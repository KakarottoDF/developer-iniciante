package factory;

import transport.Transport;
import transport.Truck;

public class RoadLogistic extends Logistic{
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
