package p000a.p003c.p004a;

import p000a.InterfaceC0298v;
import p000a.p003c.C0043l;
import p000a.p003c.p004a.C0025h;

/* JADX INFO: renamed from: a.c.a.b */
/* JADX INFO: compiled from: LsarSidArrayX.java */
/* JADX INFO: loaded from: classes.dex */
final class C0019b extends C0025h.g {
    C0019b(InterfaceC0298v[] interfaceC0298vArr) {
        this.f132a = interfaceC0298vArr.length;
        this.f133b = new C0025h.h[interfaceC0298vArr.length];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < interfaceC0298vArr.length) {
                this.f133b[i2] = new C0025h.h();
                this.f133b[i2].f134a = (C0043l.b) interfaceC0298vArr[i2].mo911a(C0043l.b.class);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }
}
