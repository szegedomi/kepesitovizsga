package hu.nive.ujratervezes.kepesitovizsga.addigits;

public class AddDigits {

    public int addDigits(String input){
        int result = 0;
        if(input == null || input.isEmpty()){
            return -1;
        }
        for(int i = 0; i < input.length(); i++){
            char actualChar = input.charAt(i);
            if(Character.isDigit(actualChar)){
                result += Integer.parseInt(Character.toString(actualChar));
            }
        }
        return result;
    }

}
