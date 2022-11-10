import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Time time = new Time(1, 58, 59);
        System.out.println(time);
        System.out.println(1 + " or " + 2);

        while (true){
            int scan = scanner.nextInt();
            if (1 == scan){
                time.nextSecond();
                System.out.println(time);
            } else if (2 == scan) {
                time.previoussecond();
                System.out.println(time);
            }else {
                System.out.println("Invalid number! ");
            }
        }
    }
}