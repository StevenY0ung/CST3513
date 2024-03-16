// Task #1
// The purpose of this class is to model a television
// Author: Steven Young
// Date: 03/10/24

public class Television {
    // Constant fields
    private final String MANUFACTURER; // Represents the manufacturer of the television
    private final int SCREEN_SIZE; // Represents the size of the television screen in inches

    // Fields
    private boolean powerOn; // Represents whether the television is powered on or off
    private int channel; // Represents the current channel the television is tuned to
    private int volume; // Represents the volume level of the television

    // Task #2
    // Constructor
    public Television(String manufacturer, int screenSize) {
        MANUFACTURER = manufacturer;
        SCREEN_SIZE = screenSize;
        powerOn = false; // By default, the television is powered off
        channel = 2; // Default channel set to 2
        volume = 20; // Default volume level set to 20
    }

    // Task 3
    // Methods (Getters and Setters)
    public String getManufacturer() {
        return MANUFACTURER;
    }

    public int getScreenSize() {
        return SCREEN_SIZE;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

    public void power() {
        powerOn = !powerOn; // Toggle the power state
    }

    public void setChannel(int newChannel) {
        channel = newChannel;
    }

    public void increaseVolume() {
        volume++;
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
    }
}
