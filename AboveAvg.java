import java.util.Scanner;

public class Lab_12_avg {
    public static void main(String[] args) {
        double sum = 0;
        int count = 0;
        int count_average = 0;
        System.out.println("Enter the numbers: \nEnter a negative number to stop the count");
        Scanner Win = new Scanner(System.in);
        int[] temp_array = new int[100]; //the maximum amount of numbers you can add is 99.
        for (int i = 0; i < 100; i++) {
            temp_array[i] = Win.nextInt();
            if (temp_array[i] < 0) {
                temp_array[i] = 0;
                break;
            }
            sum = sum + temp_array[i]; //adding all numbers together
            count = count + 1; // counting  the amount of numbers, we use it to figure out the length of the new array.
        }


        int[] garg = new int[count];
        for (int i = 0; i < count; i++) {
            garg[i] = temp_array[i];
        }

        double average = sum / garg.length; //this is the average we compare to

        for (int i = 0; i < count; i++) {
            if (garg[i] > average) {
                count_average += 1; //this counts how many times there are numbers above the average.
            }
        }
        System.out.println("The amount of time there was an above average number: " + count_average);

    }
}