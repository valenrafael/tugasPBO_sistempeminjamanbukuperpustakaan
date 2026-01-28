public class MainPerpustakaan {
    public static void main(String[] args) {
        // Buat objek Perpustakaan
        Perpustakaan perpus = new Perpustakaan("Perpustakaan Kota");

        // Tambahkan beberapa buku
        perpus.tambahBuku(new Buku("111", "Pemrograman Java", "Eko"));
        perpus.tambahBuku(new Buku("222", "Struktur Data", "Sari"));
        perpus.tambahBuku(new Buku("333", "Logika Algoritma", "Budi"));

        // Tampilkan koleksi awal
        perpus.tampilkanKoleksiBuku();

        // Simulasi Peminjaman
        System.out.println("\n--- Memulai Aksi Peminjaman ---");
        perpus.pinjamBuku("ANG01", "111"); // Berhasil
        perpus.pinjamBuku("ANG02", "111"); // Gagal (sudah dipinjam)
        perpus.pinjamBuku("ANG03", "999"); // Gagal (ISBN tidak ada)

        // Tampilkan koleksi akhir dan log
        perpus.tampilkanKoleksiBuku();
        perpus.tampilkanLogPeminjaman();

        System.out.println("\nSemangat! Ingat, compiler itu jujur, bukan galak.");
    }
}