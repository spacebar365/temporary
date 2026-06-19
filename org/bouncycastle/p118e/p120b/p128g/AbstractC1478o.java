package org.bouncycastle.p118e.p120b.p128g;

import org.bouncycastle.p142f.AbstractC1556g;

/* JADX INFO: renamed from: org.bouncycastle.e.b.g.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1478o {

    /* JADX INFO: renamed from: a */
    private final int f5350a;

    /* JADX INFO: renamed from: b */
    private final long f5351b;

    /* JADX INFO: renamed from: c */
    private final int f5352c;

    /* JADX INFO: renamed from: d */
    private final int f5353d;

    /* JADX INFO: renamed from: org.bouncycastle.e.b.g.o$a */
    protected static abstract class a<T extends a> {

        /* JADX INFO: renamed from: a */
        private final int f5354a;

        /* JADX INFO: renamed from: b */
        private int f5355b = 0;

        /* JADX INFO: renamed from: c */
        private long f5356c = 0;

        /* JADX INFO: renamed from: d */
        private int f5357d = 0;

        protected a(int i) {
            this.f5354a = i;
        }

        /* JADX INFO: renamed from: a */
        protected final T m3917a(long j) {
            this.f5356c = j;
            return (T) mo3873b();
        }

        /* JADX INFO: renamed from: a */
        protected abstract AbstractC1478o mo3871a();

        /* JADX INFO: renamed from: b */
        protected abstract T mo3873b();

        /* JADX INFO: renamed from: d */
        protected final T m3918d(int i) {
            this.f5355b = i;
            return (T) mo3873b();
        }

        /* JADX INFO: renamed from: e */
        protected final T m3919e(int i) {
            this.f5357d = i;
            return (T) mo3873b();
        }
    }

    protected AbstractC1478o(a aVar) {
        this.f5350a = aVar.f5355b;
        this.f5351b = aVar.f5356c;
        this.f5352c = aVar.f5354a;
        this.f5353d = aVar.f5357d;
    }

    /* JADX INFO: renamed from: a */
    protected byte[] mo3865a() {
        byte[] bArr = new byte[32];
        AbstractC1556g.m4136a(this.f5350a, bArr, 0);
        AbstractC1556g.m4137a(this.f5351b, bArr, 4);
        AbstractC1556g.m4136a(this.f5352c, bArr, 12);
        AbstractC1556g.m4136a(this.f5353d, bArr, 28);
        return bArr;
    }

    /* JADX INFO: renamed from: e */
    protected final int m3910e() {
        return this.f5350a;
    }

    /* JADX INFO: renamed from: f */
    protected final long m3911f() {
        return this.f5351b;
    }

    /* JADX INFO: renamed from: g */
    public final int m3912g() {
        return this.f5353d;
    }
}
