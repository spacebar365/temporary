package org.bouncycastle.p142f.p144b.p145a;

import java.io.BufferedWriter;
import java.io.Writer;
import org.bouncycastle.p142f.C1560k;
import org.bouncycastle.p142f.p143a.C1536a;

/* JADX INFO: renamed from: org.bouncycastle.f.b.a.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1550e extends BufferedWriter {

    /* JADX INFO: renamed from: a */
    private final int f5506a;

    /* JADX INFO: renamed from: b */
    private char[] f5507b;

    public C1550e(Writer writer) {
        super(writer);
        this.f5507b = new char[64];
        String strM4158a = C1560k.m4158a();
        if (strM4158a != null) {
            this.f5506a = strM4158a.length();
        } else {
            this.f5506a = 2;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4133a(byte[] bArr) {
        byte[] bArrM4098a = C1536a.m4098a(bArr);
        int length = 0;
        while (length < bArrM4098a.length) {
            int i = 0;
            while (i != this.f5507b.length && length + i < bArrM4098a.length) {
                this.f5507b[i] = (char) bArrM4098a[length + i];
                i++;
            }
            write(this.f5507b, 0, i);
            newLine();
            length += this.f5507b.length;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4134a(InterfaceC1549d interfaceC1549d) {
        C1548c c1548cMo4132d = interfaceC1549d.mo4132d();
        write("-----BEGIN " + c1548cMo4132d.m4129a() + "-----");
        newLine();
        if (!c1548cMo4132d.m4130b().isEmpty()) {
            for (C1547b c1547b : c1548cMo4132d.m4130b()) {
                write(c1547b.m4127a());
                write(": ");
                write(c1547b.m4128b());
                newLine();
            }
            newLine();
        }
        m4133a(c1548cMo4132d.m4131c());
        write("-----END " + c1548cMo4132d.m4129a() + "-----");
        newLine();
    }
}
