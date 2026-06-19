package p000a.p006d.p016e.p018b;

import p000a.InterfaceC0267h;
import p000a.p006d.C0175g;
import p000a.p006d.p016e.AbstractC0146d;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.e.b.f */
/* JADX INFO: compiled from: Smb2SetInfoResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0140f extends AbstractC0146d {
    public C0140f(InterfaceC0267h interfaceC0267h) {
        super(interfaceC0267h);
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: d */
    protected final int mo411d(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: e */
    protected final int mo412e(byte[] bArr, int i) throws C0175g {
        if (C0173a.m509a(bArr, i) != 2) {
            throw new C0175g("Expected structureSize = 2");
        }
        return 2;
    }
}
