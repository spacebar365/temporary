package org.bouncycastle.jcajce.provider.symmetric.util;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: loaded from: classes.dex */
public class IvAlgorithmParameters extends BaseAlgorithmParameters {

    /* JADX INFO: renamed from: a */
    private byte[] f6210a;

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
    /* JADX INFO: renamed from: a */
    protected final AlgorithmParameterSpec mo4277a(Class cls) throws InvalidParameterSpecException {
        if (cls == IvParameterSpec.class || cls == AlgorithmParameterSpec.class) {
            return new IvParameterSpec(this.f6210a);
        }
        throw new InvalidParameterSpecException("unknown parameter spec passed to IV parameters object.");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded() {
        return engineGetEncoded("ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded(String str) {
        if (m4449a(str)) {
            return new C0581be(engineGetEncoded("RAW")).mo1578k();
        }
        if (str.equals("RAW")) {
            return C1535a.m4086b(this.f6210a);
        }
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (!(algorithmParameterSpec instanceof IvParameterSpec)) {
            throw new InvalidParameterSpecException("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
        }
        this.f6210a = ((IvParameterSpec) algorithmParameterSpec).getIV();
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr) {
        if (bArr.length % 8 != 0 && bArr[0] == 4 && bArr[1] == bArr.length - 2) {
            bArr = ((AbstractC0655q) AbstractC0686u.m1692b(bArr)).mo1410c();
        }
        this.f6210a = C1535a.m4086b(bArr);
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr, String str) throws IOException {
        if (m4449a(str)) {
            try {
                engineInit(((AbstractC0655q) AbstractC0686u.m1692b(bArr)).mo1410c());
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
