package replits;

public class replit178 {

    public static void main(String[] args) {

        EncapsulationDemo obj = new EncapsulationDemo();
        System.out.println(obj.getEmpName("Mario"));
        System.out.println(obj.getEmpAge(32));

    }
}

class EncapsulationDemo {
    private String empName;
    private int empAge;

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpName(String empName) {
        return empName;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public int getEmpAge(int empAge) {
        return empAge;
    }
}

