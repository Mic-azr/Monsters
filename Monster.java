/**
 * Class design practice
 * Abstract Parent class for humanlike and inhuman monsters
 * For the purposes of the project, only supernatural (fictional) beings are Monsters
 */

public abstract class Monster {
    //considering making monsterDescription and a few others static, since the description ought to be dependent on the Monster type and not the individual Monster object
    private String monsterName;
    public String getMonsterName() {
        return monsterName;
    }

    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
    }

    private String monsterDescription;
    public String getMonsterDescription() {
        return monsterDescription;
    }

    public void setMonsterDescription(String monsterDescription) {
        this.monsterDescription = monsterDescription;
    }

    private boolean monsterWasOnceAMan; //Doesn't necessarily mean the monster is humanlike, for example a depraved murderer who dies and becomes an incorporeal wraith with no size or weight
    public boolean isMonsterWasOnceAMan() {
        return monsterWasOnceAMan;
    }

    public void setMonsterWasOnceAMan(boolean monsterWasOnceAMan) {
        this.monsterWasOnceAMan = monsterWasOnceAMan;
    }

    private boolean monsterIsEvil; //Some monsters simply don't know better (ex. Zombie), while others choose to cause pain and destruction (ex. Demon)
    public boolean isMonsterIsEvil() {
        return monsterIsEvil;
    }

    public void setMonsterIsEvil(boolean monsterIsEvil) {
        this.monsterIsEvil = monsterIsEvil;
    }

    private boolean monsterIsMortal; //Indicates whether the Monster may die from natural causes, or be killed by wounds inflicted by mundane weapons
    public boolean isMonsterIsMortal() {
        return monsterIsMortal;
    }

    public void setMonsterIsMortal(boolean monsterIsMortal) {
        this.monsterIsMortal = monsterIsMortal;
    }

    public Monster(){};

    abstract public void frighten(); //A Monster ought to inspire fear in others in some way









}
