package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int originalnumber = input.nextInt();
        assert originalnumber>0 : "Number must be greater than 0!";
        int copynumber = originalnumber;
        int reversednumber = 0;

        while(copynumber!=0){
             int digitcurrent = copynumber%10;
             copynumber = copynumber/10;
             reversednumber *=10;
             reversednumber = reversednumber+digitcurrent;
        }
        boolean result = reversednumber==originalnumber;
        if (result){
          System.out.println("Palindrome: true");
        } else{
          System.out.println("Palindrome: false");
        }
        
    }
}
