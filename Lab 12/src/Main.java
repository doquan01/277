//Quan Do, Ashur Motlagh, Emmanuel Rodriguez, Tony Tran
//Demo Time: 4:19
//Week 12 Lab Singleton
class Main{
    public static void main(String [] args){
        MathLibrary someMethod = MathLibrary.getInstance();
        MathLibrary anotherMethod = MathLibrary.getInstance();
        System.out.println(someMethod.toString());
        System.out.println("Hashcode for someMethod : " + someMethod.hashCode());

        System.out.println(anotherMethod.toString());
        System.out.println("Hashcode for anotherMethod : " + anotherMethod.hashCode());

    }
}