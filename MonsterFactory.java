/**
 * I really hope the Factory approach is best for whatever it is I'm trying to do here
 * Because MonsterFactory is an awesome name
 */

public class MonsterFactory {

    Monster buildMonster(String monsterName) {
        if (monsterName == "Demon") {
            return new Demon();
        }
        else if (monsterName == "Werewolf") {
            return new Werewolf();
        }
        else if (monsterName == "Vampire") {
            return new Vampire();
        }
        else if (monsterName == "Zombie") {
            return new Zombie();
        }
        else {
            return null;
        }

    }

}
