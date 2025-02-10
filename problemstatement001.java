import java.util.Scanner;
class Employee{
    Scanner scanner=new Scanner(System.in);
    int id;
    String firstName;
String lastname;
String address;
public Employee(){
System.out.println("Enter the id:");
this.id=scanner.nextInt();
System.out.println("Enter the first_name: ");
this.firstName=scanner.next();
System.out.println("Enter the last_name:");
this.lastname=scanner.next();
System.out.println("Enter the address: ");
this.address=scanner.next();
}
public Employee(String lastname,String address){
    this.lastname=lastname;
    this.address=address;
}
String getFullName(){
return this.firstName+" "+this.lastname;
}
public static void main(String[] args){
    Employee employee=new Employee();
   
   System.out.println(employee.getFullName());
}
}