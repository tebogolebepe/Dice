public class DiceFactory extends Die{
    public DiceFactory(int sides) { // This is our superclass constructor as we inherited from it
        super(sides);
    }

    public static Die makeDie(int sides) // we create a new die
    {
        Die dice = new Die(sides);
        System.out.println("New Die created with " + sides + " Sides"); // messege sent after creation of new die
        return dice;
    }
}