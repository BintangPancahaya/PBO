package Pertemuan9;

public class Barrier implements Destroyable {
    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return this.strength;
    }

    @Override
    public void destroyed() {
        this.strength -= 9;
    }

    public String getBarrierInfo() {
        return "Barrier Strength = " + this.strength;
    }
}