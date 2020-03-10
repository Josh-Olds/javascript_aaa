/**
 * @author Josh
 * @version 1.0.0
 * @ClassName Generic.java
 * @Description TODO
 * @createTime 2020-02-27 20:42:00
 */
public class GenericDemo<T> {


    public static void main(String[] args) {
        Generic<String> genericStr = new Generic<>("Josh");
        Generic<Boolean> genericBo = new Generic<>(true);
        System.out.println(genericStr);
        System.out.println(genericBo);
    }

}
class Generic<T> {

    public T genericType;

    public Generic(T genericType){
        this.genericType = genericType;
    }

    @Override
    public String toString() {
        return "Generic{" +
                "genericType=" + genericType +
                '}';
    }
}
