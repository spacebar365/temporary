package org.bouncycastle.p083b.p097k;

/* JADX INFO: renamed from: org.bouncycastle.b.k.am */
/* JADX INFO: loaded from: classes.dex */
public class C1061am extends C1075b {

    /* JADX INFO: renamed from: b */
    private C1062an f4387b;

    protected C1061am(boolean z, C1062an c1062an) {
        super(z);
        this.f4387b = c1062an;
    }

    /* JADX INFO: renamed from: b */
    public final C1062an m2578b() {
        return this.f4387b;
    }

    public int hashCode() {
        if (this.f4387b != null) {
            return this.f4387b.hashCode();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1061am)) {
            return false;
        }
        C1061am c1061am = (C1061am) obj;
        return this.f4387b == null ? c1061am.f4387b == null : this.f4387b.equals(c1061am.f4387b);
    }
}
