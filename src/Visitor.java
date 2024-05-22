import java.time.LocalDate;
public class Visitor {
    private static int NEXT_VISIOR_NUMBER = 1;
    private int number;
    private String name;
    private String address;
    private String postCode;
    private LocalDate dateOfBirth;

    public Visitor(String aName, String aAddress, String aPostcode, LocalDate aDate, int aNumber) {
        this.name = aName;
        this.address = aAddress;
        this.postCode = aPostcode;
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

    public int getNumber() {
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

    public void displayDetails() {
        System.out.println(this.getNumber() + "\t" + this.getName() + "\t" + this.getAddress() + "\t" + this.getPostCode()
                + "\t" + this.getDateOfBirth().toString());
    }


    @Override
    public boolean equals(Object obj) //this adds an override for
    {
        boolean equal = false; //local variable to use to return whether objects are considered equal

        if(obj == this)  //if memmory references of the two objects match consider equal by default
        {
            equal = true;
        }
        else //this means references don't match
        {
            if(obj instanceof Visitor)//if parameter object is an instance of the Visitor(or one of it's subclasses)
            {
                Visitor otherVisitor = (Visitor) obj; //cast parameter object to an object of the Visitor class

                if(otherVisitor.getNumber() == this.getNumber()) //compare the IDs
                {
                    equal = true; //return true if the IDs match
                }

            }
        }
        return equal;

    }


}


