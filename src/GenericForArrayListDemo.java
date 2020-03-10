/**
 * @author Josh
 * @version 1.0.0
 * @ClassName GenericForArrayListDemo.java
 * @Description TODO
 * @createTime 2020-02-27 21:02:00
 */

public class GenericForArrayListDemo<T> {

    public Object[] array;

    public int index = 0;

    public GenericForArrayListDemo(){
        array = new Object[10];
    }
    public GenericForArrayListDemo(int size){
        array = new Object[size];
    }

    public void add(T element){
        // index++ 假如的元素自增
        array[index++] = element;
    }

    public T get(int index){
        return (T) array[index];
    }

    public int size(){
        return index;
    }


    public static void main(String[] args) {


        GenericForArrayListDemo<Integer> generic = new GenericForArrayListDemo<Integer>();

        generic.add(new Integer(10));
        generic.add(new Integer(20));

        System.out.println(generic.size());
        System.out.println(generic.get(0));

    }
}