package p000a.p006d.p016e.p017a;

import java.nio.charset.StandardCharsets;
import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.InterfaceC0016c;
import p000a.InterfaceC0267h;
import p000a.p006d.InterfaceC0172f;
import p000a.p006d.p016e.AbstractC0141c;
import p000a.p006d.p016e.AbstractC0146d;
import p000a.p006d.p025f.C0173a;
import p000a.p031i.C0284e;

/* JADX INFO: renamed from: a.d.e.a.e */
/* JADX INFO: compiled from: Smb2CreateRequest.java */
/* JADX INFO: loaded from: classes.dex */
public class C0132e extends AbstractC0141c<C0133f> implements InterfaceC0172f {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC1612b f614a = C1620c.m4563a((Class<?>) C0132e.class);

    /* JADX INFO: renamed from: b */
    private byte f615b;

    /* JADX INFO: renamed from: c */
    private byte f616c;

    /* JADX INFO: renamed from: d */
    private int f617d;

    /* JADX INFO: renamed from: e */
    private long f618e;

    /* JADX INFO: renamed from: f */
    private int f619f;

    /* JADX INFO: renamed from: g */
    private int f620g;

    /* JADX INFO: renamed from: h */
    private int f621h;

    /* JADX INFO: renamed from: i */
    private int f622i;

    /* JADX INFO: renamed from: j */
    private int f623j;

    /* JADX INFO: renamed from: k */
    private String f624k;

    /* JADX INFO: renamed from: l */
    private InterfaceC0128a[] f625l;

    /* JADX INFO: renamed from: m */
    private String f626m;

    /* JADX INFO: renamed from: n */
    private String f627n;

    /* JADX INFO: renamed from: o */
    private String f628o;

    /* JADX INFO: renamed from: p */
    private boolean f629p;

    public C0132e(InterfaceC0267h interfaceC0267h, String str) {
        super(interfaceC0267h, 5);
        this.f616c = (byte) 0;
        this.f617d = 2;
        this.f619f = 1179785;
        this.f621h = 3;
        this.f622i = 1;
        this.f623j = 0;
        mo353a(str);
    }

    @Override // p000a.p006d.InterfaceC0172f
    /* JADX INFO: renamed from: l */
    public final String mo368l() {
        return "\\" + this.f624k;
    }

    @Override // p000a.p006d.InterfaceC0172f
    /* JADX INFO: renamed from: o */
    public final String mo370o() {
        return this.f626m;
    }

    @Override // p000a.p006d.InterfaceC0172f
    /* JADX INFO: renamed from: o_ */
    public final String mo371o_() {
        return this.f628o;
    }

    @Override // p000a.p006d.InterfaceC0172f
    /* JADX INFO: renamed from: n */
    public final String mo369n() {
        return this.f627n;
    }

    @Override // p000a.p006d.InterfaceC0172f
    /* JADX INFO: renamed from: a */
    public final void mo354a(String str, String str2, String str3) {
        this.f627n = str;
        this.f628o = str2;
        this.f626m = str3;
    }

    @Override // p000a.p006d.InterfaceC0172f
    /* JADX INFO: renamed from: a */
    public final void mo353a(String str) {
        if (str.length() > 0 && str.charAt(0) == '\\') {
            str = str.substring(1);
        }
        if (str.length() > 1 && str.charAt(str.length() - 1) == '\\') {
            str = str.substring(0, str.length() - 1);
        }
        this.f624k = str;
    }

    @Override // p000a.p006d.InterfaceC0172f
    /* JADX INFO: renamed from: p */
    public final void mo372p() {
        m445h(268435456);
        this.f629p = true;
    }

    /* JADX INFO: renamed from: k */
    public final void m416k(int i) {
        this.f619f = i;
    }

    /* JADX INFO: renamed from: k */
    public final void m415k() {
        this.f620g = 128;
    }

    /* JADX INFO: renamed from: l */
    public final void m417l(int i) {
        this.f621h = i;
    }

    /* JADX INFO: renamed from: m */
    public final void m418m(int i) {
        this.f622i = i;
    }

    /* JADX INFO: renamed from: n */
    public final void m419n(int i) {
        this.f623j = i;
    }

