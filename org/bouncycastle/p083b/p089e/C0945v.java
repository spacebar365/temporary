package org.bouncycastle.p083b.p089e;

import org.bouncycastle.p083b.InterfaceC0816ap;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p092h.C0993f;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p083b.p097k.C1080be;
import org.bouncycastle.p083b.p097k.C1081bf;
import org.bouncycastle.p083b.p097k.C1082bg;
import org.bouncycastle.p083b.p097k.C1083bh;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.e.v */
/* JADX INFO: loaded from: classes.dex */
public class C0945v implements InterfaceC0816ap {

    /* JADX INFO: renamed from: a */
    private C0944u f3952a = new C0944u();

    /* JADX INFO: renamed from: b */
    private C0993f f3953b = new C0993f();

    @Override // org.bouncycastle.p083b.InterfaceC0816ap
    /* JADX INFO: renamed from: a */
    public final String mo1914a() {
        return "GOST28147Wrap";
    }

    @Override // org.bouncycastle.p083b.InterfaceC0816ap
    /* JADX INFO: renamed from: a */
    public void mo1915a(boolean z, InterfaceC1003i interfaceC1003i) {
        C1083bh c1083bh = (C1083bh) (interfaceC1003i instanceof C1081bf ? ((C1081bf) interfaceC1003i).m2614b() : interfaceC1003i);
        this.f3952a.mo2124a(z, c1083bh.m2618b());
        this.f3953b.mo2449a(new C1080be(c1083bh.m2618b() instanceof C1082bg ? (C1076ba) ((C1082bg) c1083bh.m2618b()).m2616b() : (C1076ba) c1083bh.m2618b(), c1083bh.m2617a()));
    }

    @Override // org.bouncycastle.p083b.InterfaceC0816ap
    /* JADX INFO: renamed from: a */
    public final byte[] mo1916a(byte[] bArr, int i) {
        this.f3953b.mo2450a(bArr, 0, i);
        byte[] bArr2 = new byte[this.f3953b.mo2451b() + i];
        this.f3952a.mo2122a(bArr, 0, bArr2, 0);
        this.f3952a.mo2122a(bArr, 8, bArr2, 8);
        this.f3952a.mo2122a(bArr, 16, bArr2, 16);
        this.f3952a.mo2122a(bArr, 24, bArr2, 24);
        this.f3953b.mo2446a(bArr2, i);
        return bArr2;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0816ap
    /* JADX INFO: renamed from: b */
    public final byte[] mo1917b(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i - this.f3953b.mo2451b()];
        this.f3952a.mo2122a(bArr, 0, bArr2, 0);
        this.f3952a.mo2122a(bArr, 8, bArr2, 8);
        this.f3952a.mo2122a(bArr, 16, bArr2, 16);
        this.f3952a.mo2122a(bArr, 24, bArr2, 24);
        byte[] bArr3 = new byte[this.f3953b.mo2451b()];
        this.f3953b.mo2450a(bArr2, 0, bArr2.length);
        this.f3953b.mo2446a(bArr3, 0);
        byte[] bArr4 = new byte[this.f3953b.mo2451b()];
        System.arraycopy(bArr, (i + 0) - 4, bArr4, 0, this.f3953b.mo2451b());
        if (C1535a.m4085b(bArr3, bArr4)) {
            return bArr2;
        }
        throw new IllegalStateException("mac mismatch");
    }
}
