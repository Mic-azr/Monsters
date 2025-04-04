public class Ghost extends Monster {
    
    private String monsterName = "Ghost";
    private String monsterDescription = """
                                        Though there is much debate as to what Ghosts actually are, most believe that they are they are left behind when a person dies.
                                        Just as there are many different kinds of people, there are many different kinds of Ghosts depending on who they were in life, and their manner of death. 
                                        """;
    private boolean monsterWasOnceAMan = true;
    private boolean monsterIsEvil = false; //Defaulting to false. I wonder if it would be better to convert monsterIsEvil to a categorical variable to include an 'Unknown' category, but so far this would be the only instance which it would get used
    private boolean monsterIsMortal = false; 

    /*
     * This variable holds the name of the person whose death left the Ghost behind.
     */
    private String ghostLivingName = "";
    
    public Ghost() {

    }

    @Override
    public void frighten() {
        System.out.println("BOO!");
    }

    public String getGhostLivingName() {
        return ghostLivingName;
    }
    public void setGhostLivingName(String name) {
        ghostLivingName = name;
    }

}
