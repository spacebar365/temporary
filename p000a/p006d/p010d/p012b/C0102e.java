package p000a.p006d.p010d.p012b;

import java.util.Objects;
import p000a.p029g.InterfaceC0250j;
import p000a.p031i.C0284e;

/* JADX INFO: renamed from: a.d.d.b.e */
/* JADX INFO: compiled from: SmbShareInfo.java */
/* JADX INFO: loaded from: classes.dex */
public class C0102e implements InterfaceC0250j {

    /* JADX INFO: renamed from: b */
    protected String f471b;

    /* JADX INFO: renamed from: c */
    protected int f472c;

    /* JADX INFO: renamed from: d */
    protected String f473d;

    public C0102e() {
    }

    public C0102e(String str) {
        this.f471b = str;
        this.f472c = 0;
        this.f473d = null;
    }

    @Override // p000a.p029g.InterfaceC0250j
    /* JADX INFO: renamed from: a */
    public final String mo233a() {
        return this.f471b;
    }

    @Override // p000a.p029g.InterfaceC0250j
    /* JADX INFO: renamed from: c */
    public final int mo235c() {
        return 0;
    }

    @Override // p000a.p029g.InterfaceC0250j
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        switch (this.f472c & 65535) {
            case 1:
                return 32;
            case 2:
            default:
                return 8;
            case 3:
                return 16;
        }
    }

    @Override // p000a.p029g.InterfaceC0250j
    /* JADX INFO: renamed from: e */
    public final int mo237e() {
        return 17;
    }

    @Override // p000a.p029g.InterfaceC0250j
    /* JADX INFO: renamed from: f */
    public final long mo238f() {
        return 0L;
    }

    @Override // p000a.p029g.InterfaceC0250j
    /* JADX INFO: renamed from: g */
    public final long mo239g() {
        return 0L;
    }

    @Override // p000a.p029g.InterfaceC0250j
    /* JADX INFO: renamed from: h */
    public final long mo240h() {
        return 0L;
    }

    @Override // p000a.p029g.InterfaceC0250j
    /* JADX INFO: renamed from: i */
    public final long mo241i() {
        return 0L;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0102e) {
            return Objects.equals(this.f471b, ((C0102e) obj).f471b);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f471b);
    }

    public String toString() {
        return new String("SmbShareInfo[netName=" + this.f471b + ",type=0x" + C0284e.m947a(this.f472c, 8) + ",remark=" + this.f473d + "]");
    }
}
