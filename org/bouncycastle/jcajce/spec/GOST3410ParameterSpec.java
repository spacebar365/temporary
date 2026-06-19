package org.bouncycastle.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p061f.C0620b;
import org.bouncycastle.p054a.p061f.InterfaceC0619a;
import org.bouncycastle.p054a.p075t.InterfaceC0685a;

/* JADX INFO: loaded from: classes.dex */
public class GOST3410ParameterSpec implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: a */
    private final C0653p f6250a;

    /* JADX INFO: renamed from: b */
    private final C0653p f6251b;

    /* JADX INFO: renamed from: c */
    private final C0653p f6252c;

    private GOST3410ParameterSpec(C0653p c0653p, C0653p c0653p2) {
        this.f6250a = c0653p;
        this.f6251b = c0653p2;
        this.f6252c = null;
    }

    /* JADX INFO: renamed from: a */
    public final C0653p m4497a() {
        return this.f6250a;
    }

    /* JADX INFO: renamed from: b */
    public final C0653p m4498b() {
        return this.f6251b;
    }

    /* JADX INFO: renamed from: c */
    public final C0653p m4499c() {
        return this.f6252c;
    }

    public GOST3410ParameterSpec(String str) {
        this(C0620b.m1506b(str), str.indexOf("12-512") > 0 ? InterfaceC0685a.f2804d : str.indexOf("12-256") > 0 ? InterfaceC0685a.f2803c : InterfaceC0619a.f2208p);
    }
}
