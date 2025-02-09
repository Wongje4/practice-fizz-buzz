package tdd.fizzbuzz;

public class FizzBuzz {

    public String countOff(int order) {
        if (order % 3 == 0 && order % 5 == 0 && order % 7 == 0) {
            return "FizzBuzzWhizz";
        } else if (order % 3 == 0 && order % 5 == 0) {
            return "FizzBuzz";
        } else if (order % 3 == 0) {
            return "Fizz";
        } else if (order % 5 == 0) {
            return "Buzz";
        } else if (order % 7 == 0) {
            return "Whizz";
        }
        return Integer.toString(order);
    }
}
