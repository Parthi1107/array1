import java.util.Scanner;
public class main {
     String firstName;
     String lastName;

    main(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    String getfirstName()
    {
        return firstName;
    }
    String getlastName()
    {
    return lastName;
    }
}
class Employee extends main {
     int employeeId;
     String jobTitle;

     Employee(String firstName, String lastName, int employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }
    int getemployeeId()
    {
        return employeeId;
    }
    String getjobTitle()
    {
        return jobTitle;
    }
    }
class Person {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter the Employee ID");
        int employeeId= sc.nextInt();
        System.out.println(" Enter First Name");
        String firstName= sc.nextLine();
        System.out.println(" Enter Last Name");
        String lastName= sc.nextLine();
       
        System.out.println(" Enter Job title");
        String jobTitle= sc.nextLine();
        
      Employee emp = new Employee(firstName,lastName, employeeId,jobTitle);
      System.out.print("Employee "+ emp.getfirstName() + " " +  emp.getlastName() + " with employee ID" + " "+ emp.getemployeeId() + " is a " + emp.getjobTitle());
    }
}