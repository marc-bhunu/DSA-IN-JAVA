package leetcode.arraysandhashing.encodedecodestring;

import java.util.ArrayList;
import java.util.List;

public class Codec {

    public String encode(String[] strings) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String string: strings){
            stringBuilder.append(string.length());
            stringBuilder.append("#");
            stringBuilder.append(string);
        }
      return stringBuilder.toString();
    }

    public List<String> decode(String encoded) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while(i < encoded.length()){
            int j = i;
            while(encoded.charAt(j) != '#'){
                j++;
            }
            int intVal = Integer.parseInt(encoded.substring(i , j));
            i = j + 1;
            String word = encoded.substring(i, i + intVal);
            result.add(word);
            i = i  + intVal;
        }
     return  result;
    }
}
