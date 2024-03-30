public class Main {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 10, 100, -1, -9, 20, 33, 1001, 222, -111, 3457};

        int minValue = myArray[0];
        int maxValue = myArray[0];
        int secondSmallerValue = myArray[0];

        for (int i = 0; i < myArray.length; i++){
            if (myArray[i] > maxValue) {
                maxValue = myArray[i];
            }
            if (myArray[i] < secondSmallerValue && secondSmallerValue != minValue){
                secondSmallerValue = myArray[i];
            }
            if (myArray[i] < minValue) {
                minValue = myArray[i];
            }
        }
        int x = 7;
        int y = 5;

        int result = x^2 + ( (4*y)/5 - x )^2;
        System.out.println("The equation result is: " + result);
        System.out.println("The difference between minimum and maximum in the array is: " + (maxValue - minValue));
        System.out.println("The minimum is: " + minValue);
        System.out.println("The second smallest is: " + secondSmallerValue);

    }
}