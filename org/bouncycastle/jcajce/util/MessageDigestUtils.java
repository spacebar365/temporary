package org.bouncycastle.jcajce.util;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.a.i.d;
import org.bouncycastle.a.l.a;
import org.bouncycastle.a.p;
import org.bouncycastle.a.r.b;
import org.bouncycastle.a.s.n;

/* JADX INFO: loaded from: classes.dex */
public class MessageDigestUtils {
    private static Map<p, String> a;

    static {
        HashMap map = new HashMap();
        a = map;
        map.put(n.H, "MD2");
        a.put(n.I, "MD4");
        a.put(n.J, "MD5");
        a.put(b.i, "SHA-1");
        a.put(org.bouncycastle.a.o.b.f, "SHA-224");
        a.put(org.bouncycastle.a.o.b.c, "SHA-256");
        a.put(org.bouncycastle.a.o.b.d, "SHA-384");
        a.put(org.bouncycastle.a.o.b.e, "SHA-512");
        a.put(org.bouncycastle.a.v.p.c, "RIPEMD-128");
        a.put(org.bouncycastle.a.v.p.b, "RIPEMD-160");
        a.put(org.bouncycastle.a.v.p.d, "RIPEMD-128");
        a.put(a.d, "RIPEMD-128");
        a.put(a.c, "RIPEMD-160");
        a.put(org.bouncycastle.a.f.a.b, "GOST3411");
        a.put(org.bouncycastle.a.j.a.g, "Tiger");
        a.put(a.e, "Whirlpool");
        a.put(org.bouncycastle.a.o.b.i, "SHA3-224");
        a.put(org.bouncycastle.a.o.b.j, "SHA3-256");
        a.put(org.bouncycastle.a.o.b.k, "SHA3-384");
        a.put(org.bouncycastle.a.o.b.l, "SHA3-512");
        a.put(d.ab, "SM3");
    }

    public static String a(p pVar) {
        String str = a.get(pVar);
        return str != null ? str : pVar.b();
    }
}
