public class OddNumbers {

    public void getOddNumbers() {
        int numOddNumbers = 0;
        int numEvenNumbers = 0;
        int numRandom;
        int min = 1;
        int max = 100;

        for(int i = 0; i < 100; i++) {
            numRandom = getRandomNumber(min, max);
            if(numRandom % 2 == 0) {
                numEvenNumbers++;
            } else {
                numOddNumbers++;
            }
        }
        System.out.println(numEvenNumbers + " even(head)" + ", " + numOddNumbers + " odd(tail)");
        if(numOddNumbers > numEvenNumbers)
            System.out.println("Odd Win!");
        else
            System.out.print("Even Win!");
    }

    private int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
