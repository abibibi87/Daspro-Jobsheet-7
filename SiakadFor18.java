import java.util.Scanner;

public class SiakadFor18 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    double nilai;
    double tertinggi = 0;
    double terendah = 0;

    for (int i = 1; i <= 10; i++) {
      System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
      nilai = sc.nextDouble();

      if (nilai < 0 || nilai > 100) {
        System.out.println("Input tidak valid!");
        i--;
        continue;
      }

      if (i == 1) {
        tertinggi = nilai;
        terendah = nilai;
      } else {
        if (nilai > tertinggi) {
          tertinggi = nilai;
        }
        if (nilai < terendah) {
          terendah = nilai;
        }
      }
      
    }

    System.out.println("Nilai tertinggi: " + tertinggi);
    System.out.println("Nilai terendah: " + terendah);

    sc.close();

  }
}