package tiket;

public class Tiket {
    protected String namaPenumpang;
    protected String tujuan;
    protected double harga;

    public Tiket(String namaPenumpang, String tujuan, double harga) {
        this.namaPenumpang = namaPenumpang;
        this.tujuan = tujuan;
        this.harga = harga;
    }

    public double hitungTotal() {
        double pajak = harga * 0.1;
        return harga + pajak;
    }

    public void tampil() {
        System.out.println("Nama: " + namaPenumpang);
        System.out.println("Tujuan: " + tujuan);
        System.out.println("Total: " + hitungTotal());
    }
}