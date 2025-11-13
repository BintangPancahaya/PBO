package Pertemuan_8.GameZombie;

public class JumpingZombie extends Zombie {

    public JumpingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        switch (level) {
            case 1:
                health += (int) (health * 0.3); // 30%
                break;
            case 2:
                health += (int) (health * 0.4); // 40%
                break;
            case 3:
                health += (int) (health * 0.5); // 50%
                break;
        }
    }

    @Override
    public void destroyed() {
        // Health berkurang 10% dari health saat ini
        this.health -= (int) (this.health * 0.10);
    }

    @Override
    public String getZombieInfo() {
        return "Jumping Zombie Data =\n" + super.getZombieInfo();
    }
}