package org.bouncycastle.jcajce.provider.asymmetric.edec;

import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import org.bouncycastle.a.z.u;
import org.bouncycastle.b.k.ah;
import org.bouncycastle.b.k.ak;
import org.bouncycastle.b.k.b;
import org.bouncycastle.f.a;
import org.bouncycastle.jcajce.interfaces.EdDSAKey;

/* JADX INFO: loaded from: classes.dex */
public class BCEdDSAPublicKey implements PublicKey, EdDSAKey {
    private transient b a;

    BCEdDSAPublicKey(b bVar) {
        this.a = bVar;
    }

    BCEdDSAPublicKey(byte[] bArr, byte[] bArr2) throws InvalidKeySpecException {
        int length = bArr.length;
        if (!Utils.a(bArr, bArr2)) {
            throw new InvalidKeySpecException("raw key data not recognised");
        }
        if (bArr2.length - length == 57) {
            this.a = new ak(bArr2, length);
        } else {
            if (bArr2.length - length != 32) {
                throw new InvalidKeySpecException("raw key data not recognised");
            }
            this.a = new ah(bArr2, length);
        }
    }

    final b a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BCEdDSAPublicKey) {
            return a.a(((BCEdDSAPublicKey) obj).getEncoded(), getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.a instanceof ak ? "Ed448" : "Ed25519";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        if (this.a instanceof ak) {
            byte[] bArr = new byte[KeyFactorySpi.c.length + 57];
            System.arraycopy(KeyFactorySpi.c, 0, bArr, 0, KeyFactorySpi.c.length);
            ((ak) this.a).a(bArr, KeyFactorySpi.c.length);
            return bArr;
        }
        byte[] bArr2 = new byte[KeyFactorySpi.d.length + 32];
        System.arraycopy(KeyFactorySpi.d, 0, bArr2, 0, KeyFactorySpi.d.length);
        ((ah) this.a).a(bArr2, KeyFactorySpi.d.length);
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

    BCEdDSAPublicKey(u uVar) {
        if (org.bouncycastle.a.h.a.e.equals(uVar.a().a())) {
            this.a = new ak(uVar.c().c(), 0);
        } else {
            this.a = new ah(uVar.c().c(), 0);
        }
    }
}
