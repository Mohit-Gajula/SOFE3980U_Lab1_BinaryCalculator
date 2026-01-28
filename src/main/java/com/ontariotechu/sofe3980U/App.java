package com.ontariotechu.sofe3980U;

import java.util.Scanner;

import org.joda.time.LocalTime;

/**
 * Hello world!
 *
 */
public class App 
{
	/**
	* Main program:  The entry point of the program. The local time will be printed first,
	*      Then it will create two binary variables, add them and print the result.
	*
	* @param args: not used
	*/
    public static void main( String[] args )
    {
		Scanner scanner = new Scanner(System.in);

        // Take input

        System.out.println("Enter first Binary Num = ");
        String input1 = scanner.nextLine();
        Binary binary1 = new Binary(input1);
        System.out.println( "First binary number is "+binary1.getValue());

        System.out.println("Enter second Binary Num = ");
        String input2 = scanner.nextLine();
        Binary binary2 = new Binary(input2);
        System.out.println( "Second binary number is "+binary2.getValue());

        // Function Calling

        Binary sum= Binary.add(binary1,binary2);
		System.out.println( "Their summation is "+sum.getValue());

        Binary orResult = Binary.or(binary1,binary2);
		System.out.println( "Their bitwise or is "+orResult.getValue());

        Binary andResult= Binary.and(binary1,binary2);
		System.out.println( "Their bitwise and is "+andResult.getValue());

        Binary multiply= Binary.multiply(binary1,binary2);
		System.out.println( "Their product is "+multiply.getValue());

        LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);
		
        scanner.close();
		
    }
}