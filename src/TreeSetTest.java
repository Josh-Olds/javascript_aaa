import java.util.*;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName TreeSetTest.java
 * @Description TODO
 * @createTime 2020-02-27 14:29:00
 */
public class TreeSetTest {

    public static void main(String[] args) {

        Zoon zoon = new Zoon("A");
        Zoon zoon1 = new Zoon("B");
        Zoon zoon2 = new Zoon("C");
        Zoon zoon3 = new Zoon("D");

        ArrayList<Zoon> treeSet = new ArrayList();
        treeSet.add(zoon);
        treeSet.add(zoon1);
        treeSet.add(zoon2);
        treeSet.add(zoon3);

        // 方式一
        Collections.sort(treeSet, new Comparator<Zoon>() {
            @Override
            public int compare(Zoon o1, Zoon o2) {
                return 0;
            }
        });
        // 方式二
        Collections.sort(treeSet,new A());



        Double a = null;

        System.out.println(a+"");
        System.out.println(String.valueOf(a));


    }
    static class A implements Comparator<Zoon>{
        @Override
        public int compare(Zoon o1, Zoon o2) {
            return 0;
        }
    }

}

class Zoon implements Comparable{
    public String age;
    public Zoon(String age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Zoon{" +
                "age='" + age + '\'' +
                '}';
    }
    @Override
    public int compareTo(Object object) {
        Zoon str = (Zoon)object;
        return str.age.compareTo(age);
    }
}