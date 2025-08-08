package Head01_JavaProgrammingStart.example05;

public class ImporvedForLoop {
    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 4, 5};

//         for(int i = 0; i <5; i++){
//             System.out.println("nums[i] 출력 : " + nums[i]);
       int[] scores = {90, 85, 78};

       for (int s : scores) {
           System.out.println("점수: " + s);

        }
    }
}
