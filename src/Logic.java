import com.sun.jdi.event.ExceptionEvent;

import java.util.ArrayList;
import java.util.Objects;

public class Logic {

    // Seats variable
    ArrayList<String> barberingShopSeats;

    String event;

    // Customer Counter
    int VIPCounter;
    int OrdCounter;

    public Logic(){
        barberingShopSeats = new ArrayList<>(6);
    }

    public void init(int generatedNumber ){
        //getRandom Number
        processRandomNumber(generatedNumber);
        testPrint(generatedNumber, " Was generated.");
    }

    public void testPrint(int rand,String test){
        System.out.println(rand + " " + test);
    }
    public void printTest(ArrayList<String> seats){
        System.out.println(seats);
    }

    public void finishedCustomer(){
        if(!barberingShopSeats.isEmpty()){
            barberingShopSeats.removeFirst();
        } else {
            System.out.println("No customer on the main seat!");
        }
    }


    public void isVIP(){
        var i = VIPCounter;
        ++VIPCounter;

        event = "VIP";
        var prevVIPIndex = barberingShopSeats.indexOf(event + i);

        if(barberingShopSeats.isEmpty()){
            barberingShopSeats.add(VIPCounter + event);
        } else if (!barberingShopSeats.contains("VIP") && OrdCounter > 0){
            barberingShopSeats.add(1, event+VIPCounter);
        }
        else if (prevVIPIndex >= 1){
            var index = prevVIPIndex;
            var newIndex = ++index;
            barberingShopSeats.add(newIndex, event+ VIPCounter);
        }
    }

    public void isOrd(){
        ++OrdCounter;
        event = "Ord";
        barberingShopSeats.add(event + OrdCounter);
    }

    public void processRandomNumber(int eventNumber){

        if(barberingShopSeats.size() != 6 ){
            if( eventNumber == 0){
                finishedCustomer();
            } else if (eventNumber == 1){
                isVIP();
            } else {
                isOrd();
            }
        }
        else{
            if(eventNumber == 0){
                finishedCustomer();
            }
            System.out.println("+-");
        }

        printTest(barberingShopSeats);
    }


}
