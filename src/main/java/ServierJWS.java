import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class ServierJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9999/",new BanqueService());
        System.out.println("web service depolye dans le port 9999");
    }
}
