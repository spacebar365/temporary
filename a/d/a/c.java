package a.d.a;

import a.n;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: DfsReferralRequestBuffer.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements n {
    private final int a = 3;
    private final String b;

    public c(String str) {
        this.b = str;
    }

    @Override // a.n
    public final int a() {
        return (this.b.length() * 2) + 4;
    }

    @Override // a.n
    public final int a(byte[] bArr, int i) {
        a.d.f.a.a(this.a, bArr, i);
        int i2 = i + 2;
        byte[] bytes = this.b.getBytes(StandardCharsets.UTF_16LE);
        System.arraycopy(bytes, 0, bArr, i2, bytes.length);
        int length = i2 + bytes.length;
        a.d.f.a.a(0L, bArr, length);
        return (length + 2) - i;
    }
}
