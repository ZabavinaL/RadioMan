package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void changeNextStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.nextStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void changePrevStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);
        radio.prevStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void pressOnTheNextButton() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void pressOnThePrevButton() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void toSetTheStationNumberMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(-6);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void toSetTheStationNumberMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(11);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void volumeIncrease() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);
        radio.plusVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void volumeDecrease() {
        Radio radio = new Radio();

        radio.setCurrentVolume(3);
        radio.minusVolume();
        assertEquals(2, radio.getCurrentVolume());
    }

    @Test
    public void volumeIncreaseOverMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(12);
        radio.plusVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void volumeDecreaseUnderMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);
        radio.minusVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}
