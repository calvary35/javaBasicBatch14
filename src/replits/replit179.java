package replits;

public class replit179 {

        public static void main(String[]args){
            EncapsulationDemo1 obj = new EncapsulationDemo1();
            obj.getEmpName();
            obj.getEmpAge();
        }
    }
    class EncapsulationDemo1{
        private String empName="John";
        private int empAge=30;

        public void getEmpName(){
            System.out.println(empName);
        }
        public void getEmpAge(){
            System.out.println(empAge);
        }
    }

