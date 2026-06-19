package org.bouncycastle.p083b.p089e;

import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p093i.C1026k;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p083b.p097k.C1080be;
import org.bouncycastle.p083b.p097k.C1081bf;
import org.bouncycastle.p083b.p097k.C1082bg;
import org.bouncycastle.p083b.p097k.C1083bh;
import org.bouncycastle.p142f.AbstractC1556g;

/* JADX INFO: renamed from: org.bouncycastle.b.e.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0937n extends C0945v {
    @Override // org.bouncycastle.p083b.p089e.C0945v, org.bouncycastle.p083b.InterfaceC0816ap
    /* JADX INFO: renamed from: a */
    public final void mo1915a(boolean z, InterfaceC1003i interfaceC1003i) {
        C1076ba c1076ba;
        C1083bh c1083bh = (C1083bh) (interfaceC1003i instanceof C1081bf ? ((C1081bf) interfaceC1003i).m2614b() : interfaceC1003i);
        byte[] bArrM2615a = null;
        if (c1083bh.m2618b() instanceof C1082bg) {
            c1076ba = (C1076ba) ((C1082bg) c1083bh.m2618b()).m2616b();
            bArrM2615a = ((C1082bg) c1083bh.m2618b()).m2615a();
        } else {
            c1076ba = (C1076ba) c1083bh.m2618b();
        }
        C1076ba c1076ba2 = new C1076ba(m2347a(c1076ba.m2603a(), c1083bh.m2617a(), bArrM2615a));
        if (bArrM2615a != null) {
            super.mo1915a(z, new C1083bh(new C1082bg(c1076ba2, bArrM2615a), c1083bh.m2617a()));
        } else {
            super.mo1915a(z, new C1083bh(c1076ba2, c1083bh.m2617a()));
        }
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m2347a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        for (int i = 0; i != 8; i++) {
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 != 8; i4++) {
                int iM4152c = AbstractC1556g.m4152c(bArr, i4 * 4);
                if ((bArr2[i] & (1 << i4)) != 0) {
                    i3 += iM4152c;
                } else {
                    i2 += iM4152c;
                }
            }
            byte[] bArr4 = new byte[8];
            AbstractC1556g.m4147b(i3, bArr4, 0);
            AbstractC1556g.m4147b(i2, bArr4, 4);
            C1026k c1026k = new C1026k(new C0944u());
            c1026k.mo1912a(true, new C1080be(new C1082bg(new C1076ba(bArr), bArr3), bArr4));
            c1026k.mo2122a(bArr, 0, bArr, 0);
            c1026k.mo2122a(bArr, 8, bArr, 8);
            c1026k.mo2122a(bArr, 16, bArr, 16);
            c1026k.mo2122a(bArr, 24, bArr, 24);
        }
        return bArr;
    }
}
