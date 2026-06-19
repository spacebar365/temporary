package org.bouncycastle.jcajce.provider.asymmetric.edec;

import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import org.bouncycastle.jcajce.interfaces.XDHKey;
import org.bouncycastle.p054a.p063h.InterfaceC0628a;
import org.bouncycastle.p054a.p082z.C0780u;
import org.bouncycastle.p083b.p097k.C1075b;
import org.bouncycastle.p083b.p097k.C1094bs;
import org.bouncycastle.p083b.p097k.C1097bv;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: loaded from: classes.dex */
public class BCXDHPublicKey implements PublicKey, XDHKey {

    /* JADX INFO: renamed from: a */
    private transient C1075b f5796a;

    BCXDHPublicKey(C1075b c1075b) {
        this.f5796a = c1075b;
    }

    BCXDHPublicKey(byte[] bArr, byte[] bArr2) throws InvalidKeySpecException {
        int length = bArr.length;
        if (!Utils.m4276a(bArr, bArr2)) {
            throw new InvalidKeySpecException("raw key data not recognised");
        }
        if (bArr2.length - length == 56) {
            this.f5796a = new C1097bv(bArr2, length);
        } else {
            if (bArr2.length - length != 32) {
                throw new InvalidKeySpecException("raw key data not recognised");
            }
            this.f5796a = new C1094bs(bArr2, length);
        }
    }

    /* JADX INFO: renamed from: a */
    final C1075b m4269a() {
        return this.f5796a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BCXDHPublicKey) {
            return C1535a.m4076a(((BCXDHPublicKey) obj).getEncoded(), getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.f5796a instanceof C1097bv ? "X448" : "X25519";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        if (this.f5796a instanceof C1097bv) {
            byte[] bArr = new byte[KeyFactorySpi.f5800a.length + 56];
            System.arraycopy(KeyFactorySpi.f5800a, 0, bArr, 0, KeyFactorySpi.f5800a.length);
            ((C1097bv) this.f5796a).m2647a(bArr, KeyFactorySpi.f5800a.length);
            return bArr;
        }
        byte[] bArr2 = new byte[KeyFactorySpi.f5801b.length + 32];
        System.arraycopy(KeyFactorySpi.f5801b, 0, bArr2, 0, KeyFactorySpi.f5801b.length);
        ((C1094bs) this.f5796a).m2642a(bArr2, KeyFactorySpi.f5801b.length);
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
        return Utils.m4275a("Public Key", getAlgorithm(), this.f5796a);
    }

    BCXDHPublicKey(C0780u c0780u) {
        if (InterfaceC0628a.f2266c.equals(c0780u.m1844a().m1783a())) {
            this.f5796a = new C1097bv(c0780u.m1846c().m1473c(), 0);
        } else {
            this.f5796a = new C1094bs(c0780u.m1846c().m1473c(), 0);
        }
    }
}
