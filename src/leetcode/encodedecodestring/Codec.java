package leetcode.encodedecodestring;

import java.util.ArrayList;
import java.util.List;

public class Codec {

    public String encode(String[] strings){
        StringBuilder sb = new StringBuilder();
        for (String str : strings) {
            sb.append(str.length()).append("#").append(str);
        }
        return sb.toString();
    }

    public static List<String> decode(String encoded) {
        List<String> decodeList  = new ArrayList<>();
        int i = 0;
        while (i < encoded.length()) {
            int j = i;
            while (encoded.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(encoded.substring(i, j));
            i = j + 1; // go to the beginning of a word
            String str = encoded.substring(i, i + length);
            decodeList.add(str);
            i += length;
        }

        return decodeList;
    }
}
