import com.sun.jmx.snmp.agent.SnmpErrorHandlerAgent;

import java.util.*;

/**
 * @author Josh
 * @version 1.0.0
 * @ClassName MapTest.java
 * @Description TODO
 * @createTime 2020-02-27 15:43:00
 */
public class MapTest {


    public static void main(String[] args) {

        HashMap hashMap= new HashMap();
        hashMap.put("name","Josh");
        hashMap.put("age",23);
        hashMap.put("adders","HZ");
//        HashMap hashMap1= new HashMap();
//        hashMap1.put("name","josh");
//        hashMap1.put("age",23);
//        hashMap1.put("adders","HZ");
//        HashMap hashMap2= new HashMap();
//        hashMap2.put("name","josh");
//        hashMap2.put("age",23);
//        hashMap2.put("adders","HZ");

        for (Iterator<String> iterator = hashMap.keySet().iterator(); iterator.hasNext();){
            String key = iterator.next();
            Object value = hashMap.get(key);
//            System.out.println("key:"+key +"  value："+value);
        }


        for (Iterator<Map.Entry> iterator = hashMap.entrySet().iterator(); iterator.hasNext();){
            Map.Entry  entry = iterator.next();


            String key = (String) entry.getKey();
            if ("name".equals(key)){
                entry.setValue("Josh Pro");
            }
            Object value = entry.getValue();
            System.out.println("key:"+key +"  value："+value);


        }



//        Collection values = hashMap.values();
//        Set set = hashMap.keySet();
//        set.remove("name");
//        values.remove(23);
//        System.out.println(hashMap.toString());


        HashSet hashSet = new HashSet();
    }
}
