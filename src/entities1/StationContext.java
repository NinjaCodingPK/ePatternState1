package entities1;

/**
 * Created by wookie on 5/25/16.
 */
public class StationContext {
    private Station station;

    public void setStation(Station station) {
        this.station = station;
    }

    public void nextStation() {
        if(station instanceof  Radio1) {
            setStation(new Radio2());
        }
        else
            if(station instanceof  Radio2) {
                setStation(new Radio1());
            }
    }

    public void play() {
        station.play();
    }
}
