package org.bouncycastle.jcajce.provider.util;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.p054a.p070o.InterfaceC0652b;
import org.bouncycastle.p054a.p072q.InterfaceC0656a;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;

/* JADX INFO: loaded from: classes.dex */
public class SecretKeyUtil {

    /* JADX INFO: renamed from: a */
    private static Map f6230a;

    static {
        HashMap map = new HashMap();
        f6230a = map;
        map.put(InterfaceC0674n.f2615D.m1593b(), 192);
        f6230a.put(InterfaceC0652b.f2508u, 128);
        f6230a.put(InterfaceC0652b.f2455C, 192);
        f6230a.put(InterfaceC0652b.f2463K, 256);
        f6230a.put(InterfaceC0656a.f2559a, 128);
        f6230a.put(InterfaceC0656a.f2560b, 192);
        f6230a.put(InterfaceC0656a.f2561c, 256);
    }
}
