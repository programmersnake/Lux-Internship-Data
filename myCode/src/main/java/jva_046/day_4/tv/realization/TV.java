package jva_046.day_4.tv.realization;

public class TV {

    private boolean isOn;

    private int channel;
    private final int maxChannel = 50;

    private int volume;
    private final int maxVolume = 100;

    public TV() {
        isOn = false;
        volume = 0;
        channel = 1;
    }

    public void redButtonAction() {
        if(isOn)
            System.out.println("Was click Red Button");
    }

    public void yellowButtonAction() {
        if(isOn)
            System.out.println("Was click Yellow Button");
    }

    public void greenButtonAction() {
        if(isOn)
            System.out.println("Was click Green Button");
    }

    public void blueButtonAction() {
        if(isOn)
            System.out.println("Was click Blue Button");
    }

    public void increaseVolume() {
        if((isOn) && (volume<maxVolume))
            volume++;
    }

    public void reduceVolume() {
        if((isOn) && (volume>0))
            volume--;
    }

    public void nextChannel() {
        if((isOn) && (channel<maxChannel))
            channel++;
        else
            channel = 0;
    }

    public void backChannel() {
        if((isOn) && (channel>0))
            channel--;
        else
            channel = maxChannel;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOnOff() {
        if(isOn)
            isOn = false;
        else
            isOn = true;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getInfo() {
        return "TV[" +
                "isOn=" + isOn +
                ", channel=" + channel +
                ", volume=" + volume +
                ']';
    }
}
