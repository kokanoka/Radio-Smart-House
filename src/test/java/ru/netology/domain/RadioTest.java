package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();
    Radio radio1 = new Radio(6, 5);

    @Test
    void setCurrentStationNumber() {
        radio.setCurrentStationNumber(8);
        assertEquals(8, radio.getCurrentStationNumber());
    }



    @Test
    void setCurrentOverMaxStationNumber() {
        radio.setCurrentStationNumber(30);
        assertEquals(0, radio.getCurrentStationNumber());
    }

    @Test
    void setCurrentBelowMinStationNumber() {
        radio.setCurrentStationNumber(-40);
        assertEquals(0, radio.getCurrentStationNumber());
    }

    @Test
    void setIncreaseStationNumber() {
        radio.setCurrentStationNumber(6);
        radio.increaseStationNumber();
        assertEquals(7, radio.getCurrentStationNumber());
    }

    @Test
    void setIncreaseMaxStationNumber() {
        radio.setCurrentStationNumber(radio.getMaxStationNumber());
        radio.increaseStationNumber();
        assertEquals(0, radio.getCurrentStationNumber());
    }

    @Test
    void setDecreaseStationNumber() {
        radio.setCurrentStationNumber(6);
        radio.decreaseStationNumber();
        assertEquals(5, radio.getCurrentStationNumber());
    }

    @Test
    void setDecreaseMinStationNumber() {
        radio.setCurrentStationNumber(radio.getMinStationNumber());
        radio.decreaseStationNumber();
        assertEquals(9, radio.getCurrentStationNumber());
    }

    @Test
    void setCurrentVolume() {
        radio.setCurrentVolume(8);
        assertEquals(8, radio.getCurrentVolume());
    }

    @Test
    void setCurrentOverMaxVolume() {
        radio.setCurrentVolume(140);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void setCurrentBelowMinVolume() {
        radio.setCurrentVolume(-20);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void setIncreaseVolume() {
        radio.setCurrentVolume(4);
        radio.increaseVolume();
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    void setIncreaseMaxVolume() {
        radio.setCurrentVolume(radio.getMaxVolume());
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void setDecreaseVolume() {
        radio.setCurrentVolume(4);
        radio.decreaseVolume();
        assertEquals(3, radio.getCurrentVolume());
    }

    @Test
    void setDecreaseMinVolume() {
        radio.setCurrentVolume(radio.getMinVolume());
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void setCurrentOverMaximumStation() {
        radio1.setCurrentStationNumber(9);
        assertEquals(0,radio1.getCurrentStationNumber());


    }
}