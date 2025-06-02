package factory;

import transport.Ship;
import transport.Transport;

public class SealLogistic extends Logistic{
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
