package a.f.a;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: AvPairs.java */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static c a(List<c> list, int i) {
        for (c cVar : list) {
            if (cVar.a() == i) {
                return cVar;
            }
        }
        return null;
    }

    public static void a(List<c> list, c cVar) {
        int iA = cVar.a();
        Iterator<c> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().a() == iA) {
                it.remove();
            }
        }
        list.add(cVar);
    }

    public static byte[] a(List<c> list) {
        Iterator<c> it = list.iterator();
        int length = 0;
        while (it.hasNext()) {
            length = it.next().b().length + 4 + length;
        }
        byte[] bArr = new byte[length + 4];
        Iterator<c> it2 = list.iterator();
        int length2 = 0;
        while (it2.hasNext()) {
            byte[] bArrB = it2.next().b();
            a.d.f.a.a(r0.a(), bArr, length2);
            a.d.f.a.a(bArrB.length, bArr, length2 + 2);
            System.arraycopy(bArrB, 0, bArr, length2 + 4, bArrB.length);
            length2 = bArrB.length + 4 + length2;
        }
        a.d.f.a.a(0L, bArr, length2);
        a.d.f.a.a(0L, bArr, length2 + 2);
        return bArr;
    }
}
