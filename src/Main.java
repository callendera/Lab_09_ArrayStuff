import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int COUNT = 100;
        int[] dataPoints = new int[COUNT];
        Random r = new Random();
        for (int i = 0; i < COUNT; i++) {
            dataPoints[i] = 1 + r.nextInt(100);
        }

        for (int i = 0; i < COUNT; i++) {
            int currentDataPoint = dataPoints[i];
            System.out.print(currentDataPoint);
            if (i < COUNT - 1)
                System.out.print("|");
        }

        int sum = 0;
        for (int i = 0; i < COUNT; i++) {
            sum = sum + dataPoints[i];
        }

        double avg = (float) sum / COUNT;

        System.out.println("\nThe SUM of the random array dataPoints is: " + sum);
        System.out.println("The AVERAGE of the random array dataPoints is: " + avg);


        Scanner in = new Scanner(System.in);
        int input = 0;

        input = SafeInput.getRangedInt(in,"Enter a number from 1-100: ",1, 100);

        int n = 0;

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == input) {
                n++;
            }
        }

        System.out.printf("The number of times the input value of %d matches is %d\n", input, n);

        int input2 = 0;
        input2 = SafeInput.getRangedInt(in, "Enter a number from 1-100: ",1, 100);

        int pos = -1;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == input) {
                pos = i;
                break;
            }
        }

        if (pos > -1) {
            System.out.printf("The value %d was found at array index %d\n", input2, pos);

        } else {
            System.out.printf("The value %d was not found\n", input2);
        }

        int min = dataPoints[0];
        int max = dataPoints[0];

        for(int i = 1; i < COUNT; i++){
            int currentData= dataPoints[i];
            if(currentData > max)
                max = currentData;
            if(currentData < min)
                min = currentData;
        }

        System.out.println("Minimum Value in the dataPoints = "+min);
        System.out.println("Maximum Value in the dataPoints = "+max);

        //define double array
        double[] dataPointsDouble = {5.75,25.55,57.65,112.04,225.08,7.68};

        //call getAverage
        System.out.println("Average of dataPoints is: "+getAverage(dataPointsDouble));

    }

    public static double getAverage(double[] values){
        double sum = 0;
        double avg = 0;
        if(values!=null && values.length!=0){
            for(double d: values){
                sum = sum + d;
            }
            avg = sum/values.length;
        }
        return avg;
    }
}