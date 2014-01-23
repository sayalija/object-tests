import junit.framework.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.Comparator;
import java.util.*;

class AddPeople {

    public static List addPeopleToList(Person... persons) {
        List<Person> people = new ArrayList<Person>();
        Collections.addAll(people, persons);
        return people;
    }
}

public class ComparatorTest {
    Person Swamiji = new Person("Swamiji", 3);
    Person SwamijiClone = new Person("Swamiji", 3);

    Person Kunal = new Person("Kunal", 50);
    Person KunalClone = new Person("Kunal", 50);

    Person Srijayanth = new Person("Srijayanth", 35);

    List people = AddPeople.addPeopleToList(Srijayanth, Kunal, Swamiji);

    @Test
    public void testCompareToByNameOfPerson() throws Exception {
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });
        Assert.assertEquals(true, Kunal.equals(people.get(0)));
        Assert.assertEquals(true, Srijayanth.equals(people.get(1)));
        Assert.assertEquals(true, Swamiji.equals(people.get(2)));
    }

    @Test
    public void testCompareToByNameLengthOfPerson() throws Exception {
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().length() - p2.getName().length();
            }
        });
        Assert.assertEquals(true, Kunal.equals(people.get(0)));
        Assert.assertEquals(true, Swamiji.equals(people.get(1)));
        Assert.assertEquals(true, Srijayanth.equals(people.get(2)));
    }

    @Test
    public void testCompareToageOfPerson() throws Exception {
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getAge() - p2.getAge();
            }
        });
        Assert.assertEquals(true, Swamiji.equals(people.get(0)));
        Assert.assertEquals(true, Srijayanth.equals(people.get(1)));
        Assert.assertEquals(true, Kunal.equals(people.get(2)));
    }

    @Test
    public void testCompareToNameLengthOfPersonInDecsendingOrder() throws Exception {
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p2.getName().length() - p1.getName().length();
            }
        });
        Assert.assertEquals(true, Srijayanth.equals(people.get(0)));
        Assert.assertEquals(true, Swamiji.equals(people.get(1)));
        Assert.assertEquals(true, Kunal.equals(people.get(2)));
    }

//    ------------  Test cases for inserting hashmap  -------------

    @Test
    public void testInsertsInHashMapShouldInsertProvidedData() {
        HashMap<Person, Person> people = new HashMap<Person, Person>();
        people.put(Swamiji, SwamijiClone);
        people.put(Kunal, KunalClone);
        Assert.assertEquals(2, people.size());
    }

    @Test
    public void testInsertsInHashMapOverWriteSameData() {
        HashMap<Person, Person> people = new HashMap<Person, Person>();
        people.put(Swamiji, SwamijiClone);
        people.put(Swamiji, SwamijiClone);
        Assert.assertEquals(1, people.size());
    }
//    ------------  Test cases for inserting set  -------------

    @Test
    public void testInsertsInSetShouldInsertProvidedData() {
        Set<Person> people = new HashSet<Person>();
        people.add(Swamiji);
        people.add(Kunal);
        Assert.assertEquals(2, people.size());
    }

    @Test
    public void testInsertsInSetOverWriteSameData() {
        Set<Person> people = new HashSet<Person>();
        people.add(Swamiji);
        people.add(Swamiji);
        Assert.assertEquals(1, people.size());
    }

    //    ------------  Test cases for ArrayList  -------------

    @Test(expected = ClassCastException.class)
    public void testToTryInsertElementInArrayList() {
        List people = new ArrayList<Person>();
        people.add(Kunal);
        people.add("Srijayanth");
        Person p = (Person) people.get(1);
    }
}
