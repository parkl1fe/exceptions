package code.academy;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Device> devices=new ArrayList<>();
        devices.add(new Mouse(true));
        devices.add(new Display(true));
        devices.add(new Keyboard(true));
        devices.add(new Mouse(true));
        devices.add(new Display(true));
        devices.add(new Keyboard(true));
        Monitoring.pingAllDevices(devices);
        devices.get(3).setOn(false);
        System.out.println();
        Monitoring.pingAllDevices(devices);

    }

}


