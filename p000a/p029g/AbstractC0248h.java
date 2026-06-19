package p000a.p029g;

import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.C0044d;
import p000a.InterfaceC0003aa;
import p000a.InterfaceC0197f;
import p000a.InterfaceC0296t;

/* JADX INFO: renamed from: a.g.h */
/* JADX INFO: compiled from: DirFileEntryEnumIteratorBase.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0248h implements InterfaceC0197f<InterfaceC0250j> {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC1612b f1146a = C1620c.m4563a((Class<?>) AbstractC0248h.class);

    /* JADX INFO: renamed from: b */
    private final C0235ay f1147b;

    /* JADX INFO: renamed from: d */
    private final InterfaceC0003aa f1149d;

    /* JADX INFO: renamed from: e */
    private final String f1150e;

    /* JADX INFO: renamed from: g */
    private InterfaceC0250j f1152g;

    /* JADX INFO: renamed from: h */
    private int f1153h;

    /* JADX INFO: renamed from: i */
    private boolean f1154i = false;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0296t f1148c = null;

    /* JADX INFO: renamed from: f */
    private final int f1151f = 22;

    /* JADX INFO: renamed from: a */
    protected abstract InterfaceC0250j mo863a();

    /* JADX INFO: renamed from: b */
    protected abstract InterfaceC0250j[] mo864b();

    /* JADX INFO: renamed from: c */
    protected abstract boolean mo865c();

    /* JADX INFO: renamed from: d */
    protected abstract boolean mo866d();

    /* JADX INFO: renamed from: e */
    protected abstract void mo867e();

    public AbstractC0248h(C0235ay c0235ay, InterfaceC0003aa interfaceC0003aa, String str) throws Exception {
        this.f1149d = interfaceC0003aa;
        this.f1150e = str;
        this.f1147b = c0235ay.m796h();
        try {
            this.f1152g = mo863a();
            if (this.f1152g == null) {
                m875j();
            }
        } catch (Exception e) {
            m875j();
            throw e;
        }
    }

    /* JADX INFO: renamed from: f */
    public final C0235ay m871f() {
        return this.f1147b;
    }

    /* JADX INFO: renamed from: g */
    public final int m872g() {
        return this.f1151f;
    }

    /* JADX INFO: renamed from: h */
    public final String m873h() {
        return this.f1150e;
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC0003aa m874i() {
        return this.f1149d;
    }

    /* JADX INFO: renamed from: a */
    private final boolean m868a(InterfaceC0250j interfaceC0250j) {
        int iHashCode;
        String strMo233a = interfaceC0250j.mo233a();
        if (strMo233a.length() < 3 && (((iHashCode = strMo233a.hashCode()) == C0215ae.f956a || iHashCode == C0215ae.f957b) && (strMo233a.equals(".") || strMo233a.equals("..")))) {
            return false;
        }
        if (this.f1148c == null) {
            return true;
        }
        try {
            return this.f1148c.m965a();
        } catch (C0044d e) {
            f1146a.mo4544e("Failed to apply name filter", e);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return null;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final p000a.p029g.InterfaceC0250j m870a(boolean r5) {
        /*
            r4 = this;
            r1 = 0
        L1:
            a.g.j[] r2 = r4.mo864b()
        L5:
            int r0 = r4.f1153h
            int r3 = r2.length
            if (r0 >= r3) goto L1b
            int r0 = r4.f1153h
            r0 = r2[r0]
            int r3 = r4.f1153h
            int r3 = r3 + 1
            r4.f1153h = r3
            boolean r3 = r4.m868a(r0)
            if (r3 == 0) goto L5
        L1a:
            return r0
        L1b:
            if (r5 != 0) goto L33
            boolean r0 = r4.mo866d()
            if (r0 != 0) goto L33
            boolean r0 = r4.mo865c()
            if (r0 != 0) goto L2e
            r4.m875j()
            r0 = r1
            goto L1a
        L2e:
            r0 = 0
            r4.f1153h = r0
            r5 = 1
            goto L1
        L33:
            r0 = r1
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.AbstractC0248h.m870a(boolean):a.g.j");
    }

    /* JADX INFO: renamed from: j */
    protected final synchronized void m875j() {
        if (!this.f1154i) {
            this.f1154i = true;
            try {
                mo867e();
            } finally {
                this.f1152g = null;
                this.f1147b.m797i();
            }
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f1152g != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Iterator
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public InterfaceC0250j next() {
        InterfaceC0250j interfaceC0250j = this.f1152g;
        try {
            InterfaceC0250j interfaceC0250jM870a = m870a(false);
            if (interfaceC0250jM870a == null) {
                m875j();
            } else {
                this.f1152g = interfaceC0250jM870a;
            }
        } catch (C0044d e) {
            f1146a.mo4541d("Enumeration failed", e);
            this.f1152g = null;
            try {
                m875j();
            } catch (C0044d e2) {
                f1146a.mo4535b("Failed to close enum", e);
            }
        }
        return interfaceC0250j;
    }

    @Override // p000a.InterfaceC0197f, java.lang.AutoCloseable
    public void close() {
        if (this.f1152g != null) {
            m875j();
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
