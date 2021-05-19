
public class Skeleton extends KillableCharacter
{

    int health = 75;
        public int attackPoints=25;
    public void attack(Player player) {
        player.HP -= attackPoints;
        System.out.println("The skeleton attacked the player.");
    }
    public void defend(Player player) {
        this.health += player.attackPoints;
        System.out.println("The skeleton defended.");
    }
    public void deathSound() {
        System.out.println("Urggg");
    }
    public String monsterType() {
        return "Skeleton";
    }
}
