import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by sayalija on 1/14/14.
 */
public class StringTest {
    @Test
    public void twoSameLiteralStringWillReturnFalse() throws Exception {
        String India = "India";
        String MyCountry = "India";
        Assert.assertEquals(true, India.equals(MyCountry));
    }

    @Test
    public void twoDifferentLiteralStringWillReturnFalse() throws Exception {
        String India = "India";
        String MyCountry = "MyCountry";
        Assert.assertEquals(false, India.equals(MyCountry));
    }

    @Test
    public void twoDifferentObjectStringWillReturnFalse() throws Exception {
        String India = new String("India");
        String MyCountry = new String("MyCountry");
        Assert.assertEquals(false, India.equals(MyCountry));
    }

    @Test
    public void twoSameLiteralObjectWillReturnTrue() throws Exception {
        String India = new String("India");
        String MyCountry = new String("India");
        Assert.assertEquals(true, India.equals(MyCountry));
    }
    @Test
    public void oneObjectStringAndOtherLiteralStringWillReturnFalse() throws Exception {
        String India = new String("India");
        String MyCountry = new String("MyCountry");
        Assert.assertEquals(false, India.equals(MyCountry));
    }

    @Test
    public void oneObjectStringAndOtherLiteralStringWillReturnTrue() throws Exception {
        String India = new String("India");
        String MyCountry = new String("India");
        Assert.assertEquals(true, India.equals(MyCountry));
    }


}
