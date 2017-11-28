package caoyang;
//find the largest and smallest number of an array
public class FindLargestSmallestNumber {
    public static void main(String[] args) {
        //array of 10 numbers
        int numbers[] = new int[]{32,43,53,54,32,65,63,98,43,23};
        int smallest = numbers[0];
        int largest = numbers[0];

        for(int i = 1; i < numbers.length; ++i) {
            if(numbers[i] > largest)
                largest = numbers[i];
            else if(numbers[i] < smallest)
                smallest = numbers[i];
            else;
        }

        System.out.println("The largest number is " + largest);
        System.out.println("The smallest number is " + smallest);
    }
}
