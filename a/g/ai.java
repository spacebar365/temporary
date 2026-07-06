package a.g;

import java.net.MalformedURLException;

/* JADX INFO: compiled from: SmbNamedPipe.java */
/* JADX INFO: loaded from: classes.dex */
public final class ai extends ae implements a.z {
    private final int d;

    public ai(String str, a.c cVar) throws MalformedURLException {
        super(str, cVar);
        this.d = 27198979;
        d();
        if (!a().h()) {
            throw new MalformedURLException("Named pipes are only valid on IPC$");
        }
        this.c.a(16);
    }

    @Override // a.g.ae
    protected final void a(a.d.d.a.h hVar, a.d.d.a.i iVar) {
        hVar.W();
        iVar.Y();
    }

    @Override // a.g.ae
    public final int g() {
        return 16;
    }

    public final int q() {
        return this.d;
    }

    public final a.y r() {
        return new aj(this);
    }
}
