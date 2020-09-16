public class cylinder extends Luggage {
    private int radius;
    private int length;
    public cylinder(int radius, int length){
        super((float)(Math.PI * (radius * radius) * length),"cylinder");
        this.radius = radius;
        this.length = length;
    }
    public float getVolume(){
        return (float)(Math.PI * (radius * radius) * length);
    }
    public String toString(){
        return "Cylinder, Volume: " + getVolume() + ", Radius: " + radius + ", Length: " + length;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
