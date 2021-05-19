
public abstract class KillableCharacter
{
    public int health;
    public int attackPoints=25;
    public abstract void attack(Player player);
    public abstract void defend(Player player);
    public abstract void deathSound();
    public abstract String monsterType();
}
