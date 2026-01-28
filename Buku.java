class Buku {
    String isbn;
    String judul;
    String pengarang;
    boolean statusDipinjam = false; // Default false

    // Konstruktor untuk mengisi data buku saat objek dibuat
    Buku(String isbn, String judul, String pengarang) {
        this.isbn = isbn;
        this.judul = judul;
        this.pengarang = pengarang;
    }
}