package org.bouncycastle.jcajce.provider.asymmetric.gost;

import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import org.bouncycastle.a.be;
import org.bouncycastle.a.f.f;
import org.bouncycastle.a.p;
import org.bouncycastle.a.z.a;
import org.bouncycastle.a.z.u;
import org.bouncycastle.b.k.au;
import org.bouncycastle.c.a.h;
import org.bouncycastle.c.a.j;
import org.bouncycastle.c.c.l;
import org.bouncycastle.c.c.n;
import org.bouncycastle.c.c.o;
import org.bouncycastle.jcajce.provider.asymmetric.util.GOST3410Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;

/* JADX INFO: loaded from: classes.dex */
public class BCGOST3410PublicKey implements j {
    private BigInteger a;
    private transient h b;

    BCGOST3410PublicKey(u uVar) {
        f fVarA = f.a(uVar.a().b());
        try {
            byte[] bArrC = ((be) uVar.b()).c();
            byte[] bArr = new byte[bArrC.length];
            for (int i = 0; i != bArrC.length; i++) {
                bArr[i] = bArrC[(bArrC.length - 1) - i];
            }
            this.a = new BigInteger(1, bArr);
            this.b = l.a(fVarA);
        } catch (IOException e) {
            throw new IllegalArgumentException("invalid info structure in GOST3410 public key");
        }
    }

    BCGOST3410PublicKey(au auVar, l lVar) {
        this.a = auVar.c();
        this.b = lVar;
    }

    BCGOST3410PublicKey(j jVar) {
        this.a = jVar.b();
        this.b = jVar.a();
    }

    BCGOST3410PublicKey(o oVar) {
        this.a = oVar.a();
        this.b = new l(new n(oVar.b(), oVar.c(), oVar.d()));
    }

    @Override // org.bouncycastle.c.a.g
    public final h a() {
        return this.b;
    }

    @Override // org.bouncycastle.c.a.j
    public final BigInteger b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCGOST3410PublicKey)) {
            return false;
        }
        BCGOST3410PublicKey bCGOST3410PublicKey = (BCGOST3410PublicKey) obj;
        return this.a.equals(bCGOST3410PublicKey.a) && this.b.equals(bCGOST3410PublicKey.b);
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "GOST3410";
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public String toString() {
        try {
            return GOSTUtil.b("GOST3410", this.a, ((au) GOST3410Util.a(this)).b());
        } catch (InvalidKeyException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        byte[] byteArray = this.a.toByteArray();
        byte[] bArr = byteArray[0] == 0 ? new byte[byteArray.length - 1] : new byte[byteArray.length];
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = byteArray[(byteArray.length - 1) - i];
        }
        try {
            return KeyUtil.a(this.b instanceof l ? this.b.c() != null ? new u(new a(org.bouncycastle.a.f.a.l, new f(new p(this.b.a()), new p(this.b.b()), new p(this.b.c()))), new be(bArr)) : new u(new a(org.bouncycastle.a.f.a.l, new f(new p(this.b.a()), new p(this.b.b()))), new be(bArr)) : new u(new a(org.bouncycastle.a.f.a.l), new be(bArr)));
        } catch (IOException e) {
            return null;
        }
    }
}
