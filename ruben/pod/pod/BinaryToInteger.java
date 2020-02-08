package pod;


import java.util.Scanner;

public class BinaryToInteger{
    public static int getDecimal(int binary){
        int decimal = 0;
        int n = 0;
        while(true){
            if(binary == 0){
                break;
            } else {
                int temp = binary%10;
                decimal += temp*Math.pow(2, n);
                binary = binary/10;
                n++;
            }
        }
        return decimal;
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter a binary number:");
        int n = scanner.nextInt();
        System.out.println("The integer of " + n + " is " + getDecimal(n));

    }}
