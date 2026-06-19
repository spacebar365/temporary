package org.bouncycastle.p118e.p129c.p131b.p138g;

import java.io.IOException;
import java.security.PublicKey;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p082z.C0780u;
import org.bouncycastle.p118e.p119a.C1435i;
import org.bouncycastle.p118e.p120b.p127f.C1460c;
import org.bouncycastle.p118e.p120b.p127f.C1461d;
import org.bouncycastle.p118e.p120b.p128g.C1489z;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.e.c.b.g.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1519d implements PublicKey {

    /* JADX INFO: renamed from: a */
    private transient C1489z f5448a;

    /* JADX INFO: renamed from: b */
    private transient C0653p f5449b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1519d)) {
            return false;
        }
        C1519d c1519d = (C1519d) obj;
        return this.f5449b.equals(c1519d.f5449b) && C1535a.m4076a(this.f5448a.m3986c(), c1519d.f5448a.m3986c());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSS";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return C1461d.m3820a(this.f5448a).mo1578k();
        } catch (IOException e) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return this.f5449b.hashCode() + (C1535a.m4066a(this.f5448a.m3986c()) * 37);
    }

    public C1519d(C0780u c0780u) {
        this.f5449b = C1435i.m3755a(c0780u.m1844a().m1784b()).m3757b().m1783a();
        this.f5448a = (C1489z) C1460c.m3818a(c0780u);
    }
}
