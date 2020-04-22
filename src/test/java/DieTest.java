import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class DieTest {
    @Test
    public void DieRange() {
        Pattern pattern = Pattern.compile("[1-6]");
        Die die6 = new Die(6);
        die6.roll();
        int num = die6.value;
        String finder = String.valueOf(num);

        Assert.assertEquals(pattern.matcher(finder).find(),true);

    }


}