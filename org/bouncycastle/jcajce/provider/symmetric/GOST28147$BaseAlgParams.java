package org.bouncycastle.jcajce.provider.symmetric;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.a.f.a;
import org.bouncycastle.a.f.c;
import org.bouncycastle.a.p;
import org.bouncycastle.b.e.u;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.spec.GOST28147ParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public abstract class GOST28147$BaseAlgParams extends BaseAlgorithmParameters {
    private p a = a.h;
    private byte[] b;

    private static p b(String str) {
        p pVar = (p) GOST28147.a().get(str);
        if (pVar == null) {
            throw new IllegalArgumentException("Unknown SBOX name: ".concat(String.valueOf(str)));
        }
        return pVar;
    }

    protected static p b(byte[] bArr) {
        return b(u.a(bArr));
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
    protected AlgorithmParameterSpec a(Class cls) throws InvalidParameterSpecException {
        if (cls == IvParameterSpec.class) {
            return new IvParameterSpec(this.b);
        }
        if (cls == GOST28147ParameterSpec.class || cls == AlgorithmParameterSpec.class) {
            return new GOST28147ParameterSpec(this.a, this.b);
        }
        throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: " + cls.getName());
    }

    abstract void a(byte[] bArr);

    protected byte[] a() {
        return new c(this.b, this.a).k();
    }

    @Override // java.security.AlgorithmParametersSpi
    protected final byte[] engineGetEncoded() {
        return engineGetEncoded("ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected final byte[] engineGetEncoded(String str) throws IOException {
        if (a(str)) {
            return a();
        }
        throw new IOException("Unknown parameter format: ".concat(String.valueOf(str)));
    }

    @Override // java.security.AlgorithmParametersSpi
    protected final void engineInit(byte[] bArr) throws IOException {
        engineInit(bArr, "ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected final void engineInit(byte[] bArr, String str) throws IOException {
        if (bArr == null) {
            throw new NullPointerException("Encoded parameters cannot be null");
        }
        if (!a(str)) {
            throw new IOException("Unknown parameter format: ".concat(String.valueOf(str)));
        }
        try {
            a(bArr);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException("Parameter parsing failed: " + e2.getMessage());
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (algorithmParameterSpec instanceof IvParameterSpec) {
            this.b = ((IvParameterSpec) algorithmParameterSpec).getIV();
        } else {
            if (!(algorithmParameterSpec instanceof GOST28147ParameterSpec)) {
                throw new InvalidParameterSpecException("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
            }
            this.b = ((GOST28147ParameterSpec) algorithmParameterSpec).c();
            try {
                this.a = b(u.a(((GOST28147ParameterSpec) algorithmParameterSpec).b()));
            } catch (IllegalArgumentException e) {
                throw new InvalidParameterSpecException(e.getMessage());
            }
        }
    }
}
