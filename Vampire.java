public class Vampire extends Monster {
    
    private String monsterName = "Vampire";
    private String monsterDescription = "An immortal stalker of the night driven by a thirst for fresh human blood.\n" +
                                        "Having consorted with the forces of evil to gain their unnatural powers, vampires have some weaknesses and limitations,\n" +
                                        "but a vampire may only truly be laid to eternal rest by exposure to direct sunlight or by piercing its dead heart with a blessed stake.";
    private boolean monsterWasOnceAMan = true;
    private boolean monsterIsEvil = true;

    private String[] vampireThirstScale = {"Ravenous", "Hungry", "Peckish", "Not Hungry", "Satiated"}; //I have no idea what I'm doing
    private String vampireThirstLevel;
    
    public String getVampireThirstLevel() {
        return vampireThirstLevel;
    }

    public void setVampireThirstLevel(int vampireThirstInput) {
        this.vampireThirstLevel = vampireThirstScale[vampireThirstInput];
    }

    public Vampire(){
        setVampireThirstLevel(1);
    };

    public void frighten(){
        System.out.println("Hiss!");
    }

    public void vampireCheckHunger(){
        System.out.println("This vampire is" + getVampireThirstLevel().toLowerCase() + ".");
    }

}
