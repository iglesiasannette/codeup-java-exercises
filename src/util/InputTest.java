package util;


public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

//        System.err.println(input.getString()); //version 1
//        System.err.println(input.getString("Talk to me: ")); // version 2
//
//        System.err.println(input.getInt());
//        System.err.println(input.getDouble());
//        System.err.println(input.yesNo());


        //bonus
        System.out.println(input.getBinary());
        System.out.println(input.getStandard());
    }

    //System.out.println, then you're dumping your errors to the stdout, not stderr.
    //It's traditional to dump errors to standard error, so you can filter normal successful
    // output from the error output. It's a common practise for command-line utilities and consequently a
    // good idea to follow
}