public class SH_Java {
//    https://javarevisited.blogspot.com/2017/07/top-50-java-programs-from-coding-Interviews.html

//    You need to write a simple Java program to check if a given String is palindrome or not. A Palindrome is a String which is equal to the reverse of itself, e.g., "Bob" is a palindrome because of the reverse of "Bob" is also "Bob."  Though be prepared with both recursive and iterative solution of this problem. The interviewer may ask you to solve without using any library method, e.g. indexOf() or subString() so be prepared for that.
    public static void main(String args[]) {
        System.out.println(isPalindromString("aaa"));
        System.out.println(isPalindromString("abc"));
        System.out.println(isPalindromString("bbbb"));
        System.out.println(isPalindromString("defg"));

        System.out.println(isPalindrome(1001));
        System.out.println(isPalindrome(1234));
        System.out.println(isPalindrome(1221));

        armstrongNumbers(153);
    }

    public static boolean isPalindromString(String text){
        String reverse = reverse(text);
        if(text.equals(reverse)){
            return true;
        }

        return false;
    }

    public static String reverse(String input){
        if(input == null || input.isEmpty()){
            return input;
        }

        return input.charAt(input.length()- 1) + reverse(input.substring(0, input.length() - 1));
    }

//    A number is called an Armstrong number if it is equal to the cube of its every digit. For example, 153 is an Armstrong number because of 153= 1+ 125+27, which is equal to 1^3+5^3+3^3. You need to write a program to check if the given number is Armstrong number or not.

    public static void armstrongNumbers(int num){
        int c=0,a,temp;
        temp=num;
        while(num>0) {
            a=num%10;
            num = num / 10;
            c = c + (a*a*a);
        }
        if(temp==c) {
            System.out.println("armstrong number");
        }else {
            System.out.println("Not armstrong number");
        }
}


//    This is generally asked as follow-up or alternative of the previous program. This time you need to check if given Integer is palindrome or not. An integer is called palindrome if it's equal to its reverse, e.g. 1001 is a palindrome, but 1234 is not because the reverse of 1234 is 4321 which is not equal to 1234. You can use divide by 10 to reduce the number and modulus 10 to get the last digit. This trick is used to solve this problem.

    public static boolean isPalindrome(int number) {
        int palindrome = number;
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        if (number == reverse) {
            return true;
        }
        return false;
    }

}


