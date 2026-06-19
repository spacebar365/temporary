package p000a.p027f.p028a;

import p000a.InterfaceC0267h;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.f.a.e */
/* JADX INFO: compiled from: AvSingleHost.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0203e extends C0201c {
    public C0203e(byte[] bArr) {
        super(8, bArr);
    }

    public C0203e(InterfaceC0267h interfaceC0267h) {
        this(new byte[8], interfaceC0267h.mo49an());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private C0203e(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[48];
        C0173a.m512b(48L, bArr3, 0);
        C0173a.m512b(0L, bArr3, 4);
        System.arraycopy(bArr, 0, bArr3, 8, 8);
        System.arraycopy(bArr2, 0, bArr3, 16, 32);
        this(bArr3);
    }
}
