package p000a.p006d.p016e.p017a;

import java.util.LinkedList;
import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.InterfaceC0267h;
import p000a.p006d.C0175g;
import p000a.p006d.InterfaceC0055c;
import p000a.p006d.InterfaceC0177i;
import p000a.p006d.p016e.AbstractC0146d;
import p000a.p006d.p016e.InterfaceC0127a;
import p000a.p006d.p025f.C0173a;
import p000a.p031i.C0284e;

/* JADX INFO: renamed from: a.d.e.a.f */
/* JADX INFO: compiled from: Smb2CreateResponse.java */
/* JADX INFO: loaded from: classes.dex */
public class C0133f extends AbstractC0146d implements InterfaceC0177i {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC1612b f630a = C1620c.m4563a((Class<?>) C0133f.class);

    /* JADX INFO: renamed from: b */
    private byte f631b;

    /* JADX INFO: renamed from: c */
    private byte f632c;

    /* JADX INFO: renamed from: d */
    private int f633d;

    /* JADX INFO: renamed from: e */
    private long f634e;

    /* JADX INFO: renamed from: f */
    private long f635f;

    /* JADX INFO: renamed from: g */
    private long f636g;

    /* JADX INFO: renamed from: h */
    private long f637h;

    /* JADX INFO: renamed from: i */
    private long f638i;

    /* JADX INFO: renamed from: j */
    private long f639j;

    /* JADX INFO: renamed from: k */
    private int f640k;

    /* JADX INFO: renamed from: l */
    private byte[] f641l;

    /* JADX INFO: renamed from: m */
    private InterfaceC0129b[] f642m;

    /* JADX INFO: renamed from: n */
    private final String f643n;

    public C0133f(InterfaceC0267h interfaceC0267h, String str) {
        super(interfaceC0267h);
        this.f641l = new byte[16];
        this.f643n = str;
    }

    @Override // p000a.p006d.p016e.AbstractC0146d, p000a.p006d.InterfaceC0067d
    /* JADX INFO: renamed from: b */
    public final void mo243b(InterfaceC0055c interfaceC0055c) {
        if (mo328D() && (interfaceC0055c instanceof InterfaceC0127a)) {
            ((InterfaceC0127a) interfaceC0055c).mo408a(this.f641l);
        }
        super.mo243b(interfaceC0055c);
    }

    @Override // p000a.p006d.InterfaceC0177i
    /* JADX INFO: renamed from: e */
    public final long mo231e() {
        return this.f635f;
    }

    @Override // p000a.p006d.InterfaceC0177i
    /* JADX INFO: renamed from: d */
    public final long mo230d() {
        return this.f636g;
    }

    /* JADX INFO: renamed from: g */
    public final long m420g() {
        return this.f639j;
    }

    /* JADX INFO: renamed from: h */
    public final byte[] m421h() {
        return this.f641l;
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: d */
    protected final int mo411d(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: e */
    protected final int mo412e(byte[] bArr, int i) throws C0175g {
        int iM511b;
        if (C0173a.m509a(bArr, i) != 89) {
            throw new C0175g("Structure size is not 89");
        }
        this.f631b = bArr[i + 2];
        this.f632c = bArr[i + 3];
        int i2 = i + 4;
        this.f633d = C0173a.m511b(bArr, i2);
        int i3 = i2 + 4;
        this.f634e = C0173a.m515d(bArr, i3);
        int i4 = i3 + 8;
        this.f635f = C0173a.m515d(bArr, i4);
        int i5 = i4 + 8;
        this.f636g = C0173a.m515d(bArr, i5);
        int i6 = i5 + 8;
        this.f637h = C0173a.m515d(bArr, i6);
        int i7 = i6 + 8;
        this.f638i = C0173a.m513c(bArr, i7);
        int i8 = i7 + 8;
        this.f639j = C0173a.m513c(bArr, i8);
        int i9 = i8 + 8;
        this.f640k = C0173a.m511b(bArr, i9);
        int i10 = i9 + 4 + 4;
        System.arraycopy(bArr, i10, this.f641l, 0, 16);
        int i11 = i10 + 16;
        int iM511b2 = C0173a.m511b(bArr, i11);
        int i12 = i11 + 4;
        int iM511b3 = C0173a.m511b(bArr, i12);
        int iMax = i12 + 4;
        if (iM511b2 > 0 && iM511b3 > 0) {
            LinkedList linkedList = new LinkedList();
            int iM = m432M() + iM511b2;
            do {
                iM511b = C0173a.m511b(bArr, iM);
                int i13 = iM + 4;
                int iM509a = C0173a.m509a(bArr, i13);
                int iM509a2 = C0173a.m509a(bArr, i13 + 2);
                int i14 = i13 + 4;
                int iM509a3 = C0173a.m509a(bArr, i14 + 2);
                int i15 = i14 + 4;
                int iM511b4 = C0173a.m511b(bArr, i15);
                byte[] bArr2 = new byte[iM509a2];
                System.arraycopy(bArr, iM + iM509a, bArr2, 0, bArr2.length);
                int iMax2 = Math.max(Math.max(i15 + 4, iM509a + iM + iM509a2), iM + iM509a3 + iM511b4);
                if (iM511b > 0) {
                    iM += iM511b;
                }
                iMax = Math.max(iMax, iMax2);
            } while (iM511b > 0);
            this.f642m = (InterfaceC0129b[]) linkedList.toArray(new InterfaceC0129b[0]);
        }
        if (f630a.mo4539c()) {
            f630a.mo4534b("Opened " + this.f643n + ": " + C0284e.m948a(this.f641l));
        }
        return iMax - i;
    }

    @Override // p000a.p006d.InterfaceC0177i
    /* JADX INFO: renamed from: b_ */
    public final long mo228b_() {
        return this.f634e;
    }

    @Override // p000a.p006d.InterfaceC0177i
    /* JADX INFO: renamed from: c_ */
    public final long mo229c_() {
        return this.f639j;
    }

    @Override // p000a.p006d.InterfaceC0177i
    /* JADX INFO: renamed from: b */
    public final int mo227b() {
        return this.f640k;
    }
}
