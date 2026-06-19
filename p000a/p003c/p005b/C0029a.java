package p000a.p003c.p005b;

import p000a.p031i.C0282c;
import p000a.p031i.C0285f;

/* JADX INFO: renamed from: a.c.b.a */
/* JADX INFO: compiled from: NdrBuffer.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0029a {

    /* JADX INFO: renamed from: a */
    public byte[] f179a;

    /* JADX INFO: renamed from: b */
    public int f180b;

    /* JADX INFO: renamed from: c */
    public int f181c;

    /* JADX INFO: renamed from: d */
    public int f182d = 0;

    /* JADX INFO: renamed from: e */
    public C0029a f183e = this;

    public C0029a(byte[] bArr, int i) {
        this.f179a = bArr;
        this.f181c = i;
        this.f180b = i;
    }

    /* JADX INFO: renamed from: a */
    public final C0029a m137a(int i) {
        C0029a c0029a = new C0029a(this.f179a, this.f180b);
        c0029a.f181c = i;
        c0029a.f183e = this.f183e;
        return c0029a;
    }

    /* JADX INFO: renamed from: a */
    public final void m138a() {
        this.f181c = this.f180b;
        this.f182d = 0;
        this.f183e = this;
    }

    /* JADX INFO: renamed from: b */
    public final void m142b(int i) {
        this.f183e.f182d = i;
    }

    /* JADX INFO: renamed from: c */
    public final void m144c(int i) {
        this.f181c += i;
        if (this.f181c - this.f180b > this.f183e.f182d) {
            this.f183e.f182d = this.f181c - this.f180b;
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m146d(int i) {
        int i2 = i - 1;
        int i3 = this.f181c - this.f180b;
        int i4 = ((i2 ^ (-1)) & (i3 + i2)) - i3;
        m144c(i4);
        return i4;
    }

    /* JADX INFO: renamed from: e */
    public final void m148e(int i) {
        this.f179a[this.f181c] = (byte) (i & 255);
        m144c(1);
    }

    /* JADX INFO: renamed from: b */
    public final int m141b() {
        int i = this.f179a[this.f181c] & 255;
        m144c(1);
        return i;
    }

    /* JADX INFO: renamed from: f */
    public final void m149f(int i) {
        m146d(2);
        C0282c.m942a((short) i, this.f179a, this.f181c);
        m144c(2);
    }

    /* JADX INFO: renamed from: c */
    public final int m143c() {
        m146d(2);
        short sM944a = C0282c.m944a(this.f179a, this.f181c);
        m144c(2);
        return sM944a;
    }

    /* JADX INFO: renamed from: g */
    public final void m150g(int i) {
        m146d(4);
        C0282c.m941a(i, this.f179a, this.f181c);
        m144c(4);
    }

    /* JADX INFO: renamed from: d */
    public final int m145d() {
        m146d(4);
        int iM945b = C0282c.m945b(this.f179a, this.f181c);
        m144c(4);
        return iM945b;
    }

    /* JADX INFO: renamed from: a */
    public final void m140a(String str) {
        m146d(4);
        int i = this.f181c;
        int length = str.length();
        C0282c.m941a(length + 1, this.f179a, i);
        int i2 = i + 4;
        C0282c.m941a(0, this.f179a, i2);
        int i3 = i2 + 4;
        C0282c.m941a(length + 1, this.f179a, i3);
        int i4 = i3 + 4;
        System.arraycopy(C0285f.m952a(str), 0, this.f179a, i4, length * 2);
        int i5 = i4 + (length * 2);
        int i6 = i5 + 1;
        this.f179a[i5] = 0;
        this.f179a[i6] = 0;
        m144c((i6 + 1) - this.f181c);
    }

    /* JADX INFO: renamed from: e */
    public final String m147e() throws C0030b {
        m146d(4);
        int i = this.f181c;
        String strM950a = null;
        int iM945b = C0282c.m945b(this.f179a, i);
        int i2 = i + 12;
        if (iM945b != 0) {
            int i3 = (iM945b - 1) * 2;
            if (i3 < 0 || i3 > 65535) {
                throw new C0030b("invalid array conformance");
            }
            strM950a = C0285f.m950a(this.f179a, i2, i3);
            i2 += i3 + 2;
        }
        m144c(i2 - this.f181c);
        return strM950a;
    }

    /* JADX INFO: renamed from: a */
    public final void m139a(Object obj) {
        if (obj == null) {
            m150g(0);
        } else {
            m150g(System.identityHashCode(obj));
        }
    }

    public final String toString() {
        return "start=" + this.f180b + ",index=" + this.f181c + ",length=" + this.f183e.f182d;
    }
}
