package p000a.p029g;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p000a.C0044d;
import p000a.p031i.C0284e;

/* JADX INFO: renamed from: a.g.ad */
/* JADX INFO: compiled from: SmbException.java */
/* JADX INFO: loaded from: classes.dex */
public class C0214ad extends C0044d implements InterfaceC0242be, InterfaceC0249i, InterfaceC0255o {

    /* JADX INFO: renamed from: c */
    private static final Map<Integer, String> f952c;

    /* JADX INFO: renamed from: d */
    private static final Map<Integer, String> f953d;

    /* JADX INFO: renamed from: e */
    private static final Map<Integer, Integer> f954e;

    /* JADX INFO: renamed from: f */
    private int f955f;

    static {
        HashMap map = new HashMap();
        for (int i = 0; i < f1174c_.length; i++) {
            map.put(Integer.valueOf(f1174c_[i]), f1175d_[i]);
        }
        HashMap map2 = new HashMap();
        for (int i2 = 0; i2 < f1155a.length; i2++) {
            map2.put(Integer.valueOf(f1155a[i2][0]), Integer.valueOf(f1155a[i2][1]));
            String str = (String) map.get(Integer.valueOf(f1155a[i2][1]));
            if (str != null) {
                map.put(Integer.valueOf(f1155a[i2][0]), str);
            }
        }
        map.put(0, "NT_STATUS_SUCCESS");
        f952c = Collections.unmodifiableMap(map);
        f954e = Collections.unmodifiableMap(map2);
        HashMap map3 = new HashMap();
        for (int i3 = 0; i3 < f1127a_.length; i3++) {
            map3.put(Integer.valueOf(f1127a_[i3]), f1128b_[i3]);
        }
        f953d = Collections.unmodifiableMap(map3);
    }

    /* JADX INFO: renamed from: a */
    public static String m612a(int i) {
        String str = f952c.get(Integer.valueOf(i));
        if (str == null) {
            return "0x" + C0284e.m947a(i, 8);
        }
        return str;
    }

    /* JADX INFO: renamed from: b */
    static int m613b(int i) {
        if (((-1073741824) & i) == 0) {
            if (f954e.containsKey(Integer.valueOf(i))) {
                return f954e.get(Integer.valueOf(i)).intValue();
            }
            return -1073741823;
        }
        return i;
    }

    public C0214ad() {
    }

    public C0214ad(int i) {
        super(m612a(i), null);
        this.f955f = m613b(i);
    }

    public C0214ad(String str) {
        super(str);
        this.f955f = -1073741823;
    }

    public C0214ad(String str, Throwable th) {
        super(str, th);
        this.f955f = -1073741823;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0214ad(int i, boolean z) {
        String strM612a;
        if (!z) {
            strM612a = m612a(i);
        } else {
            strM612a = f953d.get(Integer.valueOf(i));
            if (strM612a == null) {
                strM612a = "W" + C0284e.m947a(i, 8);
            }
        }
        super(strM612a);
        this.f955f = z ? i : m613b(i);
    }

    /* JADX INFO: renamed from: b */
    public final int m614b() {
        return this.f955f;
    }

    /* JADX INFO: renamed from: a */
    static C0214ad m611a(C0044d c0044d) {
        return c0044d instanceof C0214ad ? (C0214ad) c0044d : new C0214ad(c0044d.getMessage(), c0044d);
    }
}
