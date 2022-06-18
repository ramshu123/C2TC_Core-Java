package com.acharya.string_inbuilt_method;

public class ContainsExample3 {

	public static void main(String[] args) {
		String str = "To learn Java visit abc.in";        
        if(str.contains("abc.in")) 
        {  
                     System.out.println("This string contains abc.in");  
        }
        else  
            System.out.println("Result not found");       
    }  
}