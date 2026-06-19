package p000a.p006d.p010d.p011a;

import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.InterfaceC0016c;
import p000a.InterfaceC0267h;
import p000a.p006d.InterfaceC0067d;
import p000a.p006d.InterfaceC0126e;
import p000a.p006d.p010d.AbstractC0103c;
import p000a.p006d.p010d.C0097b;
import p000a.p006d.p025f.C0173a;
import p000a.p031i.p032a.InterfaceC0278e;

/* JADX INFO: renamed from: a.d.d.a.d */
/* JADX INFO: compiled from: SmbComClose.java */
/* JADX INFO: loaded from: classes.dex */
public class C0074d extends AbstractC0103c implements InterfaceC0126e<C0073c> {

    /* JADX INFO: renamed from: n */
    private static final InterfaceC1612b f327n = C1620c.m4563a((Class<?>) C0074d.class);

    /* JADX INFO: renamed from: o */
    private int f328o;

    /* JADX INFO: renamed from: p */
    private long f329p;

    public C0074d(InterfaceC0267h interfaceC0267h, int i) {
        super(interfaceC0267h, (byte) 4);
        this.f328o = i;
        this.f329p = 0L;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: f */
    protected final int mo253f(byte[] bArr, int i) {
        C0173a.m510a(this.f328o, bArr, i);
        int i2 = i + 2;
        if (this.f494m != null) {
            C0097b.m313a(m343T(), this.f329p, bArr, i2);
            return 6;
        }
        f327n.mo4532a("SmbComClose without a digest");
        return 6;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: g */
    protected final int mo254g(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: h */
    protected final int mo255h(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: i */
    protected final int mo256i(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    public String toString() {
        return new String("SmbComClose[" + super.toString() + ",fid=" + this.f328o + ",lastWriteTime=" + this.f329p + "]");
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: H */
    public final /* bridge */ /* synthetic */ AbstractC0103c mo259V() {
        return (C0073c) super.mo259V();
    }

    @Override // p000a.p006d.p010d.AbstractC0103c, p000a.p006d.InterfaceC0051b
    /* JADX INFO: renamed from: f_ */
    public final /* synthetic */ InterfaceC0067d mo218f_() {
        return (C0073c) super.mo259V();
    }

    @Override // p000a.p006d.p010d.AbstractC0103c, p000a.p031i.p032a.InterfaceC0276c
    /* JADX INFO: renamed from: V */
    public final /* synthetic */ InterfaceC0278e mo218f_() {
        return (C0073c) super.mo259V();
    }

    @Override // p000a.p006d.InterfaceC0126e
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0067d mo260a(InterfaceC0016c interfaceC0016c) {
        C0073c c0073c = new C0073c(interfaceC0016c.mo114a());
        mo210a((InterfaceC0067d) c0073c);
        return c0073c;
    }
}
