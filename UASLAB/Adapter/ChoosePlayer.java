package Adapter;

public class ChoosePlayer implements MediaSound {
   Adapter soundAdapter; 

   //Untuk meng-Override method pada class MediaSound
   @Override
   public void play(String soundSystem, String namaLagu) {		
      
      //untuk membuat pemutaran joox dan spotify
      if(soundSystem.equalsIgnoreCase("joox") || soundSystem.equalsIgnoreCase("spotify")){
         soundAdapter = new Adapter(soundSystem);
         soundAdapter.play(soundSystem, namaLagu);
      }
      
      else{
         System.out.println("Sound Tidak Ada Dalam List, Harap Menuliskan Dengan Benar");
      }
   }   
}
