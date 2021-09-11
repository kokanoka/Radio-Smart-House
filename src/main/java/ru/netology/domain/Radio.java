package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int currentStationNumber;
    private int currentVolume;
    private int maxStationNumber = 9;
    private int minStationNumber = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int amountStations = 10;


    public Radio(int amountStations, int maxStationNumber) {
        this.amountStations = amountStations;
        this.maxStationNumber = maxStationNumber;
    }

    public void setCurrentStationNumber(int currentStationNumber) {
        if (currentStationNumber > maxStationNumber) {
            return;
        }
        if (currentStationNumber < minStationNumber) {
            return;
        }
        this.currentStationNumber = currentStationNumber;
    }

    public void increaseStationNumber() {
        int nextStationNumber = currentStationNumber + 1;
        if (currentStationNumber < maxStationNumber) {
            this.currentStationNumber = nextStationNumber;
        } else {
            this.currentStationNumber = minStationNumber;
        }
    }

    public void decreaseStationNumber() {
        int nextStationNumber = currentStationNumber - 1;
        if (currentStationNumber > minStationNumber) {
            this.currentStationNumber = nextStationNumber;
        } else {
            this.currentStationNumber = maxStationNumber;
        }
    }

    public void setCurrentVolume(int currentVolume){
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        int nextVolume = currentVolume + 1;
        if (currentVolume < maxVolume) {
            this.currentVolume = nextVolume;
        } else
            this.currentVolume = currentVolume;
    }

    public void decreaseVolume() {
        int nextVolume = currentVolume - 1;
        if (currentVolume > minVolume) {
            this.currentVolume = nextVolume;
        } else
            this.currentVolume = currentVolume;
    }
}
