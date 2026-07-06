package org.bouncycastle.jcajce.provider.symmetric;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.a.f.a;
import org.bouncycastle.a.f.c;
import org.bouncycastle.a.p;
import org.bouncycastle.a.q;
import org.bouncycastle.a.u;
import org.bouncycastle.a.v;
import org.bouncycastle.jcajce.spec.GOST28147ParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public class GOST28147$AlgParams extends GOST28147$BaseAlgParams {
    private p a = a.h;
    private byte[] b;

    @Override // org.bouncycastle.jcajce.provider.symmetric.GOST28147$BaseAlgParams, org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
    protected final AlgorithmParameterSpec a(Class cls) throws InvalidParameterSpecException {
        if (cls == IvParameterSpec.class) {
            return new IvParameterSpec(this.b);
        }
        if (cls == GOST28147ParameterSpec.class || cls == AlgorithmParameterSpec.class) {
            return new GOST28147ParameterSpec(this.a, this.b);
        }
        throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: " + cls.getName());
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.GOST28147$BaseAlgParams
    protected final void a(byte[] bArr) throws IOException {
        u uVarB = u.b(bArr);
        if (uVarB instanceof q) {
            this.b = q.a((Object) uVarB).c();
        } else {
            if (!(uVarB instanceof v)) {
                throw new IOException("Unable to recognize parameters");
            }
            c cVarA = c.a(uVarB);
            this.a = cVarA.a();
            this.b = cVarA.b();
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.GOST28147$BaseAlgParams
    protected final byte[] a() {
        return new c(this.b, this.a).k();
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.GOST28147$BaseAlgParams, java.security.AlgorithmParametersSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (algorithmParameterSpec instanceof IvParameterSpec) {
            this.b = ((IvParameterSpec) algorithmParameterSpec).getIV();
        } else {
            if (!(algorithmParameterSpec instanceof GOST28147ParameterSpec)) {
                throw new InvalidParameterSpecException("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
            }
            this.b = ((GOST28147ParameterSpec) algorithmParameterSpec).c();
            try {
                this.a = b(((GOST28147ParameterSpec) algorithmParameterSpec).b());
            } catch (IllegalArgumentException e) {
                throw new InvalidParameterSpecException(e.getMessage());
            }
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected String engineToString() {
        return "GOST 28147 IV Parameters";
    }
}
