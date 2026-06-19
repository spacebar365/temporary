package org.bouncycastle.p118e.p129c.p131b.p138g;

import java.io.IOException;
import java.security.PrivateKey;
import org.bouncycastle.p054a.AbstractC0747x;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p074s.C0676p;
import org.bouncycastle.p118e.p119a.C1435i;
import org.bouncycastle.p118e.p120b.p127f.C1458a;
import org.bouncycastle.p118e.p120b.p127f.C1459b;
import org.bouncycastle.p118e.p120b.p128g.C1488y;
import org.bouncycastle.p118e.p129c.p130a.InterfaceC1495f;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.e.c.b.g.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1518c implements PrivateKey, InterfaceC1495f {

    /* JADX INFO: renamed from: a */
    private transient C1488y f5445a;

    /* JADX INFO: renamed from: b */
    private transient C0653p f5446b;

    /* JADX INFO: renamed from: c */
    private transient AbstractC0747x f5447c;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1518c)) {
            return false;
        }
        C1518c c1518c = (C1518c) obj;
        return this.f5446b.equals(c1518c.f5446b) && C1535a.m4076a(this.f5445a.m3968c(), c1518c.f5445a.m3968c());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSS";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return C1459b.m3817a(this.f5445a, this.f5447c).mo1578k();
        } catch (IOException e) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return this.f5446b.hashCode() + (C1535a.m4066a(this.f5445a.m3968c()) * 37);
    }

    public C1518c(C0676p c0676p) {
        this.f5447c = c0676p.m1657a();
        this.f5446b = C1435i.m3755a(c0676p.m1658b().m1784b()).m3757b().m1783a();
        this.f5445a = (C1488y) C1458a.m3815a(c0676p);
    }
}
