

public class Task6 {



    public static void main(String[] args) {

        int[] arr={ 206,430,73,30,293,322,42,36,447,229 };
        int length = arr.length;


        System.out.print("Statistical Information: \n"

                + "------------------------------------ \n");

        System.out.format("Arithmetic mean: %.6f\n", mean(arr));

        System.out.format("Median: %.1f\n", median(arr));

        System.out.format("Mode: %d\n", mode(arr));

        System.out.format("Standard Deviation: %.6f\n", deviation(arr));

    }

    public static double mean(int[] array) {

        double sum = 0.0;

        for (int i = 0; i < array.length; i++) {

            sum += array[i];

        }

        return sum / array.length;

    }



    public static double median(int[] array) {

        int middle = array.length/2;

        if (array.length%2 == 1) {

            return array[middle];

        }

        else {

            return (array[middle-1] + array[middle]) / 2.0;

        }

    }



    public static int mode(int[] array) {

        int max_Value = 0;

        int max_Count = 0;



        for (int i = 0; i < array.length; ++i) {

            int count = 0;

            for (int j = 0; j < array.length; ++j) {

                if (array[j] == array[i]) ++count;

            }

            if (count > max_Count) {

                max_Count = count;

                max_Value = array[i];

            }

        }

        return max_Value;

    }



    public static double deviation(int[] array) {

        double sum = 0.0, standardDeviation = 0.0;

        int length = array.length;



        for(double num : array) {

            sum += num;

        }



        double mean = sum/length;



        for(double num: array) {

            standardDeviation += Math.pow(num - mean, 2);

        }



        return Math.sqrt(standardDeviation/length);

    }


}