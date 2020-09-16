public class hexagonalPrism extends Luggage{
    private int edge;
    private int height;
    public hexagonalPrism(int edge, int height){
        super((float)((((3 * Math.sqrt(3))/2) * (edge * edge) * height)),"hexagonal prism");
        this.edge = edge;
        this.height = height;
    }
    public float getVolume(){
        return (float)((((3 * Math.sqrt(3))/2) * (edge * edge) * height));
    }
    public String toString(){
        return "Hexagonal Prism, Volume: " + getVolume() + ", Edge: " + edge + ", Height: " + height;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
