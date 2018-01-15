package sample;

/**
 * Created by mosab on 17/05/17.
 */
public class Test
{
    public static void main(String[] args)
    {
        Voice voice = new Voice("kevin16");
        String sayMe = "Hello what's up dud";
        voice.say(sayMe);
    }
}
