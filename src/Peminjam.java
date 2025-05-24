import java.util.ArrayList;
import java.util.Scanner;

public class Peminjam extends Pengguna{

    static ArrayList<String> userPinjaman = new ArrayList<>();
    static ArrayList<String> riwayatPinjaman = new ArrayList<>();




    
	 static void MenuUser(Scanner input) {
        boolean lanjut = true;
        while (lanjut) {
            System.out.println("\nMenu Pengguna:");
            System.out.println("1. Ajukan Pinjaman");
            System.out.println("2. Lihat Riwayat Pinjaman");
            System.out.println("3. Bayar Pinjaman");
            System.out.println("4. Logout");
            System.out.print("Pilih opsi: ");
            String pilihan = input.nextLine();

            switch (pilihan) {
                case "1":
                    // System.out.print("Masukkan deskripsi pinjaman: ");
                    // String deskripsi = input.nextLine();
                    // userPinjaman.add(UserSaatIni);
                    // riwayatPinjaman.add(deskripsi);
                    // System.out.println("Pengajuan pinjaman berhasil.");
                    break;
                case "2":
                    // System.out.println("Riwayat Pinjaman Anda:");
                    // boolean ada = false;
                    // for (int i = 0; i < userPinjaman.size(); i++) {
                    //     if (userPinjaman.get(i).equals(UserSaatIni)) {
                    //         System.out.println("- " + riwayatPinjaman.get(i));
                    //         ada = true;
                    //     }
                    // }
                    // if (!ada) {
                    //     System.out.println("Belum ada riwayat pinjaman.");
                    // }
                    break;
                case "3":
                    // System.out.print("Masukkan ID pinjaman yang ingin dibayar: ");
                    // String idPinjaman = input.nextLine();
                    // boolean found = false;
                    // for (int i = 0; i < userPinjaman.size(); i++) {
                    //     if (userPinjaman.get(i).equals(UserSaatIni) && riwayatPinjaman.get(i).equals(idPinjaman)) {
                    //         userPinjaman.remove(i);
                    //         riwayatPinjaman.remove(i);
                    //         System.out.println("Pembayaran pinjaman berhasil.");
                    //         found = true;
                    //         break;
                    //     }
                    // }
                    // if (!found) {
                    //     System.out.println("ID pinjaman tidak ditemukan.");
                    // }
                    break;

                case "4":
                    System.out.println("Logout berhasil.");
                    lanjut = false;
                    MenuAwal(input);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
     }
}

