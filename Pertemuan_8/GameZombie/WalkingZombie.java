package Pertemuan_8.GameZombie;

public class WalkingZombie extends Zombie {

    public WalkingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        switch (level) {
            case 1:
                health += (int) (health * 0.2); // 20%
                break;
            case 2:
                health += (int) (health * 0.3); // 30%
                break;
            case 3:
                health += (int) (health * 0.4); // 40%
                break;
        }
    }

    @Override
    public void destroyed() {
        // Health berkurang 20% dari health saat ini
        this.health -= (int) (this.health * 0.20);
    }

    @Override
    public String getZombieInfo() {
        return "Walking Zombie Data =\n" + super.getZombieInfo();
    }
}