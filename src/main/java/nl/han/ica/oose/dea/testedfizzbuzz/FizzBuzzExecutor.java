package nl.han.ica.oose.dea.testedfizzbuzz;

public class FizzBuzzExecutor {

    public String execute(int i){
        int fizz = 3;
        int buzz = 5;
        int fizzBuzz = 15;
        if(i % fizzBuzz == 0){
            return "FizzBuzz";
        } else if (i % fizz == 0){
            return "Fizz";
        } else if (i % buzz == 0){
            return "Buzz";
        }
        return i + "";
    }
}
