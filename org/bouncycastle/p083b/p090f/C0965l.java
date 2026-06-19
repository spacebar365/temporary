package org.bouncycastle.p083b.p090f;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.p083b.C0818b;
import org.bouncycastle.p083b.C1124l;
import org.bouncycastle.p083b.C1181x;
import org.bouncycastle.p083b.InterfaceC0850c;
import org.bouncycastle.p083b.p097k.C1049aa;
import org.bouncycastle.p083b.p097k.C1052ad;
import org.bouncycastle.p083b.p097k.C1053ae;
import org.bouncycastle.p083b.p097k.C1122y;
import org.bouncycastle.p107d.p108a.AbstractC1364aa;
import org.bouncycastle.p107d.p108a.C1392m;
import org.bouncycastle.p107d.p108a.InterfaceC1376c;
import org.bouncycastle.p142f.C1544b;

/* JADX INFO: renamed from: org.bouncycastle.b.f.l */
/* JADX INFO: loaded from: classes.dex */
public class C0965l implements InterfaceC0850c, InterfaceC1376c {

    /* JADX INFO: renamed from: a */
    C1122y f4022a;

    /* JADX INFO: renamed from: b */
    SecureRandom f4023b;

    @Override // org.bouncycastle.p083b.InterfaceC0850c
    /* JADX INFO: renamed from: a */
    public final void mo2109a(C1181x c1181x) {
        C1049aa c1049aa = (C1049aa) c1181x;
        this.f4023b = c1049aa.m2824a();
        this.f4022a = c1049aa.m2562c();
        if (this.f4023b == null) {
            this.f4023b = C1124l.m2709a();
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC0850c
    /* JADX INFO: renamed from: a */
    public C0818b mo2108a() {
        BigInteger bigIntegerM2701c = this.f4022a.m2701c();
        int iBitLength = bigIntegerM2701c.bitLength();
        int i = iBitLength >>> 2;
        while (true) {
            BigInteger bigIntegerM4114a = C1544b.m4114a(iBitLength, this.f4023b);
            if (bigIntegerM4114a.compareTo(f4996e) >= 0 && bigIntegerM4114a.compareTo(bigIntegerM2701c) < 0 && AbstractC1364aa.m3257a(bigIntegerM4114a) >= i) {
                return new C0818b(new C1053ae(new C1392m().mo2903a(this.f4022a.m2700b(), bigIntegerM4114a), this.f4022a), new C1052ad(bigIntegerM4114a, this.f4022a));
            }
        }
    }
}
