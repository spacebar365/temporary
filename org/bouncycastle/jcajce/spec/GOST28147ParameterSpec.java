package org.bouncycastle.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.a.f.a;
import org.bouncycastle.a.p;
import org.bouncycastle.b.e.u;

/* JADX INFO: loaded from: classes.dex */
public class GOST28147ParameterSpec implements AlgorithmParameterSpec {
    private static Map c;
    private byte[] a;
    private byte[] b;

    static {
        HashMap map = new HashMap();
        c = map;
        map.put(a.h, "E-A");
        c.put(a.i, "E-B");
        c.put(a.j, "E-C");
        c.put(a.k, "E-D");
        c.put(org.bouncycastle.a.t.a.t, "Param-Z");
    }

    private GOST28147ParameterSpec(String str) {
        this.a = null;
        this.b = null;
        this.b = u.a(str);
    }

    private GOST28147ParameterSpec(byte[] bArr) {
        this.a = null;
        this.b = null;
        this.b = new byte[bArr.length];
        System.arraycopy(bArr, 0, this.b, 0, bArr.length);
    }

    public GOST28147ParameterSpec(byte[] bArr, byte[] bArr2) {
        this(bArr);
        this.a = new byte[bArr2.length];
        System.arraycopy(bArr2, 0, this.a, 0, bArr2.length);
    }

    public final byte[] a() {
        return org.bouncycastle.f.a.b(this.b);
    }

    public final byte[] b() {
        return org.bouncycastle.f.a.b(this.b);
    }

    public final byte[] c() {
        return org.bouncycastle.f.a.b(this.a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GOST28147ParameterSpec(p pVar, byte[] bArr) {
        String str = (String) c.get(pVar);
        if (str == null) {
            throw new IllegalArgumentException("unknown OID: ".concat(String.valueOf(pVar)));
        }
        this(str);
        this.a = org.bouncycastle.f.a.b(bArr);
    }
}
