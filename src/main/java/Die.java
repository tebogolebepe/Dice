import java.util.Random;

public class Die {
    int sides;
    int value;
    int[] probabilities;



    public Die(int sides) { // this is a default constructor for a 6 sided dice
        this.sides = sides; // here we initialize our dice sides
    }

    public Die(int sides , int[] probabilities) { // this is an optional constructor that includes probabilities
        this.sides = sides; // here we initialize our dice sides
        this.probabilities = setProbabilities(probabilities); // here we are initialize the probability variable

    }


    public int roll() // This is our roll method that is going to roll the dice for us
    {
        Random random = new Random(); // rolling the die
        value = 1+random.nextInt(this.sides); // assigning the random number between 1 - side  to value
        return value; // returning the results
    }

    public  int[] setProbabilities(int [] numbers) // Its our method that have to set our probabilities according to the rules we are given
    {
        int sum = 0; // we initialize our sum value

        for (int probability : numbers) { // checking for negative numbers
            if (probability < 0) {
                System.out.println("negative probabilities not allowed");
            }else {
                sum += numbers[probability];
            }
        }

        if(sum < 1)
        {
            System.out.println("probability sum must be greater than 0");
        }else  if(!(numbers.length == this.sides)){
            System.out.println("Probabilities length not equal to Dice sides");
        }

        return numbers;
    }

}