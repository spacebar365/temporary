package p000a.p029g;

import java.util.HashMap;
import java.util.Map;
import p000a.InterfaceC0298v;
import p000a.InterfaceC0299w;
import p000a.p003c.AbstractC0037f;
import p000a.p003c.C0036e;
import p000a.p003c.C0042k;
import p000a.p003c.p004a.C0018a;
import p000a.p003c.p004a.C0021d;
import p000a.p003c.p004a.C0025h;

/* JADX INFO: renamed from: a.g.w */
/* JADX INFO: compiled from: SIDCacheImpl.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0263w implements InterfaceC0299w {

    /* JADX INFO: renamed from: a */
    private Map<C0262v, C0262v> f1226a = new HashMap();

    /* JADX INFO: renamed from: a */
    private static void m913a(AbstractC0037f abstractC0037f, C0018a c0018a, InterfaceC0298v[] interfaceC0298vArr) throws C0036e, C0214ad {
        int i = 0;
        C0021d c0021d = new C0021d(c0018a, interfaceC0298vArr);
        abstractC0037f.m162a(c0021d);
        switch (c0021d.f107h) {
            case -1073741709:
            case 0:
            case 263:
                break;
            default:
                throw new C0214ad(c0021d.f107h, false);
        }
        while (true) {
            int i2 = i;
            if (i2 < interfaceC0298vArr.length) {
                C0262v c0262v = (C0262v) interfaceC0298vArr[i2].mo911a(C0262v.class);
                C0025h.j jVar = c0021d.f111l.f136b[i2];
                c0262v.f1222j = null;
                switch (jVar.f137a) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        c0262v.f1222j = new C0042k(c0021d.f110k.f130b[jVar.f139c].f140a).toString();
                        break;
                }
                c0262v.f1223k = new C0042k(jVar.f138b).toString();
                c0262v.f1221i = jVar.f137a;
                c0262v.f1224l = null;
                c0262v.f1225m = null;
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00d0 A[Catch: Throwable -> 0x00b2, all -> 0x00cd, TRY_LEAVE, TryCatch #3 {Throwable -> 0x00b2, blocks: (B:21:0x006a, B:23:0x0070, B:25:0x007b, B:26:0x0080, B:28:0x0092, B:41:0x00b1, B:59:0x00d0, B:56:0x00c9), top: B:73:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d9 A[Catch: IOException -> 0x00bc, all -> 0x00c5, TRY_LEAVE, TryCatch #10 {IOException -> 0x00bc, blocks: (B:19:0x004f, B:29:0x0095, B:47:0x00b8, B:48:0x00bb, B:63:0x00d9, B:62:0x00d5), top: B:71:0x004f, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p000a.InterfaceC0299w
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo914a(p000a.InterfaceC0016c r10, java.lang.String r11, p000a.InterfaceC0298v[] r12) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0263w.mo914a(a.c, java.lang.String, a.v[]):void");
    }
}
