package combat;

import enemies.IEnemy;
import player.Player;

public class CombatManager {
    public void fight(Player player, IEnemy enemy) {
        System.out.println(player.getName() + " fights " + enemy.getName());
        player.takeDamage(enemy.getDamage());
        if (player.isAlive()) {
            player.gainExperience(enemy.getExperience());
        }
    }
}
