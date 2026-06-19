package org.bouncycastle.p118e.p129c.p131b.p136e;

import java.io.IOException;
import java.security.PrivateKey;
import org.bouncycastle.p054a.AbstractC0747x;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p074s.C0676p;
import org.bouncycastle.p054a.p082z.C0759a;
import org.bouncycastle.p118e.p119a.C1434h;
import org.bouncycastle.p118e.p119a.InterfaceC1431e;
import org.bouncycastle.p118e.p120b.p126e.C1456b;
import org.bouncycastle.p118e.p120b.p127f.C1458a;
import org.bouncycastle.p118e.p120b.p127f.C1459b;
import org.bouncycastle.p118e.p129c.p130a.InterfaceC1493d;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.e.c.b.e.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1512a implements PrivateKey, InterfaceC1493d {

    /* JADX INFO: renamed from: a */
    private transient C0653p f5435a;

    /* JADX INFO: renamed from: b */
    private transient C1456b f5436b;

    /* JADX INFO: renamed from: c */
    private transient AbstractC0747x f5437c;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1512a)) {
            return false;
        }
        C1512a c1512a = (C1512a) obj;
        return this.f5435a.equals(c1512a.f5435a) && C1535a.m4076a(this.f5436b.m3813c(), c1512a.f5436b.m3813c());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return (this.f5436b.m3812b() != null ? C1459b.m3817a(this.f5436b, this.f5437c) : new C0676p(new C0759a(InterfaceC1431e.f5187r, new C1434h(new C0759a(this.f5435a))), new C0581be(this.f5436b.m3813c()), this.f5437c)).mo1578k();
        } catch (IOException e) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return this.f5435a.hashCode() + (C1535a.m4066a(this.f5436b.m3813c()) * 37);
    }

    public C1512a(C0676p c0676p) {
        this.f5437c = c0676p.m1657a();
        this.f5435a = C1434h.m3753a(c0676p.m1658b().m1784b()).m3754a().m1783a();
        this.f5436b = (C1456b) C1458a.m3815a(c0676p);
    }
}
