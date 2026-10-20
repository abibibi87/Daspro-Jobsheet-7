
import java.util.Scanner;

public class SiakadWhile18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilai, jml;
        int i = 1;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jml = sc.nextInt();

        while (i <= jml) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextInt();

            if (nilai < 0 || nilai > 100) {
                System.out.println("Input tidak valid! Masukkan nilai 0-100.");
                continue;
            }

            if (nilai > 80) {
                System.out.println("Nilai mahasiswa ke-" + i + " adalah A");
            } else if (nilai > 73) {
                System.out.println("Nilai mahasiswa ke-" + i + " adalah B+");
            } else if (nilai > 65) {
                System.out.println("Nilai mahasiswa ke-" + i + " adalah B");
            } else if (nilai > 60) {
                System.out.println("Nilai mahasiswa ke-" + i + " adalah C+");
            } else if (nilai > 55) {
                System.out.println("Nilai mahasiswa ke-" + i + " adalah C");
            } else if (nilai > 50) {
                System.out.println("Nilai mahasiswa ke-" + i + " adalah D");
            } else {
                System.out.println("Nilai mahasiswa ke-" + i + " adalah E");
            }

            i++;
        }

        sc.close();
    }
}
