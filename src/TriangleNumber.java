import java.util.Scanner;

public class TriangleNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        Integer num = in.nextInt();

        System.out.println("Треугольное число: " + TriangleNum(num));
    }



    public static double TriangleNum(Integer n) {
        return 0.5 * n * (n + 1);
    }
}
