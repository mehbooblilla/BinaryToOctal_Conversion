package Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Binary to octal conversion:
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a binary number:");
        String binaryValue=scanner.next();
        int intValue=Integer.parseInt(binaryValue,2);
        String  octalNumber=Integer.toOctalString(intValue);
        System.out.println("Octal number: "+octalNumber);
//        java octal to binary conversion:
        String octalNumber1="361";
        int intNumber=Integer.parseInt(octalNumber1,8);
        String binaryNumber=Integer.toBinaryString(intNumber);
        System.out.println(binaryNumber);

    }
}
