package org.bouncycastle.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p061f.InterfaceC0619a;
import org.bouncycastle.p054a.p075t.InterfaceC0685a;
import org.bouncycastle.p083b.p089e.C0944u;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: loaded from: classes.dex */
public class GOST28147ParameterSpec implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: c */
    private static Map f6244c;

    /* JADX INFO: renamed from: a */
    private byte[] f6245a;

    /* JADX INFO: renamed from: b */
    private byte[] f6246b;

    static {
        HashMap map = new HashMap();
        f6244c = map;
        map.put(InterfaceC0619a.f2200h, "E-A");
        f6244c.put(InterfaceC0619a.f2201i, "E-B");
        f6244c.put(InterfaceC0619a.f2202j, "E-C");
        f6244c.put(InterfaceC0619a.f2203k, "E-D");
        f6244c.put(InterfaceC0685a.f2820t, "Param-Z");
    }

    private GOST28147ParameterSpec(String str) {
        this.f6245a = null;
        this.f6246b = null;
        this.f6246b = C0944u.m2377a(str);
    }

    private GOST28147ParameterSpec(byte[] bArr) {
        this.f6245a = null;
        this.f6246b = null;
        this.f6246b = new byte[bArr.length];
        System.arraycopy(bArr, 0, this.f6246b, 0, bArr.length);
    }

    public GOST28147ParameterSpec(byte[] bArr, byte[] bArr2) {
        this(bArr);
        this.f6245a = new byte[bArr2.length];
        System.arraycopy(bArr2, 0, this.f6245a, 0, bArr2.length);
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m4492a() {
        return C1535a.m4086b(this.f6246b);
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m4493b() {
        return C1535a.m4086b(this.f6246b);
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m4494c() {
        return C1535a.m4086b(this.f6245a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GOST28147ParameterSpec(C0653p c0653p, byte[] bArr) {
        String str = (String) f6244c.get(c0653p);
        if (str == null) {
            throw new IllegalArgumentException("unknown OID: ".concat(String.valueOf(c0653p)));
        }
        this(str);
        this.f6245a = C1535a.m4086b(bArr);
    }
}
