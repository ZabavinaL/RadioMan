package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {


    @Test
    public void maxStation() {
        Radio radio = new Radio(4);

        assertEquals(4, radio.getMaxStation());
    }


    @Test
    public void setTheDesiredStation() {
        Radio radio = new Radio(5);
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void allValue() {
        Radio radio = new Radio(2, 0, 10, 9, 0, 100);

        assertEquals(2, radio.getCurrentStation());
        assertEquals(0, radio.getMinStation());
        assertEquals(10, radio.getMaxStation());
        assertEquals(9, radio.getCurrentVolume());
        assertEquals(0, radio.getMinVolume());
        assertEquals(100, radio.getMaxVolume());
    }


    @Test
    public void changeNextStation() {
        Radio radio = new Radio(5, 10);

        radio.nextStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void changePrevStation() {
        Radio radio = new Radio(9, 10);

        radio.prevStation();
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void minMaxStationValue() {
        Radio radio = new Radio();

        radio.setMaxStation(10);
        radio.setMinStation(0);
        assertEquals(10, radio.getMaxStation());
        assertEquals(0, radio.getMinStation());
    }


    @Test
    public void pressOnTheNextButton() {
        Radio radio = new Radio(10, 10);

        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void pressOnThePrevButton() {
        Radio radio = new Radio(0, 10);

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
    public void setAnyStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(23);
        assertEquals(10, radio.getCurrentStation());
    }


    @Test
    public void volumeValues() {
        Radio radio = new Radio();

        radio.setCurrentVolume(8);
        radio.setMinVolume(0);
        radio.setMaxVolume(100);

        assertEquals(8, radio.getCurrentVolume());
        assertEquals(0, radio.getMinVolume());
        assertEquals(100, radio.getMaxVolume());
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
    public void increaseFromMaxVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.plusVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void decreaseFromMinVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.minusVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void toSetTheVolumeNumberMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void toSetTheVolumeNumberMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(110);
        assertEquals(100, radio.getCurrentVolume());
    }
}
