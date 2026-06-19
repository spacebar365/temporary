package p000a.p006d.p008b;

import p000a.p006d.C0175g;
import p000a.p006d.p025f.C0173a;
import p000a.p029g.C0262v;

/* JADX INFO: renamed from: a.d.b.b */
/* JADX INFO: compiled from: SecurityDescriptor.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0053b implements InterfaceC0054c {

    /* JADX INFO: renamed from: a */
    private int f258a;

    /* JADX INFO: renamed from: b */
    private C0052a[] f259b;

    /* JADX INFO: renamed from: c */
    private C0262v f260c;

    /* JADX INFO: renamed from: d */
    private C0262v f261d;

    @Override // p000a.InterfaceC0286j
    /* JADX INFO: renamed from: a */
    public final int mo201a(byte[] bArr, int i, int i2) throws C0175g {
        int i3 = i + 1 + 1;
        this.f258a = C0173a.m509a(bArr, i3);
        int i4 = i3 + 2;
        int iM511b = C0173a.m511b(bArr, i4);
        int i5 = i4 + 4;
        int iM511b2 = C0173a.m511b(bArr, i5);
        int i6 = i5 + 4;
        C0173a.m511b(bArr, i6);
        int iM511b3 = C0173a.m511b(bArr, i6 + 4);
        if (iM511b > 0) {
            this.f260c = new C0262v(bArr, i + iM511b);
        }
        if (iM511b2 > 0) {
            this.f261d = new C0262v(bArr, i + iM511b2);
        }
        int iMo201a = i + iM511b3;
        if (iM511b3 > 0) {
            int i7 = iMo201a + 1 + 1;
            C0173a.m509a(bArr, i7);
            int i8 = i7 + 2;
            int iM511b4 = C0173a.m511b(bArr, i8);
            iMo201a = i8 + 4;
            if (iM511b4 > 4096) {
                throw new C0175g("Invalid SecurityDescriptor");
            }
            this.f259b = new C0052a[iM511b4];
            for (int i9 = 0; i9 < iM511b4; i9++) {
                this.f259b[i9] = new C0052a();
                iMo201a += this.f259b[i9].mo201a(bArr, iMo201a, i2 - iMo201a);
            }
        } else {
            this.f259b = null;
        }
        return iMo201a - i;
    }

    public final String toString() {
        String str = "SecurityDescriptor:\n";
        if (this.f259b == null) {
            return "SecurityDescriptor:\nNULL";
        }
        for (int i = 0; i < this.f259b.length; i++) {
            str = str + this.f259b[i].toString() + "\n";
        }
        return str;
    }
}
