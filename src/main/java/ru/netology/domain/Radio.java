package ru.netology.domain;

public class Radio {

    private int currentStation; // текущая радиостанция
    private int firstStation;
    private int lastStation = 9;
    private int currentVolume; // текущая громкость звука
    private int minVolume;
    private int maxVolume = 10;


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {

        if(currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }

        if(currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {

        if (currentStation < firstStation) {
            this.currentStation = firstStation;
            return;
        }
        if (currentStation > lastStation) {
            this.currentStation = lastStation;
            return;
        }

        this.currentStation = currentStation;
    }


    public int getFirstStation() {
        return firstStation;
    }

    public void setFirstStation(int firstStation) {
        this.firstStation = firstStation;
    }

    public int getLastStation() {
        return lastStation;
    }

    public void setLastStation(int lastStation) {
        this.lastStation = lastStation;
    }


    public void nextStation() {
        if (currentStation == lastStation) {
            this.currentStation = firstStation;
            return;
        }
        currentStation++;
    }


    public void prevStation() {
        if (currentStation == firstStation) {
            this.currentStation = lastStation;
            return;
        }
        currentStation--;
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
