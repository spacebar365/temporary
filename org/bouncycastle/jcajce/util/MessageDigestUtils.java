package org.bouncycastle.jcajce.util;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p061f.InterfaceC0619a;
import org.bouncycastle.p054a.p064i.InterfaceC0633d;
import org.bouncycastle.p054a.p065j.InterfaceC0635a;
import org.bouncycastle.p054a.p067l.InterfaceC0639a;
import org.bouncycastle.p054a.p070o.InterfaceC0652b;
import org.bouncycastle.p054a.p073r.InterfaceC0659b;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;
import org.bouncycastle.p054a.p077v.InterfaceC0739p;

/* JADX INFO: loaded from: classes.dex */
public class MessageDigestUtils {

    /* JADX INFO: renamed from: a */
    private static Map<C0653p, String> f6276a;

    static {
        HashMap map = new HashMap();
        f6276a = map;
        map.put(InterfaceC0674n.f2619H, "MD2");
        f6276a.put(InterfaceC0674n.f2620I, "MD4");
        f6276a.put(InterfaceC0674n.f2621J, "MD5");
        f6276a.put(InterfaceC0659b.f2575i, "SHA-1");
        f6276a.put(InterfaceC0652b.f2493f, "SHA-224");
        f6276a.put(InterfaceC0652b.f2490c, "SHA-256");
        f6276a.put(InterfaceC0652b.f2491d, "SHA-384");
        f6276a.put(InterfaceC0652b.f2492e, "SHA-512");
        f6276a.put(InterfaceC0739p.f2931c, "RIPEMD-128");
        f6276a.put(InterfaceC0739p.f2930b, "RIPEMD-160");
        f6276a.put(InterfaceC0739p.f2932d, "RIPEMD-128");
        f6276a.put(InterfaceC0639a.f2394d, "RIPEMD-128");
        f6276a.put(InterfaceC0639a.f2393c, "RIPEMD-160");
        f6276a.put(InterfaceC0619a.f2194b, "GOST3411");
        f6276a.put(InterfaceC0635a.f2351g, "Tiger");
        f6276a.put(InterfaceC0639a.f2395e, "Whirlpool");
        f6276a.put(InterfaceC0652b.f2496i, "SHA3-224");
        f6276a.put(InterfaceC0652b.f2497j, "SHA3-256");
        f6276a.put(InterfaceC0652b.f2498k, "SHA3-384");
        f6276a.put(InterfaceC0652b.f2499l, "SHA3-512");
        f6276a.put(InterfaceC0633d.f2303ab, "SM3");
    }

    /* JADX INFO: renamed from: a */
    public static String m4528a(C0653p c0653p) {
        String str = f6276a.get(c0653p);
        return str != null ? str : c0653p.m1593b();
    }
}
