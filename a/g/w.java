package a.g;

import a.c.a.h$j;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: SIDCacheImpl.java */
/* JADX INFO: loaded from: classes.dex */
public final class w implements a.w {
    private Map<v, v> a = new HashMap();

    private static void a(a.c.f fVar, a.c.a.a aVar, a.v[] vVarArr) throws a.c.e, ad {
        int i = 0;
        a.c.a.d dVar = new a.c.a.d(aVar, vVarArr);
        fVar.a(dVar);
        switch (dVar.h) {
            case -1073741709:
            case 0:
            case 263:
                break;
            default:
                throw new ad(dVar.h, false);
        }
        while (true) {
            int i2 = i;
            if (i2 < vVarArr.length) {
                v vVar = (v) vVarArr[i2].a(v.class);
                h$j h_j = dVar.l.b[i2];
                vVar.j = null;
                switch (h_j.a) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        vVar.j = new a.c.k(dVar.k.b[h_j.c].a).toString();
                        break;
                }
                vVar.k = new a.c.k(h_j.b).toString();
                vVar.i = h_j.a;
                vVar.l = null;
                vVar.m = null;
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00d0 A[Catch: Throwable -> 0x00b2, all -> 0x00cd, TRY_LEAVE, TryCatch #3 {Throwable -> 0x00b2, blocks: (B:21:0x006a, B:23:0x0070, B:25:0x007b, B:26:0x0080, B:28:0x0092, B:41:0x00b1, B:59:0x00d0, B:56:0x00c9), top: B:73:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d9 A[Catch: IOException -> 0x00bc, all -> 0x00c5, TRY_LEAVE, TryCatch #10 {IOException -> 0x00bc, blocks: (B:19:0x004f, B:29:0x0095, B:47:0x00b8, B:48:0x00bb, B:63:0x00d9, B:62:0x00d5), top: B:71:0x004f, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // a.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(a.c r10, java.lang.String r11, a.v[] r12) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.w.a(a.c, java.lang.String, a.v[]):void");
    }
}
