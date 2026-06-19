package org.bouncycastle.jcajce.provider.asymmetric.p148ec;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.spec.SM2ParameterSpec;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.p083b.C1038j;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1075b;
import org.bouncycastle.p083b.p097k.C1079bd;
import org.bouncycastle.p083b.p097k.C1081bf;
import org.bouncycastle.p083b.p101n.C1160r;

/* JADX INFO: loaded from: classes.dex */
public class GMSignatureSpi extends SignatureSpi {

    /* JADX INFO: renamed from: a */
    private final JcaJceHelper f5694a = new BCJcaJceHelper();

    /* JADX INFO: renamed from: b */
    private AlgorithmParameters f5695b;

    /* JADX INFO: renamed from: c */
    private SM2ParameterSpec f5696c;

    /* JADX INFO: renamed from: d */
    private final C1160r f5697d;

    public static class sm3WithSM2 extends GMSignatureSpi {
        public sm3WithSM2() {
            super(new C1160r());
        }
    }

    GMSignatureSpi(C1160r c1160r) {
        this.f5697d = c1160r;
    }

    @Override // java.security.SignatureSpi
    protected Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineGetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected AlgorithmParameters engineGetParameters() {
        if (this.f5695b == null && this.f5696c != null) {
            try {
                this.f5695b = this.f5694a.mo4522c("PSS");
                this.f5695b.init(this.f5696c);
            } catch (Exception e) {
                throw new RuntimeException(e.toString());
            }
        }
        return this.f5695b;
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        C1075b c1075bM4328a = ECUtil.m4328a(privateKey);
        InterfaceC1003i c1081bf = this.appRandom != null ? new C1081bf(c1075bM4328a, this.appRandom) : c1075bM4328a;
        if (this.f5696c != null) {
            this.f5697d.mo1904a(true, (InterfaceC1003i) new C1079bd(c1081bf, this.f5696c.m4505a()));
        } else {
            this.f5697d.mo1904a(true, c1081bf);
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) {
        C1075b c1075bM4232a = ECUtils.m4232a(publicKey);
        this.f5697d.mo1904a(false, this.f5696c != null ? new C1079bd(c1075bM4232a, this.f5696c.m4505a()) : c1075bM4232a);
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
        this.f5696c = (SM2ParameterSpec) algorithmParameterSpec;
    }

    @Override // java.security.SignatureSpi
    protected byte[] engineSign() throws SignatureException {
        try {
            return this.f5697d.mo1907a();
        } catch (C1038j e) {
            throw new SignatureException("unable to create signature: " + e.getMessage());
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b) {
        this.f5697d.mo1903a(b);
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte[] bArr, int i, int i2) {
        this.f5697d.mo1905a(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) {
        return this.f5697d.mo1906a(bArr);
    }
}
