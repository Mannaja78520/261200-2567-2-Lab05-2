import java.time.LocalDate;

public class Admin extends User{

    public Admin(){
        super();
    }

    public Admin(String name, int year, int month, int date) {
        super(name, year, month, date);
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("User type: admin");
    }

    public void displayInfo(boolean full){
        if (full){
            System.out.println("Name: " + super.name);
            System.out.println("Date of Birth: " + super.dob);
            System.out.println("User type: admin");
            System.out.println("Today's date: " + LocalDate.now());
        }
        else System.out.println("Name: " + super.name);
    }
    
    @Override
    public void displayHappyBirthday() {
        int age = LocalDate.now().compareTo(super.dob);
        if(isBirthday()) {
          System.out.println("Happy birthday " + super.name + "! You are " + age + "!");
        }
    }
}
