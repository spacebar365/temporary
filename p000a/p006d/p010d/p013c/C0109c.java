package p000a.p006d.p010d.p013c;

import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.InterfaceC0267h;

/* JADX INFO: renamed from: a.d.d.c.c */
/* JADX INFO: compiled from: TransCallNamedPipe.java */
/* JADX INFO: loaded from: classes.dex */
public class C0109c extends AbstractC0104a {

    /* JADX INFO: renamed from: n */
    private static final InterfaceC1612b f558n = C1620c.m4563a((Class<?>) C0109c.class);

    /* JADX INFO: renamed from: o */
    private byte[] f559o;

    /* JADX INFO: renamed from: p */
    private int f560p;

    /* JADX INFO: renamed from: q */
    private int f561q;

    public C0109c(InterfaceC0267h interfaceC0267h, String str, byte[] bArr, int i, int i2) {
        super(interfaceC0267h, (byte) 37, (byte) 84);
        this.f513G = str;
        this.f559o = bArr;
        this.f560p = i;
        this.f561q = i2;
        this.f511E = -1;
        this.f508B = 0;
        this.f509C = 65535;
        this.f510D = (byte) 0;
        this.f512F = 2;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0104a
    /* JADX INFO: renamed from: j */
    protected final int mo319j(byte[] bArr, int i) {
        int i2 = i + 1;
        bArr[i] = m381X();
        int i3 = i2 + 1;
        bArr[i2] = 0;
        bArr[i3] = 0;
        bArr[i3 + 1] = 0;
        return 4;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0104a
    /* JADX INFO: renamed from: k */
    protected final int mo320k(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0104a
    /* JADX INFO: renamed from: l */
    protected final int mo321l(byte[] bArr, int i) {
        if (bArr.length - i < this.f561q) {
            f558n.mo4534b("TransCallNamedPipe data too long for buffer");
            return 0;
        }
        System.arraycopy(this.f559o, this.f560p, bArr, i, this.f561q);
        return this.f561q;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0104a, p000a.p006d.p010d.AbstractC0103c
    public String toString() {
        return new String("TransCallNamedPipe[" + super.toString() + ",pipeName=" + this.f513G + "]");
    }
}
