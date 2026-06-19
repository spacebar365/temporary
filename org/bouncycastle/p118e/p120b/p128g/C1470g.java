package org.bouncycastle.p118e.p120b.p128g;

import org.bouncycastle.p118e.p120b.p128g.AbstractC1478o;
import org.bouncycastle.p142f.AbstractC1556g;

/* JADX INFO: renamed from: org.bouncycastle.e.b.g.g */
/* JADX INFO: loaded from: classes.dex */
final class C1470g extends AbstractC1478o {

    /* JADX INFO: renamed from: a */
    private final int f5316a;

    /* JADX INFO: renamed from: b */
    private final int f5317b;

    /* JADX INFO: renamed from: c */
    private final int f5318c;

    /* JADX INFO: renamed from: org.bouncycastle.e.b.g.g$a */
    protected static class a extends AbstractC1478o.a<a> {

        /* JADX INFO: renamed from: a */
        private int f5319a;

        /* JADX INFO: renamed from: b */
        private int f5320b;

        protected a() {
            super(2);
            this.f5319a = 0;
            this.f5320b = 0;
        }

        /* JADX INFO: renamed from: a */
        protected final a m3870a(int i) {
            this.f5319a = i;
            return this;
        }

        @Override // org.bouncycastle.p118e.p120b.p128g.AbstractC1478o.a
        /* JADX INFO: renamed from: a */
        protected final AbstractC1478o mo3871a() {
            return new C1470g(this, (byte) 0);
        }

        /* JADX INFO: renamed from: b */
        protected final a m3872b(int i) {
            this.f5320b = i;
            return this;
        }

        @Override // org.bouncycastle.p118e.p120b.p128g.AbstractC1478o.a
        /* JADX INFO: renamed from: b */
        protected final /* bridge */ /* synthetic */ AbstractC1478o.a mo3873b() {
            return this;
        }
    }

    private C1470g(a aVar) {
        super(aVar);
        this.f5316a = 0;
        this.f5317b = aVar.f5319a;
        this.f5318c = aVar.f5320b;
    }

    /* synthetic */ C1470g(a aVar, byte b) {
        this(aVar);
    }

    @Override // org.bouncycastle.p118e.p120b.p128g.AbstractC1478o
    /* JADX INFO: renamed from: a */
    protected final byte[] mo3865a() {
        byte[] bArrMo3865a = super.mo3865a();
        AbstractC1556g.m4136a(this.f5316a, bArrMo3865a, 16);
        AbstractC1556g.m4136a(this.f5317b, bArrMo3865a, 20);
        AbstractC1556g.m4136a(this.f5318c, bArrMo3865a, 24);
        return bArrMo3865a;
    }

    /* JADX INFO: renamed from: b */
    protected final int m3866b() {
        return this.f5317b;
    }

    /* JADX INFO: renamed from: c */
    protected final int m3867c() {
        return this.f5318c;
    }
}
