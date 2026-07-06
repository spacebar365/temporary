package org.bouncycastle.b.o;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.f.k;

/* JADX INFO: loaded from: classes.dex */
final class h {
    private final ByteArrayOutputStream a = new ByteArrayOutputStream();

    h() {
    }

    public final void a(long j) {
        this.a.write((int) ((j >>> 24) & 255));
        this.a.write((int) ((j >>> 16) & 255));
        this.a.write((int) ((j >>> 8) & 255));
        this.a.write((int) (j & 255));
    }

    public final void a(String str) {
        a(k.d(str));
    }

    public final void a(byte[] bArr) {
        a(bArr.length);
        try {
            this.a.write(bArr);
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

    public final byte[] a() {
        return this.a.toByteArray();
    }

    public final void b(byte[] bArr) {
        try {
            this.a.write(bArr);
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage(), e);
        }
    }
}
