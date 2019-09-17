public class HelloWorld {
    public static void main(String[] args) {
        System.out.println ("Hello, World!");

        int myFavoriteNumber = 25;
        System.out.println (myFavoriteNumber);

        String myString = "My name is Annette.";
        System.out.println(myString);

//        explicit casting
//        double myNumber= 3.14;
//        float y = (float) myNumber;
//        System.out.println(myNumber);
//        System.out.println(y);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

        ///Does not work because you can not assign a number to a string
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

        //does not work because a string can not be converted into an integer
//        int three = (int) "three";
//        System.out.println(three);
/*********one***************
//        int x = 4;
//        x = x + 5;
//        System.out.println(x);
******is the same as *****/


//        int x = 4;
//        x +=5;
//        System.out.println(x);

/*********two***************
//        int x = 3;
//        int y = 4;
//        y = y * x;
//        System.out.println(y);
 ******is the same as *****/

//        int x =3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);

        /*********three***************
//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;
//        System.out.println(y);
  ******is the same as *****/

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
        System.out.println(x);
        System.out.println(y);

    }


}