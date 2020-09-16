public class sphere extends Luggage {
    private int radius;
    public sphere(int radius){
        super((float)((4/3) * Math.PI * (radius * radius * radius)), "sphere");
        this.radius = radius;
    }
    public float getVolume(){
        return (float)(Math.round(((4/3) * Math.PI * (radius * radius * radius))*100.0)/100.0);
    }
    public String toString(){
        return "Sphere, Volume: " + getVolume() + ", Radius: " + radius;
    }
}
