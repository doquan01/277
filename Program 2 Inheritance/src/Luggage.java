abstract class Luggage implements Comparable{
    float volume;
    String type;

    public Luggage(float volume, String type){
        this.volume = volume;
        this.type = type;
    }
//    public String toString(){
//        return "Luggage type: " + type + ", Volume: " + volume;
//    }
    public int compareTo(Luggage lug){
        if(this.volume > lug.volume){
            return 1;
        }
        else if(this.volume < lug.volume){
            return -1;
        }
        else{
            return 0;
        }
    }
}
