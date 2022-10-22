package replits;

public class replit146 {
    public static void main(String[]args){
        Employee task= new Employee();
        Employee task1= new Employee("Joe","Smith",12345,"01/01/1970",35000);
        task.print();
        task1.print();


    }
}
    class Employee{
        String name;
        String lastName;
        int employeeID;
        String startDate;
        int salary;

        Employee(){


        }
        Employee(String name, String lastName, int employeeID, String startDate, int salary){
            this.name=name;
            this.lastName=lastName;
            this.employeeID=employeeID;
            this.startDate=startDate;
            this.salary=salary;
        }
        void print(){
            System.out.println(name+" "+lastName+" "+employeeID+" "+startDate+" "+salary);


        }
    }

