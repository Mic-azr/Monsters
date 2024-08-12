/**
 * Class design practice
 * 
 */
import java.time.LocalTime;
public class Werewolf extends Monster{

    private String monsterName = "Werewolf";
    private String monsterDescription = "A Monster that was once a man, cursed to transform into a bloodthirsty beast under the glow of a full moon.\n" +
                                        "Only a weapon made from silver inherited from an ancestor may truly kill a werewolf while it assumes its beast form.\n";
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
        if(LocalTime.now().isAfter(LocalTime.parse("MIDNIGHT")) && LocalTime.now().isBefore(LocalTime.parse("06:00"))){
            setWerewolfTransformed(true);
        }
        else {
            setWerewolfTransformed(false);
        } 
    };

    public Werewolf(boolean transformed) {
        setWerewolfTransformed(transformed);
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
        if (!isWerewolfTransformed()){
            setWerewolfTransformed(true);;
            System.out.println("The werewolf shapeshifts into its beastly form!");
        }
        else{
            setWerewolfTransformed(false);;
            System.out.println("The werewolf reverts back into a human.");
        }
    }
    
}
