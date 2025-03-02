import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat daftar film dan studio
        Film film1 = new Film("Avengers", "Action", "14:00", 50000);
        Studio studio1 = new Studio(1, 100, film1);

        Film film2 = new Film("Frozen II", "Animation", "16:00", 40000);
        Studio studio2 = new Studio(2, 80, film2);

        Film film3 = new Film("Joker", "Drama", "18:00", 45000);
        Studio studio3 = new Studio(3, 120, film3);

        for (int i = 0; i < 3; i++) {
            // Menampilkan informasi studio dan film
            System.out.println("\nDAFTAR STUDIO DAN FILM:");
            studio1.tampilkanInfo();
            studio2.tampilkanInfo();
            studio3.tampilkanInfo();

            // Input data dari pengguna
            System.out.print("Masukkan nama penonton: ");
            String namaPenonton = scanner.nextLine();

            System.out.println("\nPilih nomor film:");
            System.out.println("1. " + film1.judul);
            System.out.println("2. " + film2.judul);
            System.out.println("3. " + film3.judul);
            System.out.print("Pilihan Anda: ");
            int filmPilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer

            Film filmTerpilih;
            Studio studioTerpilih;
            String nomorTiket;

            switch (filmPilihan) {
                case 1:
                    filmTerpilih = film1;
                    studioTerpilih = studio1;
                    nomorTiket = "AV-1001";
                    break;
                case 2:
                    filmTerpilih = film2;
                    studioTerpilih = studio2;
                    nomorTiket = "FZ-2001";
                    break;
                case 3:
                    filmTerpilih = film3;
                    studioTerpilih = studio3;
                    nomorTiket = "JK-3001";
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    continue;
            }

            System.out.print("Masukkan jumlah penonton: ");
            int jumlahPenonton = scanner.nextInt();

            System.out.print("Masukkan baris kursi: ");
            int nomorKursi = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer

            // Membuat tiket dan menampilkan informasinya
            Tiket tiket = new Tiket(nomorTiket, filmTerpilih, studioTerpilih, jumlahPenonton, nomorKursi, namaPenonton);
            System.out.println("\nRingkasan Pemesanan Tiket:");
            tiket.tampilkanInfo();
        }
        
        scanner.close(); // Menutup scanner untuk mencegah kebocoran sumber daya
    }
}
