package main;

import entities1.Radio1;
import entities1.StationContext;
import entities2.Human;
import entities2.Rest;

/**
 * Created by wookie on 5/25/16.
 */
public class Main {
    public static void main(String[] args) {
        StationContext radio = new StationContext();
        radio.setStation(new Radio1());
        radio.play();
        radio.nextStation();
        radio.play();

        Human human = new Human();
        human.setActivity(new Rest());
        human.doSomething();
        human.doSomething();
        human.doSomething();
    }
}
