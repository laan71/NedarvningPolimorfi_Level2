import java.util.Date;

public class Merchandise {

    double price;
    double weight;
    double prisPrBundt;
    double antalBlomsterPrBundt;
    Date holdbarhed;
    boolean kanSælges = true;
    boolean skalTilberedes = true;
    boolean freerange = true;

    void smidUd() {
        kanSælges = false;
    }
}
