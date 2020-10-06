// Quan Do, Scott Herron, Josiah Rojas, Williams Nguyen
// Class: CECS 277
// Sec 02 - 2791
//Demo time: 4:40
import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {
    public BetterRectangle(int x, int y, int width, int height){
        setLocation(x, y);
        setSize(width, height);
    }
    public int getPerimeter()
    {
        return 2 * (this.width + this.height);
    }
    public int getArea(){
        return (this.width * this.height);
    }
}