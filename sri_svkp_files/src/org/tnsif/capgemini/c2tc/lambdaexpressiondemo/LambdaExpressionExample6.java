package org.tnsif.capgemini.c2tc.lambdaexpressiondemo;

import java.util.*;  
public class LambdaExpressionExample6{  
    public static void main(String[] args) {  
          
        List<String> list=new ArrayList<String>();  
        list.add("Satya");  
        list.add("Jaya"); 
        list.add("Swetha");  
        list.add("Venkat");  
        list.add("Sri");         
        list.forEach(  
            (n)->System.out.println(n)  
        );  
    }  
}  