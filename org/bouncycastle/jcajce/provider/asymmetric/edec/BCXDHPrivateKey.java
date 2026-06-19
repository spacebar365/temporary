package org.bouncycastle.jcajce.provider.asymmetric.edec;

import java.io.IOException;
import java.security.PrivateKey;
import org.bouncycastle.jcajce.interfaces.XDHKey;
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.AbstractC0747x;
import org.bouncycastle.p054a.InterfaceC0618f;
import org.bouncycastle.p054a.p063h.InterfaceC0628a;
import org.bouncycastle.p054a.p074s.C0676p;
import org.bouncycastle.p083b.p097k.C1075b;
import org.bouncycastle.p083b.p097k.C1093br;
import org.bouncycastle.p083b.p097k.C1096bu;
import org.bouncycastle.p083b.p102o.C1169f;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: loaded from: classes.dex */
public class BCXDHPrivateKey implements PrivateKey, XDHKey {

    /* JADX INFO: renamed from: a */
    private transient C1075b f5793a;

    /* JADX INFO: renamed from: b */
    private final boolean f5794b;

    /* JADX INFO: renamed from: c */
    private final byte[] f5795c;

    BCXDHPrivateKey(C1075b c1075b) {
        this.f5794b = true;
        this.f5795c = null;
        this.f5793a = c1075b;
    }

    /* JADX INFO: renamed from: a */
    final C1075b m4268a() {
        return this.f5793a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BCXDHPrivateKey) {
            return C1535a.m4076a(((BCXDHPrivateKey) obj).getEncoded(), getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.f5793a instanceof C1096bu ? "X448" : "X25519";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            AbstractC0747x abstractC0747xM1741a = AbstractC0747x.m1741a(this.f5795c);
            C0676p c0676pM2805a = C1169f.m2805a(this.f5793a, abstractC0747xM1741a);
            return this.f5794b ? c0676pM2805a.mo1578k() : new C0676p(c0676pM2805a.m1658b(), c0676pM2805a.m1659c(), abstractC0747xM1741a).mo1578k();
        } catch (IOException e) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return C1535a.m4066a(getEncoded());
    }

    public String toString() {
        return Utils.m4275a("Private Key", getAlgorithm(), this.f5793a instanceof C1096bu ? ((C1096bu) this.f5793a).m2646c() : ((C1093br) this.f5793a).m2641c());
    }

    BCXDHPrivateKey(C0676p c0676p) {
        this.f5794b = c0676p.m1660d();
        this.f5795c = c0676p.m1657a() != null ? c0676p.m1657a().mo1578k() : null;
        InterfaceC0618f interfaceC0618fM1659c = c0676p.m1659c();
        if (InterfaceC0628a.f2266c.equals(c0676p.m1658b().m1783a())) {
            this.f5793a = new C1096bu(AbstractC0655q.m1596a(interfaceC0618fM1659c).mo1410c());
        } else {
            this.f5793a = new C1093br(AbstractC0655q.m1596a(interfaceC0618fM1659c).mo1410c());
        }
    }
}
