public class Lec05 {
    public static void main(String[] args) {
        User john = new User("john", 1954, 2, 18);
        john.displayInfo();
        john.displayHappyBirthday();

        Admin nicolas = new Admin("nicolas", 1964, 12, 18);
        nicolas.displayHappyBirthday();
        // nicolas.displayInfo();
        // nicolas.displayInfo(true);
        // nicolas.displayInfo(false);
    }
}
