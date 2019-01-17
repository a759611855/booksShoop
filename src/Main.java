import com.xugh.reflec.Person;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("com.xugh.reflec.Person");
            Person p = (Person) clazz.newInstance();
            Method []methods = clazz.getMethods();
            Field name = clazz.getDeclaredField("name");
            name.setAccessible(true);
            name.set(p,"xugh");
            Method method = clazz.getMethod("say");
            method.invoke(p);
            System.out.println(p.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
