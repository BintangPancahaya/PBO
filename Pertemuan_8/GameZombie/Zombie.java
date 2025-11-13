package Pertemuan_8.GameZombie;

public abstract class Zombie extends Destroyable {
    protected int health;
    protected int level;

    public Zombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    // Method heal() dibuat abstract karena logikanya berbeda untuk setiap jenis zombie
    public abstract void heal();

    public int getHealth() {
        return health;
    }

    public String getZombieInfo() {
        return "Health = " + this.health + "\nLevel = " + this.level;
    }
}