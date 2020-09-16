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
    public float getVolume(){
        return (float)((length * width * height));
    }
    public String toString(){
        return "";
    }
}