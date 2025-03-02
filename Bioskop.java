// Kelas Film merepresentasikan sebuah film yang akan ditayangkan di bioskop
class Film {
    String judul, genre; // Judul dan genre film
    String jamTayang; // Waktu tayang film
    double hargaTiket; // Harga tiket per orang

    // Konstruktor untuk inisialisasi objek Film
    public Film(String judul, String genre, String jamTayang, double hargaTiket) {
        this.judul = judul;
        this.genre = genre;
        this.jamTayang = jamTayang;
        this.hargaTiket = hargaTiket;
    }

    // Menampilkan informasi film
    public void tampilkanInfo() {
        System.out.printf("%-15s | %-10s | %-10s | Rp%,.0f%n", judul, genre, jamTayang, hargaTiket);
    }
}

// Kelas Studio merepresentasikan studio di dalam bioskop
class Studio {
    int nomorStudio;
    int kapasitasKursi;
    Film film; // Film yang sedang ditayangkan di studio ini

    // Konstruktor untuk inisialisasi studio dengan film
    public Studio(int nomorStudio, int kapasitasKursi, Film film) {
        this.nomorStudio = nomorStudio;
        this.kapasitasKursi = kapasitasKursi;
        this.film = film;
    }

    // Menampilkan informasi studio beserta film yang sedang diputar
    public void tampilkanInfo() {
        System.out.println("----------------------------------------------------");
        System.out.printf("Studio %-2d | Kapasitas: %-3d%n", nomorStudio, kapasitasKursi);
        System.out.println("----------------------------------------------------");
        System.out.printf("%-15s | %-10s | %-10s | %-10s%n", "Judul", "Genre", "Jam Tayang", "Harga Tiket");
        System.out.println("----------------------------------------------------");
        film.tampilkanInfo();
        System.out.println("----------------------------------------------------\n");
    }
}

// Kelas Tiket merepresentasikan tiket yang dibeli oleh penonton
class Tiket {
    String nomorTiket;
    Film film;
    Studio studio;
    int jumlahPenonton;
    int nomorKursi;
    String namaPenonton;
    double totalHarga;

    // Konstruktor untuk inisialisasi tiket dengan informasi yang diperlukan
    public Tiket(String nomorTiket, Film film, Studio studio, int jumlahPenonton, int nomorKursi, String namaPenonton) {
        this.nomorTiket = nomorTiket;
        this.film = film;
        this.studio = studio;
        this.jumlahPenonton = jumlahPenonton;
        this.nomorKursi = nomorKursi;
        this.namaPenonton = namaPenonton;
        this.totalHarga = jumlahPenonton * film.hargaTiket; // Menghitung total harga berdasarkan jumlah penonton
    }

    // Menampilkan informasi tiket yang telah dipesan
    public void tampilkanInfo() {
        System.out.println("==============================================");
        System.out.printf("Tiket No   : %s%n", nomorTiket);
        System.out.printf("Penonton   : %s%n", namaPenonton);
        System.out.printf("Jumlah     : %d orang%n", jumlahPenonton);
        System.out.printf("Studio     : %d%n", studio.nomorStudio);
        System.out.printf("Nomor Kursi: %d%n", nomorKursi);
        System.out.println("----------------------------------------------");
        System.out.printf("Film       : %s%n", film.judul);
        System.out.printf("Genre      : %s%n", film.genre);
        System.out.printf("Jam Tayang : %s%n", film.jamTayang);
        System.out.printf("Total Harga: Rp%,.0f%n", totalHarga);
        System.out.println("==============================================\n");
    }
}