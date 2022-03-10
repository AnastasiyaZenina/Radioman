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

    public Radio(int currentStation, int currentVolume, int quantityStation,
                 int minVolume, int maxVolume, int minStation, int maxStation) {
        this.currentStation = currentStation;
        this.currentVolume = currentVolume;
        this.quantityStation = quantityStation;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.minStation = minStation;
        this.maxStation = maxStation;
    }

    public Radio(int currentStation, int currentVolume) {
        this.currentStation = currentStation;
        this.currentVolume = currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}
