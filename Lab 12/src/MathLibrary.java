//Quan Do, Ashur Motlagh, Emmanuel Rodriguez, Tony Tran
//Demo Time: 4:19
//Week 12 Lab Singleton

public class MathLibrary {
    private static MathLibrary instance = null;
    // declare the constructor as private which prevents object creation via new
    private MathLibrary() { }

    public synchronized static MathLibrary getInstance() {
        if (instance == null)
            instance = new MathLibrary();
        return instance;
    }

    public int someMathMethod() {
        return -1;
    }

    public double anotherMathMethod() {
        return 0;
    }
}
