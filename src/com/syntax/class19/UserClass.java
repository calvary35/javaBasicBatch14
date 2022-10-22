package com.syntax.class19;

public class UserClass {
    /*
    Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
     Create a subclass  userInfo that will have user address variable
      and it also being initialized through constructor call.
     Print users name, mobile number and address in userDetails method. Test your code.
     */
    String name;
    String mobileNumber;
    UserClass(String name,String mobileNumber){
        this.name=name;
        this.mobileNumber=mobileNumber;
    }
}
class UserInfo extends UserClass {
    String userAddress;

    UserInfo(String name, String mobileNumber, String userAddress) {
        super(name, mobileNumber);
        this.userAddress = userAddress;
    }
    void userDetails(){
        System.out.println("The user's name is "+name+" and their mobile number is "+mobileNumber+
                " and their address is "+ userAddress);
    }
}
class testing{
    public static void main(String[] args) {
        new UserInfo("Kevin","123-456-7890","123 Main Street").userDetails();
    }

}
