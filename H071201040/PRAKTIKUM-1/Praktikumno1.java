import java.util.Scanner;
public class Praktikumno1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input waktu");
        int waktu = input.nextInt();
        System.out.println("input kecepatan");
        int kecepatan = input.nextInt();
        int efisiensi = 14;
        double jarak;
        jarak = kecepatan*waktu;
        double bahan_bakar;
        bahan_bakar = jarak/efisiensi;
        System.out.printf("Bensin Yang Digunakan = %.3f L", bahan_bakar);
        
    }
}
