package tiket;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Tiket> daftarTiket = new ArrayList<>();

        boolean jalan = true;

        while (jalan) {
            try {
                System.out.println("\n=== SISTEM PEMESANAN TIKET PESAWAT ===");
                System.out.println("1. Pesan Tiket");
                System.out.println("2. Lihat Semua Tiket");
                System.out.println("3. Keluar");
                System.out.print("Pilih menu: ");

                int pilihan = input.nextInt();
                input.nextLine();

                switch (pilihan) {
                    case 1:
                        System.out.print("Nama: ");
                        String nama = input.nextLine();

                        if (nama.isEmpty()) {
                            throw new Exception("Nama tidak boleh kosong!");
                        }

                        System.out.print("Tujuan (Jakarta/Surabaya/Bali): ");
                        String tujuan = input.nextLine();

                        double harga;

                        // IF
                        if (tujuan.equalsIgnoreCase("Jakarta")) {
                            harga = 1000000;
                        } else if (tujuan.equalsIgnoreCase("Surabaya")) {
                            harga = 800000;
                        } else if (tujuan.equalsIgnoreCase("Bali")) {
                            harga = 1200000;
                        } else {
                            throw new Exception("Tujuan tidak valid!");
                        }

                        System.out.print("Kelas (Ekonomi/Bisnis): ");
                        String kelas = input.nextLine();

                        Tiket tiket;

                        // SWITCH
                        switch (kelas.toLowerCase()) {
                            case "ekonomi":
                                tiket = new Tiket(nama, tujuan, harga);
                                break;

                            case "bisnis":
                                tiket = new TiketBisnis(nama, tujuan, harga, "Makanan + Bagasi");
                                break;

                            default:
                                throw new Exception("Kelas tidak valid!");
                        }

                        daftarTiket.add(tiket);
                        System.out.println("Tiket berhasil dipesan!");
                        break;

                    case 2:
                        if (daftarTiket.isEmpty()) {
                            System.out.println("Belum ada tiket!");
                        } else {
                            int no = 1;
                            for (Tiket t : daftarTiket) {
                                System.out.println("\nTiket ke-" + no++);
                                t.tampil();
                            }
                        }
                        break;

                    case 3:
                        jalan = false;
                        System.out.println("Terima kasih!");
                        break;

                    default:
                        System.out.println("Menu tidak tersedia!");
                }

            } catch (InputMismatchException e) {
                System.out.println("Input harus angka!");
                input.nextLine();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        input.close();
    }
}