package p000a.p006d.p010d.p012b;

import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.InterfaceC0267h;
import p000a.p006d.p010d.p013c.AbstractC0108b;
import p000a.p006d.p025f.C0173a;
import p000a.p029g.InterfaceC0250j;

/* JADX INFO: renamed from: a.d.d.b.d */
/* JADX INFO: compiled from: NetShareEnumResponse.java */
/* JADX INFO: loaded from: classes.dex */
public class C0101d extends AbstractC0108b {

    /* JADX INFO: renamed from: C */
    private static final InterfaceC1612b f468C = C1620c.m4563a((Class<?>) C0101d.class);

    /* JADX INFO: renamed from: D */
    private int f469D;

    /* JADX INFO: renamed from: E */
    private int f470E;

    public C0101d(InterfaceC0267h interfaceC0267h) {
        super(interfaceC0267h);
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0108b
    /* JADX INFO: renamed from: j */
    protected final int mo323j(byte[] bArr, int i) {
        m398j(C0173a.m509a(bArr, i));
        int i2 = i + 2;
        this.f469D = C0173a.m509a(bArr, i2);
        int i3 = i2 + 2;
        m399k(C0173a.m509a(bArr, i3));
        int i4 = i3 + 2;
        this.f470E = C0173a.m509a(bArr, i4);
        return (i4 + 2) - i;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0108b
    /* JADX INFO: renamed from: a */
    protected final int mo322a(byte[] bArr, int i, int i2) {
        m356b(false);
        InterfaceC0250j[] interfaceC0250jArr = new C0102e[m394aa()];
        int i3 = i;
        for (int i4 = 0; i4 < m394aa(); i4++) {
            C0102e c0102e = new C0102e();
            interfaceC0250jArr[i4] = c0102e;
            c0102e.f471b = m348a(bArr, i3, 13, false);
            int i5 = i3 + 14;
            c0102e.f472c = C0173a.m509a(bArr, i5);
            int i6 = i5 + 2;
            int iM511b = C0173a.m511b(bArr, i6);
            i3 = i6 + 4;
            c0102e.f473d = m348a(bArr, ((iM511b & 65535) - this.f469D) + i, 128, false);
            if (f468C.mo4536b()) {
                f468C.mo4532a(c0102e.toString());
            }
        }
        m393a(interfaceC0250jArr);
        return i3 - i;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0108b, p000a.p006d.p010d.AbstractC0103c
    public String toString() {
        return new String("NetShareEnumResponse[" + super.toString() + ",status=" + m392Z() + ",converter=" + this.f469D + ",entriesReturned=" + m394aa() + ",totalAvailableEntries=" + this.f470E + "]");
    }
}
