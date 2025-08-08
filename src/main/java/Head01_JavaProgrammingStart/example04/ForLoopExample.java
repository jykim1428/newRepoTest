package Head01_JavaProgrammingStart.example04;

public class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        for(int i = 0; i < 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.println(j);
            }
            System.out.println("나: " + i);
        }

        int i = 0;
        i++;
        i = i + 1;
        i--;
        i = i - 1;

    }
}
