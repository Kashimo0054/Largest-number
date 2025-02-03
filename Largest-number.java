import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Enter your  numbers: ");

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();

        int num2 = sc.nextInt();

        int num3 = sc.nextInt();

        int num4 = sc.nextInt();

        ArrayList<Integer> num = new ArrayList<>();

        num.add(num1);
        num.add(num2);
        num.add(num3);
        num.add(num4);

        System.out.println(Collections.max(num) + "Largest number");

    }
}
