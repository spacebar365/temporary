package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import java.io.IOException;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPublicKeySpec;
import org.bouncycastle.a.aa.aj;
import org.bouncycastle.a.bc;
import org.bouncycastle.a.f;
import org.bouncycastle.a.m;
import org.bouncycastle.a.z.a;
import org.bouncycastle.a.z.i;
import org.bouncycastle.a.z.u;
import org.bouncycastle.b.k.t;
import org.bouncycastle.f.k;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;

/* JADX INFO: loaded from: classes.dex */
public class BCDSAPublicKey implements DSAPublicKey {
    private static BigInteger a = BigInteger.valueOf(0);
    private BigInteger b;
    private transient t c;
    private transient DSAParams d;

    BCDSAPublicKey(DSAPublicKey dSAPublicKey) {
        this.b = dSAPublicKey.getY();
        this.d = dSAPublicKey.getParams();
        this.c = new t(this.b, DSAUtil.a(this.d));
    }

    BCDSAPublicKey(DSAPublicKeySpec dSAPublicKeySpec) {
        this.b = dSAPublicKeySpec.getY();
        this.d = new DSAParameterSpec(dSAPublicKeySpec.getP(), dSAPublicKeySpec.getQ(), dSAPublicKeySpec.getG());
        this.c = new t(this.b, DSAUtil.a(this.d));
    }

    BCDSAPublicKey(t tVar) {
        this.b = tVar.c();
        if (tVar != null) {
            this.d = new DSAParameterSpec(tVar.b().a(), tVar.b().b(), tVar.b().c());
        } else {
            this.d = null;
        }
        this.c = tVar;
    }

    final t a() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAPublicKey)) {
            return false;
        }
        DSAPublicKey dSAPublicKey = (DSAPublicKey) obj;
        return this.d != null ? getY().equals(dSAPublicKey.getY()) && dSAPublicKey.getParams() != null && getParams().getG().equals(dSAPublicKey.getParams().getG()) && getParams().getP().equals(dSAPublicKey.getParams().getP()) && getParams().getQ().equals(dSAPublicKey.getParams().getQ()) : getY().equals(dSAPublicKey.getY()) && dSAPublicKey.getParams() == null;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "DSA";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return this.d == null ? KeyUtil.a(new a(aj.U), new m(this.b)) : KeyUtil.a(new a(aj.U, new i(this.d.getP(), this.d.getQ(), this.d.getG()).i()), new m(this.b));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // java.security.interfaces.DSAKey
    public DSAParams getParams() {
        return this.d;
    }

    @Override // java.security.interfaces.DSAPublicKey
    public BigInteger getY() {
        return this.b;
    }

    public int hashCode() {
        return this.d != null ? ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getQ().hashCode() : getY().hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String strA = k.a();
        stringBuffer.append("DSA Public Key [").append(DSAUtil.a(this.b, getParams())).append("]").append(strA);
        stringBuffer.append("            Y: ").append(getY().toString(16)).append(strA);
        return stringBuffer.toString();
    }

    public BCDSAPublicKey(u uVar) {
        try {
            this.b = ((m) uVar.b()).b();
            f fVarB = uVar.a().b();
            if ((fVarB == null || bc.a.equals(fVarB.i())) ? false : true) {
                i iVarA = i.a(uVar.a().b());
                this.d = new DSAParameterSpec(iVarA.a(), iVarA.b(), iVarA.c());
            } else {
                this.d = null;
            }
            this.c = new t(this.b, DSAUtil.a(this.d));
        } catch (IOException e) {
            throw new IllegalArgumentException("invalid info structure in DSA public key");
        }
    }
}
