import java.time.LocalDate;
import java.util.HashSet;
public abstract class Pass {
    public static int NEXT_PASS_NUMBER = 1;
    private int number;
    private int credits;
    private boolean active;
    private LocalDate dateActivated;
    private LocalDate dateClosed;
    private Visitor visitor;
    private HashSet<Transaction> transactions;
    public Pass(Visitor aVisitor) {
        this.visitor = aVisitor;
        this.credits = 0;
        this.active = false;
        this.dateActivated = null;
        this.dateClosed = null;
        this.transactions = new HashSet<>();
        this.number = Pass.NEXT_PASS_NUMBER;
        NEXT_PASS_NUMBER++;
    }
    public Visitor getVisitor() {
        return this.visitor;
    }
    public int getNumber(){
        return this.number;
    }
    public boolean isActive()
    {
        return this.active;
    }
    /**
     * activates the pass and records the date activated
     */
    public void activate() {
        this.active = true;
        this.dateActivated = LocalDate.now();
    }
    /**
     * deactivates the pass and records the date deactivated
     */
    public void deactivate()
    {
        this.active =false;
        this.dateClosed=LocalDate.now();
    }
    /**
     * returns the date on which the pass was activated as a String
     * @return the date on which the pass was activated as a String
     */
    public String getDateActivated()
    {
        String date;
        if (this.dateActivated != null) {
            date = this.dateActivated.toString();
        }
        else {
            date = "The Pass has not been activated";
        }
        return date;
    }
    /**
     * Returns the date on which the pass was deactivated as a String
     * @return the date on which the pass was deactivated as a String
     */
    public String getDateDeactivated()
    {
        String date;
        if(this.dateActivated == null)
        {
            date = "The Pass has not been activated";
        }
        else if (this.dateActivated != null && this.dateClosed == null)
        {
            date = "the Pass is still active";
        }
        else
        {
            date = this.dateClosed.toString();
        }
        return date;
    }
    public int getCredits()
    {
        return this.credits;
    }
    public void addCredits(int numCredits)
    {
        this.credits+=numCredits;
    }
    public void useCredits(int numCredits)
    {
        if (numCredits <= this.credits)
        {
            this.credits -= numCredits;
        }
    }
    public int numberOfTransactions()
    {
        return this.transactions.size();
    }
    public void addTransaction(Transaction t)
    {
        this.transactions.add(t);
    }
    public void displayDetails()
    {
        String status;
        String date;
        if(this.isActive())
        {
            status= " Pass Active ";
            date = this.getDateActivated();
        }
        else
        {
            status = "Pass Closed ";
            date = this.getDateDeactivated();
        }
        System.out.println(this.visitor.getNumber() + "Credits: " + this.getCredits() + " , " + status + ", " + date);
    }
    public void showTransactions()
    {
        System.out.println("Type\tCredits\tDate/Time\tID");
        for(Transaction t: this.transactions)
        {
            t.showDetails();
        }
    }


}
