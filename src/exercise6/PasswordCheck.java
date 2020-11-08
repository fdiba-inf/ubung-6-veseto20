package exercise6;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
        System.out.println("Enter your password:");          

          String password = input.nextLine();
         boolean valid = true;
         int digitCount = 0;
         if (password.length()<8){
           valid = false;
           continue;
         } else{
           for(int i=0; i<password.length(); i++){
            if (Character.isDigit(password.charAt(i))){
              digitCount++;
            }
             if (!Character.isLetterOrDigit(password.charAt(i))){
               valid = false;
               break;
             }
           }
         } if (digitCount<2){
           valid = false;
         } if(valid){
           break;
         }
        }
    }
}
