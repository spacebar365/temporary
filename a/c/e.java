package a.c;

import a.g.be;

/* JADX INFO: compiled from: DcerpcException.java */
/* JADX INFO: loaded from: classes.dex */
public final class e extends a.d implements d, be {
    private int c;

    private static String a(int i) {
        int i2 = 0;
        int length = a.length;
        while (length >= i2) {
            int i3 = (i2 + length) / 2;
            if (i > a[i3]) {
                i2 = i3 + 1;
            } else if (i < a[i3]) {
                length = i3 - 1;
            } else {
                return b[i3];
            }
        }
        return "0x" + a.i.e.a(i, 8);
    }

    e(int i) {
        super(a(i));
        this.c = i;
    }

    public e(String str) {
        super(str);
    }
}
