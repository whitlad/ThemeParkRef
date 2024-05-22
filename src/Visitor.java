import java.time.LocalDate;
public class Visitor {
    private static int NEXT_VISIOR_NUMBER = 1;
    private int number;
    private String name;
    private String address;
    private String postCode;
    private LocalDate dateOfBirth;
    public Visitor(String aName, String aAddress, String aPostcode, LocalDate aDate, int aNumber)
    {
        this.name= aName;
        this.address = aAddress;
        this.postCode =aPostcode;
        this.dateOfBirth = aDate;
        this.number = NEXT_VISIOR_NUMBER;
        NEXT_VISIOR_NUMBER++;
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPostCode() {
        return postCode;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public int getNumber()
    {
        return this.number;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
    public void displayDetails()
    {
        System.out.println(this.getNumber() + "\t" + this.getName() + "\t" + this.getAddress() + "\t" + this.getPostCode()
                + "\t" + this.getDateOfBirth().toString());
    }
}

