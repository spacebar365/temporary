package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.p082z.C0768i;

/* JADX INFO: loaded from: classes.dex */
public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {

    /* JADX INFO: renamed from: a */
    DSAParameterSpec f5636a;

    /* JADX INFO: renamed from: a */
    private static boolean m4206a(String str) {
        return str == null || str.equals("ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded() {
        try {
            return new C0768i(this.f5636a.getP(), this.f5636a.getQ(), this.f5636a.getG()).m1577a("DER");
        } catch (IOException e) {
            throw new RuntimeException("Error encoding DSAParameters");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded(String str) {
        if (m4206a(str)) {
            return engineGetEncoded();
        }
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (!(algorithmParameterSpec instanceof DSAParameterSpec)) {
            throw new InvalidParameterSpecException("DSAParameterSpec required to initialise a DSA algorithm parameters object");
        }
        this.f5636a = (DSAParameterSpec) algorithmParameterSpec;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr) throws IOException {
        try {
            C0768i c0768iM1813a = C0768i.m1813a(AbstractC0686u.m1692b(bArr));
            this.f5636a = new DSAParameterSpec(c0768iM1813a.m1814a(), c0768iM1813a.m1815b(), c0768iM1813a.m1816c());
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IOException("Not a valid DSA Parameter encoding.");
        } catch (ClassCastException e2) {
            throw new IOException("Not a valid DSA Parameter encoding.");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr, String str) throws IOException {
        if (!m4206a(str) && !str.equalsIgnoreCase("X.509")) {
            throw new IOException("Unknown parameter format ".concat(String.valueOf(str)));
        }
        engineInit(bArr);
    }

    @Override // java.security.AlgorithmParametersSpi
    protected String engineToString() {
        return "DSA Parameters";
    }

    @Override // java.security.AlgorithmParametersSpi
    protected AlgorithmParameterSpec engineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        if (cls == null) {
            throw new NullPointerException("argument to getParameterSpec must not be null");
        }
        if (cls == DSAParameterSpec.class || cls == AlgorithmParameterSpec.class) {
            return this.f5636a;
        }
        throw new InvalidParameterSpecException("unknown parameter spec passed to DSA parameters object.");
    }
}
