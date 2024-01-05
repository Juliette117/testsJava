package demo.tdd;

public class FizzBuzz {
    public String say(int number) {
        if(number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }
        //1ere etape: if(number == 3)
        if(number % 3 == 0) {
            return "Fizz";
        }
        //1ere etape: if(number == 5)
        if (number % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(number);
    }
}
