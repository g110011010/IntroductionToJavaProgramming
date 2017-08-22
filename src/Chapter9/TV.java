package Chapter9;

/**
 * Created by sf on 2017/8/22.
 */
public class TV {
    private int channel;
    private int volumeLevel;
    private boolean on;
    public void turnOn(){
        this.on=true;
    }
    public void turnOff(){
        this.on=false;
    }
    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }
    public void channelUp(){
        this.channel++;
    }
    public void channelDown(){
        this.channel--;
    }
    public void volumeLevelUp(){
        this.volumeLevel++;
    }
    public void volumeLevelDown(){
        this.volumeLevel--;
    }
}
