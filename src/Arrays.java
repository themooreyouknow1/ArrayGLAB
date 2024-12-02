import java.util.Scanner;

public class Arrays {
    public void arrayDemoOne(){
        int[] age = {12, 4, 5, 2, 5};

            System.out.println("Accessing Elements of an Array: ");
            System.out.println("First ELement: " + age[0]);
            System.out.println("Second ELement: " + age[1]);
            System.out.println("Third ELement: " + age[2]);
            System.out.println("Fourth ELement: " + age[3]);
            System.out.println("Fifth ELement: " + age[4]);
    }
    public void arrayDemoTwo(){
        int[] age = {12, 4, 5};
        System.out.println("Using for loop: ");
        for(int i = 0; i < age.length; i++){
            System.out.println(age[i]);
        }
    }
    public void arrayDemoThree(){
        String[] names = {"New York", "Dallas", "Las Vegas", "Florida"};
        for (String name : names){
            System.out.println(name);
        }
    }
    public void arrayDemoFour(){
        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int sum = 0;
        Double average;

        for(int number: numbers){
            sum += number;
        }
        int arrayLength = numbers.length;
        average = (double)sum / (double)arrayLength;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
    public void arrayDemoFive(){
        int[] marks = {74, 43, 58, 60, 90, 64, 70};
        int sum = 0;
        int sumSq = 0;
        double mean, stdDev;

        for (int i = 0; i < marks.length; ++i){
            sum += marks[i];
            sumSq += marks[i] * marks[i];
        }
        mean = (double)sum / marks.length;
        stdDev = Math.sqrt((double)sumSq / marks.length - mean * mean);
        System.out.printf("Mean: %.2f%n", mean);
        System.out.printf("Standard Deviation: %.2f%n", stdDev);
    }
    public void arrayDemoSix(){
        int i, element;
        int[] arr = new int[11];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 10 elements: ");
        for (i = 0; i < 10; i++)
            arr[i] = input.nextInt();

        System.out.println("Enter an element to insert: ");
        element = input.nextInt();
        arr[i] = element;

        System.out.println("New Array: ");
        for(i = 0; i < 11; i++)
            System.out.println(arr[i]+ " ");

    }
}
