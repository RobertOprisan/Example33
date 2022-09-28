import java.util.Scanner;
public class Example33 {
    public static void main(String[] args) {
        double x, y, n, e = 1;

        System.out.println("enter a number");
        Scanner input = new Scanner(System.in);
        n = input.nextDouble();

        x = n;
        while (e > 0.00001) {
            y = 1d / 2d * (x + n / x);
            e = x - y;
            if (e < 0) {
                e = -1 * e;
                x = y;

            }
            System.out.println(x);

        }
    }
}
