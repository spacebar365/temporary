package p000a.p006d.p016e.p022f;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import p000a.EnumC0289m;
import p000a.InterfaceC0016c;
import p000a.InterfaceC0267h;
import p000a.p006d.InterfaceC0179k;
import p000a.p006d.p016e.AbstractC0141c;
import p000a.p006d.p016e.AbstractC0146d;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.e.f.e */
/* JADX INFO: compiled from: Smb2NegotiateRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0161e extends AbstractC0141c<C0162f> implements InterfaceC0179k {

    /* JADX INFO: renamed from: a */
    private int[] f768a;

    /* JADX INFO: renamed from: b */
    private int f769b;

    /* JADX INFO: renamed from: c */
    private byte[] f770c;

    /* JADX INFO: renamed from: d */
    private int f771d;

    /* JADX INFO: renamed from: e */
    private InterfaceC0158b[] f772e;

    /* JADX INFO: renamed from: f */
    private byte[] f773f;

    public C0161e(InterfaceC0267h interfaceC0267h, int i) {
        super(interfaceC0267h, 0);
        this.f770c = new byte[16];
        this.f771d = i;
        if (!interfaceC0267h.mo59d()) {
            this.f769b |= 1;
        }
        if (interfaceC0267h.mo27V() && interfaceC0267h.mo62g() != null && interfaceC0267h.mo62g().m961a(EnumC0289m.SMB300)) {
            this.f769b |= 64;
        }
        Set<EnumC0289m> setM959b = EnumC0289m.m959b(EnumC0289m.m958a(EnumC0289m.SMB202, interfaceC0267h.mo61f()), interfaceC0267h.mo62g());
        this.f768a = new int[setM959b.size()];
        Iterator<EnumC0289m> it = setM959b.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            this.f768a[i2] = it.next().m962b();
            i2++;
        }
        if (interfaceC0267h.mo62g().m961a(EnumC0289m.SMB210)) {
            System.arraycopy(interfaceC0267h.mo49an(), 0, this.f770c, 0, this.f770c.length);
        }
        LinkedList linkedList = new LinkedList();
        if (interfaceC0267h.mo62g() != null && interfaceC0267h.mo62g().m961a(EnumC0289m.SMB311)) {
            byte[] bArr = new byte[32];
            interfaceC0267h.mo33a().nextBytes(bArr);
            linkedList.add(new C0160d(new int[]{1}, bArr));
            this.f773f = bArr;
            if (interfaceC0267h.mo27V()) {
                linkedList.add(new C0157a(new int[]{2, 1}));
            }
        }
        this.f772e = (InterfaceC0158b[]) linkedList.toArray(new InterfaceC0158b[linkedList.size()]);
    }

    /* JADX INFO: renamed from: k */
    public final int m491k() {
        return this.f771d;
    }

    /* JADX INFO: renamed from: l */
    public final int m492l() {
        return this.f769b;
    }

    /* JADX INFO: renamed from: m */
    public final int[] m493m() {
        return this.f768a;
    }

    /* JADX INFO: renamed from: n */
    public final byte[] m494n() {
        return this.f770c;
    }

    /* JADX INFO: renamed from: o */
    public final InterfaceC0158b[] m495o() {
        return this.f772e;
    }

    @Override // p000a.p006d.InterfaceC0055c
    /* JADX INFO: renamed from: l_ */
    public final int mo225l_() {
        int iA = m422a(this.f768a.length * 2, 4) + 100;
        if (this.f772e != null) {
            for (InterfaceC0158b interfaceC0158b : this.f772e) {
                iA += m424i(interfaceC0158b.mo198a()) + 8;
            }
        }
        return m424i(iA);
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: d */
    protected final int mo411d(byte[] bArr, int i) {
        int i2;
        int i3;
        C0173a.m510a(36L, bArr, i);
        C0173a.m510a(this.f768a.length, bArr, i + 2);
        int i4 = i + 4;
        C0173a.m510a(this.f771d, bArr, i4);
        C0173a.m510a(0L, bArr, i4 + 2);
        int i5 = i4 + 4;
        C0173a.m512b(this.f769b, bArr, i5);
        int i6 = i5 + 4;
        System.arraycopy(this.f770c, 0, bArr, i6, 16);
        int i7 = i6 + 16;
        if (this.f772e == null || this.f772e.length == 0) {
            C0173a.m514c(0L, bArr, i7);
            i2 = 0;
        } else {
            C0173a.m510a(this.f772e.length, bArr, i7 + 4);
            C0173a.m510a(0L, bArr, i7 + 6);
            i2 = i7;
        }
        int i8 = i7 + 8;
        int length = this.f768a.length;
        for (int i9 = 0; i9 < length; i9++) {
            C0173a.m510a(r4[i9], bArr, i8);
            i8 += 2;
        }
        int iJ = m446j(i8) + i8;
        if (this.f772e == null || this.f772e.length == 0) {
            i3 = iJ;
        } else {
            C0173a.m512b(iJ - m432M(), bArr, i2);
            i3 = iJ;
            for (InterfaceC0158b interfaceC0158b : this.f772e) {
                C0173a.m510a(interfaceC0158b.mo489c(), bArr, i3);
                int i10 = i3 + 2;
                int i11 = i3 + 4;
                C0173a.m512b(0L, bArr, i11);
                int i12 = i11 + 4;
                int i13 = m424i(interfaceC0158b.mo199a(bArr, i12));
                C0173a.m510a(i13, bArr, i10);
                i3 = i12 + i13;
            }
        }
        return i3 - i;
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: e */
    protected final int mo412e(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.InterfaceC0179k
    /* JADX INFO: renamed from: g_ */
    public final boolean mo268g_() {
        return (this.f771d & 2) != 0;
    }

    @Override // p000a.p006d.p016e.AbstractC0141c
    /* JADX INFO: renamed from: c */
    protected final /* synthetic */ AbstractC0146d mo410c(InterfaceC0016c interfaceC0016c) {
        return new C0162f(interfaceC0016c.mo114a());
    }
}
