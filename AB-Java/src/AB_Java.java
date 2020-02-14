import java.util.Arrays;

public class AB_Java {
    public static void main(String[] args){
    }

//    https://edabit.com/challenge/vXYP24qRoQQijc834
//    Create a function that tests whether or not an integer is a perfect number. A perfect number is a number that can be written as the sum of its factors, excluding the number itself.
//
//For example, 6 is a perfect number, since 1 + 2 + 3 = 6, where 1, 2, and 3 are all factors of 6. Similarly, 28 is a perfect number, since 1 + 2 + 4 + 7 + 14 = 28.


    public static class Challenge {
        public static boolean checkPerfect(int num) {
            int sum = 1;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            return sum == num;
        }
    }
//     https://edabit.com/challenge/c52kNwPuWo5kp9x4H
//     Create a function that takes a string and returns a new string with its first and last characters swapped, except under three conditions:
//
//If the length of the string is less than two, return "Incompatible.".
//If the first and last characters are the same, return "Two's a pair.".

        public static class Program {
            public static String flipEndChars(String s) {
                if(s.length() < 2)
                    return "Incompatible.";
                if(s.charAt(0) == s.charAt(s.length()-1))
                    return "Two's a pair.";
                return s.substring(s.length()-1) + s.substring(1,s.length()-1) + s.substring(0,1);
            }
        }

//        https://edabit.com/challenge/KESQCRf5mJd7x6Rfh
//    Create a method that takes an array of strings or integers, removes all duplicate items and returns a new array in the same sequential order as the old array (minus duplicates).

    public static int[] removeDups(int[] nums) {
        return Arrays.stream(nums).boxed().mapToInt(Integer::intValue).distinct().toArray();
    }
    public static String[] removeDups(String[] str) {
        return Arrays.asList(str).stream().distinct().toArray(String[]::new);
    }


//        https://edabit.com/challenge/2Cbbs3pvH2gCMZMsg
//        Write a function that changes every letter to the next letter:
//
//          "a" becomes "b"
//          "b" becomes "c"
//          "d" becomes "e"
//          and so on ...

    public static String move(String word) {
        String s ="";
        for(char c : word.toCharArray()){
            s +=Character.toString((char) (((c - 'a' + 1) % 26) + 'a'));
        }
        return s;
    }

}

//      https://edabit.com/challenge/9Y83kppxQeMbvtDtF
//      Create a method that alternates the case of the letters in a string.

class Program {
    public static String alternatingCaps(String s) {
        boolean upper = true;
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            char ch = c;
            if (ch != ' ') {
                ch = (upper) ? Character.toUpperCase(c) : Character.toLowerCase(c);
                upper = !upper;
            }
            sb.append(ch);
        }
        return sb.toString();
    }


//      https://edabit.com/challenge/GJh9FraKutcnHoruX
//      Create a method that takes an array of integers between 1 and 10 (excluding one number) and returns the missing number.


    public static int missingNum(int[] nums) {
        int total = 55;
        for (int i = 0; i < nums.length; i++)
            total -= nums[i];
        return total;
    }
}



