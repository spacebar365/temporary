package p000a.p027f;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.p031i.C0284e;

/* JADX INFO: renamed from: a.f.c */
/* JADX INFO: compiled from: Type2Message.java */
/* JADX INFO: loaded from: classes.dex */
public class C0207c extends AbstractC0198a {

    /* JADX INFO: renamed from: c */
    private static final InterfaceC1612b f927c = C1620c.m4563a((Class<?>) C0207c.class);

    /* JADX INFO: renamed from: h */
    private static final Map<String, byte[]> f928h = new HashMap();

    /* JADX INFO: renamed from: d */
    private byte[] f929d;

    /* JADX INFO: renamed from: e */
    private String f930e;

    /* JADX INFO: renamed from: f */
    private byte[] f931f;

    /* JADX INFO: renamed from: g */
    private byte[] f932g;

    public C0207c(byte[] bArr) throws IOException {
        for (int i = 0; i < 8; i++) {
            if (bArr[i] != f919a[i]) {
                throw new IOException("Not an NTLMSSP message.");
            }
        }
        if (m574a(bArr, 8) != 2) {
            throw new IOException("Not a Type 2 message.");
        }
        int iA = m574a(bArr, 20);
        m581a(iA);
        byte[] bArrB = m579b(bArr, 12);
        int iA2 = m574a(bArr, 16);
        if (bArrB.length != 0) {
            this.f930e = new String(bArrB, (iA & 1) != 0 ? "UTF-16LE" : "Cp850");
        }
        if (!m590c(bArr, 24)) {
            byte[] bArr2 = new byte[8];
            System.arraycopy(bArr, 24, bArr2, 0, 8);
            this.f929d = bArr2;
        }
        if (iA2 >= 40 && bArr.length >= 40) {
            if (!m590c(bArr, 32)) {
                byte[] bArr3 = new byte[8];
                System.arraycopy(bArr, 32, bArr3, 0, 8);
                this.f931f = bArr3;
            }
            if (iA2 < 48 || bArr.length < 48) {
                return;
            }
            byte[] bArrB2 = m579b(bArr, 40);
            if (bArrB2.length == 0) {
                return;
            }
            this.f932g = bArrB2;
        }
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m591c() {
        return this.f929d;
    }

    /* JADX INFO: renamed from: d */
    public final byte[] m592d() {
        return this.f932g;
    }

    /* JADX INFO: renamed from: c */
    private static boolean m590c(byte[] bArr, int i) {
        for (int i2 = i; i2 < i + 8; i2++) {
            if (bArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String str = this.f930e;
        byte[] bArr = this.f929d;
        byte[] bArr2 = this.f931f;
        byte[] bArr3 = this.f932g;
        return "Type2Message[target=" + str + ",challenge=" + (bArr == null ? "null" : "<" + bArr.length + " bytes>") + ",context=" + (bArr2 == null ? "null" : "<" + bArr2.length + " bytes>") + ",targetInformation=" + (bArr3 == null ? "null" : "<" + bArr3.length + " bytes>") + ",flags=0x" + C0284e.m947a(m580a(), 8) + "]";
    }
}
