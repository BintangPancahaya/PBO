package Pertemuan9;

public class JumpingZombie extends Zombie {

    public JumpingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        switch (this.level) {
            case 1:
                this.health += (int) (this.health * 0.30);
                break;
            case 2:
                this.health += (int) (this.health * 0.40);
                break;
            case 3:
                this.health += (int) (this.health * 0.50);
                break;
        }
    }

    @Override
    public void destroyed() {
        this.health -= (int) (this.health * 0.10);
    }

    @Override
    public String getZombieInfo() {
        return "Jumping Zombie Data =\n" + super.getZombieInfo();
    }
}