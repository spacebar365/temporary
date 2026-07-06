package a.g;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: SmbFileHandleImpl.java */
/* JADX INFO: loaded from: classes.dex */
class af implements a.x {
    private static final org.c.b a = org.c.c.a((Class<?>) af.class);
    private final a.h b;
    private final int c;
    private final byte[] d;
    private boolean e;
    private final long f;
    private ay g;
    private final AtomicLong h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final String m;
    private final StackTraceElement[] n;
    private long o;

    public af(a.h hVar, byte[] bArr, ay ayVar, String str, int i, int i2, long j) {
        this.e = true;
        this.h = new AtomicLong(1L);
        this.b = hVar;
        this.d = bArr;
        this.o = j;
        this.c = 0;
        this.m = str;
        this.i = i;
        this.j = i2;
        this.k = 0;
        this.l = 0;
        this.g = ayVar.h();
        this.f = ayVar.g();
        if (hVar.am()) {
            this.n = Thread.currentThread().getStackTrace();
        } else {
            this.n = null;
        }
    }

    public af(a.h hVar, int i, ay ayVar, String str, int i2, int i3, int i4, long j) {
        this.e = true;
        this.h = new AtomicLong(1L);
        this.b = hVar;
        this.c = i;
        this.o = j;
        this.d = null;
        this.m = str;
        this.i = i2;
        this.j = i3;
        this.k = i4;
        this.l = 0;
        this.g = ayVar.h();
        this.f = ayVar.g();
        if (hVar.am()) {
            this.n = Thread.currentThread().getStackTrace();
        } else {
            this.n = null;
        }
    }

    public final int a() throws ad {
        if (!e()) {
            throw new ad("Descriptor is no longer valid");
        }
        return this.c;
    }

    public final byte[] b() throws ad {
        if (!e()) {
            throw new ad("Descriptor is no longer valid");
        }
        return this.d;
    }

    public final long c() {
        return this.o;
    }

    public final ay d() {
        return this.g.h();
    }

    public final boolean e() {
        return this.e && this.f == this.g.g() && this.g.f();
    }

    @Override // a.x, java.lang.AutoCloseable
    public void close() {
        f();
    }

    /* JADX WARN: Finally extract failed */
    public final synchronized void f() {
        long jDecrementAndGet = this.h.decrementAndGet();
        if (jDecrementAndGet != 0) {
            if (a.b()) {
                a.a(String.format("Release %s (%d)", this, Long.valueOf(jDecrementAndGet)));
            }
        } else {
            ay ayVar = this.g;
            if (ayVar != null) {
                try {
                    if (e()) {
                        if (a.c()) {
                            a.b("Closing file handle ".concat(String.valueOf(this)));
                        }
                        if (ayVar.b()) {
                            ayVar.a(new a.d.e.a.c(this.b, this.d), u.c);
                        } else {
                            ayVar.a(new a.d.d.a.d(this.b, this.c), new a.d.d.a.c(this.b), u.c);
                        }
                    }
                } catch (Throwable th) {
                    this.e = false;
                    if (ayVar != null) {
                        ayVar.i();
                    }
                    this.g = null;
                    throw th;
                }
            }
            this.e = false;
            if (ayVar != null) {
                ayVar.i();
            }
            this.g = null;
        }
    }

    protected void finalize() {
        if (this.h.get() != 0 && this.e) {
            a.d("File handle was not properly closed: ".concat(String.valueOf(this)));
            if (this.n != null) {
                a.d(Arrays.toString(this.n));
            }
        }
    }

    public final af g() {
        long jIncrementAndGet = this.h.incrementAndGet();
        if (a.b()) {
            a.a(String.format("Acquire %s (%d)", this, Long.valueOf(jIncrementAndGet)));
        }
        return this;
    }

    public final void h() {
        this.e = false;
    }

    public String toString() {
        Object[] objArr = new Object[7];
        objArr[0] = this.m;
        objArr[1] = this.d != null ? a.i.e.a(this.d) : Integer.valueOf(this.c);
        objArr[2] = Long.valueOf(this.f);
        objArr[3] = Integer.valueOf(this.i);
        objArr[4] = Integer.valueOf(this.j);
        objArr[5] = Integer.valueOf(this.k);
        objArr[6] = Integer.valueOf(this.l);
        return String.format("FileHandle %s [fid=%s,tree=%d,flags=%x,access=%x,attrs=%x,options=%x]", objArr);
    }

    public int hashCode() {
        return this.d != null ? (int) (((long) Arrays.hashCode(this.d)) + (this.f * 3)) : (int) (((long) this.c) + (this.f * 3));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof af)) {
            return false;
        }
        af afVar = (af) obj;
        return this.d != null ? Arrays.equals(this.d, afVar.d) && this.f == afVar.f : this.c == afVar.c && this.f == afVar.f;
    }
}
