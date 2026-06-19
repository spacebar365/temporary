package p000a.p002b;

import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.C0044d;
import p000a.InterfaceC0016c;
import p000a.InterfaceC0272i;
import p000a.p029g.C0259s;

/* JADX INFO: renamed from: a.b.a */
/* JADX INFO: compiled from: AbstractCIFSContext.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0011a extends Thread implements InterfaceC0016c {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC1612b f83a = C1620c.m4563a((Class<?>) AbstractC0011a.class);

    /* JADX INFO: renamed from: b */
    private boolean f84b;

    /* JADX INFO: renamed from: k */
    protected abstract InterfaceC0272i mo112k();

    public AbstractC0011a() {
        Runtime.getRuntime().addShutdownHook(this);
    }

    @Override // p000a.InterfaceC0016c
    /* JADX INFO: renamed from: a */
    public final InterfaceC0016c mo107a(InterfaceC0272i interfaceC0272i) {
        return new C0013c(this, interfaceC0272i);
    }

    @Override // p000a.InterfaceC0016c
    /* JADX INFO: renamed from: j */
    public final InterfaceC0016c mo111j() {
        return mo107a(new C0259s());
    }

    @Override // p000a.InterfaceC0016c
    /* JADX INFO: renamed from: i */
    public final InterfaceC0016c mo110i() {
        return mo107a(mo112k());
    }

    @Override // p000a.InterfaceC0016c
    /* JADX INFO: renamed from: g */
    public final InterfaceC0272i mo109g() {
        return mo112k();
    }

    @Override // p000a.InterfaceC0016c
    /* JADX INFO: renamed from: a */
    public final boolean mo108a(String str, Throwable th) {
        return false;
    }

    /* JADX INFO: renamed from: l */
    public boolean mo113l() {
        if (!this.f84b) {
            Runtime.getRuntime().removeShutdownHook(this);
            return false;
        }
        return false;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            this.f84b = true;
            mo113l();
        } catch (C0044d e) {
            f83a.mo4541d("Failed to close context on shutdown", e);
        }
    }
}
