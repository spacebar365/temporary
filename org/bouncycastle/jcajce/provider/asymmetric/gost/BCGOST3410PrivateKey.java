package org.bouncycastle.jcajce.provider.asymmetric.gost;

import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.util.Enumeration;
import org.bouncycastle.a.be;
import org.bouncycastle.a.f.f;
import org.bouncycastle.a.m;
import org.bouncycastle.a.q;
import org.bouncycastle.a.s.p;
import org.bouncycastle.a.z.a;
import org.bouncycastle.b.k.at;
import org.bouncycastle.c.a.h;
import org.bouncycastle.c.a.i;
import org.bouncycastle.c.a.n;
import org.bouncycastle.c.c.l;
import org.bouncycastle.jcajce.provider.asymmetric.util.GOST3410Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;

/* JADX INFO: loaded from: classes.dex */
public class BCGOST3410PrivateKey implements i, n {
    private BigInteger a;
    private transient h b;
    private transient n c = new PKCS12BagAttributeCarrierImpl();

    protected BCGOST3410PrivateKey() {
    }

    BCGOST3410PrivateKey(p pVar) {
        f fVarA = f.a(pVar.b().b());
        org.bouncycastle.a.f fVarC = pVar.c();
        if (fVarC instanceof m) {
            this.a = m.a(fVarC).c();
        } else {
            byte[] bArrC = q.a(pVar.c()).c();
            byte[] bArr = new byte[bArrC.length];
            for (int i = 0; i != bArrC.length; i++) {
                bArr[i] = bArrC[(bArrC.length - 1) - i];
            }
            this.a = new BigInteger(1, bArr);
        }
        this.b = l.a(fVarA);
    }

    BCGOST3410PrivateKey(at atVar, l lVar) {
        this.a = atVar.c();
        this.b = lVar;
        if (lVar == null) {
            throw new IllegalArgumentException("spec is null");
        }
    }

    BCGOST3410PrivateKey(i iVar) {
        this.a = iVar.c();
        this.b = iVar.a();
    }

    BCGOST3410PrivateKey(org.bouncycastle.c.c.m mVar) {
        this.a = mVar.a();
        this.b = new l(new org.bouncycastle.c.c.n(mVar.b(), mVar.c(), mVar.d()));
    }

    @Override // org.bouncycastle.c.a.n
    public final org.bouncycastle.a.f a(org.bouncycastle.a.p pVar) {
        return this.c.a(pVar);
    }

    @Override // org.bouncycastle.c.a.g
    public final h a() {
        return this.b;
    }

    @Override // org.bouncycastle.c.a.n
    public final void a(org.bouncycastle.a.p pVar, org.bouncycastle.a.f fVar) {
        this.c.a(pVar, fVar);
    }

    @Override // org.bouncycastle.c.a.n
    public final Enumeration b() {
        return this.c.b();
    }

    @Override // org.bouncycastle.c.a.i
    public final BigInteger c() {
        return this.a;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "GOST3410";
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public String toString() {
        try {
            return GOSTUtil.a("GOST3410", this.a, ((at) GOST3410Util.a(this)).b());
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
            return (this.b instanceof l ? new p(new a(org.bouncycastle.a.f.a.l, new f(new org.bouncycastle.a.p(this.b.a()), new org.bouncycastle.a.p(this.b.b()))), new be(bArr)) : new p(new a(org.bouncycastle.a.f.a.l), new be(bArr))).a("DER");
        } catch (IOException e) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!this.a.equals(iVar.c()) || !this.b.d().equals(iVar.a().d()) || !this.b.b().equals(iVar.a().b())) {
            return false;
        }
        String strC = this.b.c();
        String strC2 = iVar.a().c();
        return strC == strC2 ? true : strC == null ? false : strC.equals(strC2);
    }

    public int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }
}
