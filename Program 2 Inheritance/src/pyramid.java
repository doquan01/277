public class pyramid extends Luggage {
    private int base;
    private int height;
    public pyramid(int base, int height){
        super((float)((base * base * height) / 3), "pyramid");
        this.base = base;
        this.height = height;
    }
    public String toString(){
        return "Pyramid, Volume: " + Math.round(getVolume() * 100.0)/100.0 + " units cubed" + ", Base Length: " + base + ", Height: " + height;
    }
}
