/**
 * Created by Moravia on 11/21/16.
 */
public class ServerNameGenerator {
    public static void main(String[] args) {
        String serverName;

        String[] adjectives = {
            "purple", "sandy", "shiny", "tarnished", "courageous"
        };

        String[] nouns = {
            "aardvark", "ponytail", "headphones", "drainpipe"
        };

        serverName = getRandomString(adjectives) + " " + getRandomString(nouns);

        System.out.println(serverName);
    }

    protected static String getRandomString(String[] arrayOfStrings) {
        int random = (int) Math.floor(Math.random() * arrayOfStrings.length);
        return arrayOfStrings[random];
    }
}
