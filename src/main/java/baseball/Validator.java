package baseball;

public class Validator {

    public void ValidatorAllList(String number){
        ValidatorRangeNumber(number);
        ValidatorNotEmpty(number);
        ValidatorOnlyNumber(number);
    }


    public void ValidatorRangeNumber(String number){
        for(int i = 0; i < number.length(); i++){
            if(number.length() != 3 ) {
            throw new IllegalArgumentException("3자리의 숫자만 입력 가능합니다.");
            }
        }
    }

    public void ValidatorNotEmpty(String number){
        for(int i = 0; i < number.length(); i++){
            if(number.charAt(i) == ' '){
                throw new IllegalArgumentException("공백은 들어올 수 없습니다");
            }
        }
    }

    public void ValidatorOnlyNumber(String number){
        for(int i = 0; i < number.length(); i++){
            if(number.length() == 0){
                throw new IllegalArgumentException("0은 들어올 수 없습니다.");
            }
        }
    }

}
