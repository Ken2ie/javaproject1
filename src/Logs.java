import java.util.ArrayList;
import java.util.List;

public class Logs {

    static ArrayList<String> eventStreams = new ArrayList<>();
    static String stream;

    public Logs(){
    }

    public static void eventStreamer(int x, ArrayList<String> barberingShopSeats, String event){
        StringBuilder streamer = new StringBuilder();

        for(int i = 0; i < 6; i++) {
            String curr = "";
            if (i < barberingShopSeats.size()) {
                curr = barberingShopSeats.get(i);
            }
            if(curr.isEmpty()) {
                streamer.append(": ---- ");
            } else {
                streamer.append(": ").append(curr).append(" ");
            }
        }

        stream  =  x + " ----> " + "( " + event + " ) " + "[ " + streamer.substring(1) + "]" ;
        eventStreams.add(stream);
        log();
    }

    public static void log(){
//        for(String stream: eventStreams) {
            System.out.println(stream);
//        }
    }
}
