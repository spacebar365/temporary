package p000a.p006d.p016e.p018b;

import java.util.ArrayList;
import p000a.InterfaceC0267h;
import p000a.p006d.C0175g;
import p000a.p006d.p009c.C0058c;
import p000a.p006d.p016e.AbstractC0146d;
import p000a.p006d.p025f.C0173a;
import p000a.p029g.InterfaceC0250j;

/* JADX INFO: renamed from: a.d.e.b.b */
/* JADX INFO: compiled from: Smb2QueryDirectoryResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0136b extends AbstractC0146d {

    /* JADX INFO: renamed from: a */
    private final byte f674a;

    /* JADX INFO: renamed from: b */
    private InterfaceC0250j[] f675b;

    public C0136b(InterfaceC0267h interfaceC0267h, byte b) {
        super(interfaceC0267h);
        this.f674a = b;
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC0250j[] m458e() {
        return this.f675b;
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: d */
    protected final int mo411d(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p016e.AbstractC0134b
    /* JADX INFO: renamed from: e */
    protected final int mo412e(byte[] bArr, int i) throws C0175g {
        C0058c c0058c;
        if (C0173a.m509a(bArr, i) != 9) {
            throw new C0175g("Expected structureSize = 9");
        }
        int iM509a = C0173a.m509a(bArr, i + 2) + m432M();
        int i2 = i + 4;
        int iM511b = C0173a.m511b(bArr, i2);
        int i3 = i2 + 4;
        ArrayList arrayList = new ArrayList();
        do {
            if (this.f674a == 3) {
                c0058c = new C0058c(m448q(), true);
            } else {
                c0058c = null;
            }
            if (c0058c == null) {
                break;
            }
            c0058c.mo201a(bArr, i3, iM511b);
            arrayList.add(c0058c);
            int iM242j = c0058c.m242j();
            if (iM242j <= 0) {
                break;
            }
            i3 += iM242j;
        } while (i3 < iM509a + iM511b);
        int i4 = i3;
        this.f675b = (InterfaceC0250j[]) arrayList.toArray(new InterfaceC0250j[arrayList.size()]);
        return i4 - i;
    }
}
