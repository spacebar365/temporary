package org.bouncycastle.jcajce.provider.symmetric;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.a.d.a;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.spec.AEADParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public class AES$AlgParamsCCM extends BaseAlgorithmParameters {
    private a a;

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
    protected final AlgorithmParameterSpec a(Class cls) throws InvalidParameterSpecException {
        if (cls == AlgorithmParameterSpec.class || GcmSpecUtil.a(cls)) {
            return GcmSpecUtil.a() ? GcmSpecUtil.a(this.a.i()) : new AEADParameterSpec(this.a.a(), this.a.b() * 8);
        }
        if (cls == AEADParameterSpec.class) {
            return new AEADParameterSpec(this.a.a(), this.a.b() * 8);
        }
        if (cls == IvParameterSpec.class) {
            return new IvParameterSpec(this.a.a());
        }
        throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: " + cls.getName());
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded() {
        return this.a.k();
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded(String str) throws IOException {
        if (a(str)) {
            return this.a.k();
        }
        throw new IOException("unknown format specified");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr) {
        this.a = a.a(bArr);
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr, String str) throws IOException {
        if (!a(str)) {
            throw new IOException("unknown format specified");
        }
        this.a = a.a(bArr);
    }

    @Override // java.security.AlgorithmParametersSpi
    protected String engineToString() {
        return "CCM";
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (GcmSpecUtil.a(algorithmParameterSpec)) {
            this.a = a.a(GcmSpecUtil.b(algorithmParameterSpec));
        } else {
            if (!(algorithmParameterSpec instanceof AEADParameterSpec)) {
                throw new InvalidParameterSpecException("AlgorithmParameterSpec class not recognized: " + algorithmParameterSpec.getClass().getName());
            }
            this.a = new a(((AEADParameterSpec) algorithmParameterSpec).getIV(), ((AEADParameterSpec) algorithmParameterSpec).a() / 8);
        }
    }
}
