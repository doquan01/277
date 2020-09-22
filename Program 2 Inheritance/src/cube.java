public class cube extends Luggage {
    private int width;
    public cube(int width){
        super((float)(width * width * width),"cube");
        this.width = width;
    }
    public String toString(){
        return "Cube, Volume: " + Math.round(getVolume() * 100.0)/100.0 + " units cubed" + ", Width: " + width;
    }
}
