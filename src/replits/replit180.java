package replits;

public class replit180 {
    public static void main(String[]args){
        Account obj =new Account();
        obj.getAcc_No();
        obj.getName();
        obj.getEmail();
        obj.getAmount();
    }
}
class Account{
    private String acc_no;
    private String name;
    private String email;
    private double amount;



    public String setAcc_No(String acc_no){

       return acc_no="7560504000";

    }
    public String setName(){
        return "Sumair";
    }
    public String setEmail(){
        return "sumair@syntax.com";
    }
    public double setAmount(){
        return 50000.0;
    }
    public void getAcc_No(){
        System.out.print(acc_no+" ");
    }

    public void getName(){
        System.out.print(name +" ");
    }

    public void getEmail()
    {
        System.out.print(email+" ");
    }

    public void getAmount(){
        System.out.print(amount+" ");
    }
}

