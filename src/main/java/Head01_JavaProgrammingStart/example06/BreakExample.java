package Head01_JavaProgrammingStart.example06;

public class BreakExample {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                System.out.println("i = " + i);
                break;
            }
        }
    }
}
