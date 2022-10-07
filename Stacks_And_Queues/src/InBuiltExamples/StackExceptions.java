package InBuiltExamples;

// it is our custom exceptions and it extends to the exception class
public class StackExceptions extends Exception{

    // a constructor taking string as arguement and passing it to the super class constructor
    public StackExceptions(String message){
        super(message);
    }
}
