package code.academy;

import java.util.List;

public class Monitoring {

    public static void pingAllDevices (List<Device> devices) {
        System.out.println("PINGING STARTED: ");
        for (Device device : devices) {
            try {
                device.ping();
                System.out.println(String.format("DEVICE: %s with id %s is ON", device.getClass().getSimpleName(), device.getId()));
            } catch (DeviceIsOffException e) {
                System.out.println(String.format("DEVICE: %s with id %s is OFF", device.getClass().getSimpleName(), device.getId()));

            }
        }
        System.out.println("PINGING FINISHED");

    }
}