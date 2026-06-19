package p000a.p006d.p007a;

import java.nio.charset.StandardCharsets;
import p000a.InterfaceC0290n;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.a.c */
/* JADX INFO: compiled from: DfsReferralRequestBuffer.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0048c implements InterfaceC0290n {

    /* JADX INFO: renamed from: a */
    private final int f237a = 3;

    /* JADX INFO: renamed from: b */
    private final String f238b;

    public C0048c(String str) {
        this.f238b = str;
    }

    @Override // p000a.InterfaceC0290n
    /* JADX INFO: renamed from: a */
    public final int mo198a() {
        return (this.f238b.length() * 2) + 4;
    }

    @Override // p000a.InterfaceC0290n
    /* JADX INFO: renamed from: a */
    public final int mo199a(byte[] bArr, int i) {
        C0173a.m510a(this.f237a, bArr, i);
        int i2 = i + 2;
        byte[] bytes = this.f238b.getBytes(StandardCharsets.UTF_16LE);
        System.arraycopy(bytes, 0, bArr, i2, bytes.length);
        int length = i2 + bytes.length;
        C0173a.m510a(0L, bArr, length);
        return (length + 2) - i;
    }
}
