// Task #4
import java.util.Scanner; // Needed for the Scanner class
/**
 This class demonstrates the Television class.
*/
public class TelevisionDemo
{
 public static void main(String[] args)
 {
 // Create a Scanner object to read from the keyboard
 Scanner keyboard = new Scanner (System.in);
 // Declare variables
 int station; // The user's channel choice
 // Declare and instantiate a television object
 Television bigScreen = new Television("Toshiba", 55);
 // Turn the power on
 bigScreen.power();
 // Display the state of the television
 System.out.println("A " +
 bigScreen.getScreenSize() +
 " inch " +
 bigScreen.getManufacturer() +
" has been turned on.");
 // Prompt the user for input and store into station
 System.out.print("What channel do you want? ");
 station = keyboard.nextInt();
 // Change the channel on the television
 bigScreen.setChannel(station);
 // Increase the volume of the television
 bigScreen.increaseVolume();
 // Display the the current channel and
 // volume of the television
 System.out.println("Channel: " +
 bigScreen.getChannel() +
" Volume: " +
bigScreen.getVolume() + "%");
 System.out.println("Too loud! Lowering the volume.");
 // Decrease the volume of the television
 bigScreen.decreaseVolume();
 bigScreen.decreaseVolume();
 bigScreen.decreaseVolume();
 bigScreen.decreaseVolume();
 bigScreen.decreaseVolume();
 bigScreen.decreaseVolume();
 // Display the the current channel and
 // volume of the television
 System.out.println("Channel: " +
 bigScreen.getChannel() +
" Volume: " +
bigScreen.getVolume() + "%");
 System.out.println(); // For a blank line
 System.out.println(); // For a blank line
 
 // Task #5
 // Declare and instatiate another television object
 Television portable = new Television("Sharp", 19);
 //Turn the power on for the portable television
 portable.power();
 //Display the state of the portable television
 System.out.println("A " + portable.getScreenSize() + " inches portable television by " + portable.getManufacturer() + " has turned on!");
 //Prompt the user for input and store into station
 System.out.print("What channel do you want to watch? ");
 station = keyboard.nextInt();
 // Chanage the channel on the portable television
 portable.setChannel(station);
 // Decrease the volume of the portable television by two
 portable.decreaseVolume();
 portable.decreaseVolume();
 // Display the current channel and volume of the portable television
 System.out.println("Currently watching channel " + portable.getChannel() + " and volume on " + portable.getVolume() + "%");
 }
}