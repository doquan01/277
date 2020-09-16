public class hexagonalPrism extends Luggage{
    public hexagonalPrism(double edge, double height){
        super((float)((((3 * Math.sqrt(3))/2) * (edge * edge) * height)),"hexagonal prism");
    }
    public String toString(){
        return "";
    }
}
