package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {

    private int currentStation; // текущая радиостанция
    private int minStation;
    private int maxStation = 10;

    private int currentVolume; // текущая громкость звука
    private int minVolume;
    private int maxVolume = 100;


    public Radio(int maxStation) {
        this.maxStation = maxStation;
    }

    public Radio(int currentStation, int maxStation) {
        this.currentStation = currentStation;
        this.maxStation = maxStation;
    }

    public Radio(int currentVolume, int minVolume, int maxVolume) {
        this.currentVolume = currentVolume;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
    }


    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {

        if (currentStation < minStation) {
            this.currentStation = minStation;
            return;
        }
        if (currentStation > maxStation) {
            this.currentStation = maxStation;
            return;
        }
        this.currentStation = currentStation;
    }


    public void nextStation() {
        if (currentStation == maxStation) {
            this.currentStation = minStation;
            return;
        }
        currentStation++;
    }


    public void prevStation() {
        if (currentStation == minStation) {
            this.currentStation = maxStation;
            return;
        }
        currentStation--;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {

        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }

        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void plusVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        currentVolume++;
    }

    public void minusVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        currentVolume--;
    }
}

