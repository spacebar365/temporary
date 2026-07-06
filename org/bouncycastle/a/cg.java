package org.bouncycastle.a;

/* JADX INFO: loaded from: classes.dex */
public final class cg {
    private String a;
    private int b = 0;

    public cg(String str) {
        this.a = str;
    }

    public final boolean a() {
        return this.b != -1;
    }

    public final String b() {
        if (this.b == -1) {
            return null;
        }
        int iIndexOf = this.a.indexOf(46, this.b);
        if (iIndexOf == -1) {
            String strSubstring = this.a.substring(this.b);
            this.b = -1;
            return strSubstring;
        }
        String strSubstring2 = this.a.substring(this.b, iIndexOf);
        this.b = iIndexOf + 1;
        return strSubstring2;
    }
}
