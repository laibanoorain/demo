
public class demo {
    String name;
    int id;
double salary;
public demo(String name,int id,double salary){
    this.name=name;
    this.id=id;
    this.salary=salary;
}
public void displayInfo() {
    System.out.println("Employee ID: "+ id);
    System.out.println("Employee Name:"+ name);
    System.out.println("Salary:"+ salary);

}
public static void main(String[] args){
    demo emp1= new demo("XYZ",101,50000.0);
    emp1.displayInfo();
}
}






