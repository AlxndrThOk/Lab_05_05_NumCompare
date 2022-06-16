public class Main {
    public static void main(String[] args)
    {
        double valueOne = 0;
        double valueTwo = 0;
        System.out.println("what is the first value?");
        valueOne = 0;
        System.out.println("what is the the second value?");
        valueTwo = 0;
        if (valueOne == valueTwo)
        {
            System.out.println(valueOne + " is equal to " +valueTwo);
        }
        else if (valueOne < valueTwo)
        {
            System.out.println(valueOne + " is less than " + valueTwo);
        }
        else if (valueOne > valueTwo)
        {
            System.out.println(valueOne + " is greater than " + valueTwo);
        }
        else
        {
            System.out.println("values entered are not a number, try again");
        }
    }
}