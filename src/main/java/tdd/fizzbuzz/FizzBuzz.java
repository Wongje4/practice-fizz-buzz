package tdd.fizzbuzz;

public class FizzBuzz {

    public String countOff(int order) {
        if (order % 3 == 0) {
            return "Fizz";
        }
        return Integer.toString(order);
    }
}
