package org.bouncycastle.b.m;

import java.security.SecureRandom;
import org.bouncycastle.b.l;
import org.bouncycastle.b.r;
import org.bouncycastle.b.z;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    private final SecureRandom a;
    private final e b;
    private byte[] c;
    private int d;
    private int e;

    public h() {
        this(l.a(), false);
    }

    public h(SecureRandom secureRandom, boolean z) {
        this.d = 256;
        this.e = 256;
        this.a = secureRandom;
        this.b = new a(this.a, z);
    }

    public h(e eVar) {
        this.d = 256;
        this.e = 256;
        this.a = null;
        this.b = eVar;
    }

    public final g a(r rVar, byte[] bArr, boolean z) {
        return new g(this.a, this.b.a(this.e), new h$b(rVar, bArr, this.c, this.d), z);
    }

    public final g a(z zVar, byte[] bArr) {
        return new g(this.a, this.b.a(this.e), new h$a(zVar, bArr, this.c, this.d), false);
    }

    public final h a(byte[] bArr) {
        this.c = org.bouncycastle.f.a.b(bArr);
        return this;
    }
}
