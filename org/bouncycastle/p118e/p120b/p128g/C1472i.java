package org.bouncycastle.p118e.p120b.p128g;

import org.bouncycastle.p118e.p120b.p128g.AbstractC1478o;
import org.bouncycastle.p142f.AbstractC1556g;

/* JADX INFO: renamed from: org.bouncycastle.e.b.g.i */
/* JADX INFO: loaded from: classes.dex */
final class C1472i extends AbstractC1478o {

    /* JADX INFO: renamed from: a */
    private final int f5323a;

    /* JADX INFO: renamed from: b */
    private final int f5324b;

    /* JADX INFO: renamed from: c */
    private final int f5325c;

    /* JADX INFO: renamed from: org.bouncycastle.e.b.g.i$a */
    protected static class a extends AbstractC1478o.a<a> {

        /* JADX INFO: renamed from: a */
        private int f5326a;

        /* JADX INFO: renamed from: b */
        private int f5327b;

        /* JADX INFO: renamed from: c */
        private int f5328c;

        protected a() {
            super(1);
            this.f5326a = 0;
            this.f5327b = 0;
            this.f5328c = 0;
        }

        /* JADX INFO: renamed from: a */
        protected final a m3884a(int i) {
            this.f5326a = i;
            return this;
        }

        @Override // org.bouncycastle.p118e.p120b.p128g.AbstractC1478o.a
        /* JADX INFO: renamed from: a */
        protected final AbstractC1478o mo3871a() {
            return new C1472i(this, (byte) 0);
        }

        /* JADX INFO: renamed from: b */
        protected final a m3885b(int i) {
            this.f5327b = i;
            return this;
        }

        @Override // org.bouncycastle.p118e.p120b.p128g.AbstractC1478o.a
        /* JADX INFO: renamed from: b */
        protected final /* bridge */ /* synthetic */ AbstractC1478o.a mo3873b() {
            return this;
        }

        /* JADX INFO: renamed from: c */
        protected final a m3886c(int i) {
            this.f5328c = i;
            return this;
        }
    }

    private C1472i(a aVar) {
        super(aVar);
        this.f5323a = aVar.f5326a;
        this.f5324b = aVar.f5327b;
        this.f5325c = aVar.f5328c;
    }

    /* synthetic */ C1472i(a aVar, byte b) {
        this(aVar);
    }

    @Override // org.bouncycastle.p118e.p120b.p128g.AbstractC1478o
    /* JADX INFO: renamed from: a */
    protected final byte[] mo3865a() {
        byte[] bArrMo3865a = super.mo3865a();
        AbstractC1556g.m4136a(this.f5323a, bArrMo3865a, 16);
        AbstractC1556g.m4136a(this.f5324b, bArrMo3865a, 20);
        AbstractC1556g.m4136a(this.f5325c, bArrMo3865a, 24);
        return bArrMo3865a;
    }

    /* JADX INFO: renamed from: b */
    protected final int m3878b() {
        return this.f5323a;
    }

    /* JADX INFO: renamed from: c */
    protected final int m3879c() {
        return this.f5324b;
    }

    /* JADX INFO: renamed from: d */
    protected final int m3880d() {
        return this.f5325c;
    }
}
