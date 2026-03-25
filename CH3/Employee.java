

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(String firstName, String lastName, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        if(salary > 0.0)
            this.salary = salary;
    }

    public String getFistName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public double getSalary(){
        return salary;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public double annualSalary(){
        return salary * 12;
    }

    public void adjustment(int value) {
        if(value > 0 )
            salary += salary * 10 / 100;
    }
}
