package emailapp;
import  java.util.Scanner;
public class Email {
    //encapsulation ; make variables private.

    private String firstName;
    private String lastName;
    private String password;
    private String derpartment;
    private int mailboxCapacity = 500;
    private String altEmail;
    private int defaultPasswordLength = 10;
    private String email;
    private String companySuffix = "company.com";

    //create constructor to recieve first and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        //System.out.println("Email created " + this.firstName + " " + this.lastName);

        //Call method asking for department - return department
        this.derpartment = setDepartment();
        System.out.println("Deparment is " + this.derpartment);

        //Call method to generate random password
        this.password = ranPassword(defaultPasswordLength);
        System.out.println("The password is " + this.password);

        //Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + derpartment + "." + companySuffix;
        //System.out.println("Your email is " + email);
    }
    //Ask for department
    private String setDepartment(){
        System.out.print("New worker : "+firstName+"\nDEPARTMENT CODES:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter Department Code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice == 1){
            return "Sales";
        } else if (depChoice == 2) {
            return  "Dev";

        } else if (depChoice == 3) {
            return "Accounting";
        } else {
            return "";
        }

    }
    //Generate a random password
    private String ranPassword(int length){
            String passwordSet = "ABCDEFGHIJKLNOPQERSTUVWXYZ0123456789!@#$%";
            char [] password = new char[length];
            for(int i = 0; i < length ; i++){
                int rand = (int)(Math.random() * passwordSet.length()); //creating random value using password set
                password[i] = passwordSet.charAt(rand);
            }
            return new String(password);
    }

    //Set Mailbox Capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }
    //Set Alt Email
    public void setAltEmail(String altEmail){
        this.altEmail = altEmail;
    }
    //Change the password
    public void setPassword(String password){
        this.password = password;
    }

    public int getMailboxCapacity(){
        return mailboxCapacity;
    }

    public String getAltEmail(){
        return altEmail;
    }

    public String getPassword(){
        return password;
    }

    public String showInfo(){
        return "Display name is: " + firstName + " " + lastName +
                "\nCompany Email: " + email +
                "\nMailbox Capacity: " + mailboxCapacity + "mb";
    }

}
