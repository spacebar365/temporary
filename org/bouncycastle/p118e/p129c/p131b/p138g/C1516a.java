package org.bouncycastle.p118e.p129c.p131b.p138g;

import java.io.IOException;
import java.security.PrivateKey;
import org.bouncycastle.p054a.AbstractC0747x;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p074s.C0676p;
import org.bouncycastle.p118e.p119a.C1436j;
import org.bouncycastle.p118e.p120b.p127f.C1458a;
import org.bouncycastle.p118e.p120b.p127f.C1459b;
import org.bouncycastle.p118e.p120b.p128g.C1482s;
import org.bouncycastle.p118e.p129c.p130a.InterfaceC1494e;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.e.c.b.g.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1516a implements PrivateKey, InterfaceC1494e {

    /* JADX INFO: renamed from: a */
    private transient C0653p f5440a;

    /* JADX INFO: renamed from: b */
    private transient C1482s f5441b;

    /* JADX INFO: renamed from: c */
    private transient AbstractC0747x f5442c;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1516a)) {
            return false;
        }
        C1516a c1516a = (C1516a) obj;
        return this.f5440a.equals(c1516a.f5440a) && C1535a.m4076a(this.f5441b.m3927c(), c1516a.f5441b.m3927c());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSSMT";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return C1459b.m3817a(this.f5441b, this.f5442c).mo1578k();
        } catch (IOException e) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return this.f5440a.hashCode() + (C1535a.m4066a(this.f5441b.m3927c()) * 37);
    }

    public C1516a(C0676p c0676p) {
        this.f5442c = c0676p.m1657a();
        this.f5440a = C1436j.m3758a(c0676p.m1658b().m1784b()).m3761c().m1783a();
        this.f5441b = (C1482s) C1458a.m3815a(c0676p);
    }
}
