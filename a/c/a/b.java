package a.c.a;

import a.c.l$b;
import a.v;

/* JADX INFO: compiled from: LsarSidArrayX.java */
/* JADX INFO: loaded from: classes.dex */
final class b extends h$g {
    b(v[] vVarArr) {
        this.a = vVarArr.length;
        this.b = new h$h[vVarArr.length];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < vVarArr.length) {
                this.b[i2] = new h$h();
                this.b[i2].a = (l$b) vVarArr[i2].a(l$b.class);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }
}
