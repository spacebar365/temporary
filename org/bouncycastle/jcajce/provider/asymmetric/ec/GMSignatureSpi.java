package org.bouncycastle.jcajce.provider.asymmetric.ec;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.b.i;
import org.bouncycastle.b.j;
import org.bouncycastle.b.k.b;
import org.bouncycastle.b.k.bd;
import org.bouncycastle.b.k.bf;
import org.bouncycastle.b.n.r;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.spec.SM2ParameterSpec;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;

/* JADX INFO: loaded from: classes.dex */
public class GMSignatureSpi extends java.security.SignatureSpi {
    private final JcaJceHelper a = new BCJcaJceHelper();
    private AlgorithmParameters b;
    private SM2ParameterSpec c;
    private final r d;

    GMSignatureSpi(r rVar) {
        this.d = rVar;
    }

    @Override // java.security.SignatureSpi
    protected Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineGetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected AlgorithmParameters engineGetParameters() {
        if (this.b == null && this.c != null) {
            try {
                this.b = this.a.c("PSS");
                this.b.init(this.c);
            } catch (Exception e) {
                throw new RuntimeException(e.toString());
            }
        }
        return this.b;
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        b bVarA = ECUtil.a(privateKey);
        i bfVar = this.appRandom != null ? new bf(bVarA, this.appRandom) : bVarA;
        if (this.c != null) {
            this.d.a(true, (i) new bd(bfVar, this.c.a()));
        } else {
            this.d.a(true, bfVar);
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) {
        b bVarA = ECUtils.a(publicKey);
        this.d.a(false, this.c != null ? new bd(bVarA, this.c.a()) : bVarA);
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof SM2ParameterSpec)) {
            throw new InvalidAlgorithmParameterException("only SM2ParameterSpec supported");
        }
        this.c = (SM2ParameterSpec) algorithmParameterSpec;
    }

    @Override // java.security.SignatureSpi
    protected byte[] engineSign() throws SignatureException {
        try {
            return this.d.a();
        } catch (j e) {
            throw new SignatureException("unable to create signature: " + e.getMessage());
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b) {
        this.d.a(b);
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte[] bArr, int i, int i2) {
        this.d.a(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) {
        return this.d.a(bArr);
    }
}
