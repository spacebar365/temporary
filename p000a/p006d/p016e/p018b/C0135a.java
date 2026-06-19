package p000a.p006d.p016e.p018b;

import java.nio.charset.StandardCharsets;
import p000a.InterfaceC0016c;
import p000a.InterfaceC0267h;
import p000a.p006d.p016e.AbstractC0141c;
import p000a.p006d.p016e.AbstractC0146d;
import p000a.p006d.p016e.C0154e;
import p000a.p006d.p016e.InterfaceC0127a;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.e.b.a */
/* JADX INFO: compiled from: Smb2QueryDirectoryRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0135a extends AbstractC0141c<C0136b> implements InterfaceC0127a {

    /* JADX INFO: renamed from: a */
    private byte f668a;

    /* JADX INFO: renamed from: b */
    private byte f669b;

    /* JADX INFO: renamed from: c */
    private int f670c;

    /* JADX INFO: renamed from: d */
    private byte[] f671d;

    /* JADX INFO: renamed from: e */
    private int f672e;

    /* JADX INFO: renamed from: f */
    private String f673f;

    public C0135a(InterfaceC0267h interfaceC0267h) {
        this(interfaceC0267h, C0154e.f759a);
    }

    public C0135a(InterfaceC0267h interfaceC0267h, byte[] bArr) {
        super(interfaceC0267h, 14);
        this.f668a = (byte) 3;
        this.f672e = (interfaceC0267h.mo40ae() - 72) & (-8);
        this.f671d = bArr;
    }

    @Override // p000a.p006d.p016e.InterfaceC0127a
    /* JADX INFO: renamed from: a */
    public final void mo408a(byte[] bArr) {
        this.f671d = bArr;
    }

    /* JADX INFO: renamed from: k */
    public final void m456k() {
        this.f669b = (byte) 4;
    }

    /* JADX INFO: renamed from: k */
    public final void m457k(int i) {
        this.f670c = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m455a(String str) {
        this.f673f = str;
    }

    @Override // p000a.p006d.InterfaceC0055c
    /* JADX INFO: renamed from: l_ */
    public final int mo225l_() {
        return m424i((this.f673f != null ? this.f673f.length() * 2 : 0) + 96);
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: d */
    protected final int mo411d(byte[] bArr, int i) {
        C0173a.m510a(33L, bArr, i);
        bArr[i + 2] = this.f668a;
        bArr[i + 3] = this.f669b;
        int i2 = i + 4;
        C0173a.m512b(this.f670c, bArr, i2);
        int i3 = i2 + 4;
        System.arraycopy(this.f671d, 0, bArr, i3, 16);
        int i4 = i3 + 16;
        int i5 = i4 + 2;
        int i6 = i4 + 4;
        C0173a.m512b(this.f672e, bArr, i6);
        int length = i6 + 4;
        if (this.f673f == null) {
            C0173a.m510a(0L, bArr, i4);
            C0173a.m510a(0L, bArr, i5);
        } else {
            byte[] bytes = this.f673f.getBytes(StandardCharsets.UTF_16LE);
            C0173a.m510a(length - m432M(), bArr, i4);
            C0173a.m510a(bytes.length, bArr, i5);
            System.arraycopy(bytes, 0, bArr, length, bytes.length);
            length += bytes.length;
        }
        return length - i;
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: e */
    protected final int mo412e(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p016e.AbstractC0141c
    /* JADX INFO: renamed from: c */
    protected final /* synthetic */ AbstractC0146d mo410c(InterfaceC0016c interfaceC0016c) {
        return new C0136b(interfaceC0016c.mo114a(), this.f668a);
    }
}
