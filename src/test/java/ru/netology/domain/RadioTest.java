package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldMaxStation(){
        Radio radio = new Radio(10);

        assertEquals(10, radio.getMaxStation());
    }

    @Test
    public void changeNextStation() {
        Radio radio = new Radio(5,10);

        radio.nextStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void changePrevStation() {
        Radio radio = new Radio(9,10);

        radio.prevStation();
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void pressOnTheNextButton() {
        Radio radio = new Radio(10,10);

        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void pressOnThePrevButton() {
        Radio radio = new Radio(0,10);

        radio.prevStation();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void toSetTheStationNumberMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(-2);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void toSetTheStationNumberMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(11);
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void volumeIncrease() {
        Radio radio = new Radio(4, 0, 100);

        radio.plusVolume();
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void volumeDecrease() {
        Radio radio = new Radio(4, 0, 100);

        radio.minusVolume();
        assertEquals(3, radio.getCurrentVolume());
    }

    @Test
    public void volumeIncreaseOverMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(109);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void volumeDecreaseUnderMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);
        radio.minusVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}
