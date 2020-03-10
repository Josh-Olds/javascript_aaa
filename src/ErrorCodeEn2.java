import ResultModel.BaseResultModel;

import java.util.*;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName EnumTest.java
 * @Description TODO
 * @createTime 2020-02-29 17:18:00
 */
public enum ErrorCodeEn2 implements INumberEnum {
        OK(0, "成功"),
        ERROR_A(100, "错误A"),
        ERROR_B(200, "错误B");

        ErrorCodeEn2(int number, String description) {
            this.code = number;
            this.description = description;
        }

        private int code;
        private String description;

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }

    public static void main(String args[]) { // 静态方法
        int ok = ErrorCodeEn2.OK.code;
        String description = ErrorCodeEn2.OK.description;


        ArrayList<BaseResultModel> arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        Iterator iterator = arrayList.iterator();
        for (Iterator<BaseResultModel> iterator1 = arrayList.iterator();iterator.hasNext();){
            BaseResultModel next = (BaseResultModel)iterator.next();
            iterator.remove();
        }
        HashSet hashSet = new HashSet();
        Iterator iterator1 = hashSet.iterator();
        TreeSet treeSet = new TreeSet();

        HashMap<String,BaseResultModel> hashMap = new HashMap();
        Hashtable hashtable = new Hashtable();

        Set<String> strings = hashMap.keySet();
        Iterator<String> iterator2 = strings.iterator();
         while (iterator2.hasNext()){
            String next = iterator2.next();
            BaseResultModel baseResultModel = hashMap.get(next);

        }

        Set<Map.Entry<String, BaseResultModel>> entries = hashMap.entrySet();

        for (Iterator<Map.Entry<String,BaseResultModel>> entryIterator= entries.iterator();entryIterator.hasNext();) {
            Map.Entry<String, BaseResultModel> next = entryIterator.next();
            String key = next.getKey();
            BaseResultModel value = next.getValue();
        }
    }
}
