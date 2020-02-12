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

        System.out.println(countVowels("apple")); // ➞ 2
        System.out.println(countVowels("cheesecake")); // ➞ 5
        System.out.println(countVowels("bbb")); // ➞ 0
        System.out.println(countVowels("")); // ➞ 0

        System.out.println(fib(0)); // ➞ 0
        System.out.println(fib(1)); // ➞ 1
        System.out.println(fib(2)); // ➞ 1
        System.out.println(fib(8)); // ➞ 21
    }

//    Write a function that recursively returns the number of vowels in a string.

    static boolean isVowel(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U');
    }
    public static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
            if (isVowel(str.charAt(i))){
                ++count;
            }
        return count;
    }

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
