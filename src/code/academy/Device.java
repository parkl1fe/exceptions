package code.academy;

public class Device {
    private boolean isOn;
    private static int newId;
    private int id;

    Device(boolean deviceStatus) {
        this.id = newId++;
        this.isOn = deviceStatus;
    }

    public void ping() throws DeviceIsOffException {
        if(!isOn()){
            throw new DeviceIsOffException();
        }
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getId() {
        return id;
    }

}