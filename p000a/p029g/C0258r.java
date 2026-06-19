package p000a.p029g;

import java.util.Arrays;
import p000a.InterfaceC0016c;

/* JADX INFO: renamed from: a.g.r */
/* JADX INFO: compiled from: NtlmPasswordAuthentication.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C0258r extends C0259s {

    /* JADX INFO: renamed from: a */
    private byte[] f1201a;

    /* JADX INFO: renamed from: b */
    private byte[] f1202b;

    /* JADX INFO: renamed from: c */
    private boolean f1203c = false;

    /* JADX INFO: renamed from: d */
    private InterfaceC0016c f1204d;

    private C0258r() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // p000a.p029g.C0259s
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C0258r mo805c() {
        C0258r c0258r = new C0258r();
        c0258r.f1204d = this.f1204d;
        if (this.f1203c) {
            c0258r.f1203c = true;
            c0258r.f1201a = this.f1201a != null ? Arrays.copyOf(this.f1201a, this.f1201a.length) : null;
            c0258r.f1202b = this.f1202b != null ? Arrays.copyOf(this.f1202b, this.f1202b.length) : null;
        } else {
            C0259s.m895a(c0258r, this);
        }
        return c0258r;
    }

    @Override // p000a.p029g.C0259s, java.security.Principal
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (!(obj instanceof C0258r)) {
            return !this.f1203c;
        }
        C0258r c0258r = (C0258r) obj;
        if (this.f1203c && c0258r.f1203c) {
            return Arrays.equals(this.f1201a, c0258r.f1201a) && Arrays.equals(this.f1202b, c0258r.f1202b);
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m892d() {
        return this.f1203c;
    }

    @Override // p000a.p029g.C0259s
    /* JADX INFO: renamed from: a */
    public final byte[] mo890a(InterfaceC0016c interfaceC0016c, byte[] bArr) {
        return this.f1203c ? this.f1201a : super.mo890a(interfaceC0016c, bArr);
    }

    @Override // p000a.p029g.C0259s
    /* JADX INFO: renamed from: b */
    public final byte[] mo891b(InterfaceC0016c interfaceC0016c, byte[] bArr) {
        return this.f1203c ? this.f1202b : super.mo891b(interfaceC0016c, bArr);
    }

    @Override // p000a.p029g.C0259s
    /* JADX INFO: renamed from: a */
    public final void mo889a(InterfaceC0016c interfaceC0016c, byte[] bArr, byte[] bArr2, int i) throws C0214ad {
        if (!this.f1203c) {
            super.mo889a(interfaceC0016c, bArr, bArr2, i);
        }
    }
}
