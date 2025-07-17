package problems.encodedecodestring;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Codec codec = new Codec();
        String[] strings = {"hello", "world", "this", "is", "a", "test"};
        String encoded = codec.encode(strings);
        System.out.println(encoded);
        List<String> decoded = Codec.decode(encoded);
        System.out.println(decoded);
    }
}
