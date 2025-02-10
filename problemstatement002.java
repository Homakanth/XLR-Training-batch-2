
import java.util.Scanner;
class employee{
    Scanner scanner=new Scanner(System.in);
    int hoursworked;
    int amountperhour;
    public employee(){
System.out.println("Enter the hours worked:");
this.hoursworked=scanner.nextInt();
System.out.println("Enter the amount per hour:");
this.amountperhour=scanner.nextInt();
    }
    public employee(int hoursworked,int amountperhour){
        this.hoursworked=hoursworked;
        this.amountperhour=amountperhour;
    }
    int computesal(){
return this.hoursworked*this.amountperhour;
    }
void showdetails(){
     System.out.println("Hours Worked: " + this.hoursworked);
        System.out.println("Amount Per Hour: " + this.amountperhour);
        System.out.println("Salary: " + computesal());
}
class parttimeemployee extends employee{
public parttimeemployee() {
        super();
    }

    public parttimeemployee(int hoursWorked, int amountPerHour) {
        super(hoursWorked, amountPerHour);
    }
}
}
public class problemstatement002{
    public static void main(String[] args) {
    employee employee=new employee();
employee.showdetails();
}
}
