package TasksIveYetToComplete;

public class Task5 {
    /*
    /Create a method createEmail(). Based on values of users name, lastName and email type,
     your method should return complete email Address. Example:
     createEmail(John, Snow, gmail) → johnsnow@gmail.com or/
     */
    String createEmail(String firstName, String lastName,String email){
        return (firstName+lastName+"@"+email+".com").toLowerCase();

    }

    public static void main(String[] args) {
        Task5 task5 =new Task5();
        String fullEmail=task5.createEmail("John","Snow","gmail");
        System.out.println(fullEmail);
        System.out.println(task5.createEmail("Niazzi","Zamir","outlook"));

    }
}
