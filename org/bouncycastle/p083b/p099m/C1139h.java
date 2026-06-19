package org.bouncycastle.p083b.p099m;

import java.security.SecureRandom;
import org.bouncycastle.p083b.C1124l;
import org.bouncycastle.p083b.InterfaceC1175r;
import org.bouncycastle.p083b.InterfaceC1183z;
import org.bouncycastle.p083b.p099m.p100a.C1129a;
import org.bouncycastle.p083b.p099m.p100a.C1130b;
import org.bouncycastle.p083b.p099m.p100a.InterfaceC1131c;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.m.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1139h {

    /* JADX INFO: renamed from: a */
    private final SecureRandom f4553a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1136e f4554b;

    /* JADX INFO: renamed from: c */
    private byte[] f4555c;

    /* JADX INFO: renamed from: d */
    private int f4556d;

    /* JADX INFO: renamed from: e */
    private int f4557e;

    /* JADX INFO: renamed from: org.bouncycastle.b.m.h$a */
    private static class a implements InterfaceC1134c {

        /* JADX INFO: renamed from: a */
        private final InterfaceC1183z f4558a;

        /* JADX INFO: renamed from: b */
        private final byte[] f4559b;

        /* JADX INFO: renamed from: c */
        private final byte[] f4560c;

        /* JADX INFO: renamed from: d */
        private final int f4561d;

        public a(InterfaceC1183z interfaceC1183z, byte[] bArr, byte[] bArr2, int i) {
            this.f4558a = interfaceC1183z;
            this.f4559b = bArr;
            this.f4560c = bArr2;
            this.f4561d = i;
        }

        @Override // org.bouncycastle.p083b.p099m.InterfaceC1134c
        /* JADX INFO: renamed from: a */
        public final InterfaceC1131c mo2734a(InterfaceC1135d interfaceC1135d) {
            return new C1129a(this.f4558a, this.f4561d, interfaceC1135d, this.f4560c, this.f4559b);
        }
    }

    /* JADX INFO: renamed from: org.bouncycastle.b.m.h$b */
    private static class b implements InterfaceC1134c {

        /* JADX INFO: renamed from: a */
        private final InterfaceC1175r f4562a;

        /* JADX INFO: renamed from: b */
        private final byte[] f4563b;

        /* JADX INFO: renamed from: c */
        private final byte[] f4564c;

        /* JADX INFO: renamed from: d */
        private final int f4565d;

        public b(InterfaceC1175r interfaceC1175r, byte[] bArr, byte[] bArr2, int i) {
            this.f4562a = interfaceC1175r;
            this.f4563b = bArr;
            this.f4564c = bArr2;
            this.f4565d = i;
        }

        @Override // org.bouncycastle.p083b.p099m.InterfaceC1134c
        /* JADX INFO: renamed from: a */
        public final InterfaceC1131c mo2734a(InterfaceC1135d interfaceC1135d) {
            return new C1130b(this.f4562a, this.f4565d, interfaceC1135d, this.f4564c, this.f4563b);
        }
    }

    public C1139h() {
        this(C1124l.m2709a(), false);
    }

    public C1139h(SecureRandom secureRandom, boolean z) {
        this.f4556d = 256;
        this.f4557e = 256;
        this.f4553a = secureRandom;
        this.f4554b = new C1128a(this.f4553a, z);
    }

    public C1139h(InterfaceC1136e interfaceC1136e) {
        this.f4556d = 256;
        this.f4557e = 256;
        this.f4553a = null;
        this.f4554b = interfaceC1136e;
    }

    /* JADX INFO: renamed from: a */
    public final C1138g m2737a(InterfaceC1175r interfaceC1175r, byte[] bArr, boolean z) {
        return new C1138g(this.f4553a, this.f4554b.mo2719a(this.f4557e), new b(interfaceC1175r, bArr, this.f4555c, this.f4556d), z);
    }

    /* JADX INFO: renamed from: a */
    public final C1138g m2738a(InterfaceC1183z interfaceC1183z, byte[] bArr) {
        return new C1138g(this.f4553a, this.f4554b.mo2719a(this.f4557e), new a(interfaceC1183z, bArr, this.f4555c, this.f4556d), false);
    }

    /* JADX INFO: renamed from: a */
    public final C1139h m2739a(byte[] bArr) {
        this.f4555c = C1535a.m4086b(bArr);
        return this;
    }
}
