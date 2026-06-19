package org.bouncycastle.jcajce.provider.asymmetric.gost;

import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import org.bouncycastle.jcajce.provider.asymmetric.util.GOST3410Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p061f.C0624f;
import org.bouncycastle.p054a.p061f.InterfaceC0619a;
import org.bouncycastle.p054a.p082z.C0759a;
import org.bouncycastle.p054a.p082z.C0780u;
import org.bouncycastle.p083b.p097k.C1069au;
import org.bouncycastle.p103c.p104a.InterfaceC1192h;
import org.bouncycastle.p103c.p104a.InterfaceC1194j;
import org.bouncycastle.p103c.p106c.C1215l;
import org.bouncycastle.p103c.p106c.C1217n;
import org.bouncycastle.p103c.p106c.C1218o;

/* JADX INFO: loaded from: classes.dex */
public class BCGOST3410PublicKey implements InterfaceC1194j {

    /* JADX INFO: renamed from: a */
    private BigInteger f5838a;

    /* JADX INFO: renamed from: b */
    private transient InterfaceC1192h f5839b;

    BCGOST3410PublicKey(C0780u c0780u) {
        C0624f c0624fM1515a = C0624f.m1515a(c0780u.m1844a().m1784b());
        try {
            byte[] bArrC = ((C0581be) c0780u.m1845b()).mo1410c();
            byte[] bArr = new byte[bArrC.length];
            for (int i = 0; i != bArrC.length; i++) {
                bArr[i] = bArrC[(bArrC.length - 1) - i];
            }
            this.f5838a = new BigInteger(1, bArr);
            this.f5839b = C1215l.m2881a(c0624fM1515a);
        } catch (IOException e) {
            throw new IllegalArgumentException("invalid info structure in GOST3410 public key");
        }
    }

    BCGOST3410PublicKey(C1069au c1069au, C1215l c1215l) {
        this.f5838a = c1069au.m2590c();
        this.f5839b = c1215l;
    }

    BCGOST3410PublicKey(InterfaceC1194j interfaceC1194j) {
        this.f5838a = interfaceC1194j.mo2837b();
        this.f5839b = interfaceC1194j.mo2831a();
    }

    BCGOST3410PublicKey(C1218o c1218o) {
        this.f5838a = c1218o.m2889a();
        this.f5839b = new C1215l(new C1217n(c1218o.m2890b(), c1218o.m2891c(), c1218o.m2892d()));
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1191g
    /* JADX INFO: renamed from: a */
    public final InterfaceC1192h mo2831a() {
        return this.f5839b;
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1194j
    /* JADX INFO: renamed from: b */
    public final BigInteger mo2837b() {
        return this.f5838a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCGOST3410PublicKey)) {
            return false;
        }
        BCGOST3410PublicKey bCGOST3410PublicKey = (BCGOST3410PublicKey) obj;
        return this.f5838a.equals(bCGOST3410PublicKey.f5838a) && this.f5839b.equals(bCGOST3410PublicKey.f5839b);
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "GOST3410";
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return this.f5838a.hashCode() ^ this.f5839b.hashCode();
    }

    public String toString() {
        try {
            return GOSTUtil.m4285b("GOST3410", this.f5838a, ((C1069au) GOST3410Util.m4336a(this)).m2585b());
        } catch (InvalidKeyException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        byte[] byteArray = this.f5838a.toByteArray();
        byte[] bArr = byteArray[0] == 0 ? new byte[byteArray.length - 1] : new byte[byteArray.length];
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = byteArray[(byteArray.length - 1) - i];
        }
        try {
            return KeyUtil.m4340a(this.f5839b instanceof C1215l ? this.f5839b.mo2834c() != null ? new C0780u(new C0759a(InterfaceC0619a.f2204l, new C0624f(new C0653p(this.f5839b.mo2832a()), new C0653p(this.f5839b.mo2833b()), new C0653p(this.f5839b.mo2834c()))), new C0581be(bArr)) : new C0780u(new C0759a(InterfaceC0619a.f2204l, new C0624f(new C0653p(this.f5839b.mo2832a()), new C0653p(this.f5839b.mo2833b()))), new C0581be(bArr)) : new C0780u(new C0759a(InterfaceC0619a.f2204l), new C0581be(bArr)));
        } catch (IOException e) {
            return null;
        }
    }
}
