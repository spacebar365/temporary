package org.bouncycastle.a.y.a;

import java.util.Hashtable;
import org.bouncycastle.a.p;
import org.bouncycastle.a.s.n;
import org.bouncycastle.a.z.aa;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {
    public static final org.bouncycastle.a.y.d K;
    public static final p a = new p("2.5.4.6").c();
    public static final p b = new p("2.5.4.10").c();
    public static final p c = new p("2.5.4.11").c();
    public static final p d = new p("2.5.4.12").c();
    public static final p e = new p("2.5.4.3").c();
    public static final p f = new p("2.5.4.5").c();
    public static final p g = new p("2.5.4.9").c();
    public static final p h = f;
    public static final p i = new p("2.5.4.7").c();
    public static final p j = new p("2.5.4.8").c();
    public static final p k = new p("2.5.4.4").c();
    public static final p l = new p("2.5.4.42").c();
    public static final p m = new p("2.5.4.43").c();
    public static final p n = new p("2.5.4.44").c();
    public static final p o = new p("2.5.4.45").c();
    public static final p p = new p("2.5.4.15").c();
    public static final p q = new p("2.5.4.17").c();
    public static final p r = new p("2.5.4.46").c();
    public static final p s = new p("2.5.4.65").c();
    public static final p t = new p("1.3.6.1.5.5.7.9.1").c();
    public static final p u = new p("1.3.6.1.5.5.7.9.2").c();
    public static final p v = new p("1.3.6.1.5.5.7.9.3").c();
    public static final p w = new p("1.3.6.1.5.5.7.9.4").c();
    public static final p x = new p("1.3.6.1.5.5.7.9.5").c();
    public static final p y = new p("1.3.36.8.3.14").c();
    public static final p z = new p("2.5.4.16").c();
    public static final p A = new p("2.5.4.54").c();
    public static final p B = aa.g;
    public static final p C = aa.w_;
    public static final p D = aa.i;
    public static final p E = n.X;
    public static final p F = n.Y;
    public static final p G = n.ae;
    public static final p H = E;
    public static final p I = new p("0.9.2342.19200300.100.1.25");
    public static final p J = new p("0.9.2342.19200300.100.1.1");
    private static final Hashtable N = new Hashtable();
    private static final Hashtable O = new Hashtable();
    protected final Hashtable M = a(N);
    protected final Hashtable L = a(O);

    static {
        N.put(a, "C");
        N.put(b, "O");
        N.put(d, "T");
        N.put(c, "OU");
        N.put(e, "CN");
        N.put(i, "L");
        N.put(j, "ST");
        N.put(f, "SERIALNUMBER");
        N.put(E, "E");
        N.put(I, "DC");
        N.put(J, "UID");
        N.put(g, "STREET");
        N.put(k, "SURNAME");
        N.put(l, "GIVENNAME");
        N.put(m, "INITIALS");
        N.put(n, "GENERATION");
        N.put(G, "unstructuredAddress");
        N.put(F, "unstructuredName");
        N.put(o, "UniqueIdentifier");
        N.put(r, "DN");
        N.put(s, "Pseudonym");
        N.put(z, "PostalAddress");
        N.put(y, "NameAtBirth");
        N.put(w, "CountryOfCitizenship");
        N.put(x, "CountryOfResidence");
        N.put(v, "Gender");
        N.put(u, "PlaceOfBirth");
        N.put(t, "DateOfBirth");
        N.put(q, "PostalCode");
        N.put(p, "BusinessCategory");
        N.put(B, "TelephoneNumber");
        N.put(C, "Name");
        N.put(D, "organizationIdentifier");
        O.put("c", a);
        O.put("o", b);
        O.put("t", d);
        O.put("ou", c);
        O.put("cn", e);
        O.put("l", i);
        O.put("st", j);
        O.put("sn", f);
        O.put("serialnumber", f);
        O.put("street", g);
        O.put("emailaddress", H);
        O.put("dc", I);
        O.put("e", H);
        O.put("uid", J);
        O.put("surname", k);
        O.put("givenname", l);
        O.put("initials", m);
        O.put("generation", n);
        O.put("unstructuredaddress", G);
        O.put("unstructuredname", F);
        O.put("uniqueidentifier", o);
        O.put("dn", r);
        O.put("pseudonym", s);
        O.put("postaladdress", z);
        O.put("nameofbirth", y);
        O.put("countryofcitizenship", w);
        O.put("countryofresidence", x);
        O.put("gender", v);
        O.put("placeofbirth", u);
        O.put("dateofbirth", t);
        O.put("postalcode", q);
        O.put("businesscategory", p);
        O.put("telephonenumber", B);
        O.put("name", C);
        O.put("organizationidentifier", D);
        K = new b();
    }

    protected b() {
    }

    @Override // org.bouncycastle.a.y.d
    public final String b(org.bouncycastle.a.y.c cVar) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z2 = true;
        for (org.bouncycastle.a.y.b bVar : cVar.a()) {
            if (z2) {
                z2 = false;
            } else {
                stringBuffer.append(',');
            }
            c.a(stringBuffer, bVar, this.M);
        }
        return stringBuffer.toString();
    }
}
