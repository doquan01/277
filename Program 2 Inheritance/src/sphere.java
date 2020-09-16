public class sphere extends Luggage {
    private int radius;
    public sphere(int radius){
        super((float)((4/3) * Math.PI * (radius * radius * radius)), "sphere");
        this.radius = radius;
    }
    public float getVolume(){
        return (float)((4/3) * Math.PI * (radius * radius * radius));
    }
    public String toString(){
        return "";
    }
}
