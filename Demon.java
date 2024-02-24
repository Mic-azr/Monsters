public class Demon extends Monster {
    private String monsterName = "Demon";
    private String monsterDescription = "";
    private boolean monsterWasOnceAMan = false; 
    private boolean monsterIsEvil = true;
    private boolean monsterIsMortal = false;


    private String demonTrueName = ""; //A sorceror who knows a Demon's true name may summon it and compel it to do the sorceror's bidding
    public String getDemonTrueName() {
        return demonTrueName;
    }

    public void setDemonTrueName(String demonTrueName) {
        this.demonTrueName = demonTrueName;
    }

    private String[] demonMonikers = {}; //It's best to purposefully avoid using a Demon's true name if you have to refer to one by name.
    public String[] getDemonMonikers() {
        return demonMonikers;
    }

    public void setDemonMonikers(String[] demonMonikers) {
        this.demonMonikers = demonMonikers;
    }

    public Demon(){

    }

    public void frighten(){
        System.out.println("PANDEMONIUM REIGNAT"); //Check out "FAITH: The Unholy Trinity" if you like horror video games!
    }
}
