package A7;

public class Main {
    public static void main(String[] args) {
        double[] myArray = new double[]{12, 95, 3, 10, 45.7};
        double average;
        double sum = 0;
        for (double number : myArray) {
            sum += number;
        }
    average = sum / myArray.length;
        System.out.println("The average value is: " + average);
    }
}
