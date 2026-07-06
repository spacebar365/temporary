package org.bouncycastle.jcajce.provider.symmetric;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.a.n.b;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;

/* JADX INFO: loaded from: classes.dex */
public class IDEA$AlgParams extends BaseAlgorithmParameters {
    private byte[] a;

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
    protected final AlgorithmParameterSpec a(Class cls) throws InvalidParameterSpecException {
        if (cls == IvParameterSpec.class) {
            return new IvParameterSpec(this.a);
        }
        throw new InvalidParameterSpecException("unknown parameter spec passed to IV parameters object.");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded() {
        return engineGetEncoded("ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded(String str) {
        if (a(str)) {
            return new b(engineGetEncoded("RAW")).k();
        }
        if (!str.equals("RAW")) {
            return null;
        }
        byte[] bArr = new byte[this.a.length];
        System.arraycopy(this.a, 0, bArr, 0, this.a.length);
        return bArr;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (!(algorithmParameterSpec instanceof IvParameterSpec)) {
            throw new InvalidParameterSpecException("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
        }
        this.a = ((IvParameterSpec) algorithmParameterSpec).getIV();
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr) {
        this.a = new byte[bArr.length];
        System.arraycopy(bArr, 0, this.a, 0, this.a.length);
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr, String str) throws IOException {
        if (str.equals("RAW")) {
            engineInit(bArr);
        } else {
            if (!str.equals("ASN.1")) {
                throw new IOException("Unknown parameters format in IV parameters object");
            }
            engineInit(b.a(bArr).a());
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected String engineToString() {
        return "IDEA Parameters";
    }
}
