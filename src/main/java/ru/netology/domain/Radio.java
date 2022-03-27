package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation = 9;
    private int minStation = 0;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 10) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        this.currentVolume = newCurrentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setPrevStation() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
            return;
        }
        this.currentStation = maxStation;
    }

    public void setNextStation() {
        if (currentStation == maxStation) {
            this.currentStation = 0;
            return;
        }
        if (currentStation > minStation) {
            this.currentStation = currentStation + 1;
            return;
        }
        this.currentStation = currentStation + 1;
    }
}
