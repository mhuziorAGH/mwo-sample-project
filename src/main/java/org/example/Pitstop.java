package org.example;

public class Pitstop {
    private double pit_duration;
    private int lap_number;
    private int driver_number;
    private int session_key;

    public Pitstop(double pit_duration, int lap_number, int driver_number, int sessionKey) {
        this.pit_duration = pit_duration;
        this.lap_number = lap_number;
        this.driver_number = driver_number;
        this.session_key = sessionKey;
    }

    public double getPit_duration() {
        return pit_duration;
    }

    public void setPit_duration(double pit_duration) {
        this.pit_duration = pit_duration;
    }

    public int getLap_number() {
        return lap_number;
    }

    public void setLap_number(int lap_number) {
        this.lap_number = lap_number;
    }

    public int getDriver_number() {
        return driver_number;
    }

    public void setDriver_number(int driver_number) {
        this.driver_number = driver_number;
    }

    public int getSession_key() {
        return session_key;
    }

    public void setSession_key(int session_key) {
        this.session_key = session_key;
    }
}
