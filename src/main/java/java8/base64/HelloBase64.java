package java8.base64;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.UUID;

public class HelloBase64 {

    public static void main(String[] args) {

        // Encode using basic encoder
        String base64encodedString = Base64.getEncoder().encodeToString(
                "TestJava8?java8".getBytes(StandardCharsets.UTF_8));

        System.out.println("Base64 Encoded String (Basic) :" + base64encodedString);

        // Decode
        byte[] base64decodedBytes = Base64.getDecoder().decode(base64encodedString);

        System.out.println("Original String: " + new String(base64decodedBytes, StandardCharsets.UTF_8));
        base64encodedString = Base64.getUrlEncoder().encodeToString(
                "TestJava8?java8".getBytes(StandardCharsets.UTF_8));
        System.out.println("Base64 Encoded String (URL) :" + base64encodedString);

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 10; ++i) {
            stringBuilder.append(UUID.randomUUID());
        }

        byte[] mimeBytes = stringBuilder.toString().getBytes(StandardCharsets.UTF_8);
        String mimeEncodedString = Base64.getMimeEncoder().encodeToString(mimeBytes);
        System.out.println("Base64 Encoded String (MIME) :" + mimeEncodedString);
    }
}
