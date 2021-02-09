public class cone extends Luggage {
    private int radius;
    private int height;
    public cone(int radius, int height){
        super((float)((Math.PI * (radius * radius) * height)/3),"cone");
        this.radius = radius;
        this.height = height;
    }
    public String toString() {
        return "Cone, Volume: " + Math.round(getVolume() * 100.0)/100.0 + " units cubed" + ", Radius: " + radius + ", Height: " + height;
    }
}
