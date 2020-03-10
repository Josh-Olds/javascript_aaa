import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName hashSetTest.java
 * @Description TODO
 * @createTime 2020-02-27 00:48:00
 */
public class hashSetTest {

    public static void main(String[] args) {
        People people = new People("Josh",23);
        People people2 = new People("jeery",24);

        HashSet hashSet = new HashSet();
        hashSet.add(people);
        hashSet.add(people2);
        // 迭代器
        Iterator iterator = hashSet.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        for (Iterator iterator1 = hashSet.iterator(); iterator.hasNext();){
                        System.out.println(iterator.next());

        }



        System.out.println(hashSet.size());
//        String s = "s";
//        System.out.println(Integer.toHexString(people.hashCode()));
//        people.age = 32;
//        System.out.println(people.equals(people));
//        System.out.println(people.toString());


    }
}
class People {

    public String name;

    public int age;

    public People(String name,int age){
        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return age == people.age &&
                Objects.equals(name, people.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}