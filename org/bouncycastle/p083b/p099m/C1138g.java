package org.bouncycastle.p083b.p099m;

import java.security.SecureRandom;
import org.bouncycastle.p083b.p099m.p100a.InterfaceC1131c;

/* JADX INFO: renamed from: org.bouncycastle.b.m.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1138g extends SecureRandom {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1134c f4548a;

    /* JADX INFO: renamed from: b */
    private final boolean f4549b;

    /* JADX INFO: renamed from: c */
    private final SecureRandom f4550c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC1135d f4551d;

    /* JADX INFO: renamed from: e */
    private InterfaceC1131c f4552e;

    C1138g(SecureRandom secureRandom, InterfaceC1135d interfaceC1135d, InterfaceC1134c interfaceC1134c, boolean z) {
        this.f4550c = secureRandom;
        this.f4551d = interfaceC1135d;
        this.f4548a = interfaceC1134c;
        this.f4549b = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m2736a() {
        synchronized (this) {
            if (this.f4552e == null) {
                this.f4552e = this.f4548a.mo2734a(this.f4551d);
            }
            this.f4552e.mo2724a();
        }
    }

    @Override // java.security.SecureRandom
    public final byte[] generateSeed(int i) {
        return C1137f.m2735a(this.f4551d, i);
    }

    @Override // java.security.SecureRandom, java.util.Random
    public final void nextBytes(byte[] bArr) {
        synchronized (this) {
            if (this.f4552e == null) {
                this.f4552e = this.f4548a.mo2734a(this.f4551d);
            }
            if (this.f4552e.mo2723a(bArr, this.f4549b) < 0) {
                this.f4552e.mo2724a();
                this.f4552e.mo2723a(bArr, this.f4549b);
            }
        }
    }

    @Override // java.security.SecureRandom, java.util.Random
    public final void setSeed(long j) {
        synchronized (this) {
            if (this.f4550c != null) {
                this.f4550c.setSeed(j);
            }
        }
    }

    @Override // java.security.SecureRandom
    public final void setSeed(byte[] bArr) {
        synchronized (this) {
            if (this.f4550c != null) {
                this.f4550c.setSeed(bArr);
            }
        }
    }
}
