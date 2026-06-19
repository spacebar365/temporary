package org.bouncycastle.jcajce.provider.util;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p070o.InterfaceC0652b;
import org.bouncycastle.p054a.p073r.InterfaceC0659b;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;
import org.bouncycastle.p083b.InterfaceC1175r;
import org.bouncycastle.p083b.p086b.C0836m;
import org.bouncycastle.p083b.p086b.C0842s;
import org.bouncycastle.p083b.p086b.C0843t;
import org.bouncycastle.p083b.p086b.C0844u;
import org.bouncycastle.p083b.p086b.C0845v;
import org.bouncycastle.p083b.p086b.C0847x;
import org.bouncycastle.p083b.p102o.C1164a;
import org.bouncycastle.p142f.C1560k;

/* JADX INFO: loaded from: classes.dex */
public class DigestFactory {

    /* JADX INFO: renamed from: a */
    private static Set f6217a = new HashSet();

    /* JADX INFO: renamed from: b */
    private static Set f6218b = new HashSet();

    /* JADX INFO: renamed from: c */
    private static Set f6219c = new HashSet();

    /* JADX INFO: renamed from: d */
    private static Set f6220d = new HashSet();

    /* JADX INFO: renamed from: e */
    private static Set f6221e = new HashSet();

    /* JADX INFO: renamed from: f */
    private static Set f6222f = new HashSet();

    /* JADX INFO: renamed from: g */
    private static Set f6223g = new HashSet();

    /* JADX INFO: renamed from: h */
    private static Set f6224h = new HashSet();

    /* JADX INFO: renamed from: i */
    private static Set f6225i = new HashSet();

    /* JADX INFO: renamed from: j */
    private static Set f6226j = new HashSet();

    /* JADX INFO: renamed from: k */
    private static Set f6227k = new HashSet();

    /* JADX INFO: renamed from: l */
    private static Set f6228l = new HashSet();

    /* JADX INFO: renamed from: m */
    private static Map f6229m = new HashMap();

