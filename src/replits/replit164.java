package replits;

public class replit164 {

    public static void main(String[] args) {

        child obj = new child();

        child2 task = new child2();

        child3 obj2 = new child3();


        Parent[] arr = {new child(), new child2(), new child3()};

        for (Parent files:arr){
            files.hello();
        }


    }
}

class Parent {
    void hello() {
        System.out.println("method in Parent class");

    }
}

class child extends Parent {
    void hello() {
        System.out.println("method in Child1 class");
    }
}

class child2 extends Parent {
    void hello() {
        System.out.println("method in Child2 class");
    }
}

class child3 extends Parent {
    void hello() {
        System.out.println("method in Child3 class");
    }
}


