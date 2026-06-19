package org.bouncycastle.p054a;

/* JADX INFO: renamed from: org.bouncycastle.a.cg */
/* JADX INFO: loaded from: classes.dex */
public final class C0611cg {

    /* JADX INFO: renamed from: a */
    private String f2172a;

    /* JADX INFO: renamed from: b */
    private int f2173b = 0;

    public C0611cg(String str) {
        this.f2172a = str;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1486a() {
        return this.f2173b != -1;
    }

    /* JADX INFO: renamed from: b */
    public final String m1487b() {
        if (this.f2173b == -1) {
            return null;
        }
        int iIndexOf = this.f2172a.indexOf(46, this.f2173b);
        if (iIndexOf == -1) {
            String strSubstring = this.f2172a.substring(this.f2173b);
            this.f2173b = -1;
            return strSubstring;
        }
        String strSubstring2 = this.f2172a.substring(this.f2173b, iIndexOf);
        this.f2173b = iIndexOf + 1;
        return strSubstring2;
    }
}
