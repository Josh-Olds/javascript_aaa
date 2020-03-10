package ResultModel;

import java.util.Objects;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName baseResultModel.java
 * @Description TODO
 * @createTime 2020-02-27 21:32:00
 */
public class BaseResultModel implements Comparable<BaseResultModel>{

    public String code;

    public String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "BaseResultModel{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseResultModel that = (BaseResultModel) o;
        return Objects.equals(code, that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }


    @Override
    public int compareTo(BaseResultModel o) {
        return 0;
    }
}
