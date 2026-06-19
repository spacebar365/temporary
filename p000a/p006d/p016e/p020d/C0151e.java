package p000a.p006d.p016e.p020d;

import p000a.InterfaceC0286j;
import p000a.p006d.C0175g;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.e.d.e */
/* JADX INFO: compiled from: SrvRequestResumeKeyResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0151e implements InterfaceC0286j {

    /* JADX INFO: renamed from: a */
    private byte[] f750a;

    @Override // p000a.InterfaceC0286j
    /* JADX INFO: renamed from: a */
    public final int mo201a(byte[] bArr, int i, int i2) throws C0175g {
        if (i2 < 24) {
            throw new C0175g("Invalid resume key");
        }
        this.f750a = new byte[24];
        System.arraycopy(bArr, i, this.f750a, 0, 24);
        int i3 = i + 24;
        C0173a.m511b(bArr, i3);
        return (i3 + 4) - i;
    }
}
