package org.bouncycastle.p118e.p129c.p131b.p134c;

import java.io.IOException;
import java.security.PublicKey;
import org.bouncycastle.p054a.p082z.C0780u;
import org.bouncycastle.p118e.p120b.p123c.C1451b;
import org.bouncycastle.p118e.p120b.p123c.C1452c;
import org.bouncycastle.p118e.p120b.p127f.C1460c;
import org.bouncycastle.p118e.p120b.p127f.C1461d;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.e.c.b.c.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1507b implements PublicKey {

    /* JADX INFO: renamed from: a */
    private transient C1451b f5424a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1507b)) {
            return false;
        }
        C1507b c1507b = (C1507b) obj;
        return this.f5424a.m3796b() == c1507b.f5424a.m3796b() && C1535a.m4076a(this.f5424a.m3797c(), c1507b.f5424a.m3797c());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return C1452c.m3798a(this.f5424a.m3796b());
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return C1461d.m3820a(this.f5424a).mo1578k();
        } catch (IOException e) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return this.f5424a.m3796b() + (C1535a.m4066a(this.f5424a.m3797c()) * 37);
    }

    public C1507b(C0780u c0780u) {
        this.f5424a = (C1451b) C1460c.m3818a(c0780u);
    }
}
