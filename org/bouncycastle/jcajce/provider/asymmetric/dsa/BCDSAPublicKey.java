package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import java.io.IOException;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPublicKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.p054a.C0579bc;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p054a.InterfaceC0618f;
import org.bouncycastle.p054a.p056aa.InterfaceC0513aj;
import org.bouncycastle.p054a.p082z.C0759a;
import org.bouncycastle.p054a.p082z.C0768i;
import org.bouncycastle.p054a.p082z.C0780u;
import org.bouncycastle.p083b.p097k.C1117t;
import org.bouncycastle.p142f.C1560k;

/* JADX INFO: loaded from: classes.dex */
public class BCDSAPublicKey implements DSAPublicKey {

    /* JADX INFO: renamed from: a */
    private static BigInteger f5640a = BigInteger.valueOf(0);

    /* JADX INFO: renamed from: b */
    private BigInteger f5641b;

    /* JADX INFO: renamed from: c */
    private transient C1117t f5642c;

    /* JADX INFO: renamed from: d */
    private transient DSAParams f5643d;

    BCDSAPublicKey(DSAPublicKey dSAPublicKey) {
        this.f5641b = dSAPublicKey.getY();
        this.f5643d = dSAPublicKey.getParams();
        this.f5642c = new C1117t(this.f5641b, DSAUtil.m4211a(this.f5643d));
    }

    BCDSAPublicKey(DSAPublicKeySpec dSAPublicKeySpec) {
        this.f5641b = dSAPublicKeySpec.getY();
        this.f5643d = new DSAParameterSpec(dSAPublicKeySpec.getP(), dSAPublicKeySpec.getQ(), dSAPublicKeySpec.getG());
        this.f5642c = new C1117t(this.f5641b, DSAUtil.m4211a(this.f5643d));
    }

    BCDSAPublicKey(C1117t c1117t) {
        this.f5641b = c1117t.m2691c();
        if (c1117t != null) {
            this.f5643d = new DSAParameterSpec(c1117t.m2680b().m2686a(), c1117t.m2680b().m2687b(), c1117t.m2680b().m2688c());
        } else {
            this.f5643d = null;
        }
        this.f5642c = c1117t;
    }

    /* JADX INFO: renamed from: a */
    final C1117t m4207a() {
        return this.f5642c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAPublicKey)) {
            return false;
        }
        DSAPublicKey dSAPublicKey = (DSAPublicKey) obj;
        return this.f5643d != null ? getY().equals(dSAPublicKey.getY()) && dSAPublicKey.getParams() != null && getParams().getG().equals(dSAPublicKey.getParams().getG()) && getParams().getP().equals(dSAPublicKey.getParams().getP()) && getParams().getQ().equals(dSAPublicKey.getParams().getQ()) : getY().equals(dSAPublicKey.getY()) && dSAPublicKey.getParams() == null;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "DSA";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return this.f5643d == null ? KeyUtil.m4339a(new C0759a(InterfaceC0513aj.f1921U), new C0640m(this.f5641b)) : KeyUtil.m4339a(new C0759a(InterfaceC0513aj.f1921U, new C0768i(this.f5643d.getP(), this.f5643d.getQ(), this.f5643d.getG()).mo1358i()), new C0640m(this.f5641b));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // java.security.interfaces.DSAKey
    public DSAParams getParams() {
        return this.f5643d;
    }

    @Override // java.security.interfaces.DSAPublicKey
    public BigInteger getY() {
        return this.f5641b;
    }

    public int hashCode() {
        return this.f5643d != null ? ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getQ().hashCode() : getY().hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String strM4158a = C1560k.m4158a();
        stringBuffer.append("DSA Public Key [").append(DSAUtil.m4208a(this.f5641b, getParams())).append("]").append(strM4158a);
        stringBuffer.append("            Y: ").append(getY().toString(16)).append(strM4158a);
        return stringBuffer.toString();
    }

    public BCDSAPublicKey(C0780u c0780u) {
        try {
            this.f5641b = ((C0640m) c0780u.m1845b()).m1564b();
            InterfaceC0618f interfaceC0618fM1784b = c0780u.m1844a().m1784b();
            if ((interfaceC0618fM1784b == null || C0579bc.f2112a.equals(interfaceC0618fM1784b.mo1358i())) ? false : true) {
                C0768i c0768iM1813a = C0768i.m1813a(c0780u.m1844a().m1784b());
                this.f5643d = new DSAParameterSpec(c0768iM1813a.m1814a(), c0768iM1813a.m1815b(), c0768iM1813a.m1816c());
            } else {
                this.f5643d = null;
            }
            this.f5642c = new C1117t(this.f5641b, DSAUtil.m4211a(this.f5643d));
        } catch (IOException e) {
            throw new IllegalArgumentException("invalid info structure in DSA public key");
        }
    }
}
