public class Main {

    public static void main(String[] args) {

        //1. Write a method in Java to get the difference between the largest and smallest values in an array of integers.
        //The length of the array must be 1 and above.

        //2. Write a method in Java to find the smallest and second smallest elements of a given array and print it
        // in the console.

        //3. Write a method in Java that resolves this mathematical expression where x and y are two variables
        // pre-set in your code.

        int[] numbers = {10,45,98,35,4,21,16,54,100,87,28};

        int smallest = getSmallest(numbers);
        int largest = getLargest(numbers);
        int difference = getDifference(smallest, largest);

        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
        System.out.println("Difference: " + difference);

    }


    public static int getSmallest(int[] numbers) {
        int smallest = numbers[0];
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static int getLargest(int[] numbers) {
        int largest = 0;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static int getDifference(int smallest, int largest) {
        return largest - smallest;
    }


}
