package org.bouncycastle.jcajce.spec;

import java.security.spec.ECParameterSpec;
import org.bouncycastle.b.k.y;
import org.bouncycastle.f.a;

/* JADX INFO: loaded from: classes.dex */
public class DSTU4145ParameterSpec extends ECParameterSpec {
    private final byte[] a;
    private final y b;

    public final byte[] a() {
        return a.b(this.a);
    }

    public boolean equals(Object obj) {
        if (obj instanceof DSTU4145ParameterSpec) {
            return this.b.equals(((DSTU4145ParameterSpec) obj).b);
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode();
    }
}
