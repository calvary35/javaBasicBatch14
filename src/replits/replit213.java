package replits;
/*
Create a method that will do temperature check. Anytime user passes temperture that is below 32 method should throw an
Exception saying "It is freezing"/*
 */




public class replit213 {
  static void tempCheck(int temp) throws RuntimeException{
        if(temp <32){
          throw new RuntimeException("It is freezing");

        }
  }

    public static void main(String[] args) {
        try{
            tempCheck(31);
        }catch (RuntimeException e){
            e.printStackTrace();

        }
    }

}
