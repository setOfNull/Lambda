import java.util.*;

public class Randomm {
    public static void main(String[] args) {
        //Рандомный код
        RandomI randomMash;
        String str = "butterfly";
        System.out.println("Our word: ***" + str + "***");
        List<Character> list = new ArrayList<>();
               randomMash = x -> {

                   for (int i = 0; i < str.length(); i++) {
                       list.add(str.charAt(i));
                   }
                   Collections.shuffle(list);
                   StringBuilder sb = new StringBuilder();
                   for (Character ch : list) {
                       sb.append(ch);
                   }
                   return sb.toString();
               };


        System.out.println("Random: " + randomMash.rand(list.toString()));

//*****************************************************************************
     //Переворачивает сроку
        StringReverter stringReverter;
        stringReverter = strr -> {

            String str2 = "";
            for (int i = str.length()-1; i>=0; i--){

                char lchar = str.charAt(i);
                str2 += String.valueOf(lchar);

            }
            return str2;
        };

        System.out.println("Reverse: " + stringReverter.revert(str));

//*****************************************************************************
     //Калькулятор
Calculator calculator;
calculator = (x,y)->{
    int sum = x+y;
    int sub = x-y;
    int mul = x*y;
    int div = x/y;
    return new int[] {sum, sub, mul, div};
};

        System.out.println("Calculator: " + Arrays.toString(calculator.calculate(5, 4)));
    }
}
