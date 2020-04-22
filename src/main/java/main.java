public class main {
    public static void main(String[] args)
    {
        Die die6 = new Die(6);
        Die dieh = new Die(6,new int[]{1,1,1,1,1,2});
        die6.roll();
        dieh.roll();
        System.out.println(die6.value);
        System.out.println(dieh.value);

        Die die20 = DiceFactory.makeDie(20);
        Die anotherDie20 = DiceFactory.makeDie(30);

        System.out.println(die20);
        System.out.println(anotherDie20);
    }
}