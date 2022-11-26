package replits;

import java.util.*;

/*# Map and List (Follow Steps Carefully)













Step 8: calculate the subtotal of each object.

Step 9: Print the values of each Iteration same as shown below in Output example.

Step 10: Calculate the Sum of subtotal. and store is in variable called totalPurchase.

Step 11: After Loop Print the value of Total Purchase.*/


public class replit209 {
    public static void main(String[] args) {

        List<Map<String, Object>> dataList= new ArrayList<>();


        Map<String,Object> appleMap= new HashMap<>();
        appleMap.put("Items","Apple");
        appleMap.put("Price", 20.00);
        appleMap.put("Quantity",10.0);

        dataList.add(appleMap);

        Map<String,Object> orangeMap= new HashMap<>();
        orangeMap.put("Items","Orange");
        orangeMap.put("Price",21.99);
        orangeMap.put("Quantity",10.0);

        dataList.add(orangeMap);

        //Step 8: calculate the subtotal of each object.
        //**NOTE: as the values are Object you have to do casting properly while retrieving from for each map.** */
        double subTotal=0.0;
        double Total = 0.0;

        for(Map<String,Object> map:dataList){

            //
            String item = (String) map.get("Items");

            //Object price= map.get("Price");
            Double prices= (Double)map.get("Price");

            Object quantity = map.get("Quantity");
            Double quantities= (Double) quantity;
            subTotal= prices*quantities;

            System.out.println("Items: "+item+" Price: "+prices+" Quantity: "+ quantities+ " SubTotal: "+subTotal);
            System.out.println();
            Total+=subTotal;
        }

        System.out.println("Your Purchase total : "+ Total);

    }
}
