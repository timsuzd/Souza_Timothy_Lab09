import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayStuff {
    void main() {
        int sum = 0;
        double avg = 0;
        int rangedInput = 0;
        int inputInstance = 0;
        int val = 0;
        int loc = 0;
        int minval = 100;
        int maxval = 1;
        Scanner in = new Scanner(System.in);

        int[] datapoints = new int[100];
        for (int i = 0; i < 100; i++) {
            datapoints[i] = new Random().nextInt(100) + 1;
        }
        for (int i = 0; i < datapoints.length; i++) {
            System.out.print(datapoints[i]);
            sum += datapoints[i];

            if (i < datapoints.length - 1) {
                System.out.print(" | ");
            }
        }
        avg = sum / datapoints.length;
        System.out.println("\n" + "The sum of all values in the array is " + sum);
        System.out.println("The mean of all values in the array is " + avg);
        rangedInput = SafeInput.getRangedInt(in, "Input an integer", 0, 100);
        IO.println("You entered: " + rangedInput);
        for (int i = 0; i < datapoints.length; i++) {
            if (rangedInput == datapoints[i]) {
                inputInstance++;
            }
        }
        System.out.println("Your integer '" + rangedInput + "' appeared: " + inputInstance + " times in the dataset.");
        val = SafeInput.getRangedInt(in, "Input another integer", 0, 100);
        for (int i = 0; i < datapoints.length; i++) {
            if (val == datapoints[i]) {
                loc = i + 1;
                break;
            } else {
                loc = -1;
            }
        }
        if (loc == -1) {
            System.out.println("Your integer did not appear in the dataset.");
        } else {
            System.out.println("Your integer '" + val + "' appeared at array index: " + loc);
        }
        for (int i = 0; i < datapoints.length; i++) {
            if (minval > datapoints[i]) {
                minval = datapoints[i];
            }
            if (maxval < datapoints[i]) {
                maxval = datapoints[i];
            }
        }
        IO.println("The minimum value in the array is " + minval);
        IO.println("The maximum value in the array is " + maxval);
        System.out.println("The average value in the array is " + getAverage(datapoints));

    }
    public static double getAverage(int values[])
    {
        double avg = 0;
        int sumValues = 0;

        for (int i = 0; i < values.length; i++) {
            sumValues += values[i];
        }

        avg = (double) sumValues / values.length;
        return avg;
    }
}

