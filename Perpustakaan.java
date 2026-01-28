import java.util.ArrayList;

class Perpustakaan {
    String nama;
    ArrayList<Buku> koleksiBuku;
    ArrayList<String> daftarPeminjaman;

    Perpustakaan(String nama) {
        this.nama = nama;
        this.koleksiBuku = new ArrayList<>();
        this.daftarPeminjaman = new ArrayList<>();
    }

    void tambahBuku(Buku buku) {
        koleksiBuku.add(buku);
    }

    Buku cariBuku(String isbn) {
        for (Buku b : koleksiBuku) {
            if (b.isbn.equals(isbn)) {
                return b;
            }
        }
        return null;
    }

    void pinjamBuku(String idAnggota, String isbn) {
        Buku buku = cariBuku(isbn);

        if (buku == null) {
            System.out.println("Hasil: Buku tidak ditemukan.");
        } else if (buku.statusDipinjam) {
            System.out.println("Hasil: Buku '" + buku.judul + "' sedang dipinjam.");
        } else {
            buku.statusDipinjam = true;
            String log = idAnggota + " - " + buku.judul;
            daftarPeminjaman.add(log);
            System.out.println("Hasil: Berhasil meminjam buku '" + buku.judul + "'.");
        }
    }

    void tampilkanKoleksiBuku() {
        System.out.println("\n--- DAFTAR KOLEKSI BUKU ---");
        for (Buku b : koleksiBuku) {
            String status = b.statusDipinjam ? "Dipinjam" : "Tersedia";
            System.out.println("ISBN: " + b.isbn + " | Judul: " + b.judul + " | Status: " + status);
        }
    }

    void tampilkanLogPeminjaman() {
        System.out.println("\n--- LOG PEMINJAMAN ---");
        if (daftarPeminjaman.isEmpty()) {
            System.out.println("Belum ada transaksi.");
        } else {
            for (String log : daftarPeminjaman) {
                System.out.println(log);
            }
        }
    }
}