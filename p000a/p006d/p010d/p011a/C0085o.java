package p000a.p006d.p010d.p011a;

import java.util.Date;
import p000a.InterfaceC0267h;
import p000a.p006d.InterfaceC0177i;
import p000a.p006d.p010d.AbstractC0103c;
import p000a.p006d.p025f.C0173a;
import p000a.p031i.C0284e;

/* JADX INFO: renamed from: a.d.d.a.o */
/* JADX INFO: compiled from: SmbComQueryInformationResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0085o extends AbstractC0103c implements InterfaceC0177i {

    /* JADX INFO: renamed from: n */
    private int f392n;

    /* JADX INFO: renamed from: o */
    private long f393o;

    /* JADX INFO: renamed from: p */
    private long f394p;

    /* JADX INFO: renamed from: q */
    private int f395q;

    public C0085o(InterfaceC0267h interfaceC0267h, long j) {
        super(interfaceC0267h, (byte) 8);
        this.f392n = 0;
        this.f393o = 0L;
        this.f395q = 0;
        this.f394p = j;
    }

    @Override // p000a.p006d.InterfaceC0177i
    /* JADX INFO: renamed from: b */
    public final int mo227b() {
        return this.f392n;
    }

    @Override // p000a.p006d.InterfaceC0177i
    /* JADX INFO: renamed from: b_ */
    public final long mo228b_() {
        return this.f393o + this.f394p;
    }

    @Override // p000a.p006d.InterfaceC0177i
    /* JADX INFO: renamed from: d */
    public final long mo230d() {
        return this.f393o + this.f394p;
    }

    @Override // p000a.p006d.InterfaceC0177i
    /* JADX INFO: renamed from: e */
    public final long mo231e() {
        return this.f393o + this.f394p;
    }

    @Override // p000a.p006d.InterfaceC0177i
    /* JADX INFO: renamed from: c_ */
    public final long mo229c_() {
        return this.f395q;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: f */
    protected final int mo253f(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: g */
    protected final int mo254g(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: h */
    protected final int mo255h(byte[] bArr, int i) {
        if (this.f490i == 0) {
            return 0;
        }
        this.f392n = C0173a.m509a(bArr, i);
        int i2 = i + 2;
        this.f393o = C0173a.m517e(bArr, i2);
        this.f395q = C0173a.m511b(bArr, i2 + 4);
        return 20;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: i */
    protected final int mo256i(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    public final String toString() {
        return new String("SmbComQueryInformationResponse[" + super.toString() + ",fileAttributes=0x" + C0284e.m947a(this.f392n, 4) + ",lastWriteTime=" + new Date(this.f393o) + ",fileSize=" + this.f395q + "]");
    }
}
