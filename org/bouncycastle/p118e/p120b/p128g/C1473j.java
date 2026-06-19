package org.bouncycastle.p118e.p120b.p128g;

import org.bouncycastle.p118e.p120b.p128g.AbstractC1478o;
import org.bouncycastle.p142f.AbstractC1556g;

/* JADX INFO: renamed from: org.bouncycastle.e.b.g.j */
/* JADX INFO: loaded from: classes.dex */
final class C1473j extends AbstractC1478o {

    /* JADX INFO: renamed from: a */
    private final int f5329a;

    /* JADX INFO: renamed from: b */
    private final int f5330b;

    /* JADX INFO: renamed from: c */
    private final int f5331c;

    /* JADX INFO: renamed from: org.bouncycastle.e.b.g.j$a */
    protected static class a extends AbstractC1478o.a<a> {

        /* JADX INFO: renamed from: a */
        private int f5332a;

        /* JADX INFO: renamed from: b */
        private int f5333b;

        /* JADX INFO: renamed from: c */
        private int f5334c;

        protected a() {
            super(0);
            this.f5332a = 0;
            this.f5333b = 0;
            this.f5334c = 0;
        }

        /* JADX INFO: renamed from: a */
        protected final a m3893a(int i) {
            this.f5332a = i;
            return this;
        }

        @Override // org.bouncycastle.p118e.p120b.p128g.AbstractC1478o.a
        /* JADX INFO: renamed from: a */
        protected final AbstractC1478o mo3871a() {
            return new C1473j(this, (byte) 0);
        }

        /* JADX INFO: renamed from: b */
        protected final a m3894b(int i) {
            this.f5333b = i;
            return this;
        }

        @Override // org.bouncycastle.p118e.p120b.p128g.AbstractC1478o.a
        /* JADX INFO: renamed from: b */
        protected final /* bridge */ /* synthetic */ AbstractC1478o.a mo3873b() {
            return this;
        }

        /* JADX INFO: renamed from: c */
        protected final a m3895c(int i) {
            this.f5334c = i;
            return this;
        }
    }

    private C1473j(a aVar) {
        super(aVar);
        this.f5329a = aVar.f5332a;
        this.f5330b = aVar.f5333b;
        this.f5331c = aVar.f5334c;
    }

    /* synthetic */ C1473j(a aVar, byte b) {
        this(aVar);
    }

    @Override // org.bouncycastle.p118e.p120b.p128g.AbstractC1478o
    /* JADX INFO: renamed from: a */
    protected final byte[] mo3865a() {
        byte[] bArrMo3865a = super.mo3865a();
        AbstractC1556g.m4136a(this.f5329a, bArrMo3865a, 16);
        AbstractC1556g.m4136a(this.f5330b, bArrMo3865a, 20);
        AbstractC1556g.m4136a(this.f5331c, bArrMo3865a, 24);
        return bArrMo3865a;
    }

    /* JADX INFO: renamed from: b */
    protected final int m3887b() {
        return this.f5329a;
    }

    /* JADX INFO: renamed from: c */
    protected final int m3888c() {
        return this.f5330b;
    }

    /* JADX INFO: renamed from: d */
    protected final int m3889d() {
        return this.f5331c;
    }
}
