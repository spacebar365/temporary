package org.bouncycastle.jcajce.provider.asymmetric.edec;

import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import org.bouncycastle.jcajce.interfaces.EdDSAKey;
import org.bouncycastle.p054a.p063h.InterfaceC0628a;
import org.bouncycastle.p054a.p082z.C0780u;
import org.bouncycastle.p083b.p097k.C1056ah;
import org.bouncycastle.p083b.p097k.C1059ak;
import org.bouncycastle.p083b.p097k.C1075b;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: loaded from: classes.dex */
public class BCEdDSAPublicKey implements PublicKey, EdDSAKey {

    /* JADX INFO: renamed from: a */
    private transient C1075b f5792a;

    BCEdDSAPublicKey(C1075b c1075b) {
        this.f5792a = c1075b;
    }

    BCEdDSAPublicKey(byte[] bArr, byte[] bArr2) throws InvalidKeySpecException {
        int length = bArr.length;
        if (!Utils.m4276a(bArr, bArr2)) {
            throw new InvalidKeySpecException("raw key data not recognised");
        }
        if (bArr2.length - length == 57) {
            this.f5792a = new C1059ak(bArr2, length);
        } else {
            if (bArr2.length - length != 32) {
                throw new InvalidKeySpecException("raw key data not recognised");
            }
            this.f5792a = new C1056ah(bArr2, length);
        }
    }

    /* JADX INFO: renamed from: a */
    final C1075b m4267a() {
        return this.f5792a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BCEdDSAPublicKey) {
            return C1535a.m4076a(((BCEdDSAPublicKey) obj).getEncoded(), getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.f5792a instanceof C1059ak ? "Ed448" : "Ed25519";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        if (this.f5792a instanceof C1059ak) {
            byte[] bArr = new byte[KeyFactorySpi.f5802c.length + 57];
            System.arraycopy(KeyFactorySpi.f5802c, 0, bArr, 0, KeyFactorySpi.f5802c.length);
            ((C1059ak) this.f5792a).m2575a(bArr, KeyFactorySpi.f5802c.length);
            return bArr;
        }
        byte[] bArr2 = new byte[KeyFactorySpi.f5803d.length + 32];
        System.arraycopy(KeyFactorySpi.f5803d, 0, bArr2, 0, KeyFactorySpi.f5803d.length);
        ((C1056ah) this.f5792a).m2570a(bArr2, KeyFactorySpi.f5803d.length);
        return bArr2;
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return C1535a.m4066a(getEncoded());
    }

    public String toString() {
        return Utils.m4275a("Public Key", getAlgorithm(), this.f5792a);
    }

    BCEdDSAPublicKey(C0780u c0780u) {
        if (InterfaceC0628a.f2268e.equals(c0780u.m1844a().m1783a())) {
            this.f5792a = new C1059ak(c0780u.m1846c().m1473c(), 0);
        } else {
            this.f5792a = new C1056ah(c0780u.m1846c().m1473c(), 0);
        }
    }
}
