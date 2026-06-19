package p000a.p027f.p028a;

import java.util.Iterator;
import java.util.List;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.f.a.d */
/* JADX INFO: compiled from: AvPairs.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0202d {
    /* JADX INFO: renamed from: a */
    public static C0201c m586a(List<C0201c> list, int i) {
        for (C0201c c0201c : list) {
            if (c0201c.m584a() == i) {
                return c0201c;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static void m587a(List<C0201c> list, C0201c c0201c) {
        int iM584a = c0201c.m584a();
        Iterator<C0201c> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().m584a() == iM584a) {
                it.remove();
            }
        }
        list.add(c0201c);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m588a(List<C0201c> list) {
        Iterator<C0201c> it = list.iterator();
        int length = 0;
        while (it.hasNext()) {
            length = it.next().m585b().length + 4 + length;
        }
        byte[] bArr = new byte[length + 4];
        Iterator<C0201c> it2 = list.iterator();
        int length2 = 0;
        while (it2.hasNext()) {
            byte[] bArrM585b = it2.next().m585b();
            C0173a.m510a(r0.m584a(), bArr, length2);
            C0173a.m510a(bArrM585b.length, bArr, length2 + 2);
            System.arraycopy(bArrM585b, 0, bArr, length2 + 4, bArrM585b.length);
            length2 = bArrM585b.length + 4 + length2;
        }
        C0173a.m510a(0L, bArr, length2);
        C0173a.m510a(0L, bArr, length2 + 2);
        return bArr;
    }
}
