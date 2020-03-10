package ResultModel;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName ResultModel.java
 * @Description TODO
 * @createTime 2020-02-27 21:31:00
 */
public class ResultModel<T extends BaseResultModel> {

    public T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
