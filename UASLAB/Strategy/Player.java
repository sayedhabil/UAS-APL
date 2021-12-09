package Strategy;

public class Player{

    //Mendelkarasikan sebuah variabel PlayerMethod
    private PlayerMethod PlayerMethod;
    
    //Method untuk merubah metode dalam play
    public void setPlayMethod(PlayerMethod play){
        this.PlayerMethod = play;
    }

    //Method untuk mendapatkan metode dalam play
    public PlayerMethod getPlayMethod(){
        return PlayerMethod;
    }

    //Method untuk melakukan mainkanMusik dengan metode yang dipilih
    public void mainkanMusik(){
        PlayerMethod.mainkanMusik();
    }
}
