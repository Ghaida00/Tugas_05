// Kelas untuk menyimpan informasi pemesanan tiket
class Pemesanan {
    private String nama;
    private String tahap;
    private Tiket tiket;
    private int jumlah;

    public Pemesanan(String nama, String tahap, Tiket tiket, int jumlah) {
        this.nama = nama;
        this.tahap = tahap;
        this.tiket = tiket;
        this.jumlah = jumlah;
    }


    public void cetakNota() {
        // Do your magic here
        int harga = tiket.getHarga(tahap) * jumlah;
        System.out.println("--- Nota Pemesanan---");
        System.out.println("Nama pembeli: " + nama);
        System.out.println("Tahap Pembelian: " + tahap);
        if (tiket instanceof Festival) {
            System.out.println("Jenis Tiket: Festival");
        } else if (tiket instanceof VIP) {
            System.out.println("Jenis Tiket: VIP");
        } else if (tiket instanceof VVIP) {
            System.out.println("Jenis Tiket: VVIP");
        }
        System.out.println("Jumlah tiket: " + jumlah);
        System.out.println("Total harga: Rp " + harga);
    }
}
