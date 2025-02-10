package enemies;

public class Skeleton implements IEnemy {
    public String getName() {
        return "Skeleton";
    }

    public int getDamage() {
        return 10;
    }

    public int getExperience() {
        return 20;
    }
}
