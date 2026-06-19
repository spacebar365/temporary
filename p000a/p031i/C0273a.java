package p000a.p031i;

import p000a.InterfaceC0290n;

/* JADX INFO: renamed from: a.i.a */
/* JADX INFO: compiled from: ByteEncodable.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0273a implements InterfaceC0290n {

    /* JADX INFO: renamed from: a */
    private byte[] f1234a;

    /* JADX INFO: renamed from: b */
    private int f1235b;

    /* JADX INFO: renamed from: c */
    private int f1236c;

    public C0273a(byte[] bArr, int i, int i2) {
        this.f1234a = bArr;
        this.f1235b = i;
        this.f1236c = i2;
    }

    @Override // p000a.InterfaceC0290n
    /* JADX INFO: renamed from: a */
    public final int mo198a() {
        return this.f1236c;
    }

    @Override // p000a.InterfaceC0290n
    /* JADX INFO: renamed from: a */
    public final int mo199a(byte[] bArr, int i) {
        System.arraycopy(this.f1234a, this.f1235b, bArr, i, this.f1236c);
        return this.f1236c;
    }
}
