public class Employee2 {
    private static int count = 0;
    private String lastName;
    private String firstName;

    public Employee2(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
        ++count;
        System.out.printf("Employee constructor: %s %s; count = %d%n", firstName, lastName, count);
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public static int getCount() {
        return count;
    }
}
