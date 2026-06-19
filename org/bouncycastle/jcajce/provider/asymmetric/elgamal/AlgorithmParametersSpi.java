package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.p073r.C0658a;
import org.bouncycastle.p103c.p106c.C1212i;

/* JADX INFO: loaded from: classes.dex */
public class AlgorithmParametersSpi extends BaseAlgorithmParameters {

    /* JADX INFO: renamed from: a */
    C1212i f5817a;

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
    /* JADX INFO: renamed from: a */
    protected final AlgorithmParameterSpec mo4277a(Class cls) throws InvalidParameterSpecException {
        if (cls == C1212i.class || cls == AlgorithmParameterSpec.class) {
            return this.f5817a;
        }
        if (cls == DHParameterSpec.class) {
            return new DHParameterSpec(this.f5817a.m2877a(), this.f5817a.m2878b());
        }
        throw new InvalidParameterSpecException("unknown parameter spec passed to ElGamal parameters object.");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded() {
        try {
            return new C0658a(this.f5817a.m2877a(), this.f5817a.m2878b()).m1577a("DER");
        } catch (IOException e) {
            throw new RuntimeException("Error encoding ElGamalParameters");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded(String str) {
        if (m4449a(str) || str.equalsIgnoreCase("X.509")) {
            return engineGetEncoded();
        }
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (!(algorithmParameterSpec instanceof C1212i) && !(algorithmParameterSpec instanceof DHParameterSpec)) {
            throw new InvalidParameterSpecException("DHParameterSpec required to initialise a ElGamal algorithm parameters object");
        }
        if (algorithmParameterSpec instanceof C1212i) {
            this.f5817a = (C1212i) algorithmParameterSpec;
        } else {
            DHParameterSpec dHParameterSpec = (DHParameterSpec) algorithmParameterSpec;
            this.f5817a = new C1212i(dHParameterSpec.getP(), dHParameterSpec.getG());
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr) throws IOException {
        try {
            C0658a c0658aM1598a = C0658a.m1598a(AbstractC0686u.m1692b(bArr));
            this.f5817a = new C1212i(c0658aM1598a.m1599a(), c0658aM1598a.m1600b());
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IOException("Not a valid ElGamal Parameter encoding.");
        } catch (ClassCastException e2) {
            throw new IOException("Not a valid ElGamal Parameter encoding.");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr, String str) throws IOException {
        if (!m4449a(str) && !str.equalsIgnoreCase("X.509")) {
            throw new IOException("Unknown parameter format ".concat(String.valueOf(str)));
        }
        engineInit(bArr);
    }

    @Override // java.security.AlgorithmParametersSpi
    protected String engineToString() {
        return "ElGamal Parameters";
    }
}
