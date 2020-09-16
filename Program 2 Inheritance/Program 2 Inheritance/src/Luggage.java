abstract class Luggage{
    float volume;
    String type;

    public Luggage(float volume, String type){
        this.volume = volume;
        this.type = type;
    }
    public String toString(){
        return "Luggage type: " + type + ", Volume: " + volume;
    }
    public boolean compareTo(Luggage lug){
        return this.volume > lug.volume;
    }
}
