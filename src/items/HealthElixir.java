package items;

import player.Player;

public class HealthElixir implements IItem {
    public String getName() {
        return "Health Elixir";
    }

    public void applyEffect(Player player) {
        player.takeDamage(-20);
    }
}
