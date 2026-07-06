package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.a.r.b;
import org.bouncycastle.a.s.n;

/* JADX INFO: loaded from: classes.dex */
public class DESUtil {
    private static final Set<String> a;

    static {
        HashSet hashSet = new HashSet();
        a = hashSet;
        hashSet.add("DES");
        a.add("DESEDE");
        a.add(b.e.b());
        a.add(n.D.b());
        a.add(n.D.b());
        a.add(n.bK.b());
    }
}
