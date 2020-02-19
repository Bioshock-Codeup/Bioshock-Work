public class SH_Java3 {
    public static void main(String[] args){
        System.out.println(arrayOfMultiples(7, 5)); // ➞ [7, 14, 21, 28, 35]
        System.out.println(arrayOfMultiples(12, 10)); // ➞ [12, 24, 36, 48, 60, 72, 84, 96, 108, 120]
        System.out.println(arrayOfMultiples(17, 6)); // ➞ [17, 34, 51, 68, 85, 102]

        System.out.println(nameShuffle("Johnny Depp")); // ➞ "Depp Johnny"
        System.out.println(nameShuffle("Rosie O'Donnell")); // ➞ "O'Donnell Rosie"
        System.out.println(nameShuffle("Seymour Butts")); // ➞ "Butts Seymour"
    }

//    Create a function that takes two numbers as arguments (num, length) and returns an array of multiples of num up to length.
    public static int[] arrayOfMultiples(int num, int length) {
        int[] temp = new int[length];
        for(int i = 1; i <= length; i++){
            temp[i-1] = i * num;
        }
        return temp;
    }

//    Create a method that accepts a string (of a persons first and last name) and returns a string with the first and last name swapped.
    public static String nameShuffle(String s) {
        String[] names = s.split(" ");
        return names[1] + " " + names[0];
    }


}
