public class Wraith extends Ghost{

    private String monsterName = "Wraith";
    private String monsterDescription = """
                                        A subtype of Ghost characterized by its skeletal appearance and malicious nature. Wraiths are said to possess the power to kill, steal the soul of, or otherwise harm any person who encounters one.
                                        A Wraith may be left behind by the death of a murderous person, or by someone unjustly killed in the prime of their life who remains bound to this world by their anger over their stolen life.
                                        """;
    private boolean monsterIsEvil = true; 

    public Wraith() {

    }

    public void frighten() {
        System.out.println("""
                           [A skeletal hand emerges from beneath the Wraith's tattered, black robe.]
                           [It shakily points what remains of its index finger at you.]
                           """);
    }
    
}
