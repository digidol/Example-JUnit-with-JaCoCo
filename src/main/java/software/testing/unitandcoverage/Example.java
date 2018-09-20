package software.testing.unitandcoverage;

public class Example {

    public String getName() {
        return "Hello Name";
    }

    public int getValue(int input) {

        if(input == 10) {
           return input * 101;
        }

        return input * 10;
    }

}
