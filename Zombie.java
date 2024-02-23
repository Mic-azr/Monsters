public class Zombie extends Monster{
    private String monsterName = "Zombie";
    private String monsterDescription = "A human corpse reanimated by supernatural or scientific means.\n" + 
                                        "Zombies possess no higher reason or inner monologue, driven solely by an instinctual hunger for living flesh.\n" +
                                        "Zombies will rot over time and can be maimed or dismembered, but a Zombie can only truly be destroyed by burning it or by completely destroying its brain.\n"; 
    private boolean monsterWasOnceAMan = true;
    private boolean monsterIsEvil = false; //Zombies are husks with no internal experience or motivation.
    private boolean monsterIsMortal = false; //Zombies are considered to be "undead". Though I suppose the only difference between "undead" and "immortal" is one's quality of "unlife"...

    private String[] zombieBodyParts = {"Head", "Torso", "Left Arm", "Right Arm", "Left Leg", "Right Leg"}; //Fully intact Zombies should possess these 6 body parts
        //Not sure if an array of Strings is the best way to go about this, neither am I sure of what I want this class to do
    private int zombieNumberOfBodyParts = zombieBodyParts.length; //Should be 6 by default

    public Zombie(){

    }

    public void frighten(){
        System.out.println("Groan...");
    }
}
