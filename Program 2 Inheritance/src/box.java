public class box extends Luggage{
    private int length;
    private int width;
    private int height;

    public box(int length, int width, int height){
        super((float)((length * width * height)),"box");
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public String toString(){
        return "Box, Volume: " + Math.round(getVolume() * 100.0)/100.0 + " units cubed" + ", Length: " + length + ", Width: " + width + ", Height: " + height;
    }
}