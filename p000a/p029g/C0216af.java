package p000a.p029g;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;
import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.InterfaceC0267h;
import p000a.InterfaceC0300x;
import p000a.p006d.p010d.p011a.C0073c;
import p000a.p006d.p010d.p011a.C0074d;
import p000a.p006d.p016e.p017a.C0130c;
import p000a.p031i.C0284e;

/* JADX INFO: renamed from: a.g.af */
/* JADX INFO: compiled from: SmbFileHandleImpl.java */
/* JADX INFO: loaded from: classes.dex */
class C0216af implements InterfaceC0300x {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC1612b f971a = C1620c.m4563a((Class<?>) C0216af.class);

    /* JADX INFO: renamed from: b */
    private final InterfaceC0267h f972b;

    /* JADX INFO: renamed from: c */
    private final int f973c;

    /* JADX INFO: renamed from: d */
    private final byte[] f974d;

    /* JADX INFO: renamed from: e */
    private boolean f975e;

    /* JADX INFO: renamed from: f */
    private final long f976f;

    /* JADX INFO: renamed from: g */
    private C0235ay f977g;

    /* JADX INFO: renamed from: h */
    private final AtomicLong f978h;

    /* JADX INFO: renamed from: i */
    private final int f979i;

    /* JADX INFO: renamed from: j */
    private final int f980j;

    /* JADX INFO: renamed from: k */
    private final int f981k;

    /* JADX INFO: renamed from: l */
    private final int f982l;

    /* JADX INFO: renamed from: m */
    private final String f983m;

    /* JADX INFO: renamed from: n */
    private final StackTraceElement[] f984n;

    /* JADX INFO: renamed from: o */
    private long f985o;

    public C0216af(InterfaceC0267h interfaceC0267h, byte[] bArr, C0235ay c0235ay, String str, int i, int i2, long j) {
        this.f975e = true;
        this.f978h = new AtomicLong(1L);
        this.f972b = interfaceC0267h;
        this.f974d = bArr;
        this.f985o = j;
        this.f973c = 0;
        this.f983m = str;
        this.f979i = i;
        this.f980j = i2;
        this.f981k = 0;
        this.f982l = 0;
        this.f977g = c0235ay.m796h();
        this.f976f = c0235ay.m795g();
        if (interfaceC0267h.mo48am()) {
            this.f984n = Thread.currentThread().getStackTrace();
        } else {
            this.f984n = null;
        }
    }

    public C0216af(InterfaceC0267h interfaceC0267h, int i, C0235ay c0235ay, String str, int i2, int i3, int i4, long j) {
        this.f975e = true;
        this.f978h = new AtomicLong(1L);
        this.f972b = interfaceC0267h;
        this.f973c = i;
        this.f985o = j;
        this.f974d = null;
        this.f983m = str;
        this.f979i = i2;
        this.f980j = i3;
        this.f981k = i4;
        this.f982l = 0;
        this.f977g = c0235ay.m796h();
        this.f976f = c0235ay.m795g();
        if (interfaceC0267h.mo48am()) {
            this.f984n = Thread.currentThread().getStackTrace();
        } else {
            this.f984n = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m640a() throws C0214ad {
        if (!m644e()) {
            throw new C0214ad("Descriptor is no longer valid");
        }
        return this.f973c;
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m641b() throws C0214ad {
        if (!m644e()) {
            throw new C0214ad("Descriptor is no longer valid");
        }
        return this.f974d;
    }

    /* JADX INFO: renamed from: c */
    public final long m642c() {
        return this.f985o;
    }

    /* JADX INFO: renamed from: d */
    public final C0235ay m643d() {
        return this.f977g.m796h();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m644e() {
        return this.f975e && this.f976f == this.f977g.m795g() && this.f977g.m794f();
    }

    @Override // p000a.InterfaceC0300x, java.lang.AutoCloseable
    public void close() {
        m645f();
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: f */
    public final synchronized void m645f() {
        long jDecrementAndGet = this.f978h.decrementAndGet();
        if (jDecrementAndGet != 0) {
            if (f971a.mo4536b()) {
                f971a.mo4532a(String.format("Release %s (%d)", this, Long.valueOf(jDecrementAndGet)));
            }
        } else {
            C0235ay c0235ay = this.f977g;
            if (c0235ay != null) {
                try {
                    if (m644e()) {
                        if (f971a.mo4539c()) {
                            f971a.mo4534b("Closing file handle ".concat(String.valueOf(this)));
                        }
                        if (c0235ay.mo103b()) {
                            c0235ay.m790a(new C0130c(this.f972b, this.f974d), EnumC0261u.NO_RETRY);
                        } else {
                            c0235ay.m789a(new C0074d(this.f972b, this.f973c), new C0073c(this.f972b), EnumC0261u.NO_RETRY);
                        }
                    }
                } catch (Throwable th) {
                    this.f975e = false;
                    if (c0235ay != null) {
                        c0235ay.m797i();
                    }
                    this.f977g = null;
                    throw th;
                }
            }
            this.f975e = false;
            if (c0235ay != null) {
                c0235ay.m797i();
            }
            this.f977g = null;
        }
    }

    protected void finalize() {
        if (this.f978h.get() != 0 && this.f975e) {
            f971a.mo4540d("File handle was not properly closed: ".concat(String.valueOf(this)));
            if (this.f984n != null) {
                f971a.mo4540d(Arrays.toString(this.f984n));
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final C0216af m646g() {
        long jIncrementAndGet = this.f978h.incrementAndGet();
        if (f971a.mo4536b()) {
            f971a.mo4532a(String.format("Acquire %s (%d)", this, Long.valueOf(jIncrementAndGet)));
        }
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final void m647h() {
        this.f975e = false;
    }

    public String toString() {
        Object[] objArr = new Object[7];
        objArr[0] = this.f983m;
        objArr[1] = this.f974d != null ? C0284e.m948a(this.f974d) : Integer.valueOf(this.f973c);
        objArr[2] = Long.valueOf(this.f976f);
        objArr[3] = Integer.valueOf(this.f979i);
        objArr[4] = Integer.valueOf(this.f980j);
        objArr[5] = Integer.valueOf(this.f981k);
        objArr[6] = Integer.valueOf(this.f982l);
        return String.format("FileHandle %s [fid=%s,tree=%d,flags=%x,access=%x,attrs=%x,options=%x]", objArr);
    }

    public int hashCode() {
        return this.f974d != null ? (int) (((long) Arrays.hashCode(this.f974d)) + (this.f976f * 3)) : (int) (((long) this.f973c) + (this.f976f * 3));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0216af)) {
            return false;
        }
        C0216af c0216af = (C0216af) obj;
        return this.f974d != null ? Arrays.equals(this.f974d, c0216af.f974d) && this.f976f == c0216af.f976f : this.f973c == c0216af.f973c && this.f976f == c0216af.f976f;
    }
}
