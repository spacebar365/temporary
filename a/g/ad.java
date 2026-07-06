package a.g;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: SmbException.java */
/* JADX INFO: loaded from: classes.dex */
public class ad extends a.d implements be, i, o {
    private static final Map<Integer, String> c;
    private static final Map<Integer, String> d;
    private static final Map<Integer, Integer> e;
    private int f;

    static {
        HashMap map = new HashMap();
        for (int i = 0; i < c_.length; i++) {
            map.put(Integer.valueOf(c_[i]), d_[i]);
        }
        HashMap map2 = new HashMap();
        for (int i2 = 0; i2 < a.length; i2++) {
            map2.put(Integer.valueOf(a[i2][0]), Integer.valueOf(a[i2][1]));
            String str = (String) map.get(Integer.valueOf(a[i2][1]));
            if (str != null) {
                map.put(Integer.valueOf(a[i2][0]), str);
            }
        }
        map.put(0, "NT_STATUS_SUCCESS");
        c = Collections.unmodifiableMap(map);
        e = Collections.unmodifiableMap(map2);
        HashMap map3 = new HashMap();
        for (int i3 = 0; i3 < a_.length; i3++) {
            map3.put(Integer.valueOf(a_[i3]), b_[i3]);
        }
        d = Collections.unmodifiableMap(map3);
    }

    public static String a(int i) {
        String str = c.get(Integer.valueOf(i));
        if (str == null) {
            return "0x" + a.i.e.a(i, 8);
        }
        return str;
    }

    static int b(int i) {
        if (((-1073741824) & i) == 0) {
            if (e.containsKey(Integer.valueOf(i))) {
                return e.get(Integer.valueOf(i)).intValue();
            }
            return -1073741823;
        }
        return i;
    }

    public ad() {
    }

    public ad(int i) {
        super(a(i), null);
        this.f = b(i);
    }

    public ad(String str) {
        super(str);
        this.f = -1073741823;
    }

    public ad(String str, Throwable th) {
        super(str, th);
        this.f = -1073741823;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ad(int i, boolean z) {
        String strA;
        if (!z) {
            strA = a(i);
        } else {
            strA = d.get(Integer.valueOf(i));
            if (strA == null) {
                strA = "W" + a.i.e.a(i, 8);
            }
        }
        super(strA);
        this.f = z ? i : b(i);
    }

    public final int b() {
        return this.f;
    }

    static ad a(a.d dVar) {
        return dVar instanceof ad ? (ad) dVar : new ad(dVar.getMessage(), dVar);
    }
}
