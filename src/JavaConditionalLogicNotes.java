import java.util.Scanner;

public class JavaConditionalLogicNotes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        ////////////////////// Boolean expressions///////////////
        System.out.println("Username: ");
        String username = input.nextLine();
        System.out.println("Password: ");
        String password = input.nextLine();
        //Login
        System.out.println( username.equalsIgnoreCase("annette") && password.equals("abcd123!"));
        ////////////////////////////////////////////////////////

        ///////Login with conditionals ////////////////////////
        if(username.isEmpty() || password.isEmpty()){
            System.out.println("one of the fields is empty");
        }else{
            //Login
            System.out.println( username.equalsIgnoreCase("annette") && password.equals("abcd123!"));
        }
        ///////////////////////////////////////////////////////

        ////////////////// CASE SWITCH ///////////////////////
//        System.out.println("Traffic Light");
//        String color = input.nextLine();
//
//        switch (color){
//            case "red":
//                System.out.println("stop");
//                break;
//            case "yellow":
//                System.out.println("slow down");
//                break;
//            case "green":
//                System.out.println("go");
//                break;
//            default:
//                System.out.println("blink");
//
//        }

        ////////////////////////////////////////////////////////

        ///////////////////////WHILE LOOPS///////////////////////////////
        ///always run while the condition is true

        boolean hasGas = true;

        while(hasGas){
            System.out.println("Traffic Light");
            String color = input.nextLine();

            switch (color){
                case "red":
                    System.out.println("stop");
                    break;
                case "yellow":
                    System.out.println("slow down");
                    break;
                case "green":
                    System.out.println("go");
                    break;
                default:
                    hasGas= false;
                    System.out.println("blink");

            }


            ///////////////do-while////////////////////////


        }


    }
}
