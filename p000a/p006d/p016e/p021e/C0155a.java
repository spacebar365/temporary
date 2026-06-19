package p000a.p006d.p016e.p021e;

import p000a.InterfaceC0267h;
import p000a.p006d.C0175g;
import p000a.p006d.p016e.AbstractC0146d;
import p000a.p006d.p025f.C0173a;
import p000a.p031i.C0284e;

/* JADX INFO: renamed from: a.d.e.e.a */
/* JADX INFO: compiled from: Smb2OplockBreakNotification.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0155a extends AbstractC0146d {

    /* JADX INFO: renamed from: a */
    private byte f760a;

    /* JADX INFO: renamed from: b */
    private byte[] f761b;

    public C0155a(InterfaceC0267h interfaceC0267h) {
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
        if (C0173a.m509a(bArr, i) != 24) {
            throw new C0175g("Expected structureSize = 24");
        }
        this.f760a = bArr[i + 2];
        int i2 = i + 4 + 4;
        this.f761b = new byte[16];
        System.arraycopy(bArr, i2, this.f761b, 0, 16);
        return (i2 + 16) - i;
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    public final String toString() {
        return "Smb2OpblockBreakNotification[oplockLevel=" + ((int) this.f760a) + ",fileId=" + C0284e.m948a(this.f761b) + "]";
    }
}
