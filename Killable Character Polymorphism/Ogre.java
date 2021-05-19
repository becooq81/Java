
public class Ogre extends KillableCharacter
{
    public int attackPoints=25;
    public void attack(Player player) {
        player.HP -= attackPoints;
        System.out.println("The ogre attacked the player.");
    }
    public void defend(Player player) {
        health += player.attackPoints;
        System.out.println("The ogre defended.");
    }
    public void deathSound() {
        System.out.println("Kkkk");
    }
    public String monsterType() {
        return "Ogre";
    }
}
