public class cube extends Luggage {
    private int width;
    public cube(int width){
        super((float)(width * width * width),"cube");
        this.width = width;
    }
    public float getVolume(){
        return (float)(width * width * width);
    }
    public String toString(){
        return "";
    }
}
