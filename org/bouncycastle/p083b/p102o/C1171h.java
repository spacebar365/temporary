package org.bouncycastle.p083b.p102o;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.p142f.C1560k;

/* JADX INFO: renamed from: org.bouncycastle.b.o.h */
/* JADX INFO: loaded from: classes.dex */
final class C1171h {

    /* JADX INFO: renamed from: a */
    private final ByteArrayOutputStream f4668a = new ByteArrayOutputStream();

    C1171h() {
    }

    /* JADX INFO: renamed from: a */
    public final void m2812a(long j) {
        this.f4668a.write((int) ((j >>> 24) & 255));
        this.f4668a.write((int) ((j >>> 16) & 255));
        this.f4668a.write((int) ((j >>> 8) & 255));
        this.f4668a.write((int) (j & 255));
    }

    /* JADX INFO: renamed from: a */
    public final void m2813a(String str) {
        m2814a(C1560k.m4168d(str));
    }

    /* JADX INFO: renamed from: a */
    public final void m2814a(byte[] bArr) {
        m2812a(bArr.length);
        try {
            this.f4668a.write(bArr);
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m2815a() {
        return this.f4668a.toByteArray();
    }

    /* JADX INFO: renamed from: b */
    public final void m2816b(byte[] bArr) {
        try {
            this.f4668a.write(bArr);
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage(), e);
        }
    }
}
