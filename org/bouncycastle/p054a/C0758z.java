package org.bouncycastle.p054a;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: org.bouncycastle.a.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0758z {

    /* JADX INFO: renamed from: a */
    private final InputStream f3112a;

    /* JADX INFO: renamed from: b */
    private final int f3113b;

    /* JADX INFO: renamed from: c */
    private final byte[][] f3114c;

    public C0758z(InputStream inputStream) {
        this(inputStream, C0612ch.m1489a(inputStream));
    }

    public C0758z(InputStream inputStream, int i) {
        this.f3112a = inputStream;
        this.f3113b = i;
        this.f3114c = new byte[11][];
    }

    /* JADX INFO: renamed from: a */
    final AbstractC0686u m1779a(boolean z, int i) throws IOException {
        if (!z) {
            return new C0590bn(false, i, new C0581be(((C0605ca) this.f3112a).m1477b()));
        }
        C0625g c0625gM1780b = m1780b();
        return this.f3112a instanceof C0607cc ? c0625gM1780b.m1519a() == 1 ? new C0553ap(true, i, c0625gM1780b.m1520a(0)) : new C0553ap(false, i, C0544ag.m1407a(c0625gM1780b)) : c0625gM1780b.m1519a() == 1 ? new C0590bn(true, i, c0625gM1780b.m1520a(0)) : new C0590bn(false, i, C0561ax.m1416a(c0625gM1780b));
    }

    /* JADX INFO: renamed from: b */
    final C0625g m1780b() throws IOException {
        C0625g c0625g = new C0625g();
        while (true) {
            InterfaceC0618f interfaceC0618fM1778a = m1778a();
            if (interfaceC0618fM1778a == null) {
                return c0625g;
            }
            if (interfaceC0618fM1778a instanceof InterfaceC0606cb) {
                c0625g.m1521a(((InterfaceC0606cb) interfaceC0618fM1778a).mo1398d());
            } else {
                c0625g.m1521a(interfaceC0618fM1778a.mo1358i());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC0618f m1778a() throws IOException {
        int i = this.f3112a.read();
        if (i == -1) {
            return null;
        }
        if (this.f3112a instanceof C0607cc) {
            ((C0607cc) this.f3112a).m1479a(false);
        }
        int iM1550a = C0638l.m1550a(this.f3112a, i);
        boolean z = (i & 32) != 0;
        int iM1555b = C0638l.m1555b(this.f3112a, this.f3113b);
        if (iM1555b < 0) {
            if (!z) {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
            C0758z c0758z = new C0758z(new C0607cc(this.f3112a, this.f3113b), this.f3113b);
            if ((i & 64) != 0) {
                return new C0543af(iM1550a, c0758z);
            }
            if ((i & 128) != 0) {
                return new C0554aq(true, iM1550a, c0758z);
            }
            switch (iM1550a) {
                case 4:
                    return new C0547aj(c0758z);
                case 8:
                    return new C0560aw(c0758z);
                case 16:
                    return new C0550am(c0758z);
                case 17:
                    return new C0552ao(c0758z);
                default:
                    throw new C0629i("unknown BER object encountered: 0x" + Integer.toHexString(iM1550a));
            }
        }
        C0605ca c0605ca = new C0605ca(this.f3112a, iM1555b);
        if ((i & 64) != 0) {
            return new C0595bs(z, iM1550a, c0605ca.m1477b());
        }
        if ((i & 128) != 0) {
            return new C0554aq(z, iM1550a, new C0758z(c0605ca));
        }
        if (!z) {
            switch (iM1550a) {
                case 4:
                    return new C0582bf(c0605ca);
                default:
                    try {
                        return C0638l.m1553a(iM1550a, c0605ca, this.f3114c);
                    } catch (IllegalArgumentException e) {
                        throw new C0629i("corrupted stream detected", e);
                    }
            }
        }
        switch (iM1550a) {
            case 4:
                return new C0547aj(new C0758z(c0605ca));
            case 8:
                return new C0560aw(new C0758z(c0605ca));
            case 16:
                return new C0586bj(new C0758z(c0605ca));
            case 17:
                return new C0588bl(new C0758z(c0605ca));
            default:
                throw new IOException("unknown tag " + iM1550a + " encountered");
        }
    }
}
