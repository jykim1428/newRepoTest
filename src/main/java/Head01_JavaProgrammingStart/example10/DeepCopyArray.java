package Head01_JavaProgrammingStart.example10;
import java.util.Arrays;

public class DeepCopyArray {
    public static void main(String[] args) {
        int[] data = {5, 2, 8};
        Arrays.sort(data);

        System.out.println(Arrays.toString(data));
    }
}
