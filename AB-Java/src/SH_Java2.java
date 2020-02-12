public class SH_Java2 {
//    Create a function that tests whether or not an integer is a perfect number. A perfect number is a number that can be written as the sum of its factors, excluding the number itself.
//
//    For example, 6 is a perfect number, since 1 + 2 + 3 = 6, where 1, 2, and 3 are all factors of 6. Similarly, 28 is a perfect number, since 1 + 2 + 4 + 7 + 14 = 28.

    public static boolean checkPerfect(int num) {
        int i, Sum = 0 ;

        for(i = 1 ; i < num ; i++) {
            if(num % i == 0)  {
                Sum = Sum + i;
            }
        }
        if (Sum == num) {
            return true;
        }
        return false;
    }

    //https://en.wikipedia.org/wiki/Perfect_number

    public static void main(String[] args){
        System.out.println(checkPerfect(6)); // ➞ true
        System.out.println(checkPerfect(28)); // ➞ true
        System.out.println(checkPerfect(496)); // ➞ true
        System.out.println(checkPerfect(12)); // ➞ false
        System.out.println(checkPerfect(97)); // ➞ false

        System.out.println(checkEnding("abc", "bc")); // ➞ true
        System.out.println(checkEnding("abc", "d")); // ➞ false
        System.out.println(checkEnding("samurai", "zi")); // ➞ false
        System.out.println(checkEnding("feminine", "nine")); // ➞ true
        System.out.println(checkEnding("convention", "tio")); // ➞ false

        System.out.println(fib(0)); // ➞ 0
        System.out.println(fib(1)); // ➞ 1
        System.out.println(fib(2)); // ➞ 1
        System.out.println(fib(8)); // ➞ 21
    }

//    Create a function that takes two strings and returns true if the first string ends with the second string; otherwise return false.

    public static boolean checkEnding(String str1, String str2) {
        return str1.endsWith(str2);
    }

    // https://www.guru99.com/string-endswith-method-java.html

//    Fibonacci numbers are created in the following way:
//
//    F(0) = 0
//    F(1) = 1
//            ...
//    F(n) = F(n-2) + F(n-1)
//    Write a function that calculates the nth Fibonacci number.

    public static int fib(int n) {
        if (n <= 1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

//    https://www.mathsisfun.com/numbers/fibonacci-sequence.html
}
