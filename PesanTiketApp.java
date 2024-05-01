import java.util.Scanner;

public class PesanTiketApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di program pemesanan tiket!");
        
        // Do your magic here
        System.out.println("Masukan nama pembeli: ");
        String nama = scanner.nextLine();

        System.out.println("Pilih tahap pembelian: ");
        System.out.println("1. Presale");
        System.out.println("2. Reguler");
        System.out.println("Pilih tahap pembelian (1/2): ");
        int tahapPembelian = scanner.nextInt();

        String tahap;
        if (tahapPembelian==1) {
            tahap = "Presale";
        } else if (tahapPembelian == 2) {
            tahap = "Reguler";
        } else {
            System.out.println("Input tidak valid!");
            return;
        }

        Tiket tiket = null;
        if (tahap.equals("Presale")) {
            System.out.println("Pilih jenis tiket:");
            System.out.println("1. VIP");
            System.out.println("2. VVIP");
            System.out.print("Pilih jenis tiket (1/2): ");
            int jenisTiket = scanner.nextInt();
            if (jenisTiket == 1) {
                tiket = new VIP();
            } else if (jenisTiket == 2) {
                tiket = new VVIP();
            } else {
                System.out.println("Input tidak valid!");
                return;
            }
        } else if (tahap.equals("Reguler")) {
            System.out.println("Pilih jenis tiket:");
            System.out.println("1. Festival");
            System.out.println("2. VIP");
            System.out.println("3. VVIP");
            System.out.print("Pilih jenis tiket (1/2/3): ");
            int jenisTiket = scanner.nextInt();
            if (jenisTiket == 1) {
                tiket = new Festival();
            } else if (jenisTiket == 2) {
                tiket = new VIP();
            } else if (jenisTiket == 3) {
                tiket = new VVIP();
            } else {
                System.out.println("Input tidak valid!");
                return;
            }
        }

        System.out.println("Masukan jumlah tiket yang ingin dibeli: ");
        int jumlahTiket = scanner.nextInt();

        Pemesanan pesanan = new Pemesanan(nama, tahap, tiket, jumlahTiket);
        pesanan.cetakNota();

    }
}
