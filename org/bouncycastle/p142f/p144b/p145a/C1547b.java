package org.bouncycastle.p142f.p144b.p145a;

/* JADX INFO: renamed from: org.bouncycastle.f.b.a.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1547b {

    /* JADX INFO: renamed from: a */
    private String f5500a;

    /* JADX INFO: renamed from: b */
    private String f5501b;

    /* JADX INFO: renamed from: a */
    private static int m4125a(String str) {
        if (str == null) {
            return 1;
        }
        return str.hashCode();
    }

    /* JADX INFO: renamed from: a */
    private static boolean m4126a(String str, String str2) {
        if (str == str2) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equals(str2);
    }

    /* JADX INFO: renamed from: a */
    public final String m4127a() {
        return this.f5500a;
    }

    /* JADX INFO: renamed from: b */
    public final String m4128b() {
        return this.f5501b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1547b)) {
            return false;
        }
        C1547b c1547b = (C1547b) obj;
        return c1547b == this || (m4126a(this.f5500a, c1547b.f5500a) && m4126a(this.f5501b, c1547b.f5501b));
    }

    public final int hashCode() {
        return m4125a(this.f5500a) + (m4125a(this.f5501b) * 31);
    }
}
