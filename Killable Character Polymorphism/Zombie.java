
public class Zombie extends KillableCharacter
{
    public int attackPoints=25;
   
    public void attack(Player player) {
        player.HP -= attackPoints;
        System.out.println("The zombie attacked the player.");
    }
    public void defend(Player player) {
        health += player.attackPoints;
        System.out.println("The zombie defended.");
    }
    public void deathSound() {
        System.out.println("Bwerk");
    }
    public String monsterType() {
        return "Zombie";
    }
}
