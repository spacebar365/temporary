package org.bouncycastle.jcajce.provider.asymmetric.util;

import org.bouncycastle.p083b.C0950f;
import org.bouncycastle.p083b.InterfaceC0890e;
import org.bouncycastle.p103c.p106c.C1219p;

/* JADX INFO: loaded from: classes.dex */
public class IESUtil {
    /* JADX INFO: renamed from: a */
    public static C1219p m4337a(C0950f c0950f, byte[] bArr) {
        if (c0950f == null) {
            return new C1219p(null, null, 128);
        }
        InterfaceC0890e interfaceC0890eM2402a = c0950f.m2402a();
        return (interfaceC0890eM2402a.mo2123a().equals("DES") || interfaceC0890eM2402a.mo2123a().equals("RC2") || interfaceC0890eM2402a.mo2123a().equals("RC5-32") || interfaceC0890eM2402a.mo2123a().equals("RC5-64")) ? new C1219p(null, null, 64, 64, bArr) : interfaceC0890eM2402a.mo2123a().equals("SKIPJACK") ? new C1219p(null, null, 80, 80, bArr) : interfaceC0890eM2402a.mo2123a().equals("GOST28147") ? new C1219p(null, null, 256, 256, bArr) : new C1219p(null, null, 128, 128, bArr);
    }
}
