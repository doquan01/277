public class cylinder extends Luggage {
    private int radius;
    private int length;
    public cylinder(int radius, int length){
        super((float)(Math.PI * (radius * radius) * length),"cylinder");
        this.radius = radius;
        this.length = length;
    }
    public String toString(){
        return "Cylinder, Volume: " + Math.round(getVolume() * 100.0)/100.0 + ", Radius: " + radius + ", Length: " + length;
    }
}
