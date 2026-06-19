package p000a.p003c;

import p000a.p003c.C0043l;

/* JADX INFO: renamed from: a.c.k */
/* JADX INFO: compiled from: UnicodeString.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0042k extends C0043l.c {

    /* JADX INFO: renamed from: a */
    boolean f206a;

    public C0042k(C0043l.c cVar) {
        this.f213b = cVar.f213b;
        this.f214c = cVar.f214c;
        this.f215d = cVar.f215d;
        this.f206a = false;
    }

    public final String toString() {
        int i = (this.f213b / 2) - (this.f206a ? 1 : 0);
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = (char) this.f215d[i2];
        }
        return new String(cArr, 0, i);
    }
}
