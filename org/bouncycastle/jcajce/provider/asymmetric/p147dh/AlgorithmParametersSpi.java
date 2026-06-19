package org.bouncycastle.jcajce.provider.asymmetric.p147dh;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.p054a.p074s.C0664d;

/* JADX INFO: loaded from: classes.dex */
public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {

    /* JADX INFO: renamed from: a */
    DHParameterSpec f5594a;

    /* JADX INFO: renamed from: a */
    private static boolean m4195a(String str) {
        return str == null || str.equals("ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded() {
        try {
            return new C0664d(this.f5594a.getP(), this.f5594a.getG(), this.f5594a.getL()).m1577a("DER");
        } catch (IOException e) {
            throw new RuntimeException("Error encoding DHParameters");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded(String str) {
        if (m4195a(str)) {
            return engineGetEncoded();
        }
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (!(algorithmParameterSpec instanceof DHParameterSpec)) {
            throw new InvalidParameterSpecException("DHParameterSpec required to initialise a Diffie-Hellman algorithm parameters object");
        }
        this.f5594a = (DHParameterSpec) algorithmParameterSpec;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr) throws IOException {
        try {
            C0664d c0664dM1618a = C0664d.m1618a(bArr);
            if (c0664dM1618a.m1621c() != null) {
                this.f5594a = new DHParameterSpec(c0664dM1618a.m1619a(), c0664dM1618a.m1620b(), c0664dM1618a.m1621c().intValue());
            } else {
                this.f5594a = new DHParameterSpec(c0664dM1618a.m1619a(), c0664dM1618a.m1620b());
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IOException("Not a valid DH Parameter encoding.");
        } catch (ClassCastException e2) {
            throw new IOException("Not a valid DH Parameter encoding.");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr, String str) throws IOException {
        if (!m4195a(str)) {
            throw new IOException("Unknown parameter format ".concat(String.valueOf(str)));
        }
        engineInit(bArr);
    }

    @Override // java.security.AlgorithmParametersSpi
    protected String engineToString() {
        return "Diffie-Hellman Parameters";
    }

    @Override // java.security.AlgorithmParametersSpi
    protected AlgorithmParameterSpec engineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        if (cls == null) {
            throw new NullPointerException("argument to getParameterSpec must not be null");
        }
        if (cls == DHParameterSpec.class || cls == AlgorithmParameterSpec.class) {
            return this.f5594a;
        }
        throw new InvalidParameterSpecException("unknown parameter spec passed to DH parameters object.");
    }
}
