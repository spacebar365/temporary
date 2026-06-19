package org.bouncycastle.jcajce.spec;

import java.security.spec.KeySpec;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: loaded from: classes.dex */
public class TLSKeyMaterialSpec implements KeySpec {

    /* JADX INFO: renamed from: a */
    private final byte[] f6269a;

    /* JADX INFO: renamed from: b */
    private final String f6270b;

    /* JADX INFO: renamed from: c */
    private final int f6271c;

    /* JADX INFO: renamed from: d */
    private final byte[] f6272d;

    /* JADX INFO: renamed from: a */
    public final String m4513a() {
        return this.f6270b;
    }

    /* JADX INFO: renamed from: b */
    public final int m4514b() {
        return this.f6271c;
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m4515c() {
        return C1535a.m4086b(this.f6269a);
    }

    /* JADX INFO: renamed from: d */
    public final byte[] m4516d() {
        return C1535a.m4086b(this.f6272d);
    }
}
