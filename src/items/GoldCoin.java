package items;

import player.Player;

public class GoldCoin implements IItem {
    public String getName() {
        return "Gold Coin";
    }

    public void applyEffect(Player player) {
        player.gainExperience(5);
    }
}
