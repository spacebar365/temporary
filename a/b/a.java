package a.b;

import a.g.s;
import a.i;

/* JADX INFO: compiled from: AbstractCIFSContext.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends Thread implements a.c {
    private static final org.c.b a = org.c.c.a((Class<?>) a.class);
    private boolean b;

    protected abstract i k();

    public a() {
        Runtime.getRuntime().addShutdownHook(this);
    }

    @Override // a.c
    public final a.c a(i iVar) {
        return new c(this, iVar);
    }

    @Override // a.c
    public final a.c j() {
        return a(new s());
    }

    @Override // a.c
    public final a.c i() {
        return a(k());
    }

    @Override // a.c
    public final i g() {
        return k();
    }

    @Override // a.c
    public final boolean a(String str, Throwable th) {
        return false;
    }

    public boolean l() {
        if (!this.b) {
            Runtime.getRuntime().removeShutdownHook(this);
            return false;
        }
        return false;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            this.b = true;
            l();
        } catch (a.d e) {
            a.d("Failed to close context on shutdown", e);
        }
    }
}
