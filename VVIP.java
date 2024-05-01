// Kelas turunan untuk tiket VVIP
class VVIP extends Tiket {
    // Do your magic here
    int getHarga(String tahap){
        if (tahap.equals("Presale")) {
            return (int) (200 * 0.8);
        } else if (tahap.equals("Reguler")){
            return 200;
        }
        return 0;
    }
}