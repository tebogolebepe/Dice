import java.util.Random;

public class Die {
    int sides;
    int value;
    int[] probabilities;
//constructor to initialise values
    public Die(int sides) {
        this.sides = sides;
    }

    public Die(int sides , int[] probabilities) {
        this.sides = sides;
        //   this.probabilities = setProbabilities();

    }

    public static void main(String[] args)
    {

        Die die6 = new Die(20);
        Die dieh = new Die(20,new int[]{0,0,0,0,0,0});
        die6.roll();
        dieh.roll();
        System.out.println(die6.value);
        System.out.println(die6.value);
    }

    public int roll()
    {
        Random random = new Random(); // rolling the die
        value = random.nextInt(this.sides); // assigning the random number between 0 - side  to value
        return value; // returning the results
    }

    public  int[] setProbabilities(int [] numbers)
    {
        int sum = 0;


        for (int probability : probabilities) {
            if (probability < 0) {
                System.out.println("negative probabilities not allowed");
            }else {
                sum += probabilities[probability];
            }
        }

        if(sum < 1)
        {
            System.out.println("probability sum must be greater than 0");
        }else  if(!(probabilities.length == this.sides)){
            System.out.println("Probabilities length not equal to Dice sides");
        }

        return numbers;
    }

}