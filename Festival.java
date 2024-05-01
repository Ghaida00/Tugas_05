// Kelas turunan untuk tiket Festival
class Festival extends Tiket {
    // Do your magic here

int getHarga(String tahap) {
    if (tahap.equals("Reguler")){
        return 100;
    } else {
    return 0;}
}
}