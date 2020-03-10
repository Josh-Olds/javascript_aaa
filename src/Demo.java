
import ResultModel.BaseResultModel;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.*;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName Demo.java
 * @Description TODO
 * @createTime 2020-02-25 14:44:00
 */
public class Demo {

    public static void main(String[] args) {


        BaseResultModel b1 = new BaseResultModel();
        b1.setCode("001");
        b1.setMessage("成功1");
        BaseResultModel b2 = new BaseResultModel();
        b2.setCode("002");
        b2.setMessage("成功2");
        BaseResultModel b3 = new BaseResultModel();
        b3.setCode("003");
        b3.setMessage("成功3");
        BaseResultModel b4 = new BaseResultModel();
        b4.setCode("004");
        b4.setMessage("成功4");
        BaseResultModel b5 = new BaseResultModel();
        b5.setCode("005");
        b5.setMessage("成功5");

        BaseResultModel b11 = new BaseResultModel();
        b11.setCode("001");
        b11.setMessage("成功1");
        BaseResultModel b22 = new BaseResultModel();
        b22.setCode("0023");
        b22.setMessage("成功2");
        BaseResultModel b33 = new BaseResultModel();
        b33.setCode("003");
        b33.setMessage("成功3");


        ArrayList<BaseResultModel> arrayList = new ArrayList<BaseResultModel>();
        arrayList.add(b1);
        arrayList.add(b2);
        arrayList.add(b3);
        arrayList.add(b4);
        arrayList.add(b5);

        ArrayList<BaseResultModel> arrayList1 = new ArrayList<BaseResultModel>();
        arrayList1.add(b11);
        arrayList1.add(b22);
        arrayList1.add(b33);
        HashMap<String,BaseResultModel> map = new HashMap<>();
        map.put("one",b1);

        HashSet<BaseResultModel> set = new HashSet<>();
        set.add(b1);

        for (BaseResultModel baseResultModel : arrayList){
            System.out.println(baseResultModel.toString());
        }
        System.out.println("---------------");

        arrayList.removeAll(arrayList1);
        for (BaseResultModel baseResultModel : arrayList){
            System.out.println(baseResultModel.toString());
        }
    }

    private int[] sort(int[] arr){
        int n = arr.length;
        for (int i = 0 ; i < n ; i++){
            for (int k = 1 ; k < n - i ; k ++){
                if (arr[k] < arr[k - 1]) {//前面的数字大于后面的数字就交换
                    //交换a[j-1]和a[j]
                    int temp;
                    temp = arr[k];
                    arr[k] = arr[k - 1];
                    arr[k - 1] = temp;
                }
            }
        }
        return arr;
    }


}
