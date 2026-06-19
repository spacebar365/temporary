package org.p037a.p038a.p039a.p040a.p041a;

import java.util.Calendar;
import org.p037a.p038a.p039a.p040a.C0453d;
import org.p037a.p038a.p039a.p040a.InterfaceC0433a;

/* JADX INFO: renamed from: org.a.a.a.a.a.b */
/* JADX INFO: compiled from: ConfigurableFTPFileEntryParserImpl.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0435b extends AbstractC0447n implements InterfaceC0433a {

    /* JADX INFO: renamed from: b */
    private final InterfaceC0438e f1556b;

    /* JADX INFO: renamed from: a */
    protected abstract C0453d mo1180a();

    public AbstractC0435b(String str) {
        super(str);
        this.f1556b = new C0439f();
    }

    public AbstractC0435b(String str, byte b) {
        super(str, (byte) 0);
        this.f1556b = new C0439f();
    }

    /* JADX INFO: renamed from: b */
    public final Calendar m1181b(String str) {
        return this.f1556b.mo1185a(str);
    }

    @Override // org.p037a.p038a.p039a.p040a.InterfaceC0433a
    /* JADX INFO: renamed from: a */
    public final void mo1178a(C0453d c0453d) {
        if (this.f1556b instanceof InterfaceC0433a) {
            C0453d c0453dMo1180a = mo1180a();
            if (c0453d != null) {
                if (c0453d.m1235b() == null) {
                    c0453d.m1234a(c0453dMo1180a.m1235b());
                }
                if (c0453d.m1237c() == null) {
                    c0453d.m1236b(c0453dMo1180a.m1237c());
                }
                ((InterfaceC0433a) this.f1556b).mo1178a(c0453d);
                return;
            }
            ((InterfaceC0433a) this.f1556b).mo1178a(c0453dMo1180a);
        }
    }
}
