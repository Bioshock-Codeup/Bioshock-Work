package pod2;

//Create a function that takes three integer arguments (a, b, c) and returns the number of equal values.




class Challenge {
    public static int equal(int a, int b, int c) {
        if (a == b && b == c) {
            System.out.println("all three match");
            return 3;
        }
        if (a == b || a == c || b == c) {
            System.out.println("Two match");
            return 2;
        }
        System.out.println("none match");
        return 0;

    }
    public static void main(String[] args) {
        System.out.println(equal(2,3,4));
        System.out.println(equal(2,2,2));
        System.out.println(equal(1,1,2));
    }
}

