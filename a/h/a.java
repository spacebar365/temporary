package a.h;

import a.i.e;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import org.bouncycastle.a.as;
import org.bouncycastle.a.au;
import org.bouncycastle.a.be;
import org.bouncycastle.a.bg;
import org.bouncycastle.a.bi;
import org.bouncycastle.a.bn;
import org.bouncycastle.a.f;
import org.bouncycastle.a.g;
import org.bouncycastle.a.p;

/* JADX INFO: compiled from: NegTokenInit.java */
/* JADX INFO: loaded from: classes.dex */
public final class a extends d {
    private static final p a = new p("1.3.6.1.5.5.2");
    private p[] b;
    private int c;

    public a() {
    }

    public a(p[] pVarArr, int i, byte[] bArr) {
        this.b = pVarArr;
        this.c = i;
        b(bArr);
        c(null);
    }

    public a(byte[] bArr) throws Throwable {
        a(bArr);
    }

    public final p[] a() {
        return this.b;
    }

    public final String toString() {
        String strA = null;
        if (e() != null) {
            strA = e.a(e(), 0, e().length);
        }
        return String.format("NegTokenInit[flags=%d,mechs=%s,mic=%s]", Integer.valueOf(this.c), Arrays.toString(this.b), strA);
    }

    @Override // a.h.d
    public final byte[] b() {
        try {
            g gVar = new g();
            p[] pVarArr = this.b;
            if (pVarArr != null) {
                g gVar2 = new g();
                for (p pVar : pVarArr) {
                    gVar2.a(pVar);
                }
                gVar.a(new bn(true, 0, new bi(gVar2)));
            }
            int i = this.c;
            if (i != 0) {
                gVar.a(new bn(true, 1, new au(i)));
            }
            byte[] bArrD = d();
            if (bArrD != null) {
                gVar.a(new bn(true, 2, new be(bArrD)));
            }
            byte[] bArrE = e();
            if (bArrE != null) {
                gVar.a(new bn(true, 3, new be(bArrE)));
            }
            g gVar3 = new g();
            gVar3.a(a);
            gVar3.a(new bn(true, 0, new bi(gVar)));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new bg(byteArrayOutputStream).a((f) new as(gVar3));
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0148 A[Catch: Throwable -> 0x0050, all -> 0x008e, TRY_LEAVE, TryCatch #4 {Throwable -> 0x0050, blocks: (B:3:0x0006, B:5:0x000e, B:20:0x005d, B:57:0x013b, B:31:0x008d, B:62:0x0148, B:61:0x0143, B:7:0x0014, B:9:0x0023, B:10:0x0044, B:11:0x004f), top: B:73:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // a.h.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void a(byte[] r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.h.a.a(byte[]):void");
    }
}
