import java.util.Scanner;
public class Praktikumno3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input h");
        int h = input.nextInt();
        System.out.println("input a");
        int a = input.nextInt();
        System.out.println("input b");
        int b = input.nextInt();
        double panjang1;
        panjang1 = h/Math.tan(Math.toRadians(180-90-a));
        double panjang2;
        panjang2 = h/Math.tan(Math.toRadians(180-90-b));
        double panjang_kapal;
        panjang_kapal = panjang1 - panjang2;
        System.out.printf("%.1f m", panjang_kapal);
    }
}
