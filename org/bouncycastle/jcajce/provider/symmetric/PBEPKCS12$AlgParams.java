package org.bouncycastle.jcajce.provider.symmetric;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.a.s.m;
import org.bouncycastle.a.u;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;

/* JADX INFO: loaded from: classes.dex */
public class PBEPKCS12$AlgParams extends BaseAlgorithmParameters {
    m a;

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
    protected final AlgorithmParameterSpec a(Class cls) throws InvalidParameterSpecException {
        if (cls == PBEParameterSpec.class) {
            return new PBEParameterSpec(this.a.b(), this.a.a().intValue());
        }
        throw new InvalidParameterSpecException("unknown parameter spec passed to PKCS12 PBE parameters object.");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded() {
        try {
            return this.a.a("DER");
        } catch (IOException e) {
            throw new RuntimeException("Oooops! " + e.toString());
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded(String str) {
        if (a(str)) {
            return engineGetEncoded();
        }
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
            throw new InvalidParameterSpecException("PBEParameterSpec required to initialise a PKCS12 PBE parameters algorithm parameters object");
        }
        PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
        this.a = new m(pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr) {
        this.a = m.a(u.b(bArr));
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr, String str) throws IOException {
        if (!a(str)) {
            throw new IOException("Unknown parameters format in PKCS12 PBE parameters object");
        }
        engineInit(bArr);
    }

    @Override // java.security.AlgorithmParametersSpi
    protected String engineToString() {
        return "PKCS12 PBE Parameters";
    }
}
