package com.example.mainactivity;

public class Music {
    private String mantra;
    private String days;
    private int song;

    public Music(String mantra, String days, int song) {
        this.mantra = mantra;
        this.days = days;
        this.song = song;
    }

    public String getMantra() {
        return mantra;
    }

    public void setMantra(String mantra) {
        this.mantra = mantra;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public int getSong() {
        return song;
    }

    public void setSong(int song) {
        this.song = song;
    }
}
