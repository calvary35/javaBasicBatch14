package replits;

public class replit170 {


    public static void main(String[] args) {
        replit170 obj = new replit170();
        obj.method("hello");

       // obj.method(isHello);
    }

    final void method(String str) {
        System.out.println("Final method with string parameter");
    }

    final void method(Boolean isHello) {


        System.out.println("Final method with boolean parameter");
    }

}

