package leetcode.arraysandhashing.encodedecodestring;

import java.util.List;

public class Main {
    static void main() {
        Codec codec = new Codec();
        String[] strings = {"hello", "world", "this", "is", "a", "test"};
        String encoded = codec.encode(strings);
        System.out.println(encoded);
        List<String> decoded = codec.decode(encoded);
        System.out.println(decoded);
    }
}
