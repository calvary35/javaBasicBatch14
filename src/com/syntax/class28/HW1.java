package com.syntax.class28;

import java.util.LinkedHashMap;
import java.util.Map;

/*
Create a map of a building. Store floor number and it is associated company name.
 (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
 */
public class HW1 {
    public static void main(String[] args) {
        Map<Integer, String> buildingBlueprint = new LinkedHashMap<>();
        buildingBlueprint.put(1, "Google");
        buildingBlueprint.put(2, "Facebook");
        buildingBlueprint.put(3, "Tesla");
        buildingBlueprint.put(4, "Amazon");
        buildingBlueprint.put(5, "Twitter");
        buildingBlueprint.put(6, "Bank of America");
        buildingBlueprint.put(7, "Chase");
        buildingBlueprint.put(7, "Chase");
        buildingBlueprint.put(7, "Chase");
        buildingBlueprint.put(7, "Chase");
        buildingBlueprint.put(7, "Chase");
        buildingBlueprint.put(7, "Chase");
        buildingBlueprint.put(7, "Chase");
        buildingBlueprint.put(7, "Chase");
        //Check how many entries you have?
        //System.out.println(buildingBlueprint.size());
        // 7
        //Update company on a 4th floor
        buildingBlueprint.replace(4, "Amazon", "Ford");
        //Remove company on the 7th floor
        buildingBlueprint.remove(7);
        //Print your map
        System.out.println(buildingBlueprint);

    }
}
