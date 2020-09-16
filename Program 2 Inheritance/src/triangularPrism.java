public class triangularPrism extends Luggage {
    private int width;
    private int height;
    private int length;
    public triangularPrism(int width, int height, int length){
        super((float)(((width * height) / 2) * length),"triangular prism");
        this.width = width;
        this.height = height;
        this.length = length;
    }
    public float getVolume(){
        return (float)(Math.round(((((width * height) / 2) * length) * 100.0))/100.0);
    }
    public String toString(){
        return "Triangular Prism, Volume: " + getVolume() + ", Width: " + width + ", Height: " + height + ", Length: " + length;
    }
}
