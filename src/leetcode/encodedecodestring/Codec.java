package leetcode.encodedecodestring;

import java.util.ArrayList;
import java.util.List;

public class Codec {

  public String encode(String[] strings){
      StringBuilder stringBuilder = new StringBuilder();
      for (String str: strings){
          stringBuilder.append(str.length()).append("#").append(str);
      }
      return  stringBuilder.toString();
  }
    public static List<String> decode(String encoded) {
      List<String> decodedList = new ArrayList<>();
      int i = 0;
      while (i < encoded.length()){
          int j = i;
          while(encoded.charAt(j) != '#'){
              j++;
          }
          int length = Integer.parseInt(encoded.substring(i, j));
          i = j + 1;
          String word = encoded.substring(i, i + length);
          decodedList.add(word);
          i = i + length;
      }

      return  decodedList;
    }


}
