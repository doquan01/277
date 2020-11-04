/*
 * Naeun Yu
 * Quan Do
 * Ashur Motlagh
 * Yang Xu
 * Time Demoed: 6:13pm
 */

class Lab8 {
    public static void main(String[] args) {
        try{
            divide(30, 1); // ArithmeticException
            index(3); // ArrayIndexOutOfBoundsException
            testClassCastE(); //ClassCastException
            String k = "hello";
            nullPoint(k);
            ilArg("1"); //IllegalArgumentException
            int x = 3;
            int y = 1;
            int z = add(x, y);
            System.out.println("Last Statement of try block");
        }
        catch(ArithmeticException e){
            System.out.println("You should not divide a number by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Accessing array elements outside of the limit");
        }
        catch(NullPointerException e){
            System.out.println("NullPointer Exception occured");
        }
        catch(IllegalArgumentException e){
            System.out.println("IllegalArgument Exception occured");
        }
        catch(ClassCastException e){
            System.out.println("ClassCastException Exception occured");
        }
        catch(OverflowException e){
            System.out.println("OverFlowError occurred ");
        }
        System.out.println("Out of the try-catch block");
    }
    public static int divide(int x, int y){
        return x/y;
    }
    public static int index(int x){
        int temp[] = {0,1,2,3,4};
        int num = temp[x];
        return num;
    }
    public static int add(int x, int y)throws OverflowException{
        // int z = 0;
        int z = x + y; //-2147483648 = MAX_VALUE + 1
        long y2 = (long) z - (long) x; // 1 = -2147483648 - MAX_VALUE.println();

        if(y2 != y){
            throw new OverflowException();
        }else{
            return z;
        }
    }
    public static String nullPoint(String a){
        return a.toString();
    }
    public static int ilArg(String x){
        int a = Integer.parseInt(x);
        return a;
    }
    public static String testClassCastE() {
        String x = "hi";
        // Object x = new Integer(0);
        return (String) x;
    }
}

