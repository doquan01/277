public class cone extends Luggage {
    private int radius;
    private int height;
    public cone(int radius, int height){
        super((float)((Math.PI * (radius * radius) * height)/3),"cone");
        this.radius = radius;
        this.height = height;
    }
    public float getVolume(){
        return (float)((Math.PI * (radius * radius) * height)/3);
    }
    public String toString(){
        return "";
    }
}
