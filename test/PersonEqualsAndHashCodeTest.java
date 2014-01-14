import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by sayalija on 1/14/14.
 */
public class PersonEqualsAndHashCodeTest {

    @Test
    public void testHashCodeWillReturnTrueForSamePersonTwoTimes() throws Exception {
        Person Swamiji = new Person("Swamiji", 34);
        int hash1 = Swamiji.hashCode();
        int hash2 = Swamiji.hashCode();
        Assert.assertEquals(true, hash1 == hash2);
    }

    @Test
    public void testHashCodeWillReturnFalseForDifferentPersons() throws Exception {
        Person Swamiji = new Person("Swamiji", 34);
        Person Kunal = new Person("Kunal", 25);
        int hash1 = Swamiji.hashCode();
        int hash2 = Kunal.hashCode();
        Assert.assertEquals(false, hash1 == hash2);
    }

    @Test
    public void testEqualsReturnTrueForSameObject() throws Exception {
        Person p1 = new Person("Swamiji", 34);
        Person p2 = new Person("Swamiji", 34);
        Assert.assertEquals(true, p1.equals(p2));
    }

    @Test
    public void testEqualsReturnFalseForDifferentObject() throws Exception {
        Person Swamiji = new Person("Swamiji", 34);
        Person Kunal = new Person("Kunal", 25);
        Assert.assertEquals(false, Swamiji.equals(Kunal));
    }


    @Test
    public void testHashCodeWillReturnTrueForSameWrongPersonTwoTimes() throws Exception {
        WrongPerson Swamiji = new WrongPerson("Swamiji", 34);
        int hash1 = Swamiji.hashCode();
        int hash2 = Swamiji.hashCode();
        Assert.assertEquals(false, hash1 == hash2);
    }

    @Test
    public void testEqualsReturnTrueForSameWrongPerson() throws Exception {
        WrongPerson p1 = new WrongPerson("Swamiji", 34);
        WrongPerson p2 = new WrongPerson("Swamiji", 34);
        Assert.assertEquals(false, p1.equals(p2));
    }

    @Test
    public void testEqualsReturnFalseForDifferentWrongPerson() throws Exception {
        WrongPerson Swamiji = new WrongPerson("Swamiji", 34);
        WrongPerson Kunal = new WrongPerson("Kunal", 25);
        Assert.assertEquals(true, Swamiji.equals(Kunal));
    }

}
