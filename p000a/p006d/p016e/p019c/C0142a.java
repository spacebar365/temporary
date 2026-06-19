package p000a.p006d.p016e.p019c;

import p000a.InterfaceC0016c;
import p000a.InterfaceC0267h;
import p000a.p006d.p016e.AbstractC0141c;
import p000a.p006d.p016e.AbstractC0146d;
import p000a.p006d.p016e.InterfaceC0127a;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.e.c.a */
/* JADX INFO: compiled from: Smb2ReadRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0142a extends AbstractC0141c<C0143b> implements InterfaceC0127a {

    /* JADX INFO: renamed from: a */
    public static byte f693a = 1;

    /* JADX INFO: renamed from: b */
    public static int f694b = 0;

    /* JADX INFO: renamed from: c */
    public static int f695c = 1;

    /* JADX INFO: renamed from: d */
    public static int f696d = 2;

    /* JADX INFO: renamed from: e */
    private byte[] f697e;

    /* JADX INFO: renamed from: f */
    private final byte[] f698f;

    /* JADX INFO: renamed from: g */
    private final int f699g;

    /* JADX INFO: renamed from: h */
    private byte f700h;

    /* JADX INFO: renamed from: i */
    private byte f701i;

    /* JADX INFO: renamed from: j */
    private int f702j;

    /* JADX INFO: renamed from: k */
    private long f703k;

    /* JADX INFO: renamed from: l */
    private int f704l;

    /* JADX INFO: renamed from: m */
    private int f705m;

    /* JADX INFO: renamed from: n */
    private int f706n;

    public C0142a(InterfaceC0267h interfaceC0267h, byte[] bArr, byte[] bArr2, int i) {
        super(interfaceC0267h, 8);
        this.f697e = bArr;
        this.f698f = bArr2;
        this.f699g = i;
    }

    @Override // p000a.p006d.p016e.InterfaceC0127a
    /* JADX INFO: renamed from: a */
    public final void mo408a(byte[] bArr) {
        this.f697e = bArr;
    }

    /* JADX INFO: renamed from: k */
    public final void m464k(int i) {
        this.f702j = i;
    }

    /* JADX INFO: renamed from: d */
    public final void m463d(long j) {
        this.f703k = j;
    }

    /* JADX INFO: renamed from: l */
    public final void m465l(int i) {
        this.f706n = i;
    }

    @Override // p000a.p006d.InterfaceC0055c
    /* JADX INFO: renamed from: l_ */
    public final int mo225l_() {
        return m424i(113);
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: d */
    protected final int mo411d(byte[] bArr, int i) {
        C0173a.m510a(49L, bArr, i);
        bArr[i + 2] = this.f700h;
        bArr[i + 3] = this.f701i;
        int i2 = i + 4;
        C0173a.m512b(this.f702j, bArr, i2);
        int i3 = i2 + 4;
        C0173a.m514c(this.f703k, bArr, i3);
        int i4 = i3 + 8;
        System.arraycopy(this.f697e, 0, bArr, i4, 16);
        int i5 = i4 + 16;
        C0173a.m512b(this.f704l, bArr, i5);
        int i6 = i5 + 4;
        C0173a.m512b(this.f705m, bArr, i6);
        int i7 = i6 + 4;
        C0173a.m512b(this.f706n, bArr, i7);
        int i8 = i7 + 4;
        C0173a.m510a(0L, bArr, i8);
        C0173a.m510a(0L, bArr, i8 + 2);
        int i9 = i8 + 4;
        bArr[i9] = 0;
        return (i9 + 1) - i;
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: e */
    protected final int mo412e(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p016e.AbstractC0141c
    /* JADX INFO: renamed from: c */
    protected final /* synthetic */ AbstractC0146d mo410c(InterfaceC0016c interfaceC0016c) {
        return new C0143b(interfaceC0016c.mo114a(), this.f698f, this.f699g);
    }
}
