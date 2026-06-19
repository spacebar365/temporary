package p000a.p026e;

import p000a.InterfaceC0267h;
import p000a.InterfaceC0293q;

/* JADX INFO: renamed from: a.e.l */
/* JADX INFO: compiled from: SessionRequestPacket.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0194l extends AbstractC0195m {

    /* JADX INFO: renamed from: c */
    private C0184b f913c;

    /* JADX INFO: renamed from: d */
    private C0184b f914d;

    public C0194l(InterfaceC0267h interfaceC0267h, InterfaceC0293q interfaceC0293q, InterfaceC0293q interfaceC0293q2) {
        this.f915a = 129;
        this.f913c = new C0184b(interfaceC0267h, interfaceC0293q);
        this.f914d = new C0184b(interfaceC0267h, interfaceC0293q2);
    }

    @Override // p000a.p026e.AbstractC0195m
    /* JADX INFO: renamed from: a */
    final int mo571a(byte[] bArr) {
        int iM527a = this.f913c.m527a(bArr, 4) + 4;
        return (iM527a + this.f914d.m527a(bArr, iM527a)) - 4;
    }
}
