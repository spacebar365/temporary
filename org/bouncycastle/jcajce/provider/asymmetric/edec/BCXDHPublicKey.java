package org.bouncycastle.jcajce.provider.asymmetric.edec;

import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import org.bouncycastle.a.z.u;
import org.bouncycastle.b.k.b;
import org.bouncycastle.b.k.bs;
import org.bouncycastle.b.k.bv;
import org.bouncycastle.f.a;
import org.bouncycastle.jcajce.interfaces.XDHKey;

/* JADX INFO: loaded from: classes.dex */
public class BCXDHPublicKey implements PublicKey, XDHKey {
    private transient b a;

    BCXDHPublicKey(b bVar) {
        this.a = bVar;
    }

    BCXDHPublicKey(byte[] bArr, byte[] bArr2) throws InvalidKeySpecException {
        int length = bArr.length;
        if (!Utils.a(bArr, bArr2)) {
            throw new InvalidKeySpecException("raw key data not recognised");
        }
        if (bArr2.length - length == 56) {
            this.a = new bv(bArr2, length);
        } else {
            if (bArr2.length - length != 32) {
                throw new InvalidKeySpecException("raw key data not recognised");
            }
            this.a = new bs(bArr2, length);
        }
    }

    final b a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BCXDHPublicKey) {
            return a.a(((BCXDHPublicKey) obj).getEncoded(), getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.a instanceof bv ? "X448" : "X25519";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        if (this.a instanceof bv) {
            byte[] bArr = new byte[KeyFactorySpi.a.length + 56];
            System.arraycopy(KeyFactorySpi.a, 0, bArr, 0, KeyFactorySpi.a.length);
            ((bv) this.a).a(bArr, KeyFactorySpi.a.length);
            return bArr;
        }
        byte[] bArr2 = new byte[KeyFactorySpi.b.length + 32];
        System.arraycopy(KeyFactorySpi.b, 0, bArr2, 0, KeyFactorySpi.b.length);
        ((bs) this.a).a(bArr2, KeyFactorySpi.b.length);
        return bArr2;
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return a.a(getEncoded());
    }

    public String toString() {
        return Utils.a("Public Key", getAlgorithm(), this.a);
    }

    BCXDHPublicKey(u uVar) {
        if (org.bouncycastle.a.h.a.c.equals(uVar.a().a())) {
            this.a = new bv(uVar.c().c(), 0);
        } else {
            this.a = new bs(uVar.c().c(), 0);
        }
    }
}
