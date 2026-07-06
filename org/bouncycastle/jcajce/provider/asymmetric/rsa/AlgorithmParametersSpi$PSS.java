package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import org.bouncycastle.a.bc;
import org.bouncycastle.a.m;
import org.bouncycastle.a.s.n;
import org.bouncycastle.a.s.u;
import org.bouncycastle.a.z.a;
import org.bouncycastle.jcajce.provider.util.DigestFactory;
import org.bouncycastle.jcajce.util.MessageDigestUtils;

/* JADX INFO: loaded from: classes.dex */
public class AlgorithmParametersSpi$PSS extends AlgorithmParametersSpi {
    PSSParameterSpec a;

    @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi
    protected final AlgorithmParameterSpec a(Class cls) throws InvalidParameterSpecException {
        if (cls == PSSParameterSpec.class || cls == AlgorithmParameterSpec.class) {
            return this.a;
        }
        throw new InvalidParameterSpecException("unknown parameter spec passed to PSS parameters object.");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded() {
        PSSParameterSpec pSSParameterSpec = this.a;
        return new u(new a(DigestFactory.b(pSSParameterSpec.getDigestAlgorithm()), bc.a), new a(n.j_, new a(DigestFactory.b(((MGF1ParameterSpec) pSSParameterSpec.getMGFParameters()).getDigestAlgorithm()), bc.a)), new m(pSSParameterSpec.getSaltLength()), new m(pSSParameterSpec.getTrailerField())).a("DER");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded(String str) {
        if (str.equalsIgnoreCase("X.509") || str.equalsIgnoreCase("ASN.1")) {
            return engineGetEncoded();
        }
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (!(algorithmParameterSpec instanceof PSSParameterSpec)) {
            throw new InvalidParameterSpecException("PSSParameterSpec required to initialise an PSS algorithm parameters object");
        }
        this.a = (PSSParameterSpec) algorithmParameterSpec;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr) throws IOException {
        try {
            u uVarA = u.a(bArr);
            if (!uVarA.b().a().equals(n.j_)) {
                throw new IOException("unknown mask generation function: " + uVarA.b().a());
            }
            this.a = new PSSParameterSpec(MessageDigestUtils.a(uVarA.a().a()), PSSParameterSpec.DEFAULT.getMGFAlgorithm(), new MGF1ParameterSpec(MessageDigestUtils.a(a.a(uVarA.b().b()).a())), uVarA.c().intValue(), uVarA.d().intValue());
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IOException("Not a valid PSS Parameter encoding.");
        } catch (ClassCastException e2) {
            throw new IOException("Not a valid PSS Parameter encoding.");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr, String str) throws IOException {
        if (!a(str) && !str.equalsIgnoreCase("X.509")) {
            throw new IOException("Unknown parameter format ".concat(String.valueOf(str)));
        }
        engineInit(bArr);
    }

    @Override // java.security.AlgorithmParametersSpi
    protected String engineToString() {
        return "PSS Parameters";
    }
}
