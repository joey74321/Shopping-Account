public class Phone {
    private String areaCode;
    private String threeDigitNumber;
    private String fourDigitNumber;

//creating a phone constructor
    public Phone(){
        this.areaCode = "";
        this.threeDigitNumber = "";
        this.fourDigitNumber = "";
    }

//The following constructor takes in values via parameters
    public Phone(String area, String numOne, String numTwo) {
        this.areaCode = area;
        this.threeDigitNumber = numOne;
        this.fourDigitNumber = numTwo;
    }

    public String toString() {
        return  areaCode + "-" + threeDigitNumber + "-" + fourDigitNumber;
    }
}
