/**
 * Class design practice
 * Abstract Parent class for humanlike and inhuman monsters
 * For the purposes of the project, only supernatural (fictional) beings are Monsters
 */

public abstract class Monster {

    private String monsterName;
    private String monsterDescription;
    private boolean monsterWasOnceAMan; //Doesn't necessarily mean the monster is humanlike, for example a depraved murderer who dies and becomes an incorporeal wraith with no size or weight
    private boolean monsterIsEvil; //Some monsters simply don't know better (ex. Zombie), while others choose to cause pain and destruction (ex. Demon)

    public Monster(){};

    abstract public void frighten(); //A Monster ought to inspire fear in others in some way

}
