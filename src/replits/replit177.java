package replits;


class Main implements Functions {

    public void display(double result){
        System.out.println("Result is ::: " + result);
    }

    public double adding(double firstNumber, double secondNumber) {
        double add=  firstNumber+secondNumber;
        return add;
    }

    public double subtracting(double firstNumber, double secondNumber) {
        double subtract= firstNumber-secondNumber;
        return subtract;
    }
    @Override
    public double multiply(double firstNumber, double secondNumber) {
        double multiple= firstNumber*secondNumber;
        return multiple;
    }
    @Override
    public double dividing(double firstNumber, double secondNumber) {
        double divide= firstNumber/secondNumber;
        return divide;
    }
    public static void main(String[]args){
        double firstNumber=100;
        double secondNumber=20;
        Main obj= new Main();
        obj.display(obj.adding(100,20));
        obj.display(obj.subtracting(100,20));
        obj.display(obj.multiply(100,20));
        obj.display(obj.dividing(100,20));



    }

}


interface Outputs{
    void display(double result);
}
interface Functions extends Outputs{
    double adding(double firstNumber,double secondNumber);
    double subtracting(double firstNumber,double secondNumber);
    double multiply(double firstNumber,double secondNumber);
    double dividing(double firstNumber,double secondNumber);
}

