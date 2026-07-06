package a.c.a;

/* JADX INFO: compiled from: MsrpcShareEnum.java */
/* JADX INFO: loaded from: classes.dex */
public final class g extends j$a {
    public g(String str) {
        super("\\\\".concat(String.valueOf(str)), new j$e());
        this.b = 0;
        this.c = 3;
    }

    public final a.g.j[] d() {
        j$e j_e = (j$e) this.k;
        g$a[] g_aArr = new g$a[j_e.a];
        for (int i = 0; i < j_e.a; i++) {
            g_aArr[i] = new g$a(this, j_e.b[i]);
        }
        return g_aArr;
    }
}
