import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {

@Test
   public void testabbr(){
    String result = StringUtils.abbreviate("Annnnn", 4);
    Assert.assertEquals(result, "A...");

    String result2 = StringUtils.abbreviate("Annnnn", 4);
    Assert.assertEquals(result2, "A...");


}

}
