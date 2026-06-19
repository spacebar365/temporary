package p000a.p006d.p010d.p012b;

import java.io.UnsupportedEncodingException;
import p000a.InterfaceC0267h;
import p000a.p006d.p010d.p013c.AbstractC0104a;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.d.b.c */
/* JADX INFO: compiled from: NetShareEnum.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0100c extends AbstractC0104a {
    public C0100c(InterfaceC0267h interfaceC0267h) {
        super(interfaceC0267h, (byte) 37, (byte) 0);
        this.f513G = new String("\\PIPE\\LANMAN");
        this.f508B = 8;
        this.f510D = (byte) 0;
        this.f512F = 0;
        this.f511E = 5000;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0104a
    /* JADX INFO: renamed from: j */
    protected final int mo319j(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0104a
    /* JADX INFO: renamed from: k */
    protected final int mo320k(byte[] bArr, int i) {
        try {
            byte[] bytes = "WrLeh\u0000B13BWz\u0000".getBytes("ASCII");
            C0173a.m510a(0L, bArr, i);
            int i2 = i + 2;
            System.arraycopy(bytes, 0, bArr, i2, bytes.length);
            int length = bytes.length + i2;
            C0173a.m510a(1L, bArr, length);
            int i3 = length + 2;
            C0173a.m510a(this.f509C, bArr, i3);
            return (i3 + 2) - i;
        } catch (UnsupportedEncodingException e) {
            return 0;
        }
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0104a
    /* JADX INFO: renamed from: l */
    protected final int mo321l(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0104a, p000a.p006d.p010d.AbstractC0103c
    public final String toString() {
        return new String("NetShareEnum[" + super.toString() + "]");
    }
}
