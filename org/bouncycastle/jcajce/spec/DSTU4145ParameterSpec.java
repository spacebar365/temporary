package org.bouncycastle.jcajce.spec;

import java.security.spec.ECParameterSpec;
import org.bouncycastle.p083b.p097k.C1122y;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: loaded from: classes.dex */
public class DSTU4145ParameterSpec extends ECParameterSpec {

    /* JADX INFO: renamed from: a */
    private final byte[] f6241a;

    /* JADX INFO: renamed from: b */
    private final C1122y f6242b;

    /* JADX INFO: renamed from: a */
    public final byte[] m4490a() {
        return C1535a.m4086b(this.f6241a);
    }

    public boolean equals(Object obj) {
        if (obj instanceof DSTU4145ParameterSpec) {
            return this.f6242b.equals(((DSTU4145ParameterSpec) obj).f6242b);
        }
        return false;
    }

    public int hashCode() {
        return this.f6242b.hashCode();
    }
}
