package ru.netology.domain;

public class Radio {
    private int currentStationNumber;
    private int currentVolume;
    private int maxStationNumber = 9;
    private int minStationNumber = 0;
    private int maxVolume = 10;
    private int minVolume = 0;



    public void setCurrentStationNumber(int currentStationNumber) {
        if (currentStationNumber > maxStationNumber) {
            return;
        }
        if (currentStationNumber < minStationNumber) {
            return;
        }
        this.currentStationNumber = currentStationNumber;
    }

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public int getMaxStationNumber() {

        return  maxStationNumber;
    }

    public int getMinStationNumber() {

        return minStationNumber;
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

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
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
