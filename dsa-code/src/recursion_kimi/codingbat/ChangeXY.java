package recursion_kimi.codingbat;

public class ChangeXY {
    public static String changeXY(String str){
        if (str.isEmpty()) return "";
        String result = "";
        char firstChar = str.charAt(0);
        String restOfString = str.substring(1);
        if (firstChar == 'x') {
            result = "y" + changeXY(restOfString);
        }else{
            result = firstChar + changeXY(restOfString);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(changeXY("xhixhix"));
    }
}
