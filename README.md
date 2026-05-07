# Workflow Engine: Strategy Pattern (Diskon Toko)

Proyek ini adalah tugas mata kuliah OOP yang mendemonstrasikan penggunaan **Strategy Pattern** untuk menangani berbagai logika diskon tanpa menggunakan `if-else` bertingkat.

## Struktur Project
- `StrategiDiskon.java`: Interface sebagai kontrak strategi.
- `DiskonGold.java`, `DiskonMember.java`, dll: Implementasi spesifik diskon.
- `Kasir.java`: Context class yang menjalankan strategi.
- `Main.java`: Entry point aplikasi.