    static {
        f6217a.add("MD5");
        f6217a.add(InterfaceC0674n.f2621J.m1593b());
        f6218b.add("SHA1");
        f6218b.add("SHA-1");
        f6218b.add(InterfaceC0659b.f2575i.m1593b());
        f6219c.add("SHA224");
        f6219c.add("SHA-224");
        f6219c.add(InterfaceC0652b.f2493f.m1593b());
        f6220d.add("SHA256");
        f6220d.add("SHA-256");
        f6220d.add(InterfaceC0652b.f2490c.m1593b());
        f6221e.add("SHA384");
        f6221e.add("SHA-384");
        f6221e.add(InterfaceC0652b.f2491d.m1593b());
        f6222f.add("SHA512");
        f6222f.add("SHA-512");
        f6222f.add(InterfaceC0652b.f2492e.m1593b());
        f6223g.add("SHA512(224)");
        f6223g.add("SHA-512(224)");
        f6223g.add(InterfaceC0652b.f2494g.m1593b());
        f6224h.add("SHA512(256)");
        f6224h.add("SHA-512(256)");
        f6224h.add(InterfaceC0652b.f2495h.m1593b());
        f6225i.add("SHA3-224");
        f6225i.add(InterfaceC0652b.f2496i.m1593b());
        f6226j.add("SHA3-256");
        f6226j.add(InterfaceC0652b.f2497j.m1593b());
        f6227k.add("SHA3-384");
        f6227k.add(InterfaceC0652b.f2498k.m1593b());
        f6228l.add("SHA3-512");
        f6228l.add(InterfaceC0652b.f2499l.m1593b());
        f6229m.put("MD5", InterfaceC0674n.f2621J);
        f6229m.put(InterfaceC0674n.f2621J.m1593b(), InterfaceC0674n.f2621J);
        f6229m.put("SHA1", InterfaceC0659b.f2575i);
        f6229m.put("SHA-1", InterfaceC0659b.f2575i);
        f6229m.put(InterfaceC0659b.f2575i.m1593b(), InterfaceC0659b.f2575i);
        f6229m.put("SHA224", InterfaceC0652b.f2493f);
        f6229m.put("SHA-224", InterfaceC0652b.f2493f);
        f6229m.put(InterfaceC0652b.f2493f.m1593b(), InterfaceC0652b.f2493f);
        f6229m.put("SHA256", InterfaceC0652b.f2490c);
        f6229m.put("SHA-256", InterfaceC0652b.f2490c);
        f6229m.put(InterfaceC0652b.f2490c.m1593b(), InterfaceC0652b.f2490c);
        f6229m.put("SHA384", InterfaceC0652b.f2491d);
        f6229m.put("SHA-384", InterfaceC0652b.f2491d);
        f6229m.put(InterfaceC0652b.f2491d.m1593b(), InterfaceC0652b.f2491d);
        f6229m.put("SHA512", InterfaceC0652b.f2492e);
        f6229m.put("SHA-512", InterfaceC0652b.f2492e);
        f6229m.put(InterfaceC0652b.f2492e.m1593b(), InterfaceC0652b.f2492e);
        f6229m.put("SHA512(224)", InterfaceC0652b.f2494g);
        f6229m.put("SHA-512(224)", InterfaceC0652b.f2494g);
        f6229m.put(InterfaceC0652b.f2494g.m1593b(), InterfaceC0652b.f2494g);
        f6229m.put("SHA512(256)", InterfaceC0652b.f2495h);
        f6229m.put("SHA-512(256)", InterfaceC0652b.f2495h);
        f6229m.put(InterfaceC0652b.f2495h.m1593b(), InterfaceC0652b.f2495h);
        f6229m.put("SHA3-224", InterfaceC0652b.f2496i);
        f6229m.put(InterfaceC0652b.f2496i.m1593b(), InterfaceC0652b.f2496i);
        f6229m.put("SHA3-256", InterfaceC0652b.f2497j);
        f6229m.put(InterfaceC0652b.f2497j.m1593b(), InterfaceC0652b.f2497j);
        f6229m.put("SHA3-384", InterfaceC0652b.f2498k);
        f6229m.put(InterfaceC0652b.f2498k.m1593b(), InterfaceC0652b.f2498k);
        f6229m.put("SHA3-512", InterfaceC0652b.f2499l);
        f6229m.put(InterfaceC0652b.f2499l.m1593b(), InterfaceC0652b.f2499l);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4480a(String str, String str2) {
        return (f6218b.contains(str) && f6218b.contains(str2)) || (f6219c.contains(str) && f6219c.contains(str2)) || ((f6220d.contains(str) && f6220d.contains(str2)) || ((f6221e.contains(str) && f6221e.contains(str2)) || ((f6222f.contains(str) && f6222f.contains(str2)) || ((f6223g.contains(str) && f6223g.contains(str2)) || ((f6224h.contains(str) && f6224h.contains(str2)) || ((f6225i.contains(str) && f6225i.contains(str2)) || ((f6226j.contains(str) && f6226j.contains(str2)) || ((f6227k.contains(str) && f6227k.contains(str2)) || ((f6228l.contains(str) && f6228l.contains(str2)) || (f6217a.contains(str) && f6217a.contains(str2)))))))))));
    }

    /* JADX INFO: renamed from: b */
    public static C0653p m4481b(String str) {
        return (C0653p) f6229m.get(str);
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC1175r m4479a(String str) {
        String strM4163b = C1560k.m4163b(str);
        if (f6218b.contains(strM4163b)) {
            return new C0842s();
        }
        if (f6217a.contains(strM4163b)) {
            return new C0836m();
        }
        if (f6219c.contains(strM4163b)) {
            return new C0843t();
        }
        if (f6220d.contains(strM4163b)) {
            return new C0844u();
        }
        if (f6221e.contains(strM4163b)) {
            return new C0845v();
        }
        if (f6222f.contains(strM4163b)) {
            return new C0847x();
        }
        if (f6223g.contains(strM4163b)) {
            return C1164a.m2782a();
        }
        if (f6224h.contains(strM4163b)) {
            return C1164a.m2783b();
        }
        if (f6225i.contains(strM4163b)) {
            return C1164a.m2784c();
        }
        if (f6226j.contains(strM4163b)) {
            return C1164a.m2785d();
        }
        if (f6227k.contains(strM4163b)) {
            return C1164a.m2786e();
        }
        if (f6228l.contains(strM4163b)) {
            return C1164a.m2787f();
        }
        return null;
    }
}
