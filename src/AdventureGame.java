
import player.Player;
import combat.CombatManager;
import enemies.IEnemy;
import enemies.Skeleton;
import enemies.Zombie;
import items.IItem;
import items.HealthElixir;
import items.GoldCoin;
import java.util.List;


//main
public class AdventureGame {
    public static void main(String[] args) {
        Player player = new Player("Adventurer");
        CombatManager combatManager = new CombatManager();

        List<IEnemy> enemies = List.of(new Skeleton(), new Zombie());
        List<IItem> items = List.of(new HealthElixir(), new GoldCoin());

        for (IEnemy enemy : enemies) {
            combatManager.fight(player, enemy);
        }

        for (IItem item : items) {
            player.pickUpItem(item);
        }
    }
}