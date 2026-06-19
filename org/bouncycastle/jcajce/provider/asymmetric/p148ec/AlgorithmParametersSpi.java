package org.bouncycastle.jcajce.provider.asymmetric.p148ec;

import java.io.IOException;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.p054a.AbstractC0642n;
import org.bouncycastle.p054a.C0579bc;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p056aa.C0505ab;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p054a.p056aa.C0514b;
import org.bouncycastle.p103c.p105b.C1200a;
import org.bouncycastle.p103c.p106c.C1207d;
import org.bouncycastle.p103c.p106c.C1208e;
import org.bouncycastle.p107d.p108a.AbstractC1381d;

/* JADX INFO: loaded from: classes.dex */
public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {

    /* JADX INFO: renamed from: a */
    private ECParameterSpec f5675a;

    /* JADX INFO: renamed from: b */
    private String f5676b;

    /* JADX INFO: renamed from: a */
    private static boolean m4223a(String str) {
        return str == null || str.equals("ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded() {
        return engineGetEncoded("ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded(String str) throws IOException {
        C0505ab c0505ab;
        if (!m4223a(str)) {
            throw new IOException("Unknown parameters format in AlgorithmParameters object: ".concat(String.valueOf(str)));
        }
        if (this.f5675a == null) {
            c0505ab = new C0505ab((AbstractC0642n) C0579bc.f2112a);
        } else if (this.f5676b != null) {
            c0505ab = new C0505ab(ECUtil.m4326a(this.f5676b));
        } else {
            C1208e c1208eM4316a = EC5Util.m4316a(this.f5675a);
            c0505ab = new C0505ab(new C0507ad(c1208eM4316a.m2869b(), c1208eM4316a.m2870c(), c1208eM4316a.m2871d(), c1208eM4316a.m2872e(), c1208eM4316a.m2873f()));
        }
        return c0505ab.mo1578k();
    }

    @Override // java.security.AlgorithmParametersSpi
    protected <T extends AlgorithmParameterSpec> T engineGetParameterSpec(Class<T> cls) throws InvalidParameterSpecException {
        if (ECParameterSpec.class.isAssignableFrom(cls) || cls == AlgorithmParameterSpec.class) {
            return this.f5675a;
        }
        if (ECGenParameterSpec.class.isAssignableFrom(cls)) {
            if (this.f5676b != null) {
                C0653p c0653pM4326a = ECUtil.m4326a(this.f5676b);
                return c0653pM4326a != null ? new ECGenParameterSpec(c0653pM4326a.m1593b()) : new ECGenParameterSpec(this.f5676b);
            }
            C0653p c0653pM4327a = ECUtil.m4327a(EC5Util.m4316a(this.f5675a));
            if (c0653pM4327a != null) {
                return new ECGenParameterSpec(c0653pM4327a.m1593b());
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
            if (algorithmParameterSpec instanceof C1207d) {
                this.f5676b = ((C1207d) algorithmParameterSpec).m2868a();
            } else {
                this.f5676b = null;
            }
            this.f5675a = (ECParameterSpec) algorithmParameterSpec;
            return;
        }
        ECGenParameterSpec eCGenParameterSpec = (ECGenParameterSpec) algorithmParameterSpec;
        C0507ad c0507adM4231a = ECUtils.m4231a(eCGenParameterSpec);
        if (c0507adM4231a == null) {
            throw new InvalidParameterSpecException("EC curve name not recognized: " + eCGenParameterSpec.getName());
        }
        this.f5676b = eCGenParameterSpec.getName();
        ECParameterSpec eCParameterSpecM4312a = EC5Util.m4312a(c0507adM4231a);
        this.f5675a = new C1207d(this.f5676b, eCParameterSpecM4312a.getCurve(), eCParameterSpecM4312a.getGenerator(), eCParameterSpecM4312a.getOrder(), BigInteger.valueOf(eCParameterSpecM4312a.getCofactor()));
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr) throws IOException {
        engineInit(bArr, "ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr, String str) throws IOException {
        if (!m4223a(str)) {
            throw new IOException("Unknown encoded parameters format in AlgorithmParameters object: ".concat(String.valueOf(str)));
        }
        C0505ab c0505abM1359a = C0505ab.m1359a(bArr);
        AbstractC1381d abstractC1381dM4318a = EC5Util.m4318a(C1200a.f4677a, c0505abM1359a);
        if (c0505abM1359a.m1360a()) {
            C0653p c0653pM1584a = C0653p.m1584a((Object) c0505abM1359a.m1362c());
            this.f5676b = C0514b.m1378a(c0653pM1584a);
            if (this.f5676b == null) {
                this.f5676b = c0653pM1584a.m1593b();
            }
        }
        this.f5675a = EC5Util.m4311a(c0505abM1359a, abstractC1381dM4318a);
    }

    @Override // java.security.AlgorithmParametersSpi
    protected String engineToString() {
        return "EC AlgorithmParameters ";
    }
}
