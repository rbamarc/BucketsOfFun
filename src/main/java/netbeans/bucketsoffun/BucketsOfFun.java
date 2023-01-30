package netbeans.bucketsoffun;

/**
 *
 * @author halfrikan
 */
public class BucketsOfFun {

    public static void main(String[] args) {
        //Declare ALL THE THINGS
        //(usually its a good idea to declare them at the beginning of
        //the program)
        int butterflies, beetles, bugs;
        
        //Now give a couple of them some values
        butterflies = 5;
        beetles = 9;
        
        bugs = beetles + butterflies;
        System.out.println("There are only " + butterflies + "butterflies");
        System.out.println("but there are " + bugs + " bugs in all!");
        
        System.out.println("Uh oh, my dog ate one.");
        butterflies --;
        System.out.println("Now there are only " + butterflies + " butterflies left.");
        
        System.out.println("But there are still " + bugs + " bugs left...");
        System.out.println("WAIT A MINUTE");
        System.out.println("... maybe my computer can't do math after all");
    }
}
