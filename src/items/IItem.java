package items;

import player.Player;

public interface IItem {
    String getName();

    void applyEffect(Player player);
}
