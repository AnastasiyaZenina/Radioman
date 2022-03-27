package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int quantityStation = 10;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int minStation = 0;
    private int maxStation = 9;

    public Radio() {
    }

    public Radio(int quantityStation) {
        this.quantityStation = quantityStation;
    }

    public int getQuantityStation() {
        return quantityStation;
    }

    public void setQuantityStation(int quantityStation) {
        this.quantityStation = quantityStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }
        this.currentVolume = newCurrentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation >= quantityStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setPrevStation() {
        if (currentStation > minStation) {
            this.currentStation = currentStation - 1;
            return;
        }
        this.currentStation = quantityStation - 1;
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
