package String;
import org.apache.commons.lang3.RandomStringUtils;


public class RandomStringUtil {
    public static void main(String[] args) {
        String generatedStrings=RandomStringUtils.randomAlphabetic(1);
        System.out.println("Soumya"+generatedStrings);

        System.out.println("-----------------------------");

        String generatedString=RandomStringUtils.randomAlphanumeric(3);
        System.out.println("Soumya"+generatedString);

        System.out.println("-----------------------------");

        String generatedStrin=RandomStringUtils.randomAlphanumeric(4);
        System.out.println("Test"+generatedStrin +"@gmail.com");




    }
}
