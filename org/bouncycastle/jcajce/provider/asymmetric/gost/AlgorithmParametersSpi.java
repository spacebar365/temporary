package org.bouncycastle.jcajce.provider.asymmetric.gost;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p061f.C0624f;
import org.bouncycastle.p103c.p106c.C1215l;
import org.bouncycastle.p103c.p106c.C1217n;

/* JADX INFO: loaded from: classes.dex */
public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {

    /* JADX INFO: renamed from: a */
    C1215l f5834a;

    /* JADX INFO: renamed from: a */
    private static boolean m4282a(String str) {
        return str == null || str.equals("ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded() {
        try {
            return new C0624f(new C0653p(this.f5834a.mo2832a()), new C0653p(this.f5834a.mo2833b()), new C0653p(this.f5834a.mo2834c())).m1577a("DER");
        } catch (IOException e) {
            throw new RuntimeException("Error encoding GOST3410Parameters");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded(String str) {
        if (m4282a(str) || str.equalsIgnoreCase("X.509")) {
            return engineGetEncoded();
        }
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (!(algorithmParameterSpec instanceof C1215l)) {
            throw new InvalidParameterSpecException("GOST3410ParameterSpec required to initialise a GOST3410 algorithm parameters object");
        }
        this.f5834a = (C1215l) algorithmParameterSpec;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr) throws IOException {
        try {
            this.f5834a = C1215l.m2881a(new C0624f((AbstractC0723v) AbstractC0686u.m1692b(bArr)));
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IOException("Not a valid GOST3410 Parameter encoding.");
        } catch (ClassCastException e2) {
            throw new IOException("Not a valid GOST3410 Parameter encoding.");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr, String str) throws IOException {
        if (!m4282a(str) && !str.equalsIgnoreCase("X.509")) {
            throw new IOException("Unknown parameter format ".concat(String.valueOf(str)));
        }
        engineInit(bArr);
    }

    @Override // java.security.AlgorithmParametersSpi
    protected String engineToString() {
        return "GOST3410 Parameters";
    }

    @Override // java.security.AlgorithmParametersSpi
    protected AlgorithmParameterSpec engineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        if (cls == null) {
            throw new NullPointerException("argument to getParameterSpec must not be null");
        }
        if (cls == C1217n.class || cls == AlgorithmParameterSpec.class) {
            return this.f5834a;
        }
        throw new InvalidParameterSpecException("unknown parameter spec passed to GOST3410 parameters object.");
    }
}
