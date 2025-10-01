public class Notes {
    public static void main(String[] args) {


        long myLong = 3L;
        short myShort = 3;
        byte myByte = 2;

        // default int type
        int myInt = 3;


        float myFloat = 3.3f;

        // default decimal typ
        double myDouble = 3.3;

        char myChar = 'a';
        String myString = "Hello World!";

        boolean myBoolean = true;

        if (myInt > 3){
            System.out.println("It's greater than 3 ");
        }else {
            System.out.println("It's not greater than 3");
        }

        final double g = 9.8; // gravity acc in m/s^2

        Circle myCircle = new Circle(1,2,3);

        Circle myCircle2 = new Circle();
        Circle myCircle3 = new Circle(1, 2);
        Circle myCircle4 = new Circle(1);

        Circle myCircle5 = Circle.makeCircleWithRadiusX(2.3, 3.4);

    }
}
