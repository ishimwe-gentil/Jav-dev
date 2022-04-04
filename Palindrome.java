import java.util.*;

class Palindrome{
         public static void main(String[]args){
             Scanner scan= new Scanner(System.in);
             binor obj= new binor();
             int num;
             String n;

             System.out.println("enter a number:");
             num= scan.nextInt();
             n= obj.binator(num);
             String reversed= obj.reversor(n);

             if(n.equals(reversed)){
                 System.out.println("\n value of "+num+" is "+n+" and reversed value "+reversed+" it is palindrome");
             }
                 else{
                     System.out.println("\n "+num+" is not palindrome. its binary value is"+n+" and reversed value is "+reversed);

                 }

             }
            }
             class binor{
                 public String binator(int n1){
                     return Integer.toBinaryString(n1);
                 }
                 public String reversor(String rev){
                     StringBuilder st= new StringBuilder(rev);
                     st.reverse();
                     return st.toString();
                 }
             } 
