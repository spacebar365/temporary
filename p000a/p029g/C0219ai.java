package p000a.p029g;

import java.net.MalformedURLException;
import p000a.InterfaceC0016c;
import p000a.InterfaceC0301y;
import p000a.InterfaceC0302z;
import p000a.p006d.p010d.p011a.C0078h;
import p000a.p006d.p010d.p011a.C0079i;

/* JADX INFO: renamed from: a.g.ai */
/* JADX INFO: compiled from: SmbNamedPipe.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0219ai extends C0215ae implements InterfaceC0302z {

    /* JADX INFO: renamed from: d */
    private final int f1015d;

    public C0219ai(String str, InterfaceC0016c interfaceC0016c) throws MalformedURLException {
        super(str, interfaceC0016c);
        this.f1015d = 27198979;
        m627d();
        if (!mo82a().mo91h()) {
            throw new MalformedURLException("Named pipes are only valid on IPC$");
        }
        this.f959c.m675a(16);
    }

    @Override // p000a.p029g.C0215ae
    /* JADX INFO: renamed from: a */
    protected final void mo625a(C0078h c0078h, C0079i c0079i) {
        c0078h.m262W();
        c0079i.m265Y();
    }

    @Override // p000a.p029g.C0215ae
    /* JADX INFO: renamed from: g */
    public final int mo630g() {
        return 16;
    }

    /* JADX INFO: renamed from: q */
    public final int m656q() {
        return this.f1015d;
    }

    /* JADX INFO: renamed from: r */
    public final InterfaceC0301y m657r() {
        return new C0220aj(this);
    }
}
