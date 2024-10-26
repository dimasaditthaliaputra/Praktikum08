import java.util.Scanner;

public class Tugas206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namaAtlet;
        int i = 1, j;

        System.out.print("Masukkan Jumlah Politeknik yang Mendaftar = ");
        int jumlahPoli = sc.nextInt();
        sc.nextLine();

        while (i <= jumlahPoli) {
            System.out.println("========================================================");
            System.out.println("Selamat datang di porseni Politeknik Negeri Malang 2024!");
            System.out.println("========================================================");

            System.out.print("Masukkan Nama Politeknik = ");
            String namaPoli = sc.nextLine();

            System.out.println();

            System.out.println("Nama atlet " + namaPoli + " cabor badminton");
            for (j = 1; j <= 5; j++) {
                System.out.print("Nama atlet ke-" + j + "= ");
                namaAtlet = sc.nextLine();
            }

            System.out.println();

            System.out.println("Nama atlet " + namaPoli + " cabor tenis meja");
            for (j = 1; j <= 5; j++) {
                System.out.print("Nama atlet ke-" + j + "= ");
                namaAtlet = sc.nextLine();
            }

            System.out.println();

            System.out.println("Nama atlet " + namaPoli + " cabor basket");
            for (j = 1; j <= 5; j++) {
                System.out.print("Nama atlet ke-" + j + "= ");
                namaAtlet = sc.nextLine();
            }

            System.out.println();

            System.out.println("Nama atlet " + namaPoli + " cabor bola voly");
            for (j = 1; j <= 5; j++) {
                System.out.print("Nama atlet ke-" + j + "= ");
                namaAtlet = sc.nextLine();
            }

            System.out.println();
            i++;
        }
        sc.close();
    }
}
