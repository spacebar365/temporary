package org.bouncycastle.jcajce.provider.asymmetric.ec;

import java.io.IOException;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import org.bouncycastle.a.aa.ab;
import org.bouncycastle.a.aa.ad;
import org.bouncycastle.a.aa.b;
import org.bouncycastle.a.bc;
import org.bouncycastle.a.n;
import org.bouncycastle.a.p;
import org.bouncycastle.c.b.a;
import org.bouncycastle.c.c.d;
import org.bouncycastle.c.c.e;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;

/* JADX INFO: loaded from: classes.dex */
public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {
    private ECParameterSpec a;
    private String b;

    private static boolean a(String str) {
        return str == null || str.equals("ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded() {
        return engineGetEncoded("ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded(String str) throws IOException {
        ab abVar;
        if (!a(str)) {
            throw new IOException("Unknown parameters format in AlgorithmParameters object: ".concat(String.valueOf(str)));
        }
        if (this.a == null) {
            abVar = new ab((n) bc.a);
        } else if (this.b != null) {
            abVar = new ab(ECUtil.a(this.b));
        } else {
            e eVarA = EC5Util.a(this.a);
            abVar = new ab(new ad(eVarA.b(), eVarA.c(), eVarA.d(), eVarA.e(), eVarA.f()));
        }
        return abVar.k();
    }

    @Override // java.security.AlgorithmParametersSpi
    protected <T extends AlgorithmParameterSpec> T engineGetParameterSpec(Class<T> cls) throws InvalidParameterSpecException {
        if (ECParameterSpec.class.isAssignableFrom(cls) || cls == AlgorithmParameterSpec.class) {
            return this.a;
        }
        if (ECGenParameterSpec.class.isAssignableFrom(cls)) {
            if (this.b != null) {
                p pVarA = ECUtil.a(this.b);
                return pVarA != null ? new ECGenParameterSpec(pVarA.b()) : new ECGenParameterSpec(this.b);
            }
            p pVarA2 = ECUtil.a(EC5Util.a(this.a));
            if (pVarA2 != null) {
                return new ECGenParameterSpec(pVarA2.b());
            }
        }
        throw new InvalidParameterSpecException("EC AlgorithmParameters cannot convert to " + cls.getName());
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (!(algorithmParameterSpec instanceof ECGenParameterSpec)) {
            if (!(algorithmParameterSpec instanceof ECParameterSpec)) {
                throw new InvalidParameterSpecException("AlgorithmParameterSpec class not recognized: " + algorithmParameterSpec.getClass().getName());
            }
            if (algorithmParameterSpec instanceof d) {
                this.b = ((d) algorithmParameterSpec).a();
            } else {
                this.b = null;
            }
            this.a = (ECParameterSpec) algorithmParameterSpec;
            return;
        }
        ECGenParameterSpec eCGenParameterSpec = (ECGenParameterSpec) algorithmParameterSpec;
        ad adVarA = ECUtils.a(eCGenParameterSpec);
        if (adVarA == null) {
            throw new InvalidParameterSpecException("EC curve name not recognized: " + eCGenParameterSpec.getName());
        }
        this.b = eCGenParameterSpec.getName();
        ECParameterSpec eCParameterSpecA = EC5Util.a(adVarA);
        this.a = new d(this.b, eCParameterSpecA.getCurve(), eCParameterSpecA.getGenerator(), eCParameterSpecA.getOrder(), BigInteger.valueOf(eCParameterSpecA.getCofactor()));
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr) throws IOException {
        engineInit(bArr, "ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr, String str) throws IOException {
        if (!a(str)) {
            throw new IOException("Unknown encoded parameters format in AlgorithmParameters object: ".concat(String.valueOf(str)));
        }
        ab abVarA = ab.a(bArr);
        org.bouncycastle.d.a.d dVarA = EC5Util.a(a.a, abVarA);
        if (abVarA.a()) {
            p pVarA = p.a((Object) abVarA.c());
            this.b = b.a(pVarA);
            if (this.b == null) {
                this.b = pVarA.b();
            }
        }
        this.a = EC5Util.a(abVarA, dVarA);
    }

    @Override // java.security.AlgorithmParametersSpi
    protected String engineToString() {
        return "EC AlgorithmParameters ";
    }
}
