/*output ;
bang bang ba-bang
ding ding da-ding*/


class Drumkit{
    boolean topHat = true;
    boolean snare = true;
    void playSnare(){
        System.out.println("bang bang ba-bang");
    }

    void playTopHat(){
        System.out.println("ding ding da-ding");
    }
}
class Drumkittestdrive {
    public static void main(String[] args){
        Drumkit d = new Drumkit();
        if(d.snare == true){
            d.playSnare();
        }
        d.snare = false;
        d.playTopHat();
    }
}
