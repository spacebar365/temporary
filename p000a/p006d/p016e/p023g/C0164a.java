package p000a.p006d.p016e.p023g;

import p000a.InterfaceC0016c;
import p000a.InterfaceC0267h;
import p000a.p006d.p016e.AbstractC0141c;
import p000a.p006d.p016e.AbstractC0146d;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.e.g.a */
/* JADX INFO: compiled from: Smb2LogoffRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0164a extends AbstractC0141c<C0165b> {
    public C0164a(InterfaceC0267h interfaceC0267h) {
        super(interfaceC0267h, 2);
    }

    @Override // p000a.p006d.InterfaceC0055c
    /* JADX INFO: renamed from: l_ */
    public final int mo225l_() {
        return m424i(68);
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: d */
    protected final int mo411d(byte[] bArr, int i) {
        C0173a.m510a(4L, bArr, i);
        C0173a.m510a(0L, bArr, i + 2);
        return 4;
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: e */
    protected final int mo412e(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p016e.AbstractC0141c
    /* JADX INFO: renamed from: c */
    protected final /* synthetic */ AbstractC0146d mo410c(InterfaceC0016c interfaceC0016c) {
        return new C0165b(interfaceC0016c.mo114a());
    }
}
