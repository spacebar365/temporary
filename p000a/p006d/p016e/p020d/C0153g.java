package p000a.p006d.p016e.p020d;

import p000a.InterfaceC0286j;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.e.d.g */
/* JADX INFO: compiled from: ValidateNegotiateInfoResponse.java */
/* JADX INFO: loaded from: classes.dex */
public class C0153g implements InterfaceC0286j {

    /* JADX INFO: renamed from: a */
    private int f755a;

    /* JADX INFO: renamed from: b */
    private byte[] f756b = new byte[16];

    /* JADX INFO: renamed from: c */
    private int f757c;

    /* JADX INFO: renamed from: d */
    private int f758d;

    /* JADX INFO: renamed from: a */
    public final int m482a() {
        return this.f755a;
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m483b() {
        return this.f756b;
    }

    /* JADX INFO: renamed from: c */
    public final int m484c() {
        return this.f757c;
    }

    /* JADX INFO: renamed from: d */
    public final int m485d() {
        return this.f758d;
    }

    @Override // p000a.InterfaceC0286j
    /* JADX INFO: renamed from: a */
    public final int mo201a(byte[] bArr, int i, int i2) {
        this.f755a = C0173a.m511b(bArr, i);
        int i3 = i + 4;
        System.arraycopy(bArr, i3, this.f756b, 0, 16);
        int i4 = i3 + 16;
        this.f757c = C0173a.m509a(bArr, i4);
        this.f758d = C0173a.m509a(bArr, i4 + 2);
        return (i4 + 4) - i;
    }
}
