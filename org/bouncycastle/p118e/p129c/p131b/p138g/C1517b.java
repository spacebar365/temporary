package org.bouncycastle.p118e.p129c.p131b.p138g;

import java.io.IOException;
import java.security.PublicKey;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p082z.C0780u;
import org.bouncycastle.p118e.p119a.C1436j;
import org.bouncycastle.p118e.p120b.p127f.C1460c;
import org.bouncycastle.p118e.p120b.p127f.C1461d;
import org.bouncycastle.p118e.p120b.p128g.C1483t;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.e.c.b.g.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1517b implements PublicKey {

    /* JADX INFO: renamed from: a */
    private transient C0653p f5443a;

    /* JADX INFO: renamed from: b */
    private transient C1483t f5444b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1517b)) {
            return false;
        }
        C1517b c1517b = (C1517b) obj;
        return this.f5443a.equals(c1517b.f5443a) && C1535a.m4076a(this.f5444b.m3945c(), c1517b.f5444b.m3945c());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSSMT";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return C1461d.m3820a(this.f5444b).mo1578k();
        } catch (IOException e) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return this.f5443a.hashCode() + (C1535a.m4066a(this.f5444b.m3945c()) * 37);
    }

    public C1517b(C0780u c0780u) {
        this.f5443a = C1436j.m3758a(c0780u.m1844a().m1784b()).m3761c().m1783a();
        this.f5444b = (C1483t) C1460c.m3818a(c0780u);
    }
}
