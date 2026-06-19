package org.bouncycastle.p118e.p129c.p131b.p133b;

import java.io.IOException;
import org.bouncycastle.p054a.p082z.C0780u;
import org.bouncycastle.p118e.p120b.p122b.C1449b;
import org.bouncycastle.p118e.p120b.p127f.C1460c;
import org.bouncycastle.p118e.p120b.p127f.C1461d;
import org.bouncycastle.p118e.p129c.p130a.InterfaceC1492c;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.e.c.b.b.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1504b implements InterfaceC1492c {

    /* JADX INFO: renamed from: a */
    private transient C1449b f5421a;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1504b)) {
            return false;
        }
        return C1535a.m4076a(this.f5421a.m3793b(), ((C1504b) obj).f5421a.m3793b());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return C1461d.m3820a(this.f5421a).mo1578k();
        } catch (IOException e) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return C1535a.m4066a(this.f5421a.m3793b());
    }

    public C1504b(C0780u c0780u) {
        this.f5421a = (C1449b) C1460c.m3818a(c0780u);
    }
}
