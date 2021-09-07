package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void setCurrentStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(8);
        assertEquals(8, radio.getCurrentStationNumber());
    }

    @Test
    void setCurrentOverMaxStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(30);
        assertEquals(0, radio.getCurrentStationNumber());
    }

    @Test
    void setCurrentBelowMinStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(-40);
        assertEquals(0, radio.getCurrentStationNumber());
    }

    @Test
    void setIncreaseStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(6);
        radio.increaseStationNumber();
        assertEquals(7, radio.getCurrentStationNumber());
    }

    @Test
    void setIncreaseMaxStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(radio.getMaxStationNumber());
        radio.increaseStationNumber();
        assertEquals(0, radio.getCurrentStationNumber());
    }

    @Test
    void setDecreaseStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(6);
        radio.decreaseStationNumber();
        assertEquals(5, radio.getCurrentStationNumber());
    }

    @Test
    void setDecreaseMinStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(radio.getMinStationNumber());
        radio.decreaseStationNumber();
        assertEquals(9, radio.getCurrentStationNumber());
    }

    @Test
    void setCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        assertEquals(8, radio.getCurrentVolume());
    }

    @Test
    void setCurrentOverMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(40);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void setCurrentBelowMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-20);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void setIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.increaseVolume();
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    void setIncreaseMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(radio.getMaxVolume());
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void setDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.decreaseVolume();
        assertEquals(3, radio.getCurrentVolume());
    }

    @Test
    void setDecreaseMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(radio.getMinVolume());
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

}