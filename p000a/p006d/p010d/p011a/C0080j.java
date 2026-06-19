package p000a.p006d.p010d.p011a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import p000a.C0297u;
import p000a.InterfaceC0267h;
import p000a.p006d.InterfaceC0179k;
import p000a.p006d.p010d.AbstractC0103c;
import p000a.p031i.C0285f;

/* JADX INFO: renamed from: a.d.d.a.j */
/* JADX INFO: compiled from: SmbComNegotiate.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0080j extends AbstractC0103c implements InterfaceC0179k {

    /* JADX INFO: renamed from: n */
    private final boolean f363n;

    /* JADX INFO: renamed from: o */
    private String[] f364o;

    public C0080j(InterfaceC0267h interfaceC0267h, boolean z) {
        super(interfaceC0267h, (byte) 114);
        this.f363n = z;
        m363e(interfaceC0267h.mo18M());
        if (interfaceC0267h.mo61f().m960a()) {
            this.f364o = new String[]{"SMB 2.???", "SMB 2.002"};
        } else if (interfaceC0267h.mo62g().m960a()) {
            this.f364o = new String[]{"NT LM 0.12", "SMB 2.???", "SMB 2.002"};
        } else {
            this.f364o = new String[]{"NT LM 0.12"};
        }
    }

    @Override // p000a.p006d.InterfaceC0179k
    /* JADX INFO: renamed from: g_ */
    public final boolean mo268g_() {
        return this.f363n;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: f */
    protected final int mo253f(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p010d.AbstractC0103c
    /* JADX INFO: renamed from: g */
    protected final int mo254g(byte[] bArr, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (String str : this.f364o) {
            byteArrayOutputStream.write(2);
            try {
                byteArrayOutputStream.write(C0285f.m956b(str));
                byteArrayOutputStream.write(0);
            } catch (IOException e) {
                throw new C0297u(e);
            }
        }
        System.arraycopy(byteArrayOutputStream.toByteArray(), 0, bArr, i, byteArrayOutputStream.size());
        return byteArrayOutputStream.size();
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
    public final String toString() {
        return new String("SmbComNegotiate[" + super.toString() + ",wordCount=" + this.f490i + ",dialects=NT LM 0.12]");
    }
}
