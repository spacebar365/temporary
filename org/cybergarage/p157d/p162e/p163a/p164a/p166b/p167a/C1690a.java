package org.cybergarage.p157d.p162e.p163a.p164a.p166b.p167a;

import org.cybergarage.p157d.p162e.p163a.p164a.p166b.AbstractC1689a;
import org.cybergarage.p157d.p162e.p163a.p164a.p166b.p169c.C1703a;
import org.cybergarage.xml.C1750a;
import org.cybergarage.xml.C1752c;

/* JADX INFO: renamed from: org.cybergarage.d.e.a.a.b.a.a */
/* JADX INFO: compiled from: ContainerNode.java */
/* JADX INFO: loaded from: classes.dex */
public class C1690a extends AbstractC1689a {
    public C1690a() {
        m5141a("id", -1);
        m5150f("container");
        m5141a("searchable", 0);
        m5141a("childCount", 0);
        m4875d("object.container");
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m4877a(C1752c c1752c) {
        String strM5153h = c1752c.m5153h();
        if (strM5153h == null) {
            return false;
        }
        return strM5153h.equals("container");
    }

    @Override // org.cybergarage.xml.C1752c
    /* JADX INFO: renamed from: b */
    public final boolean mo4880b(C1752c c1752c) {
        int iM5159k = c1752c.m5159k();
        for (int i = 0; i < iM5159k; i++) {
            C1752c c1752cM5144c = c1752c.m5144c(i);
            if (!m4877a(c1752cM5144c) && !C1703a.m4891a(c1752cM5144c)) {
                m4871b(c1752cM5144c.m5153h(), c1752cM5144c.m5155i());
            }
        }
        int iM5157j = c1752c.m5157j();
        for (int i2 = 0; i2 < iM5157j; i2++) {
            C1750a c1750aM5143b = c1752c.m5143b(i2);
            m5145c(c1750aM5143b.m5132a(), c1750aM5143b.m5134b());
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC1689a m4878a(int i) {
        return (AbstractC1689a) m5144c(i);
    }

    /* JADX INFO: renamed from: a */
    public final void m4879a(AbstractC1689a abstractC1689a) {
        m5146c(abstractC1689a);
        abstractC1689a.m5145c("parentID", m5158j("id"));
        m5141a("childCount", m5159k());
        abstractC1689a.m4868a(m4870b());
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC1689a m4881e(String str) {
        AbstractC1689a abstractC1689aM4881e;
        if (str == null) {
            return null;
        }
        if (str.equals(m5158j("id"))) {
            return this;
        }
        int iK = m5159k();
        for (int i = 0; i < iK; i++) {
            AbstractC1689a abstractC1689aM4878a = m4878a(i);
            if (abstractC1689aM4878a == null) {
                return null;
            }
            if (!abstractC1689aM4878a.m4873c() && str.equals(abstractC1689aM4878a.m5158j("id"))) {
                return abstractC1689aM4878a;
            }
            if (abstractC1689aM4878a.m4873c() && (abstractC1689aM4881e = ((C1690a) abstractC1689aM4878a).m4881e(str)) != null) {
                return abstractC1689aM4881e;
            }
        }
        return null;
    }
}
