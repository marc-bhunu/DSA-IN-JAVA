package recursion_kimi.codingbat;

public class ChangePi {
    public static   String changePi(String str){
        String result = "";
        if (str.length()  < 2) return  str;
        String firstPi = str.substring(0,2);
        String restOfString = str.substring(2);
        if (firstPi.equals("pi")) {
            result =  "3.14" + changePi(restOfString);
        }else{
            result =  str.charAt(0) + changePi(str.substring(1));
        }
        return  result;
    }

    public static void main(String[] args) {
        System.out.println(changePi("xpix"));
    }
}
