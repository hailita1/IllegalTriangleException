import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao a,b,c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        try {
            if (a + b <= c || a + c <= b || b + c <= a) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.print("Loi roi");
        }
    }
}
