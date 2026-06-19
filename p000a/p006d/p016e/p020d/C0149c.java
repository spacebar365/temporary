package p000a.p006d.p016e.p020d;

import p000a.InterfaceC0286j;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.e.d.c */
/* JADX INFO: compiled from: SrvCopyChunkCopyResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0149c implements InterfaceC0286j {

    /* JADX INFO: renamed from: a */
    private int f742a;

    /* JADX INFO: renamed from: b */
    private int f743b;

    /* JADX INFO: renamed from: c */
    private int f744c;

    @Override // p000a.InterfaceC0286j
    /* JADX INFO: renamed from: a */
    public final int mo201a(byte[] bArr, int i, int i2) {
        this.f742a = C0173a.m511b(bArr, i);
        int i3 = i + 4;
        this.f743b = C0173a.m511b(bArr, i3);
        int i4 = i3 + 4;
        this.f744c = C0173a.m511b(bArr, i4);
        return (i4 + 4) - i;
    }
}
