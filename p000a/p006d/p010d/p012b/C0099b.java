package p000a.p006d.p010d.p012b;

import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.InterfaceC0267h;
import p000a.p006d.p010d.p013c.AbstractC0108b;
import p000a.p006d.p025f.C0173a;
import p000a.p029g.InterfaceC0250j;
import p000a.p031i.C0284e;

/* JADX INFO: renamed from: a.d.d.b.b */
/* JADX INFO: compiled from: NetServerEnum2Response.java */
/* JADX INFO: loaded from: classes.dex */
public class C0099b extends AbstractC0108b {

    /* JADX INFO: renamed from: C */
    private static final InterfaceC1612b f458C = C1620c.m4563a((Class<?>) C0099b.class);

    /* JADX INFO: renamed from: D */
    private int f459D;

    /* JADX INFO: renamed from: E */
    private int f460E;

    /* JADX INFO: renamed from: F */
    private String f461F;

    /* JADX INFO: renamed from: a.d.d.b.b$a */
    /* JADX INFO: compiled from: NetServerEnum2Response.java */
    class a implements InterfaceC0250j {

        /* JADX INFO: renamed from: a */
        String f462a;

        /* JADX INFO: renamed from: b */
        int f463b;

        /* JADX INFO: renamed from: c */
        int f464c;

        /* JADX INFO: renamed from: d */
        int f465d;

        /* JADX INFO: renamed from: e */
        String f466e;

        a() {
        }

        @Override // p000a.p029g.InterfaceC0250j
        /* JADX INFO: renamed from: a */
        public final String mo233a() {
            return this.f462a;
        }

        @Override // p000a.p029g.InterfaceC0250j
        /* JADX INFO: renamed from: b */
        public final int mo234b() {
            return (this.f465d & Integer.MIN_VALUE) != 0 ? 2 : 4;
        }

        @Override // p000a.p029g.InterfaceC0250j
        /* JADX INFO: renamed from: e */
        public final int mo237e() {
            return 17;
        }

        @Override // p000a.p029g.InterfaceC0250j
        /* JADX INFO: renamed from: c */
        public final int mo235c() {
            return 0;
        }

        @Override // p000a.p029g.InterfaceC0250j
        /* JADX INFO: renamed from: f */
        public final long mo238f() {
            return 0L;
        }

        @Override // p000a.p029g.InterfaceC0250j
        /* JADX INFO: renamed from: g */
        public final long mo239g() {
            return 0L;
        }

        @Override // p000a.p029g.InterfaceC0250j
        /* JADX INFO: renamed from: h */
        public final long mo240h() {
            return 0L;
        }

        @Override // p000a.p029g.InterfaceC0250j
        /* JADX INFO: renamed from: i */
        public final long mo241i() {
            return 0L;
        }

        public final String toString() {
            return new String("ServerInfo1[name=" + this.f462a + ",versionMajor=" + this.f463b + ",versionMinor=" + this.f464c + ",type=0x" + C0284e.m947a(this.f465d, 8) + ",commentOrMasterBrowser=" + this.f466e + "]");
        }
    }

    public C0099b(InterfaceC0267h interfaceC0267h) {
        super(interfaceC0267h);
    }

    /* JADX INFO: renamed from: q */
    public final String m324q() {
        return this.f461F;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0108b
    /* JADX INFO: renamed from: j */
    protected final int mo323j(byte[] bArr, int i) {
        m398j(C0173a.m509a(bArr, i));
        int i2 = i + 2;
        this.f459D = C0173a.m509a(bArr, i2);
        int i3 = i2 + 2;
        m399k(C0173a.m509a(bArr, i3));
        int i4 = i3 + 2;
        this.f460E = C0173a.m509a(bArr, i4);
        return (i4 + 2) - i;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0108b
    /* JADX INFO: renamed from: a */
    protected final int mo322a(byte[] bArr, int i, int i2) {
        InterfaceC0250j[] interfaceC0250jArr = new a[m394aa()];
        a aVar = null;
        int i3 = i;
        for (int i4 = 0; i4 < m394aa(); i4++) {
            aVar = new a();
            interfaceC0250jArr[i4] = aVar;
            aVar.f462a = m348a(bArr, i3, 16, false);
            int i5 = i3 + 16;
            int i6 = i5 + 1;
            aVar.f463b = bArr[i5] & 255;
            int i7 = i6 + 1;
            aVar.f464c = bArr[i6] & 255;
            aVar.f465d = C0173a.m511b(bArr, i7);
            int i8 = i7 + 4;
            int iM511b = C0173a.m511b(bArr, i8);
            i3 = i8 + 4;
            aVar.f466e = m348a(bArr, ((iM511b & 65535) - this.f459D) + i, 48, false);
            if (f458C.mo4536b()) {
                f458C.mo4532a(aVar.toString());
            }
        }
        m393a(interfaceC0250jArr);
        this.f461F = aVar != null ? aVar.f462a : null;
        return i3 - i;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0108b, p000a.p006d.p010d.AbstractC0103c
    public String toString() {
        return new String("NetServerEnum2Response[" + super.toString() + ",status=" + m392Z() + ",converter=" + this.f459D + ",entriesReturned=" + m394aa() + ",totalAvailableEntries=" + this.f460E + ",lastName=" + this.f461F + "]");
    }
}
