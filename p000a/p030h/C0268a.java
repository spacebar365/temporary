package p000a.p030h;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import org.bouncycastle.p054a.C0556as;
import org.bouncycastle.p054a.C0558au;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p054a.C0583bg;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0590bn;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.InterfaceC0618f;
import p000a.p031i.C0284e;

/* JADX INFO: renamed from: a.h.a */
/* JADX INFO: compiled from: NegTokenInit.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0268a extends AbstractC0271d {

    /* JADX INFO: renamed from: a */
    private static final C0653p f1227a = new C0653p("1.3.6.1.5.5.2");

    /* JADX INFO: renamed from: b */
    private C0653p[] f1228b;

    /* JADX INFO: renamed from: c */
    private int f1229c;

    public C0268a() {
    }

    public C0268a(C0653p[] c0653pArr, int i, byte[] bArr) {
        this.f1228b = c0653pArr;
        this.f1229c = i;
        m920b(bArr);
        m921c(null);
    }

    public C0268a(byte[] bArr) throws Throwable {
        mo915a(bArr);
    }

    /* JADX INFO: renamed from: a */
    public final C0653p[] m916a() {
        return this.f1228b;
    }

    public final String toString() {
        String strM949a = null;
        if (m923e() != null) {
            strM949a = C0284e.m949a(m923e(), 0, m923e().length);
        }
        return String.format("NegTokenInit[flags=%d,mechs=%s,mic=%s]", Integer.valueOf(this.f1229c), Arrays.toString(this.f1228b), strM949a);
    }

    @Override // p000a.p030h.AbstractC0271d
    /* JADX INFO: renamed from: b */
    public final byte[] mo917b() {
        try {
            C0625g c0625g = new C0625g();
            C0653p[] c0653pArr = this.f1228b;
            if (c0653pArr != null) {
                C0625g c0625g2 = new C0625g();
                for (C0653p c0653p : c0653pArr) {
                    c0625g2.m1521a(c0653p);
                }
                c0625g.m1521a(new C0590bn(true, 0, new C0585bi(c0625g2)));
            }
            int i = this.f1229c;
            if (i != 0) {
                c0625g.m1521a(new C0590bn(true, 1, new C0558au(i)));
            }
            byte[] bArrD = m922d();
            if (bArrD != null) {
                c0625g.m1521a(new C0590bn(true, 2, new C0581be(bArrD)));
            }
            byte[] bArrE = m923e();
            if (bArrE != null) {
                c0625g.m1521a(new C0590bn(true, 3, new C0581be(bArrE)));
            }
            C0625g c0625g3 = new C0625g();
            c0625g3.m1521a(f1227a);
            c0625g3.m1521a(new C0590bn(true, 0, new C0585bi(c0625g)));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new C0583bg(byteArrayOutputStream).mo1459a((InterfaceC0618f) new C0556as(c0625g3));
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0148 A[Catch: Throwable -> 0x0050, all -> 0x008e, TRY_LEAVE, TryCatch #4 {Throwable -> 0x0050, blocks: (B:3:0x0006, B:5:0x000e, B:20:0x005d, B:57:0x013b, B:31:0x008d, B:62:0x0148, B:61:0x0143, B:7:0x0014, B:9:0x0023, B:10:0x0044, B:11:0x004f), top: B:73:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p000a.p030h.AbstractC0271d
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void mo915a(byte[] r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p030h.C0268a.mo915a(byte[]):void");
    }
}
