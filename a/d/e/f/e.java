package a.d.e.f;

import a.d.k;
import a.h;
import a.m;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* JADX INFO: compiled from: Smb2NegotiateRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class e extends a.d.e.c<f> implements k {
    private int[] a;
    private int b;
    private byte[] c;
    private int d;
    private b[] e;
    private byte[] f;

    public e(h hVar, int i) {
        super(hVar, 0);
        this.c = new byte[16];
        this.d = i;
        if (!hVar.d()) {
            this.b |= 1;
        }
        if (hVar.V() && hVar.g() != null && hVar.g().a(m.d)) {
            this.b |= 64;
        }
        Set<m> setB = m.b(m.a(m.b, hVar.f()), hVar.g());
        this.a = new int[setB.size()];
        Iterator<m> it = setB.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            this.a[i2] = it.next().b();
            i2++;
        }
        if (hVar.g().a(m.c)) {
            System.arraycopy(hVar.an(), 0, this.c, 0, this.c.length);
        }
        LinkedList linkedList = new LinkedList();
        if (hVar.g() != null && hVar.g().a(m.f)) {
            byte[] bArr = new byte[32];
            hVar.a().nextBytes(bArr);
            linkedList.add(new d(new int[]{1}, bArr));
            this.f = bArr;
            if (hVar.V()) {
                linkedList.add(new a(new int[]{2, 1}));
            }
        }
        this.e = (b[]) linkedList.toArray(new b[linkedList.size()]);
    }

    public final int k() {
        return this.d;
    }

    public final int l() {
        return this.b;
    }

    public final int[] m() {
        return this.a;
    }

    public final byte[] n() {
        return this.c;
    }

    public final b[] o() {
        return this.e;
    }

    @Override // a.d.c
    public final int l_() {
        int iA = a(this.a.length * 2, 4) + 100;
        if (this.e != null) {
            for (b bVar : this.e) {
                iA += i(bVar.a()) + 8;
            }
        }
        return i(iA);
    }

    @Override // a.d.e.b
    protected final int d(byte[] bArr, int i) {
        int i2;
        int i3;
        a.d.f.a.a(36L, bArr, i);
        a.d.f.a.a(this.a.length, bArr, i + 2);
        int i4 = i + 4;
        a.d.f.a.a(this.d, bArr, i4);
        a.d.f.a.a(0L, bArr, i4 + 2);
        int i5 = i4 + 4;
        a.d.f.a.b(this.b, bArr, i5);
        int i6 = i5 + 4;
        System.arraycopy(this.c, 0, bArr, i6, 16);
        int i7 = i6 + 16;
        if (this.e == null || this.e.length == 0) {
            a.d.f.a.c(0L, bArr, i7);
            i2 = 0;
        } else {
            a.d.f.a.a(this.e.length, bArr, i7 + 4);
            a.d.f.a.a(0L, bArr, i7 + 6);
            i2 = i7;
        }
        int i8 = i7 + 8;
        int length = this.a.length;
        for (int i9 = 0; i9 < length; i9++) {
            a.d.f.a.a(r4[i9], bArr, i8);
            i8 += 2;
        }
        int iJ = j(i8) + i8;
        if (this.e == null || this.e.length == 0) {
            i3 = iJ;
        } else {
            a.d.f.a.b(iJ - M(), bArr, i2);
            i3 = iJ;
            for (b bVar : this.e) {
                a.d.f.a.a(bVar.c(), bArr, i3);
                int i10 = i3 + 2;
                int i11 = i3 + 4;
                a.d.f.a.b(0L, bArr, i11);
                int i12 = i11 + 4;
                int i13 = i(bVar.a(bArr, i12));
                a.d.f.a.a(i13, bArr, i10);
                i3 = i12 + i13;
            }
        }
        return i3 - i;
    }

    @Override // a.d.e.b
    protected final int e(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.k
    public final boolean g_() {
        return (this.d & 2) != 0;
    }

    @Override // a.d.e.c
    protected final /* synthetic */ a.d.e.d c(a.c cVar) {
        return new f(cVar.a());
    }
}
