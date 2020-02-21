public class Pod3 {
    public static int solution(int number) {
        int bucket = 0;
        for (int i = 0; i<number; i++){
            if(i % 5 ==0 || i % 3 == 0){
                bucket+= i;

            }

        }
        return bucket;
    }
    public static void main (String[] args){

        System.out.println(solution(10));
    }
}
