package org.bouncycastle.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.p054a.p061f.InterfaceC0619a;
import org.bouncycastle.p054a.p075t.InterfaceC0685a;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: loaded from: classes.dex */
public class GOST28147WrapParameterSpec implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: c */
    private static Map f6247c;

    /* JADX INFO: renamed from: a */
    private byte[] f6248a;

    /* JADX INFO: renamed from: b */
    private byte[] f6249b;

    static {
        HashMap map = new HashMap();
        f6247c = map;
        map.put(InterfaceC0619a.f2200h, "E-A");
        f6247c.put(InterfaceC0619a.f2201i, "E-B");
        f6247c.put(InterfaceC0619a.f2202j, "E-C");
        f6247c.put(InterfaceC0619a.f2203k, "E-D");
        f6247c.put(InterfaceC0685a.f2820t, "Param-Z");
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m4495a() {
        return C1535a.m4086b(this.f6249b);
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m4496b() {
        return C1535a.m4086b(this.f6248a);
    }
}
