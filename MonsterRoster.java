import java.util.Arrays;
/*
 * Intended to be a List of Monsters that a user can browse through and view each individual Monster
 * @author Michael Cummings
 * @version 1.0
 */

public class MonsterRoster {
    private Monster[] roster;
    private int roster_count;

    /**
     * Constructor
     * @param initial_size
     */
    public MonsterRoster(int initial_size) {
        roster = new Monster[initial_size];
        roster_count = 0;
    }

    /**
     * @return the count of Monsters in the MonsterRoster
     */
    public int getRostercount() {
        return roster_count;
    }

    /**
     * Places a Monster in the first available index in the MonsterRoster
     * If the MonsterRoster is full, a copy of it with a count equal to 2 * original_count + 1 is created and assigned to the original variable
     * @param mon a Monster to add to the MonsterRoster
     */
    public void addToRoster(Monster mon) {
        if (roster_count == roster.length) {
            roster = Arrays.copyOf(roster, 2 * roster_count + 1);
        }
        roster[roster_count] = mon;
        roster_count++;
    }

    /**
     * Searches the MonsterRoster for a Monster with a specific name and replaces it with the last Monster in the MonsterRoster
     * @param name
     * @return true if a Monster with a name equal to the String given by the user is found and successfully removed from the MonsterRoster; return false if no Monster by specified name found in MosterRoster
     */
    public boolean removeFromRosterByName(String name) {
        for (int i = 0; i < roster_count; i++) {
            if(roster[i].getMonsterName().equalsIgnoreCase(name)) {
                roster[i] = roster[roster_count - 1];
                roster_count--;
                return true;
            }
        }
        return false;
    }
    
    /**
     * Removes a Monster at a specifed index and replaces it with the last Monster in the MonsterRoster
     * @param index
     * @return true if a Monster is found at the specified index and successfully removed; returns false if index is null
     */
    public boolean removeFromRosterByIndex(int index) {
        if(roster[index] != null) {
            roster[index] = roster[roster_count - 1];
            roster_count--;
            return true;
        }
        else {
            return false;
        }
    }

    public String toString() {
        String s = "";
        for(int i = 0; i < roster_count; i++) {
            s+= "Monster #" + (i + 1) + ":\n";
            s+= "Name: \t";
            s+= roster[i].getMonsterName();
            s+= "\n";  
        }
        return s;
    }
}
