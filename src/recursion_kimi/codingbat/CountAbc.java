package recursion_kimi.codingbat;

public class CountAbc {

    public static int countAbc(String str) {
        if (str.length() < 3)  return 0;
        String firstCharacters = str.substring(0, 3);
        String restOfString = str.substring(1);
        if (firstCharacters.equals("abc") || firstCharacters.equals("aba")) {
            return  1 + countAbc(restOfString);
        }else {
            return countAbc(restOfString);
        }
    }

    public static void main(String[] args) {
        System.out.println(countAbc("abc"));
        System.out.println(countAbc("abcxxabc"));
        System.out.println(countAbc("abaxxaba"));
    }
}