    @Override // p000a.p006d.InterfaceC0055c
    /* JADX INFO: renamed from: l_ */
    public final int mo225l_() {
        int length = this.f624k.length() * 2;
        if (length == 0) {
            length++;
        }
        int i = m424i(length) + 120;
        if (this.f625l != null) {
            for (InterfaceC0128a interfaceC0128a : this.f625l) {
                i += m424i(interfaceC0128a.mo198a());
            }
        }
        return m424i(i);
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: d */
    protected final int mo411d(byte[] bArr, int i) {
        int length;
        if (f614a.mo4539c()) {
            f614a.mo4534b("Opening " + this.f624k);
            f614a.mo4534b("Flags are " + C0284e.m947a(m427C(), 4));
        }
        C0173a.m510a(57L, bArr, i);
        bArr[i + 2] = this.f615b;
        bArr[i + 3] = this.f616c;
        int i2 = i + 4;
        C0173a.m512b(this.f617d, bArr, i2);
        int i3 = i2 + 4;
        C0173a.m514c(this.f618e, bArr, i3);
        int i4 = i3 + 8 + 8;
        C0173a.m512b(this.f619f, bArr, i4);
        int i5 = i4 + 4;
        C0173a.m512b(this.f620g, bArr, i5);
        int i6 = i5 + 4;
        C0173a.m512b(this.f621h, bArr, i6);
        int i7 = i6 + 4;
        C0173a.m512b(this.f622i, bArr, i7);
        int i8 = i7 + 4;
        C0173a.m512b(this.f623j, bArr, i8);
        int i9 = i8 + 4;
        byte[] bytes = this.f624k.getBytes(StandardCharsets.UTF_16LE);
        C0173a.m510a(bytes.length, bArr, i9 + 2);
        int i10 = i9 + 4;
        int i11 = i10 + 4;
        int i12 = i11 + 4;
        C0173a.m510a(i12 - m432M(), bArr, i9);
        System.arraycopy(bytes, 0, bArr, i12, bytes.length);
        if (bytes.length == 0) {
            length = i12 + 1;
        } else {
            length = bytes.length + i12;
        }
        int iJ = m446j(length) + length;
        if (this.f625l == null || this.f625l.length == 0) {
            C0173a.m512b(0L, bArr, i10);
        } else {
            C0173a.m512b(iJ - m432M(), bArr, i10);
        }
        int i13 = 0;
        if (this.f625l != null) {
            int i14 = -1;
            InterfaceC0128a[] interfaceC0128aArr = this.f625l;
            int length2 = interfaceC0128aArr.length;
            int i15 = 0;
            while (i15 < length2) {
                InterfaceC0128a interfaceC0128a = interfaceC0128aArr[i15];
                C0173a.m512b(0L, bArr, iJ);
                if (i14 > 0) {
                    C0173a.m512b(iJ - iJ, bArr, i14);
                }
                int i16 = iJ + 4;
                byte[] bArrM409b = interfaceC0128a.m409b();
                C0173a.m510a(bArrM409b.length, bArr, i16 + 2);
                int i17 = i16 + 4;
                int i18 = i17 + 2;
                int i19 = i17 + 4;
                int i20 = i19 + 4;
                C0173a.m510a(i20 - iJ, bArr, i16);
                System.arraycopy(bArrM409b, 0, bArr, i20, bArrM409b.length);
                int length3 = bArrM409b.length + i20;
                int iJ2 = length3 + m446j(length3);
                C0173a.m510a(iJ2 - iJ, bArr, i18);
                int iA = interfaceC0128a.mo199a(bArr, iJ2);
                C0173a.m512b(iA, bArr, i19);
                int i21 = iJ2 + iA;
                int iJ3 = m446j(i21);
                i13 += iA + iJ3;
                int i22 = i21 + iJ3;
                i15++;
                i14 = iJ;
                iJ = i22;
            }
        }
        C0173a.m512b(i13, bArr, i11);
        return iJ - i;
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: e */
    protected final int mo412e(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    public String toString() {
        return "[" + super.toString() + ",name=" + this.f624k + ",resolveDfs=" + this.f629p + "]";
    }

    @Override // p000a.p006d.p016e.AbstractC0141c
    /* JADX INFO: renamed from: c */
    protected final /* synthetic */ AbstractC0146d mo410c(InterfaceC0016c interfaceC0016c) {
        return new C0133f(interfaceC0016c.mo114a(), this.f624k);
    }
}
