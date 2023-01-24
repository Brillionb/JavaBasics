package basic;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CHMInterner <T> {
    private final Map<T, T> map;

    public CHMInterner() {
        map = new ConcurrentHashMap<>();
    }

    public T intern(T t) {
        T exist = map.putIfAbsent(t, t);
        return (exist == null) ? t : exist;
    }

    public int internSize() {
        return map.size();
    }
}

class StringObjects {
    public static void main(String[] args) {
        CHMInterner chmInterner = new CHMInterner();

        chmInterner.intern("TopJava_1");
        chmInterner.intern("TopJava_2");
        chmInterner.intern("TopJava_2");
        chmInterner.intern("TopJava_3");
        chmInterner.intern("TopJava_3");
        chmInterner.intern("TopJava_3");
        chmInterner.intern("TopJava_4");
        chmInterner.intern("TopJava_4");
        chmInterner.intern("TopJava_4");
        chmInterner.intern("TopJava_4");
        String t = new String("TopJava_5");
        System.out.println(t.intern());

        System.out.println("Размер пула строк равен: " + chmInterner.internSize());
    }
}
