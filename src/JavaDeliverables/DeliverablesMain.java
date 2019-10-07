package JavaDeliverables;

public class DeliverablesMain {

    public static void main(String[] args){

//        //Question 1
//        Adder a = new Adder();
//
//        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
//        System.out.println(a.add(10, 32) + " " + a.add(10,3) + " " + a.add(10,10));

        //Question 2

        Alcohol drink = new Beer();
        System.out.println(drink.stateHistoryOf());

        Alcohol drink1 = new Wine();
        System.out.println(drink1.stateHistoryOf());

        Alcohol drink2 = new Spirits();
        System.out.println(drink2.stateHistoryOf());





    }
}
