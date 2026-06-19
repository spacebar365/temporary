package org.p037a.p038a.p039a.p040a.p041a;

import org.p037a.p038a.p039a.p040a.AbstractC0458i;
import org.p037a.p038a.p039a.p040a.C0456g;
import org.p037a.p038a.p039a.p040a.InterfaceC0457h;

/* JADX INFO: renamed from: org.a.a.a.a.a.a */
/* JADX INFO: compiled from: CompositeFileEntryParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0434a extends AbstractC0458i {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0457h[] f1554a;

    /* JADX INFO: renamed from: b */
    private InterfaceC0457h f1555b = null;

    public C0434a(InterfaceC0457h[] interfaceC0457hArr) {
        this.f1554a = interfaceC0457hArr;
    }

    @Override // org.p037a.p038a.p039a.p040a.InterfaceC0457h
    /* JADX INFO: renamed from: a */
    public final C0456g mo1179a(String str) {
        if (this.f1555b != null) {
            C0456g c0456gMo1179a = this.f1555b.mo1179a(str);
            if (c0456gMo1179a != null) {
                return c0456gMo1179a;
            }
        } else {
            for (InterfaceC0457h interfaceC0457h : this.f1554a) {
                C0456g c0456gMo1179a2 = interfaceC0457h.mo1179a(str);
                if (c0456gMo1179a2 != null) {
                    this.f1555b = interfaceC0457h;
                    return c0456gMo1179a2;
                }
            }
        }
        return null;
    }
}
