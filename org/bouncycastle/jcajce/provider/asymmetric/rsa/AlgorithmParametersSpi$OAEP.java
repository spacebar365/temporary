package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource$PSpecified;
import org.bouncycastle.a.bc;
import org.bouncycastle.a.be;
import org.bouncycastle.a.q;
import org.bouncycastle.a.s.n;
import org.bouncycastle.a.s.r;
import org.bouncycastle.a.z.a;
import org.bouncycastle.jcajce.provider.util.DigestFactory;
import org.bouncycastle.jcajce.util.MessageDigestUtils;

/* JADX INFO: loaded from: classes.dex */
public class AlgorithmParametersSpi$OAEP extends AlgorithmParametersSpi {
    OAEPParameterSpec a;

    @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi
    protected final AlgorithmParameterSpec a(Class cls) throws InvalidParameterSpecException {
        if (cls == OAEPParameterSpec.class || cls == AlgorithmParameterSpec.class) {
            return this.a;
        }
        throw new InvalidParameterSpecException("unknown parameter spec passed to OAEP parameters object.");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded() {
        try {
            return new r(new a(DigestFactory.b(this.a.getDigestAlgorithm()), bc.a), new a(n.j_, new a(DigestFactory.b(((MGF1ParameterSpec) this.a.getMGFParameters()).getDigestAlgorithm()), bc.a)), new a(n.k_, new be(((PSource$PSpecified) this.a.getPSource()).getValue()))).a("DER");
        } catch (IOException e) {
            throw new RuntimeException("Error encoding OAEPParameters");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded(String str) {
        if (a(str) || str.equalsIgnoreCase("X.509")) {
            return engineGetEncoded();
        }
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (!(algorithmParameterSpec instanceof OAEPParameterSpec)) {
            throw new InvalidParameterSpecException("OAEPParameterSpec required to initialise an OAEP algorithm parameters object");
        }
        this.a = (OAEPParameterSpec) algorithmParameterSpec;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr) throws IOException {
        try {
            r rVarA = r.a(bArr);
            if (!rVarA.b().a().equals(n.j_)) {
                throw new IOException("unknown mask generation function: " + rVarA.b().a());
            }
            this.a = new OAEPParameterSpec(MessageDigestUtils.a(rVarA.a().a()), OAEPParameterSpec.DEFAULT.getMGFAlgorithm(), new MGF1ParameterSpec(MessageDigestUtils.a(a.a(rVarA.b().b()).a())), new PSource$PSpecified(q.a(rVarA.c().b()).c()));
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IOException("Not a valid OAEP Parameter encoding.");
        } catch (ClassCastException e2) {
            throw new IOException("Not a valid OAEP Parameter encoding.");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr, String str) throws IOException {
        if (!str.equalsIgnoreCase("X.509") && !str.equalsIgnoreCase("ASN.1")) {
            throw new IOException("Unknown parameter format ".concat(String.valueOf(str)));
        }
        engineInit(bArr);
    }

    @Override // java.security.AlgorithmParametersSpi
    protected String engineToString() {
        return "OAEP Parameters";
    }
}
