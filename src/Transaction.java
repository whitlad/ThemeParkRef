import java.time.LocalDateTime;
public class Transaction {
    private static int NEXT_TRANSACTION_ID = 1;
    private int id;
    private int credits;
    private LocalDateTime dateTime;
    private TransactionType type;
    public Transaction(TransactionType aType, int numCredits)
    {
        this.type = aType;
        this.credits = numCredits;
        this.dateTime = LocalDateTime.now();
        this.id=NEXT_TRANSACTION_ID;
        NEXT_TRANSACTION_ID++;
    }
    public int getId()
    {
        return this.id;
    }
    public int getCredits()
    {
        return this.credits;
    }
    public LocalDateTime getDateTime()
    {
        return this.dateTime;
    }
    public TransactionType getType()
    {
        return this.type;
    }
    public void showDetails()
    {
        System.out.println(this.type.toString() + "\t" + this.credits + "\t" + this.dateTime.toString() + "\t" + id);
    }
}
 