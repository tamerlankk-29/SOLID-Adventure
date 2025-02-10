package player;

import items.IItem;
import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int health;
    private int experience;
    private List<IItem> inventory;

    public Player(String name) {
        this.name = name;
        this.health = 100;
        this.experience = 0;
        this.inventory = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public void gainExperience(int exp) {
        this.experience += exp;
    }

    public void pickUpItem(IItem item) {
        inventory.add(item);
        item.applyEffect(this);
    }

    public boolean isAlive() {
        return health > 0;
    }

    public int getHealth() {
        return health;
    }

    public int getExperience() {
        return experience;
    }
}
