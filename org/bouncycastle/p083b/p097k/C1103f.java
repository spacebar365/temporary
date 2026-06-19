package org.bouncycastle.p083b.p097k;

/* JADX INFO: renamed from: org.bouncycastle.b.k.f */
/* JADX INFO: loaded from: classes.dex */
public class C1103f extends C1075b {

    /* JADX INFO: renamed from: b */
    private C1106i f4458b;

    protected C1103f(boolean z, C1106i c1106i) {
        super(z);
        this.f4458b = c1106i;
    }

    /* JADX INFO: renamed from: b */
    public final C1106i m2658b() {
        return this.f4458b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1103f)) {
            return false;
        }
        C1103f c1103f = (C1103f) obj;
        return this.f4458b == null ? c1103f.f4458b == null : this.f4458b.equals(c1103f.f4458b);
    }

    public int hashCode() {
        int i = this.f4411a ? 0 : 1;
        return this.f4458b != null ? i ^ this.f4458b.hashCode() : i;
    }
}
