package enemies;

public class Zombie implements IEnemy {
    public String getName() {
        return "Zombie";
    }

    public int getDamage() {
        return 15;
    }

    public int getExperience() {
        return 30;
    }
}
