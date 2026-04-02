package tiket;

public class TiketBisnis extends Tiket {
    private String fasilitas;

    public TiketBisnis(String nama, String tujuan, double harga, String fasilitas) {
        super(nama, tujuan, harga);
        this.fasilitas = fasilitas;
    }

    @Override
    public double hitungTotal() {
        double tambahan = 500000;
        double pajak = (harga + tambahan) * 0.1;
        return harga + tambahan + pajak;
    }

    @Override
    public void tampil() {
        System.out.println("Nama: " + namaPenumpang);
        System.out.println("Tujuan: " + tujuan);
        System.out.println("Kelas: Bisnis");
        System.out.println("Fasilitas: " + fasilitas);
        System.out.println("Total: " + hitungTotal());
    }
}