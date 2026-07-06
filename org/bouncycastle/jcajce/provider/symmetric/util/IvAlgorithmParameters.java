package org.bouncycastle.jcajce.provider.symmetric.util;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.a.be;
import org.bouncycastle.a.q;
import org.bouncycastle.a.u;
import org.bouncycastle.f.a;

/* JADX INFO: loaded from: classes.dex */
public class IvAlgorithmParameters extends BaseAlgorithmParameters {
    private byte[] a;

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
    protected final AlgorithmParameterSpec a(Class cls) throws InvalidParameterSpecException {
        if (cls == IvParameterSpec.class || cls == AlgorithmParameterSpec.class) {
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
            return new be(engineGetEncoded("RAW")).k();
        }
        if (str.equals("RAW")) {
            return a.b(this.a);
        }
        return null;
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
        if (bArr.length % 8 != 0 && bArr[0] == 4 && bArr[1] == bArr.length - 2) {
            bArr = ((q) u.b(bArr)).c();
        }
        this.a = a.b(bArr);
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr, String str) throws IOException {
        if (a(str)) {
            try {
                engineInit(((q) u.b(bArr)).c());
            } catch (Exception e) {
                throw new IOException("Exception decoding: ".concat(String.valueOf(e)));
            }
        } else {
            if (!str.equals("RAW")) {
                throw new IOException("Unknown parameters format in IV parameters object");
            }
            engineInit(bArr);
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected String engineToString() {
        return "IV Parameters";
    }
}
