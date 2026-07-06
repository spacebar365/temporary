package a.d.d.b;

import a.g.j;

/* JADX INFO: compiled from: NetServerEnum2Response.java */
/* JADX INFO: loaded from: classes.dex */
class b$a implements j {
    String a;
    int b;
    int c;
    int d;
    String e;
    final /* synthetic */ b f;

    b$a(b bVar) {
        this.f = bVar;
    }

    @Override // a.g.j
    public final String a() {
        return this.a;
    }

    @Override // a.g.j
    public final int b() {
        return (this.d & Integer.MIN_VALUE) != 0 ? 2 : 4;
    }

    @Override // a.g.j
    public final int e() {
        return 17;
    }

    @Override // a.g.j
    public final int c() {
        return 0;
    }

    @Override // a.g.j
    public final long f() {
        return 0L;
    }

    @Override // a.g.j
    public final long g() {
        return 0L;
    }

    @Override // a.g.j
    public final long h() {
        return 0L;
    }

    @Override // a.g.j
    public final long i() {
        return 0L;
    }

    public final String toString() {
        return new String("ServerInfo1[name=" + this.a + ",versionMajor=" + this.b + ",versionMinor=" + this.c + ",type=0x" + a.i.e.a(this.d, 8) + ",commentOrMasterBrowser=" + this.e + "]");
    }
}
