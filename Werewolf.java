import java.time.LocalTime;

/**
 * Class design practice
 * @Version 0.2
 * Implementing checking the phase of the moon on the current date to determine whether to construct a transformed werewolf.
 * Using https://aa.usno.navy.mil/data/api#phase
 */
public class Werewolf extends Monster{
    private String monsterName = "Werewolf";
    private String monsterDescription = """
                                        A Monster that was once a man, cursed to transform into a bloodthirsty beast under the glow of a full moon.
                                        Only a weapon made from silver inherited from an ancestor may truly kill a werewolf while it assumes its beast form.
                                        """;
    private boolean monsterWasOnceAMan = true;
    private boolean monsterIsEvil = false; //Werewolves are innocents suffering from a curse
    private boolean monsterIsMortal = false; //Werewolves can't die from natural causes or mundane wounds

    private boolean werewolfTransformed; //Indicates whether the Werewolf is in its beastly form (true) or has reverted back to a human (false)

    public boolean isWerewolfTransformed() {
        return werewolfTransformed;
    }

    public void setWerewolfTransformed(boolean werewolfTransformed) {
        this.werewolfTransformed = werewolfTransformed;
    }

    public Werewolf(){
        this.werewolfTransformed = LocalTime.now().isAfter(LocalTime.parse("MIDNIGHT")) && LocalTime.now().isBefore(LocalTime.parse("06:00")); // Assuming the werewolf transforms at midnight and reverts back to human at 6 AM
    };

    public Werewolf(boolean transformed) {
        this.werewolfTransformed = true;
    }

    public void frighten(){
        if(isWerewolfTransformed()) { 
           System.out.println("Howl!");
        }
        else {
            System.out.println("Stay away!");
        }
    }

    public void werewolfTransform(){
        setWerewolfTransformed(true);
        System.out.println("The werewolf shapeshifts into its beastly form!");
    }

    public void werewolfRevertToHuman(){
        setWerewolfTransformed(false);
        System.out.println("The werewolf reverts back to its human form!");
    }
}
