package org.bouncycastle.e.b.g;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class b implements Serializable {
    private final Map<Integer, a> a = new TreeMap();

    b() {
    }

    b(r rVar, long j, byte[] bArr, byte[] bArr2) {
        for (long j2 = 0; j2 < j; j2++) {
            a(rVar, j2, bArr, bArr2);
        }
    }

    public final b a(org.bouncycastle.a.p pVar) {
        b bVar = new b();
        for (Integer num : this.a.keySet()) {
            bVar.a.put(num, this.a.get(num).a(pVar));
        }
        return bVar;
    }

    private void a(r rVar, long j, byte[] bArr, byte[] bArr2) {
        x xVarC = rVar.c();
        int iD = xVarC.d();
        long j2 = j >> iD;
        int iB = aa.b(j, iD);
        j jVar = (j) new j$a().a(j2).a(iB).a();
        if (iB < (1 << iD) - 1) {
            if (a(0) == null || iB == 0) {
                a(0, new a(xVarC, bArr, bArr2, jVar));
            }
            a(0, bArr, bArr2, jVar);
        }
        int i = 1;
        while (true) {
            long j3 = j2;
            if (i >= rVar.b()) {
                return;
            }
            int iB2 = aa.b(j3, iD);
            j2 = j3 >> iD;
            j jVar2 = (j) new j$a().d(i).a(j2).a(iB2).a();
            if (iB2 < (1 << iD) - 1) {
                if (j != 0 && (1 + j) % ((long) Math.pow((double) (1 << iD), (double) i)) == 0) {
                    if (a(i) == null) {
                        a(i, new a(rVar.c(), bArr, bArr2, jVar2));
                    }
                    a(i, bArr, bArr2, jVar2);
                }
            }
            i++;
        }
    }

    private a a(int i) {
        return this.a.get(Integer.valueOf(i));
    }

    private a a(int i, byte[] bArr, byte[] bArr2, j jVar) {
        return this.a.put(Integer.valueOf(i), this.a.get(Integer.valueOf(i)).a(bArr, bArr2, jVar));
    }

    private void a(int i, a aVar) {
        this.a.put(Integer.valueOf(i), aVar);
    }
}
