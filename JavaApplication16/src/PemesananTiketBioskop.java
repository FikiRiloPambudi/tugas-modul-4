import java.util.Scanner;
public class PemesananTiketBioskop{
static void jumlahkursi(){
    System.out.println("Masukan Jumlah kursi :");
}
public static void main(String[]args){
  int pilihan,kursi,tiket;
  Scanner input = new Scanner (System.in);
  while (true) {
   System.out.println("silahkan pilih film yang ingin anda tonton");
   System.out.println("1. Dilan 1990");
   System.out.println("2. Avengers Endgame");
   System.out.println("3. Joker");
   System.out.println("4. Batal/selesai");
   System.out.print("Masukkan Pilihan Anda : ");
   pilihan = Integer.parseInt(input.next());
    
   switch(pilihan){
   case 1 :
    jumlahkursi();
    kursi = input.nextInt(); 
       if (kursi < 5) {
                          System.out.println("anda akan memesan tiket sejumlah="+kursi+"kursi");
                          tiket=(int) (kursi*25000);
                          System.out.print("harga tiket= "+tiket+"tiket akan segera dicetak, ");    
                       } else {
                           System.out.println("pemesanan kursi maksimal adalah 4 kursi");
                     }
          
    break;
    
   case 2 :
    jumlahkursi();
    kursi = input.nextInt(); 
       if (kursi < 5) {
                          System.out.println("anda akan memesan tiket sejumlah="+kursi+"kursi");
                          tiket=(int) (kursi*25000);
                          System.out.print("harga tiket= "+tiket+"tiket akan segera dicetak, ");    
                       } else {
                           System.out.println("pemesanan kursi maksimal adalah 4 kursi");
                     }
          
    break;
    
   case 3 :
    jumlahkursi();
    kursi = input.nextInt(); 
       if (kursi < 5) {
                          System.out.println("anda akan memesan tiket sejumlah="+kursi+"kursi");
                          tiket=(int) (kursi*25000);
                          System.out.print("harga tiket= "+tiket+"tiket akan segera dicetak, ");    
                       } else {
                           System.out.println("pemesanan kursi maksimal adalah 4 kursi");
                     }
          
    break;
    
   case 4 :
    System.exit(0);
   break;
    
   default:
                      System.out.println("Anda Harus memilih menu (1,2,3,4)");
                      break;
   }
 }
}
}
