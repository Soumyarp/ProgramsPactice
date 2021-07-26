package String;

import java.util.Base64;

public class DecodeString {
    public static void main(String[] args) {
        String encoded="aGkgdGhpcyBpcyBuYXJlc2gga3VtYXI=";
        byte[] decoderbyte=Base64.getDecoder().decode(encoded);
        String decoderStr = new String(decoderbyte);
        System.out.println(decoderStr);
    }


}
