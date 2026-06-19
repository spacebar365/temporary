package p000a.p003c;

import java.io.IOException;
import p000a.InterfaceC0016c;
import p000a.p029g.C0219ai;
import p000a.p029g.InterfaceC0221ak;
import p000a.p031i.C0282c;

/* JADX INFO: renamed from: a.c.h */
/* JADX INFO: compiled from: DcerpcPipeHandle.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0039h extends AbstractC0037f {

    /* JADX INFO: renamed from: b */
    private C0219ai f203b;

    /* JADX INFO: renamed from: c */
    private InterfaceC0221ak f204c;

    public C0039h(String str, InterfaceC0016c interfaceC0016c) {
        super(interfaceC0016c, AbstractC0037f.m153a(str));
        C0028b c0028bA = m161a();
        String str2 = "smb://" + c0028bA.m131a() + "/IPC$/" + c0028bA.m133b().substring(6);
        String str3 = (String) c0028bA.m130a("server");
        String str4 = str3 != null ? "&server=" + str3 : "";
        String str5 = (String) c0028bA.m130a("address");
        str4 = str5 != null ? str4 + "&address=" + str5 : str4;
        this.f203b = new C0219ai(str4.length() > 0 ? str2 + "?" + str4.substring(1) : str2, interfaceC0016c);
        this.f204c = (InterfaceC0221ak) this.f203b.m657r().mo663a(InterfaceC0221ak.class);
    }

    @Override // p000a.p003c.AbstractC0037f
    /* JADX INFO: renamed from: a */
    protected final int mo160a(byte[] bArr, int i, int i2, byte[] bArr2) throws IOException {
        if (this.f204c.mo664a()) {
            throw new IOException("DCERPC pipe is no longer open");
        }
        int iMo662a = this.f204c.mo662a(bArr, i, i2, bArr2, m164b());
        short sM944a = C0282c.m944a(bArr2, 8);
        if (sM944a > m164b()) {
            throw new IOException("Unexpected fragment length: ".concat(String.valueOf((int) sM944a)));
        }
        while (iMo662a < sM944a) {
            int iMo661a = this.f204c.mo661a(bArr2, iMo662a, sM944a - iMo662a);
            if (iMo661a == 0) {
                throw new IOException("Unexpected EOF");
            }
            iMo662a += iMo661a;
        }
        return iMo662a;
    }

    @Override // p000a.p003c.AbstractC0037f
    /* JADX INFO: renamed from: a */
    protected final void mo163a(byte[] bArr, int i, int i2) throws IOException {
        if (this.f204c.mo664a()) {
            throw new IOException("DCERPC pipe is no longer open");
        }
        this.f204c.mo666b(bArr, i, i2);
    }

    @Override // p000a.p003c.AbstractC0037f
    /* JADX INFO: renamed from: a */
    protected final int mo159a(byte[] bArr) throws IOException {
        if (bArr.length < m164b()) {
            throw new IllegalArgumentException("buffer too small");
        }
        int iMo661a = this.f204c.mo661a(bArr, 0, bArr.length);
        if (bArr[0] != 5 || bArr[1] != 0) {
            throw new IOException("Unexpected DCERPC PDU header");
        }
        short sM944a = C0282c.m944a(bArr, 8);
        if (sM944a > m164b()) {
            throw new IOException("Unexpected fragment length: ".concat(String.valueOf((int) sM944a)));
        }
        while (iMo661a < sM944a) {
            int iMo661a2 = this.f204c.mo661a(bArr, iMo661a, sM944a - iMo661a);
            if (iMo661a2 == 0) {
                throw new IOException("Unexpected EOF");
            }
            iMo661a += iMo661a2;
        }
        return iMo661a;
    }

    @Override // p000a.p003c.AbstractC0037f, java.lang.AutoCloseable
    public final void close() {
        super.close();
        try {
            this.f204c.close();
        } finally {
            this.f203b.close();
        }
    }
}
