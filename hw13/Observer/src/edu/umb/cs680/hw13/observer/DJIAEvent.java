package edu.umb.cs680.hw13.observer;

public class DJIAEvent {
    private float djia;
    DJIAEvent(float d) {
        djia = d;
    }
    public float getDjia() {
        return djia;
    }
}
