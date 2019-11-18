package software.testing.unitandcoverage;

public class Example {

    public String getName() {
        return "Hello Name";
    }

    public int getValue(int input) {

        if(input == 10) {
           return input * 10;
        }

        return input * 10;
    }

    public String sayThankYou(String language) {
        
        switch(language) {
            case "CN":
                return "谢谢";
            case "CY":
                return "Diolch";
            case "EN":
                return "Thank you";
            default:
                return "I'm sorry, I don't speak that language.";
        }
        
    }

    public static void main(String[] args) {
        Example example = new Example();
        System.out.println(example.sayThankYou("CN"));
    }
    
}
