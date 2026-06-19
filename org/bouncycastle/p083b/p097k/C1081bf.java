package org.bouncycastle.p083b.p097k;

import java.security.SecureRandom;
import org.bouncycastle.p083b.InterfaceC1003i;

/* JADX INFO: renamed from: org.bouncycastle.b.k.bf */
/* JADX INFO: loaded from: classes.dex */
public final class C1081bf implements InterfaceC1003i {

    /* JADX INFO: renamed from: a */
    private SecureRandom f4422a;

    /* JADX INFO: renamed from: b */
    private InterfaceC1003i f4423b;

    public C1081bf(InterfaceC1003i interfaceC1003i, SecureRandom secureRandom) {
        this.f4422a = secureRandom;
        this.f4423b = interfaceC1003i;
    }

    /* JADX INFO: renamed from: a */
    public final SecureRandom m2613a() {
        return this.f4422a;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC1003i m2614b() {
        return this.f4423b;
    }
}
