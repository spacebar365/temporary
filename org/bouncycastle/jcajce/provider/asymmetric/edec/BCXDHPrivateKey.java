package org.bouncycastle.jcajce.provider.asymmetric.edec;

import java.io.IOException;
import java.security.PrivateKey;
import org.bouncycastle.a.q;
import org.bouncycastle.a.s.p;
import org.bouncycastle.a.x;
import org.bouncycastle.b.k.b;
import org.bouncycastle.b.k.br;
import org.bouncycastle.b.k.bu;
import org.bouncycastle.b.o.f;
import org.bouncycastle.f.a;
import org.bouncycastle.jcajce.interfaces.XDHKey;

/* JADX INFO: loaded from: classes.dex */
public class BCXDHPrivateKey implements PrivateKey, XDHKey {
    private transient b a;
    private final boolean b;
    private final byte[] c;

    BCXDHPrivateKey(b bVar) {
        this.b = true;
        this.c = null;
        this.a = bVar;
    }

    final b a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BCXDHPrivateKey) {
            return a.a(((BCXDHPrivateKey) obj).getEncoded(), getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.a instanceof bu ? "X448" : "X25519";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            x xVarA = x.a(this.c);
            p pVarA = f.a(this.a, xVarA);
            return this.b ? pVarA.k() : new p(pVarA.b(), pVarA.c(), xVarA).k();
        } catch (IOException e) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return a.a(getEncoded());
    }

    public String toString() {
        return Utils.a("Private Key", getAlgorithm(), this.a instanceof bu ? ((bu) this.a).c() : ((br) this.a).c());
    }

    BCXDHPrivateKey(p pVar) {
        this.b = pVar.d();
        this.c = pVar.a() != null ? pVar.a().k() : null;
        org.bouncycastle.a.f fVarC = pVar.c();
        if (org.bouncycastle.a.h.a.c.equals(pVar.b().a())) {
            this.a = new bu(q.a(fVarC).c());
        } else {
            this.a = new br(q.a(fVarC).c());
        }
    }
}
