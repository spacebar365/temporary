package org.bouncycastle.jcajce.provider.symmetric;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.a.l;
import org.bouncycastle.a.n.a;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;

/* JADX INFO: loaded from: classes.dex */
public class CAST5$AlgParams extends BaseAlgorithmParameters {
    private byte[] a;
    private int b = 128;

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
    protected final AlgorithmParameterSpec a(Class cls) throws InvalidParameterSpecException {
        if (cls == IvParameterSpec.class) {
            return new IvParameterSpec(this.a);
        }
        throw new InvalidParameterSpecException("unknown parameter spec passed to CAST5 parameters object.");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded() {
        byte[] bArr = new byte[this.a.length];
        System.arraycopy(this.a, 0, bArr, 0, this.a.length);
        return bArr;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded(String str) {
        if (a(str)) {
            return new a(engineGetEncoded(), this.b).k();
        }
        if (str.equals("RAW")) {
            return engineGetEncoded();
        }
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (!(algorithmParameterSpec instanceof IvParameterSpec)) {
            throw new InvalidParameterSpecException("IvParameterSpec required to initialise a CAST5 parameters algorithm parameters object");
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
        if (a(str)) {
            a aVarA = a.a(new l(bArr).b());
            this.b = aVarA.b();
            this.a = aVarA.a();
        } else {
            if (!str.equals("RAW")) {
                throw new IOException("Unknown parameters format in IV parameters object");
            }
            engineInit(bArr);
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected String engineToString() {
        return "CAST5 Parameters";
    }
}
