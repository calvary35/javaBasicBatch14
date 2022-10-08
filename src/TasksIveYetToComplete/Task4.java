package TasksIveYetToComplete;

public class Task4 {
    /*
    Create a method that will say Hello in
    different language based on the country
    that will passed when method is executed.
     */
    void sayHello(String country){
        switch (country) {
            case "USA":
                System.out.println("Hello");
                break;
            case "India":
                System.out.println("Namaste");
                break;
            case "Turkiye":
                System.out.println("Merhaba");
                break;
            case "Pakistan":
                System.out.println("AOA");
                break;
            case "Japan":
                System.out.println("Nihau");
                break;
            default:
                System.out.println("Unknown language");

        }
    }

    public static void main(String[] args) {
        Task4 task = new Task4();
        task.sayHello("USA");
        task.sayHello("Turkiye");
    }
}
