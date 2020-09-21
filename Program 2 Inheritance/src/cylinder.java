public class cylinder extends Luggage {
    private int radius;
    private int length;
    public cylinder(int radius, int length){
        super((float)(Math.PI * (radius * radius) * length),"cylinder");
        this.radius = radius;
        this.length = length;
    }
    public float getVolume(){
        return (float)(Math.round((Math.PI * (radius * radius) * length) * 100.0)/100.0);
    }
    public String toString(){
        return "Cylinder, Volume: " + getVolume() + ", Radius: " + radius + ", Length: " + length;
    }
}
