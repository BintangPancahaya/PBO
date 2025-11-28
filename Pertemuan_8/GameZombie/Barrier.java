package Pertemuan_8.GameZombie;

public class Barrier extends Destroyable {
    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }
    
    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public void destroyed() {
        // Strength berkurang 9
        this.strength -= 9;
    }
    
    public String getBarrierInfo() {
        return "Barrier Strength = " + this.strength;
    }
}