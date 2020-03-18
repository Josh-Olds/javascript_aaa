public class stringToAscii {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        String c  = "abc";
        String d  = "123";
        String e = "123";
        String josh_abc = "a"+"bc";
        int age1 = 200;
        int age2 = 200;

        System.out.println("abc : "+a.hashCode());
        System.out.println("new String :"+c.hashCode());


        Integer integer1 = new Integer(2000);
        Integer integer2 = new Integer(20);

        System.out.println("integer : "+(integer1 == 2000));
        System.out.println("int : "+(age1 == age2));

        StringBuffer stringBuffer = new StringBuffer("abc");

        System.out.println(stringBuffer.toString() == c);
        System.out.println(a == josh_abc);

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(e.hashCode());





    }
    /**
     * 字符串转换为Ascii
     * @param value
     * @return
     */
    public static String stringToAscii(String value)
    {
        StringBuffer sbu = new StringBuffer();
        char[] chars = value.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(i != chars.length - 1)
            {
                sbu.append((int)chars[i]).append(",");
            }
            else {
                sbu.append((int)chars[i]);
            }
        }
        return sbu.toString();
    }

    /**
     * Ascii转换为字符串
     * @param value
     * @return
     */
    public static String asciiToString(String value)
    {
        StringBuffer sbu = new StringBuffer();
        String[] chars = value.split(",");
        for (int i = 0; i < chars.length; i++) {
            sbu.append((char) Integer.parseInt(chars[i]));
        }
        return sbu.toString();
    }
}