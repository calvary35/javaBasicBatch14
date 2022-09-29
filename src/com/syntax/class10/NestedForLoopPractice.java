package com.syntax.class10;

public class NestedForLoopPractice {
		  public static void main(String[]args){

		    for(int i = 0;i<5;i++){
		      System.out.print("$");
		      for(int j = i-1; j<i;j++){
		        System.out.print(" " +" ");
		      }
		      System.out.print("$");
		      System.out.println();
		    }
		  }

		}

