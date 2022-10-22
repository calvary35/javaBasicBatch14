package replits;


    public class replit159{
        public static void main(String[]args){
            display obj= new display();
            obj.display(100);
            obj.display("Syntax Technologies");
            obj.display("100.09");
        }
    }

    class display{
        void display(int i){
            System.out.println(i);
        }
        void display(String str){
            System.out.println(str);
        }
        void display(double i){
            System.out.println(i);
        }
    }

