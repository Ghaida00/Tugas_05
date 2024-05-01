// Kelas turunan untuk tiket VIP
class VIP extends Tiket {
   // Do your magic here
   int getHarga(String tahap){
      if (tahap.equals("Presale")){
         return (int) (150 * 0.8);
      } else if (tahap.equals("Reguler")) {
         return 150;
      }
      return 0;
   }
}