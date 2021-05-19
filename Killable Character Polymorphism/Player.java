
public class Player 
{
    int attackPoints = 25;
    public int HP = 100; // health point
    public Player(int healthPoint) {
        this.HP = healthPoint;
    }
    public int getHP() {
        return this.HP;
    }
    public void setHP (int healthPoint) {
        this.HP = healthPoint;
    }
    public void attack(KillableCharacter monster) {
        monster.health -= 25;
        System.out.println("The player attacked the monster");
    }
    public void defend(KillableCharacter monster) {
        this.HP += monster.attackPoints;
        System.out.println("The player defended.");
    }
}
