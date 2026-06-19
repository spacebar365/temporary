package org.bouncycastle.jcajce.provider.asymmetric.gost;

import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.util.Enumeration;
import org.bouncycastle.jcajce.provider.asymmetric.util.GOST3410Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.InterfaceC0618f;
import org.bouncycastle.p054a.p061f.C0624f;
import org.bouncycastle.p054a.p061f.InterfaceC0619a;
import org.bouncycastle.p054a.p074s.C0676p;
import org.bouncycastle.p054a.p082z.C0759a;
import org.bouncycastle.p083b.p097k.C1068at;
import org.bouncycastle.p103c.p104a.InterfaceC1192h;
import org.bouncycastle.p103c.p104a.InterfaceC1193i;
import org.bouncycastle.p103c.p104a.InterfaceC1198n;
import org.bouncycastle.p103c.p106c.C1215l;
import org.bouncycastle.p103c.p106c.C1216m;
import org.bouncycastle.p103c.p106c.C1217n;

/* JADX INFO: loaded from: classes.dex */
public class BCGOST3410PrivateKey implements InterfaceC1193i, InterfaceC1198n {

    /* JADX INFO: renamed from: a */
    private BigInteger f5835a;

    /* JADX INFO: renamed from: b */
    private transient InterfaceC1192h f5836b;

    /* JADX INFO: renamed from: c */
    private transient InterfaceC1198n f5837c = new PKCS12BagAttributeCarrierImpl();

    protected BCGOST3410PrivateKey() {
    }

    BCGOST3410PrivateKey(C0676p c0676p) {
        C0624f c0624fM1515a = C0624f.m1515a(c0676p.m1658b().m1784b());
        InterfaceC0618f interfaceC0618fM1659c = c0676p.m1659c();
        if (interfaceC0618fM1659c instanceof C0640m) {
            this.f5835a = C0640m.m1561a(interfaceC0618fM1659c).m1565c();
        } else {
            byte[] bArrMo1410c = AbstractC0655q.m1596a(c0676p.m1659c()).mo1410c();
            byte[] bArr = new byte[bArrMo1410c.length];
            for (int i = 0; i != bArrMo1410c.length; i++) {
                bArr[i] = bArrMo1410c[(bArrMo1410c.length - 1) - i];
            }
            this.f5835a = new BigInteger(1, bArr);
        }
        this.f5836b = C1215l.m2881a(c0624fM1515a);
    }

    BCGOST3410PrivateKey(C1068at c1068at, C1215l c1215l) {
        this.f5835a = c1068at.m2589c();
        this.f5836b = c1215l;
        if (c1215l == null) {
            throw new IllegalArgumentException("spec is null");
        }
    }

    BCGOST3410PrivateKey(InterfaceC1193i interfaceC1193i) {
        this.f5835a = interfaceC1193i.mo2836c();
        this.f5836b = interfaceC1193i.mo2831a();
    }

    BCGOST3410PrivateKey(C1216m c1216m) {
        this.f5835a = c1216m.m2882a();
        this.f5836b = new C1215l(new C1217n(c1216m.m2883b(), c1216m.m2884c(), c1216m.m2885d()));
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1198n
    /* JADX INFO: renamed from: a */
    public final InterfaceC0618f mo2845a(C0653p c0653p) {
        return this.f5837c.mo2845a(c0653p);
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1191g
    /* JADX INFO: renamed from: a */
    public final InterfaceC1192h mo2831a() {
        return this.f5836b;
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1198n
    /* JADX INFO: renamed from: a */
    public final void mo2846a(C0653p c0653p, InterfaceC0618f interfaceC0618f) {
        this.f5837c.mo2846a(c0653p, interfaceC0618f);
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1198n
    /* JADX INFO: renamed from: b */
    public final Enumeration mo2847b() {
        return this.f5837c.mo2847b();
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1193i
    /* JADX INFO: renamed from: c */
    public final BigInteger mo2836c() {
        return this.f5835a;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "GOST3410";
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public String toString() {
        try {
            return GOSTUtil.m4283a("GOST3410", this.f5835a, ((C1068at) GOST3410Util.m4335a(this)).m2585b());
        } catch (InvalidKeyException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        byte[] byteArray = this.f5835a.toByteArray();
        byte[] bArr = byteArray[0] == 0 ? new byte[byteArray.length - 1] : new byte[byteArray.length];
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = byteArray[(byteArray.length - 1) - i];
        }
        try {
            return (this.f5836b instanceof C1215l ? new C0676p(new C0759a(InterfaceC0619a.f2204l, new C0624f(new C0653p(this.f5836b.mo2832a()), new C0653p(this.f5836b.mo2833b()))), new C0581be(bArr)) : new C0676p(new C0759a(InterfaceC0619a.f2204l), new C0581be(bArr))).m1577a("DER");
        } catch (IOException e) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC1193i)) {
            return false;
        }
        InterfaceC1193i interfaceC1193i = (InterfaceC1193i) obj;
        if (!this.f5835a.equals(interfaceC1193i.mo2836c()) || !this.f5836b.mo2835d().equals(interfaceC1193i.mo2831a().mo2835d()) || !this.f5836b.mo2833b().equals(interfaceC1193i.mo2831a().mo2833b())) {
            return false;
        }
        String strMo2834c = this.f5836b.mo2834c();
        String strMo2834c2 = interfaceC1193i.mo2831a().mo2834c();
        return strMo2834c == strMo2834c2 ? true : strMo2834c == null ? false : strMo2834c.equals(strMo2834c2);
    }

    public int hashCode() {
        return this.f5835a.hashCode() ^ this.f5836b.hashCode();
    }
}
