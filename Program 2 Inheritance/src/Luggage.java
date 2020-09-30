abstract class Luggage implements Comparable{
    private float volume;
    private String type;

    public Luggage(float volume, String type){
        this.volume = volume;
        this.type = type;
    }
    public int compareTo(Object lug){
        Luggage newLug = (Luggage)lug;

        if(this.volume > newLug.volume){
            return 1;
        }
        else if(this.volume < newLug.volume){
            return -1;
        }
        else{
            return 0;
        }
    }
    public String toString(){
        return "Type: " + type + ", Volume: " + volume;
    }
    public float getVolume(){
        return volume;
    }
}
