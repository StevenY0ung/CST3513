import java.util.Random; // Needed for the Random class

/**
 * This class simulates rolling a pair of dice 10,000 times
 * and counts the number of times doubles of are rolled for
 * each different pair of doubles.
 */
public class DiceSimulation {
    public static void main(String[] args) {
        final int NUMBER = 10000; // Number of dice rolls
        // A random number generator used in
        // simulating the rolling of dice
        Random generator = new Random();
        int die1Value; // Value of the first die
        int die2Value; // Value of the second die
        int count = 0; // Total number of dice rolls
        int snakeEyes = 0; // Number of snake eyes rolls
        int twos = 0; // Number of double two rolls
        int threes = 0; // Number of double three rolls
        int fours = 0; // Number of double four rolls
        int fives = 0; // Number of double five rolls
        int sixes = 0; // Number of double six rolls
        
        // Task #1: Implementing the algorithm for rolling dice and counting doubles
        while (count < NUMBER) {
            // Simulate rolling the first die
            die1Value = generator.nextInt(6) + 1;
            // Simulate rolling the second die
            die2Value = generator.nextInt(6) + 1;
            
            // Check if it's a double
            if (die1Value == die2Value) {
                // Increment counters based on the value of the doubles
                switch (die1Value) {
                    case 1:
                        snakeEyes++;
                        break;
                    case 2:
                        twos++;
                        break;
                    case 3:
                        threes++;
                        break;
                    case 4:
                        fours++;
                        break;
                    case 5:
                        fives++;
                        break;
                    case 6:
                        sixes++;
                        break;
                }
            }
            
            // Increment total rolls
            count++;
        }
        
        // Display the results
        System.out.println("You rolled snake eyes " + snakeEyes + " out of " + count + " rolls.");
        System.out.println("You rolled double twos " + twos + " out of " + count + " rolls.");
        System.out.println("You rolled double threes " + threes + " out of " + count + " rolls.");
        System.out.println("You rolled double fours " + fours + " out of " + count + " rolls.");
        System.out.println("You rolled double fives " + fives + " out of " + count + " rolls.");
        System.out.println("You rolled double sixes " + sixes + " out of " + count + " rolls.");
        
        // Task #2: Change the while loop to a do-while loop
        // Reset counters for a new simulation
        count = 0;
        snakeEyes = 0;
        twos = 0;
        threes = 0;
        fours = 0;
        fives = 0;
        sixes = 0;
        
        do {
            // Simulate rolling the first die
            die1Value = generator.nextInt(6) + 1;
            // Simulate rolling the second die
            die2Value = generator.nextInt(6) + 1;
            
            // Check if it's a double
            if (die1Value == die2Value) {
                // Increment counters based on the value of the doubles
                switch (die1Value) {
                    case 1:
                        snakeEyes++;
                        break;
                    case 2:
                        twos++;
                        break;
                    case 3:
                        threes++;
                        break;
                    case 4:
                        fours++;
                        break;
                    case 5:
                        fives++;
                        break;
                    case 6:
                        sixes++;
                        break;
                }
            }
            
            // Increment total rolls
            count++;
        } while (count < NUMBER);
        
        // Display the results for the do-while loop
        System.out.println("\nResults using do-while loop:");
        System.out.println("You rolled snake eyes " + snakeEyes + " out of " + count + " rolls.");
        System.out.println("You rolled double twos " + twos + " out of " + count + " rolls.");
        System.out.println("You rolled double threes " + threes + " out of " + count + " rolls.");
        System.out.println("You rolled double fours " + fours + " out of " + count + " rolls.");
        System.out.println("You rolled double fives " + fives + " out of " + count + " rolls.");
        System.out.println("You rolled double sixes " + sixes + " out of " + count + " rolls.");
        
        // Task #2: Change the do-while loop to a for loop
        // Reset counters for a new simulation
        count = 0;
        snakeEyes = 0;
        twos = 0;
        threes = 0;
        fours = 0;
        fives = 0;
        sixes = 0;
        
        for (; count < NUMBER; count++) {
            // Simulate rolling the first die
            die1Value = generator.nextInt(6) + 1;
            // Simulate rolling the second die
            die2Value = generator.nextInt(6) + 1;
            
            // Check if it's a double
            if (die1Value == die2Value) {
                // Increment counters based on the value of the doubles
                switch (die1Value) {
                    case 1:
                        snakeEyes++;
                        break;
                    case 2:
                        twos++;
                        break;
                    case 3:
                        threes++;
                        break;
                    case 4:
                        fours++;
                        break;
                    case 5:
                        fives++;
                        break;
                    case 6:
                        sixes++;
                        break;
                }
            }
        }
        
        // Display the results for the for loop
        System.out.println("\nResults using for loop:");
        System.out.println("You rolled snake eyes " + snakeEyes + " out of " + count + " rolls.");
        System.out.println("You rolled double twos " + twos + " out of " + count + " rolls.");
        System.out.println("You rolled double threes " + threes + " out of " + count + " rolls.");
        System.out.println("You rolled double fours " + fours + " out of " + count + " rolls.");
        System.out.println("You rolled double fives " + fives + " out of " + count + " rolls.");
        System.out.println("You rolled double sixes " + sixes + " out of " + count + " rolls.");
    }
}
