package Adapter;

public class PilihSpotify implements ThePlayer{

   //Untuk Meng-override method dari ThePlayer
   @Override
   public void mainkanJoox(String namaLagu) {
   }

   //Untuk Mengoverride method dari ThePlayer dan membuat class mainkanSpotify
   @Override
   public void mainkanSpotify(String namaLagu) {
      System.out.println( namaLagu + "Diputar dengan Spotify");		
   }
}
