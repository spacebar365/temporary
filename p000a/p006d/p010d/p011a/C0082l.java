package p000a.p006d.p010d.p011a;

import java.util.Date;
import p000a.InterfaceC0267h;
import p000a.p006d.p010d.AbstractC0068a;
import p000a.p006d.p025f.C0173a;
import p000a.p031i.C0284e;

/* JADX INFO: renamed from: a.d.d.a.l */
/* JADX INFO: compiled from: SmbComOpenAndX.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0082l extends AbstractC0068a {

    /* JADX INFO: renamed from: n */
    int f376n;

    /* JADX INFO: renamed from: o */
    int f377o;

    /* JADX INFO: renamed from: p */
    int f378p;

    /* JADX INFO: renamed from: q */
    int f379q;

    /* JADX INFO: renamed from: r */
    int f380r;

    /* JADX INFO: renamed from: s */
    int f381s;

    /* JADX INFO: renamed from: t */
    int f382t;

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0082l(p000a.InterfaceC0267h r5, java.lang.String r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            r3 = 2
            r2 = 16
            r0 = 45
            r4.<init>(r5, r0, r6)
            r0 = 128(0x80, float:1.8E-43)
            r4.f379q = r0
            r0 = r7 & 3
            r4.f377o = r0
            int r0 = r4.f377o
            r1 = 3
            if (r0 != r1) goto L17
            r4.f377o = r3
        L17:
            r0 = r8 & 1
            if (r0 == 0) goto L3e
            r0 = r8 & 2
            if (r0 == 0) goto L3e
            int r0 = r4.f377o
            r0 = r0 | 64
            r4.f377o = r0
        L25:
            int r0 = r4.f377o
            r0 = r0 & (-2)
            r4.f377o = r0
            r0 = 22
            r4.f378p = r0
            r0 = r9 & 64
            r1 = 64
            if (r0 != r1) goto L60
            r0 = r9 & 16
            if (r0 != r2) goto L5d
            r0 = 18
            r4.f381s = r0
        L3d:
            return
        L3e:
            if (r8 == 0) goto L56
            r0 = r8 & 2
            if (r0 != 0) goto L4b
            int r0 = r4.f377o
            r0 = r0 | 32
            r4.f377o = r0
            goto L25
        L4b:
            r0 = r8 & 1
            if (r0 != 0) goto L56
            int r0 = r4.f377o
            r0 = r0 | 48
            r4.f377o = r0
            goto L25
        L56:
            int r0 = r4.f377o
            r0 = r0 | 16
            r4.f377o = r0
            goto L25
        L5d:
            r4.f381s = r3
            goto L3d
        L60:
            r0 = r9 & 16
            if (r0 != r2) goto L72
            r0 = r9 & 32
            r1 = 32
            if (r0 != r1) goto L6d
            r4.f381s = r2
            goto L3d
        L6d:
            r0 = 17
            r4.f381s = r0
            goto L3d
        L72:
            r0 = 1
            r4.f381s = r0
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006d.p010d.p011a.C0082l.<init>(a.h, java.lang.String, int, int, int):void");
    }

    @Override // p000a.p006d.p010d.AbstractC0068a
    /* JADX INFO: renamed from: a */
    protected final int mo248a(InterfaceC0267h interfaceC0267h, byte b) {
        if (b == 46) {
            return interfaceC0267h.mo32a("OpenAndX.ReadAndX");
        }
        return 0;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: f */
    protected final int mo253f(byte[] bArr, int i) {
        C0173a.m510a(this.f376n, bArr, i);
        int i2 = i + 2;
        C0173a.m510a(this.f377o, bArr, i2);
        int i3 = i2 + 2;
        C0173a.m510a(this.f378p, bArr, i3);
        int i4 = i3 + 2;
        C0173a.m510a(this.f379q, bArr, i4);
        int i5 = i4 + 2;
        this.f380r = 0;
        C0173a.m512b(this.f380r, bArr, i5);
        int i6 = i5 + 4;
        C0173a.m510a(this.f381s, bArr, i6);
        int i7 = i6 + 2;
        C0173a.m512b(this.f382t, bArr, i7);
        int i8 = i7 + 4;
        int i9 = 0;
        while (i9 < 8) {
            bArr[i8] = 0;
            i9++;
            i8++;
        }
        return i8 - i;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: g */
    protected final int mo254g(byte[] bArr, int i) {
        int i2;
        if (m327C()) {
            i2 = i + 1;
            bArr[i] = 0;
        } else {
            i2 = i;
        }
        return (i2 + m346a(this.f493l, bArr, i2)) - i;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: h */
    protected final int mo255h(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: i */
    protected final int mo256i(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p010d.AbstractC0068a, p000a.p006d.p010d.AbstractC0103c
    public final String toString() {
        return new String("SmbComOpenAndX[" + super.toString() + ",flags=0x" + C0284e.m947a(this.f376n, 2) + ",desiredAccess=0x" + C0284e.m947a(this.f377o, 4) + ",searchAttributes=0x" + C0284e.m947a(this.f378p, 4) + ",fileAttributes=0x" + C0284e.m947a(this.f379q, 4) + ",creationTime=" + new Date(this.f380r) + ",openFunction=0x" + C0284e.m947a(this.f381s, 2) + ",allocationSize=" + this.f382t + ",fileName=" + this.f493l + "]");
    }
}
