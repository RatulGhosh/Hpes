package Lists;

/**
 * Created by P045 on 20-06-2015.
 */
public class Employee
{
    int empId;
    String empName;
    String salary;
    Employee(int empId,String empName,String salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public void display_Employee()
    {

        System.out.println(empName);
        System.out.println(empId);
        System.out.println(salary);
    }
}





