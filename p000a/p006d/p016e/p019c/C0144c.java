package p000a.p006d.p016e.p019c;

import p000a.InterfaceC0016c;
import p000a.InterfaceC0267h;
import p000a.p006d.p016e.AbstractC0141c;
import p000a.p006d.p016e.AbstractC0146d;
import p000a.p006d.p016e.InterfaceC0127a;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.e.c.c */
/* JADX INFO: compiled from: Smb2WriteRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0144c extends AbstractC0141c<C0145d> implements InterfaceC0127a {

    /* JADX INFO: renamed from: a */
    private byte[] f711a;

    /* JADX INFO: renamed from: b */
    private int f712b;

    /* JADX INFO: renamed from: c */
    private int f713c;

    /* JADX INFO: renamed from: d */
    private byte[] f714d;

    /* JADX INFO: renamed from: e */
    private long f715e;

    /* JADX INFO: renamed from: f */
    private int f716f;

    /* JADX INFO: renamed from: g */
    private int f717g;

    /* JADX INFO: renamed from: h */
    private int f718h;

    public C0144c(InterfaceC0267h interfaceC0267h, byte[] bArr) {
        super(interfaceC0267h, 9);
        this.f714d = bArr;
    }

    @Override // p000a.p006d.p016e.InterfaceC0127a
    /* JADX INFO: renamed from: a */
    public final void mo408a(byte[] bArr) {
        this.f714d = bArr;
    }

    /* JADX INFO: renamed from: b */
    public final void m467b(byte[] bArr, int i, int i2) {
        this.f711a = bArr;
        this.f712b = i;
        this.f713c = i2;
    }

    /* JADX INFO: renamed from: d */
    public final void m468d(long j) {
        this.f715e = j;
    }

    @Override // p000a.p006d.InterfaceC0055c
    /* JADX INFO: renamed from: l_ */
    public final int mo225l_() {
        return m424i(this.f713c + 112);
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: d */
    protected final int mo411d(byte[] bArr, int i) {
        C0173a.m510a(49L, bArr, i);
        int i2 = i + 4;
        C0173a.m512b(this.f713c, bArr, i2);
        int i3 = i2 + 4;
        C0173a.m514c(this.f715e, bArr, i3);
        int i4 = i3 + 8;
        System.arraycopy(this.f714d, 0, bArr, i4, 16);
        int i5 = i4 + 16;
        C0173a.m512b(this.f716f, bArr, i5);
        int i6 = i5 + 4;
        C0173a.m512b(this.f717g, bArr, i6);
        int i7 = i6 + 4;
        C0173a.m510a(0L, bArr, i7);
        C0173a.m510a(0L, bArr, i7 + 2);
        int i8 = i7 + 4;
        C0173a.m512b(this.f718h, bArr, i8);
        int i9 = i8 + 4;
        C0173a.m510a(i9 - m432M(), bArr, i + 2);
        if (this.f713c + i9 > bArr.length) {
            throw new IllegalArgumentException(String.format("Data exceeds buffer size ( remain buffer: %d data length: %d)", Integer.valueOf(bArr.length - i9), Integer.valueOf(this.f713c)));
        }
        System.arraycopy(this.f711a, this.f712b, bArr, i9, this.f713c);
        return (this.f713c + i9) - i;
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: e */
    protected final int mo412e(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p016e.AbstractC0141c
    /* JADX INFO: renamed from: c */
    protected final /* synthetic */ AbstractC0146d mo410c(InterfaceC0016c interfaceC0016c) {
        return new C0145d(interfaceC0016c.mo114a());
    }
}
