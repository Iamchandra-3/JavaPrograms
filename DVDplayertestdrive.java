class DVDplayer{
    boolean canRecord = false;

    void playDVD(){
        System.out.println("DVD Playing...");
    }
    void recordDVD(){
        System.out.println("DVD Recording...");
    }
}



public class DVDplayertestdrive {
    public static void main(String[] args){
        DVDplayer d = new DVDplayer();
        d.canRecord = true;
        d.playDVD();
        if(d.canRecord == true){
            d.recordDVD();
        }
    }
}
