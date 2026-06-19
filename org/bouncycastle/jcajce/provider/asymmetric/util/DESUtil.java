package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.p054a.p073r.InterfaceC0659b;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;

/* JADX INFO: loaded from: classes.dex */
public class DESUtil {

    /* JADX INFO: renamed from: a */
    private static final Set<String> f5914a;

    static {
        HashSet hashSet = new HashSet();
        f5914a = hashSet;
        hashSet.add("DES");
        f5914a.add("DESEDE");
        f5914a.add(InterfaceC0659b.f2571e.m1593b());
        f5914a.add(InterfaceC0674n.f2615D.m1593b());
        f5914a.add(InterfaceC0674n.f2615D.m1593b());
        f5914a.add(InterfaceC0674n.f2700bK.m1593b());
    }
}
