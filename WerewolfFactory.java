import java.util.Scanner;
public class WerewolfFactory implements MonsterFactory{
    Scanner scanner = new Scanner(System.in);
    boolean transform_choice;
    
    @Override
    public Monster buildMonster() {
        System.out.println("Manually set werewolf transformation? Transformation will be decided by system time by default. Type 'y' or 'n'.");
        switch(scanner.nextLine().charAt(0)) {
            case 'y':
                System.out.println("Set werewolf's transformed state with 't' or 'f'.");
                switch(scanner.nextLine().charAt(0)) {
                    case 't':
                        transform_choice = true;
                        return new Werewolf(transform_choice);
                    case 'f':
                        transform_choice = false;
                        return new Werewolf(transform_choice);
                    default:
                        System.out.println("Please type either 't' or 'f'.");
                }
            case 'n':
                break;
            default:
                System.out.println("Please type either 'y' or 'n'.");
        }
        return new Werewolf();
    }
}
