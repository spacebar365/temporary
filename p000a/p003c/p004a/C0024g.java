package p000a.p003c.p004a;

import p000a.p003c.p004a.C0027j;
import p000a.p006d.p010d.p012b.C0102e;
import p000a.p029g.InterfaceC0250j;

/* JADX INFO: renamed from: a.c.a.g */
/* JADX INFO: compiled from: MsrpcShareEnum.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0024g extends C0027j.a {

    /* JADX INFO: renamed from: a.c.a.g$a */
    /* JADX INFO: compiled from: MsrpcShareEnum.java */
    class a extends C0102e {
        a(C0027j.c cVar) {
            this.f471b = cVar.f164a;
            this.f472c = cVar.f165b;
            this.f473d = cVar.f166c;
        }
    }

    public C0024g(String str) {
        super("\\\\".concat(String.valueOf(str)), new C0027j.e());
        this.f197b = 0;
        this.f198c = 3;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC0250j[] m127d() {
        C0027j.e eVar = (C0027j.e) this.f159k;
        a[] aVarArr = new a[eVar.f169a];
        for (int i = 0; i < eVar.f169a; i++) {
            aVarArr[i] = new a(eVar.f170b[i]);
        }
        return aVarArr;
    }
}
