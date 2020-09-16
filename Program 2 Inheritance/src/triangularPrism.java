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
        return (float)(((width * height) / 2) * length);
    }
    public String toString(){
        return "Triangular Prism, Volume: " + getVolume() + ", Width: " + width + ", Height: " + height + ", Length: " + length;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
