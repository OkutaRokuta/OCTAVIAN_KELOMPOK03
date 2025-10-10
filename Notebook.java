import java.util.Scanner;

public class Notebook {

    // maksimal catatan
    static final int MAX = 100;
    static String[] notes = new String[MAX];
    static int count = 0;

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        /* KELOMPOK 3 */
        String Siswa1 = "EVAN EARLY FULVIAN";
        String Siswa2 = "NUHA ANINDYA BERLIYANTI UTOMO";
        String Siswa3 = "FAIRUZ AMELYA KHALISA";
        String Siswa4 = "OCTAVIAN DWI RAMADHAN";

        System.out.println("Tugas Pengkondisian Kelompok 03");
        System.out.println(Siswa1 + "\n=== NIM : 21120125120009 ===\n");
        System.out.println(Siswa2 + "\n=== NIM : 21120125120010 ===\n");
        System.out.println(Siswa3 + "\n=== NIM : 21120125120011 ===\n");
        System.out.println(Siswa4 + "\n=== NIM : 21120125120012 ===");
        int pilihan;

        do {
            System.out.println("\n=== NOTEBOOK SEDERHANA ===");
            System.out.println("1. Tambah Catatan");
            System.out.println("2. Lihat Semua Catatan");
            System.out.println("3. Hapus Catatan");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = input.nextInt();
            input.nextLine(); // buang newline

            switch (pilihan) {
                case 1 -> tambahCatatan();
                case 2 -> tampilkanCatatan();
                case 3 -> hapusCatatan();
                case 4 -> System.out.println("Keluar dari notebook...");
                default -> System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 4);
    }

    // ==== FUNCTION ====

    // 1. Tambah catatan baru
    static void tambahCatatan() {
        if (count >= MAX) {
            System.out.println("Notebook sudah penuh!");
            return;
        }
        System.out.print("Tulis catatan baru: ");
        String note = input.nextLine();
        notes[count] = note;
        count++;
        System.out.println("Catatan berhasil ditambahkan!");
    }

    // 2. Lihat semua catatan
    static void tampilkanCatatan() {
        if (count == 0) {
            System.out.println("Belum ada catatan.");
            return;
        }
        System.out.println("\n--- Daftar Catatan ---");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + notes[i]);
        }
    }

    // 3. Hapus catatan berdasarkan nomor
    static void hapusCatatan() {
        if (count == 0) {
            System.out.println("Belum ada catatan yang bisa dihapus.");
            return;
        }

        tampilkanCatatan();
        System.out.print("Masukkan nomor catatan yang ingin dihapus: ");
        int index = input.nextInt();
        input.nextLine(); // buang newline

        if (index < 1 || index > count) {
            System.out.println("Nomor tidak valid!");
            return;
        }

        // geser catatan ke kiri
        for (int i = index - 1; i < count - 1; i++) {
            notes[i] = notes[i + 1];
        }
        count--;
        System.out.println("Catatan berhasil dihapus!");
    }
}