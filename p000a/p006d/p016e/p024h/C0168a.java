package p000a.p006d.p016e.p024h;

import java.nio.charset.StandardCharsets;
import p000a.InterfaceC0016c;
import p000a.InterfaceC0267h;
import p000a.p006d.p016e.AbstractC0134b;
import p000a.p006d.p016e.AbstractC0141c;
import p000a.p006d.p016e.AbstractC0146d;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.e.h.a */
/* JADX INFO: compiled from: Smb2TreeConnectRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0168a extends AbstractC0141c<C0169b> {

    /* JADX INFO: renamed from: a */
    private int f810a;

    /* JADX INFO: renamed from: b */
    private String f811b;

    public C0168a(InterfaceC0267h interfaceC0267h, String str) {
        super(interfaceC0267h, 3);
        this.f811b = str;
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: a */
    public final boolean mo437a(AbstractC0134b abstractC0134b) {
        abstractC0134b.m443f(-1);
        return super.mo437a(abstractC0134b);
    }

    @Override // p000a.p006d.InterfaceC0055c
    /* JADX INFO: renamed from: l_ */
    public final int mo225l_() {
        return m424i((this.f811b.length() * 2) + 72);
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: d */
    protected final int mo411d(byte[] bArr, int i) {
        C0173a.m510a(9L, bArr, i);
        C0173a.m510a(this.f810a, bArr, i + 2);
        int i2 = i + 4;
        byte[] bytes = this.f811b.getBytes(StandardCharsets.UTF_16LE);
        C0173a.m510a(bytes.length, bArr, i2 + 2);
        int i3 = i2 + 4;
        C0173a.m510a(i3 - m432M(), bArr, i2);
        System.arraycopy(bytes, 0, bArr, i3, bytes.length);
        return (bytes.length + i3) - i;
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: e */
    protected final int mo412e(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p016e.AbstractC0141c
    /* JADX INFO: renamed from: c */
    protected final /* synthetic */ AbstractC0146d mo410c(InterfaceC0016c interfaceC0016c) {
        return new C0169b(interfaceC0016c.mo114a());
    }
}
