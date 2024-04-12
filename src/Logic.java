import com.sun.jdi.event.ExceptionEvent;

import java.util.ArrayList;
import java.util.List;
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
        }
        else if (barberingShopSeats.contains(event+i)){
            var prevVIP = VIPCounter;
            prevVIPIndex = prevVIP - 1;
            int VIPIndex = barberingShopSeats.indexOf(event+ prevVIPIndex);
            ++VIPIndex;
            barberingShopSeats.add(VIPIndex, event + VIPCounter);
        }
        else if (!barberingShopSeats.contains(event+VIPCounter) && OrdCounter > 0){
            barberingShopSeats.add(1, event+VIPCounter);
        }

        event = "++VIP" + VIPCounter;
    }

    public void isOrd(){
        ++OrdCounter;
        event = "Ord";
        barberingShopSeats.add(event + OrdCounter);
        event = "++Ord" + OrdCounter;
    }

    public void processRandomNumber(int eventNumber){

        if(barberingShopSeats.size() != 6 ){
            if( eventNumber == 0){
                if(!barberingShopSeats.isEmpty()) event = "--" + barberingShopSeats.getFirst();
                finishedCustomer();
            } else if (eventNumber == 1){
                isVIP();
            } else {
                isOrd();
            }
        }
        else{
            if(eventNumber == 0){
                event = "--" + barberingShopSeats.getFirst();
                finishedCustomer();
            }
            else if(eventNumber == 1){
                var vipNextCount = VIPCounter + 1;
                event = "+-VIP" + vipNextCount;
            } else if(eventNumber >= 2){
                var ordNextCount = OrdCounter + 1;
                event = "+-Ord" + ordNextCount;
            }
        }

        Logs.eventStreamer(eventNumber, barberingShopSeats, event);
    }


}
