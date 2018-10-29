package week6_problem2;

public class Driver {
    public static void main(String[] args) {

        Court court1 = new Court(1);

        Booking tue = new Booking("30/10/2018");
        Booking wed = new Booking("31/10/2018");

        Person p1 = new Person("Charlie", "Chalmers", "07500364618");
        Member m1 = new Member("Joe", "Chalmers", "01463 712744", "1234", "Gold");
        Member m2 = new Member("Joseph", "Sweeney", "01456 222333", "4567", "Silver");
        Member p2 = new Member("Jeanette", "Chalmers", "01463 888999", "9123", "Silver");

        tue.addPerson(p1);
        tue.addPerson(m1);
        tue.addPerson(m2);
        tue.addPerson(p2);

        wed.addPerson(p1);
        wed.addPerson(p2);

        court1.addBooking(tue);
        court1.addBooking(wed);

        court1.showBooking();
        court1.showBookings();
    }
}