package p000a.p026e;

import p000a.InterfaceC0267h;

/* JADX INFO: renamed from: a.e.d */
/* JADX INFO: compiled from: NameQueryResponse.java */
/* JADX INFO: loaded from: classes.dex */
final class C0186d extends AbstractC0189g {
    C0186d(InterfaceC0267h interfaceC0267h) {
        super(interfaceC0267h);
        this.f885r = new C0184b(interfaceC0267h);
    }

    @Override // p000a.p026e.AbstractC0189g
    /* JADX INFO: renamed from: a */
    final int mo532a(byte[] bArr) {
        return 0;
    }

    @Override // p000a.p026e.AbstractC0189g
    /* JADX INFO: renamed from: b */
    final int mo534b(byte[] bArr) {
        return m568d(bArr, 12);
    }

    @Override // p000a.p026e.AbstractC0189g
    /* JADX INFO: renamed from: a */
    final int mo533a(byte[] bArr, int i) {
        if (this.f872e != 0 || this.f871d != 0) {
            return 0;
        }
        boolean z = (bArr[i] & 128) == 128;
        int i2 = (bArr[i] & 96) >> 5;
        int iC = m566c(bArr, i + 2);
        if (iC != 0) {
            this.f869b[this.f868a] = new C0190h(this.f885r, iC, z, i2);
        } else {
            this.f869b[this.f868a] = null;
        }
        return 6;
    }

    @Override // p000a.p026e.AbstractC0189g
    public final String toString() {
        return new String("NameQueryResponse[" + super.toString() + ",addrEntry=" + this.f869b + "]");
    }
}
