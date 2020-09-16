public class pyramid extends Luggage {
    private int base;
    private int height;
    public pyramid(int base, int height){
        super((float)((base * base * height) / 3), "pyramid");
        this.base = base;
        this.height = height;
    }
    public float getVolume(){
        return (float)((base * base * height) / 3);
    }
    public String toString(){
        return "";
    }
}
