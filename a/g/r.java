package a.g;

import java.util.Arrays;

/* JADX INFO: compiled from: NtlmPasswordAuthentication.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class r extends s {
    private byte[] a;
    private byte[] b;
    private boolean c = false;
    private a.c d;

    @Override // a.g.s, a.g.b
    public final /* synthetic */ b c() {
        return i();
    }

    @Override // a.g.s
    public final /* synthetic */ Object clone() {
        return i();
    }

    @Override // a.g.s
    public final /* synthetic */ s e() {
        return i();
    }

    private r() {
    }

    private r i() {
        r rVar = new r();
        rVar.d = this.d;
        if (this.c) {
            rVar.c = true;
            rVar.a = this.a != null ? Arrays.copyOf(this.a, this.a.length) : null;
            rVar.b = this.b != null ? Arrays.copyOf(this.b, this.b.length) : null;
        } else {
            s.a(rVar, this);
        }
        return rVar;
    }

    @Override // a.g.s, java.security.Principal
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (!(obj instanceof r)) {
            return !this.c;
        }
        r rVar = (r) obj;
        if (this.c && rVar.c) {
            return Arrays.equals(this.a, rVar.a) && Arrays.equals(this.b, rVar.b);
        }
        return true;
    }

    public final boolean d() {
        return this.c;
    }

    @Override // a.g.s
    public final byte[] a(a.c cVar, byte[] bArr) {
        return this.c ? this.a : super.a(cVar, bArr);
    }

    @Override // a.g.s
    public final byte[] b(a.c cVar, byte[] bArr) {
        return this.c ? this.b : super.b(cVar, bArr);
    }

    @Override // a.g.s
    public final void a(a.c cVar, byte[] bArr, byte[] bArr2, int i) throws ad {
        if (!this.c) {
            super.a(cVar, bArr, bArr2, i);
        }
    }
}
