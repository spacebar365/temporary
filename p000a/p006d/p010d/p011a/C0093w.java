package p000a.p006d.p010d.p011a;

import java.io.UnsupportedEncodingException;
import p000a.C0297u;
import p000a.InterfaceC0267h;
import p000a.p006d.InterfaceC0181m;
import p000a.p006d.p010d.AbstractC0068a;
import p000a.p006d.p010d.AbstractC0103c;

/* JADX INFO: renamed from: a.d.d.a.w */
/* JADX INFO: compiled from: SmbComTreeConnectAndXResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0093w extends AbstractC0068a implements InterfaceC0181m {

    /* JADX INFO: renamed from: n */
    private boolean f429n;

    /* JADX INFO: renamed from: o */
    private boolean f430o;

    /* JADX INFO: renamed from: p */
    private String f431p;

    /* JADX INFO: renamed from: q */
    private String f432q;

    public C0093w(InterfaceC0267h interfaceC0267h, AbstractC0103c abstractC0103c) {
        super(interfaceC0267h, abstractC0103c);
        this.f432q = "";
    }

    @Override // p000a.p006d.InterfaceC0181m
    /* JADX INFO: renamed from: p_ */
    public final String mo309p_() {
        return this.f431p;
    }

    @Override // p000a.p006d.InterfaceC0181m
    /* JADX INFO: renamed from: g */
    public final boolean mo307g() {
        return this.f430o;
    }

    @Override // p000a.p006d.InterfaceC0181m
    /* JADX INFO: renamed from: h */
    public final boolean mo308h() {
        return m361d_() != 65535;
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
        this.f429n = (bArr[i] & 1) == 1;
        this.f430o = (bArr[i] & 2) == 2;
        return 2;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: i */
    protected final int mo256i(byte[] bArr, int i) {
        int i2 = 0;
        while (bArr[i + i2] != 0) {
            int i3 = i2 + 1;
            if (i2 > 32) {
                throw new C0297u("zero termination not found: ".concat(String.valueOf(this)));
            }
            i2 = i3;
        }
        try {
            this.f431p = new String(bArr, i, i2, "ASCII");
            return ((i2 + 1) + i) - i;
        } catch (UnsupportedEncodingException e) {
            return 0;
        }
    }

    @Override // p000a.p006d.p010d.AbstractC0068a, p000a.p006d.p010d.AbstractC0103c
    public final String toString() {
        return new String("SmbComTreeConnectAndXResponse[" + super.toString() + ",supportSearchBits=" + this.f429n + ",shareIsInDfs=" + this.f430o + ",service=" + this.f431p + ",nativeFileSystem=" + this.f432q + "]");
    }
}
