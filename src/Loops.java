public class Loops {

    public static void main(String[] args) throws InterruptedException {

        /*
        Write a programm that executes 100 times a random int and at the
        end print the number of even results and the number of odd results; Announce the result!
        Random int executed 100 times.
        Results:
        50 even(head), 50 odd(tail).
         Even Win!
         */

        OddNumbers oddNumbers = new OddNumbers();

        oddNumbers.getOddNumbers();








        /*int i = 0;
        do {
            Thread.sleep(1000);
            System.out.println(i + " Do-while");
            i++;
        } while(i < 10);*/

        //Write a program that prints the numbers from 1 to 100
        // and for multiples of ‘3’ print “Fizz”
        // instead of the number and for the multiples of ‘5’ print “Buzz”.

        //1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14,
        //Fizz Buzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26,
        //Fizz, 28, 29, Fizz Buzz, 31, 32, Fizz, 34, Buzz, Fizz, ...

        /*for(int j = 0; j < 100; j++) {
            //System.out.println(j+1);
            if((j+1) % 3 == 0)
                System.out.println("Fizz");
            else if ((j+1) % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(j+1);
            }
        }*/

        /*int num = 0;
        while(num <= 100) {
            if((num+1) % 3 == 0) {
                System.out.println("Fizz");
            } else if ((num+1) % 5 ==0) {
                System.out.println("Buzz");
            } else {
                System.out.println(num+1);
            }
            num++;
        }*/

        /*int k = 0;
        do {
            if((k+1) % 3 == 0) {
                System.out.println("Fizz");
            } else if ((k+1) % 5 ==0) {
                System.out.println("Buzz");
            } else {
                System.out.println(k+1);
            }
            k++;
        } while(k <= 100);*/



    }


}
