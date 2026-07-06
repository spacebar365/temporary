package a.c;

/* JADX INFO: compiled from: UnicodeString.java */
/* JADX INFO: loaded from: classes.dex */
public final class k extends l$c {
    boolean a;

    public k(l$c l_c) {
        this.b = l_c.b;
        this.c = l_c.c;
        this.d = l_c.d;
        this.a = false;
    }

    public final String toString() {
        int i = (this.b / 2) - (this.a ? 1 : 0);
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = (char) this.d[i2];
        }
        return new String(cArr, 0, i);
    }
}
