public class Main {
    public static void main(String[] args) {
        //third part
        //task 1
        int currentYear = 2022;
        int bottomLine = currentYear - 200;
        int topLine = currentYear + 100;
        for (int i = bottomLine; i <= topLine; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }

        //task 2
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + (2 * i));
        }
    }
}