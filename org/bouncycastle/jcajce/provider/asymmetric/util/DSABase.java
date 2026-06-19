package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.math.BigInteger;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;
import org.bouncycastle.p054a.p082z.InterfaceC0760aa;
import org.bouncycastle.p083b.InterfaceC1142n;
import org.bouncycastle.p083b.InterfaceC1175r;
import org.bouncycastle.p083b.p101n.InterfaceC1143a;

/* JADX INFO: loaded from: classes.dex */
public abstract class DSABase extends SignatureSpi implements InterfaceC0674n, InterfaceC0760aa {

    /* JADX INFO: renamed from: bO */
    protected InterfaceC1175r f5915bO;

    /* JADX INFO: renamed from: bP */
    protected InterfaceC1142n f5916bP;

    /* JADX INFO: renamed from: bQ */
    protected InterfaceC1143a f5917bQ;

    protected DSABase(InterfaceC1175r interfaceC1175r, InterfaceC1142n interfaceC1142n, InterfaceC1143a interfaceC1143a) {
        this.f5915bO = interfaceC1175r;
        this.f5916bP = interfaceC1142n;
        this.f5917bQ = interfaceC1143a;
    }

    @Override // java.security.SignatureSpi
    protected Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected byte[] engineSign() throws SignatureException {
        byte[] bArr = new byte[this.f5915bO.mo1930b()];
        this.f5915bO.mo1926a(bArr, 0);
        try {
            BigInteger[] bigIntegerArrA = this.f5916bP.mo2717a(bArr);
            return this.f5917bQ.mo2747a(this.f5916bP.mo2746a(), bigIntegerArrA[0], bigIntegerArrA[1]);
        } catch (Exception e) {
            throw new SignatureException(e.toString());
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b) {
        this.f5915bO.mo1928a(b);
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte[] bArr, int i, int i2) {
        this.f5915bO.mo1929a(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) throws SignatureException {
        byte[] bArr2 = new byte[this.f5915bO.mo1930b()];
        this.f5915bO.mo1926a(bArr2, 0);
        try {
            BigInteger[] bigIntegerArrMo2748a = this.f5917bQ.mo2748a(this.f5916bP.mo2746a(), bArr);
            return this.f5916bP.mo2716a(bArr2, bigIntegerArrMo2748a[0], bigIntegerArrMo2748a[1]);
        } catch (Exception e) {
            throw new SignatureException("error decoding signature bytes.");
        }
    }
}
