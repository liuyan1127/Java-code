package data65;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashSetMap {
    public static void main(String[] args) {
        Person p1 = new Person("yy", 18);
        Person p2 = new Person("yy", 18);

//        HashSet<Person> set = new HashSet<>();//自定义类使用hashmap、hashset
//        set.add(p1);
//        System.out.println(set.contains(p2));
        // 若返回 true，必须重写 hashCode 和 equals

        /*HashMap<String,Person> map = new HashMap<>();//自定义类作为 V 没有关系
        map.put("yy",p1);
        System.out.println(map.get("yy"));*/

        HashMap<Person, String> map = new HashMap<>();//作为 K 需要重写
        map.put(p1, "yy");
        System.out.println(map.get(p2));

    }

    public static void main2(String[] args) {
        Map<String, Integer> map = new HashMap<>();//K-V模型
        System.out.println(map.put("A", 12));
        System.out.println(map.put("B", 56));
        map.put("C", 777);
        map.put("D", 999);

        for (String key : map.keySet()) {
            System.out.println(key);
        }
    }

    public static void main1(String[] args) {
        Set<Integer> set = new HashSet<>();//纯key模型
        set.add(1);
        set.add(3);
        set.add(2);
        System.out.println(set);    // 不保证顺序
        System.out.println(set.add(1));
        System.out.println(set);

        System.out.println(set.remove(3));
        System.out.println(set);

        System.out.println(set.contains(1));
        System.out.println(set.contains(4));
    }
}
