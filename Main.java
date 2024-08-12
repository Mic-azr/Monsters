import java.util.Scanner;
/*
* Driver program for Monsters
*/
public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int size = Integer.parseInt(args[0]);

    MonsterRoster roster = new MonsterRoster(size);
    Monster mon; 
    String name, description;
    boolean wasAMan, mortal, evil;
    int user_choice;

    System.out.println("MonsterFactory Demo: ");
    System.out.println("\t1. Create a new Monster and add it to your MonsterRoster");
    System.out.println("\t2. View the details of a Monster in your MonsterRoster");
    System.out.println("\t3. Remove a Monster from your MonsterRoster");
    System.out.println("\t4. Remove a slice of Monsters from your MonsterRoster (Remove the 3 Monsters in indexes [2:4], for example)");
    System.out.println("\t4. View your whole MonsterRoster");
    System.out.println("\t5. View a summary of the MonsterRoster"); //funny idea: count # of evil vs. non-evil monsters, give a percentage of evil in the roster
    System.out.println("\t6. Exit MonsterFactory Demo");

    System.out.println("Selection: ");
    user_choice = Integer.parseInt(scanner.nextLine());

    switch(user_choice) {
        case 1:
            System.out.println("Enter the name of the monster:");
            name = scanner.nextLine();
            //TODO: Finish MonsterFactory class, create a default constructor. And read!
            //Need to check the input against a list of available monsters
            break;
        case 2:
            break;
        case 3:
            break;
        case 4:
            break;
        case 5:
            break;
        case 6:
            System.out.println("Thank you for visiting the Monster Factory!");
            System.exit(0);
        default:
            System.out.println("Choose one of the available options.");
    }
}
    

