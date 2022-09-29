package com.syntax.class03;

public class TemperatureCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double temperature = 28;
		
		if(temperature < 32) {
			System.out.println("Water will freeze with temperature at " + temperature + " degrees. ");
		}else {
			System.out.println("Water will not freeze at temperature above 32 degrees");
		}

	}

}
