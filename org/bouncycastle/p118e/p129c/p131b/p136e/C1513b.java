package org.bouncycastle.p118e.p129c.p131b.p136e;

import java.io.IOException;
import java.security.PublicKey;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p082z.C0759a;
import org.bouncycastle.p054a.p082z.C0780u;
import org.bouncycastle.p118e.p119a.C1434h;
import org.bouncycastle.p118e.p119a.InterfaceC1431e;
import org.bouncycastle.p118e.p120b.p126e.C1457c;
import org.bouncycastle.p118e.p120b.p127f.C1460c;
import org.bouncycastle.p118e.p120b.p127f.C1461d;
import org.bouncycastle.p118e.p129c.p130a.InterfaceC1493d;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.e.c.b.e.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1513b implements PublicKey, InterfaceC1493d {

    /* JADX INFO: renamed from: a */
    private transient C0653p f5438a;

    /* JADX INFO: renamed from: b */
    private transient C1457c f5439b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1513b)) {
            return false;
        }
        C1513b c1513b = (C1513b) obj;
        return this.f5438a.equals(c1513b.f5438a) && C1535a.m4076a(this.f5439b.m3814c(), c1513b.f5439b.m3814c());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return (this.f5439b.m3812b() != null ? C1461d.m3820a(this.f5439b) : new C0780u(new C0759a(InterfaceC1431e.f5187r, new C1434h(new C0759a(this.f5438a))), this.f5439b.m3814c())).mo1578k();
        } catch (IOException e) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return this.f5438a.hashCode() + (C1535a.m4066a(this.f5439b.m3814c()) * 37);
    }

    public C1513b(C0780u c0780u) {
        this.f5438a = C1434h.m3753a(c0780u.m1844a().m1784b()).m3754a().m1783a();
        this.f5439b = (C1457c) C1460c.m3818a(c0780u);
    }
}
