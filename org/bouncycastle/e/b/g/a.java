package org.bouncycastle.e.b.g;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Serializable {
    private transient k a;
    private final int b;
    private final List<c> c;
    private int d;
    private u e;
    private List<u> f;
    private Map<Integer, LinkedList<u>> g;
    private Stack<u> h;
    private Map<Integer, u> i;
    private int j;
    private boolean k;

    private a(a aVar, byte[] bArr, byte[] bArr2, j jVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = new ArrayList();
        this.f.addAll(aVar.f);
        this.g = aVar.g;
        this.h = new Stack<>();
        this.h.addAll(aVar.h);
        this.c = aVar.c;
        this.i = new TreeMap(aVar.i);
        this.j = aVar.j;
        c(bArr, bArr2, jVar);
        aVar.k = true;
    }

    private a(k kVar, int i, int i2) {
        this.a = kVar;
        this.b = i;
        this.d = i2;
        if (i2 > i || i2 < 2 || (i - i2) % 2 != 0) {
            throw new IllegalArgumentException("illegal value for BDS parameter k");
        }
        this.f = new ArrayList();
        this.g = new TreeMap();
        this.h = new Stack<>();
        this.c = new ArrayList();
        for (int i3 = 0; i3 < i - i2; i3++) {
            this.c.add(new c(i3));
        }
        this.i = new TreeMap();
        this.j = 0;
        this.k = false;
    }

    a(x xVar, int i) {
        this(xVar.e(), xVar.d(), xVar.f());
        this.j = i;
        this.k = true;
    }

    a(x xVar, byte[] bArr, byte[] bArr2, j jVar) {
        this(xVar.e(), xVar.d(), xVar.f());
        b(bArr, bArr2, jVar);
    }

    a(x xVar, byte[] bArr, byte[] bArr2, j jVar, int i) {
        this(xVar.e(), xVar.d(), xVar.f());
        b(bArr, bArr2, jVar);
        while (this.j < i) {
            c(bArr, bArr2, jVar);
            this.k = false;
        }
    }

    private c b() {
        c cVar = null;
        for (c cVar2 : this.c) {
            if (!cVar2.c() && cVar2.d()) {
                if (cVar == null) {
                    cVar = cVar2;
                } else if (cVar2.a() < cVar.a()) {
                    cVar = cVar2;
                } else {
                    if (cVar2.a() != cVar.a() || cVar2.b() >= cVar.b()) {
                        cVar2 = cVar;
                    }
                    cVar = cVar2;
                }
            }
        }
        return cVar;
    }

    private void b(byte[] bArr, byte[] bArr2, j jVar) {
        if (jVar == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        i iVar = (i) new i$a().d(jVar.e()).a(jVar.f()).a();
        int i = 0;
        g gVar = (g) new g$a().d(jVar.e()).a(jVar.f()).a();
        i iVar2 = iVar;
        while (i < (1 << this.b)) {
            j jVar2 = (j) new j$a().d(jVar.e()).a(jVar.f()).a(i).b(jVar.c()).c(jVar.d()).e(jVar.g()).a();
            this.a.a(this.a.a(bArr2, jVar2), bArr);
            n nVarA = this.a.a(jVar2);
            i iVar3 = (i) new i$a().d(iVar2.e()).a(iVar2.f()).a(i).b(iVar2.c()).c(iVar2.d()).e(iVar2.g()).a();
            u uVarA = v.a(this.a, nVarA, iVar3);
            o oVarA = new g$a().d(gVar.e()).a(gVar.f()).b(i).e(gVar.g()).a();
            while (true) {
                gVar = (g) oVarA;
                if (this.h.isEmpty() || this.h.peek().a() != uVarA.a()) {
                    break;
                }
                int iA = i / (1 << uVarA.a());
                if (iA == 1) {
                    this.f.add(uVarA.c());
                }
                if (iA == 3 && uVarA.a() < this.b - this.d) {
                    this.c.get(uVarA.a()).a(uVarA.c());
                }
                if (iA >= 3 && (iA & 1) == 1 && uVarA.a() >= this.b - this.d && uVarA.a() <= this.b - 2) {
                    if (this.g.get(Integer.valueOf(uVarA.a())) == null) {
                        LinkedList<u> linkedList = new LinkedList<>();
                        linkedList.add(uVarA.c());
                        this.g.put(Integer.valueOf(uVarA.a()), linkedList);
                    } else {
                        this.g.get(Integer.valueOf(uVarA.a())).add(uVarA.c());
                    }
                }
                g gVar2 = (g) new g$a().d(gVar.e()).a(gVar.f()).a(gVar.b()).b((gVar.c() - 1) / 2).e(gVar.g()).a();
                u uVarA2 = v.a(this.a, this.h.pop(), uVarA, gVar2);
                uVarA = new u(uVarA2.a() + 1, uVarA2.b());
                oVarA = new g$a().d(gVar2.e()).a(gVar2.f()).a(gVar2.b() + 1).b(gVar2.c()).e(gVar2.g()).a();
            }
            this.h.push(uVarA);
            i++;
            iVar2 = iVar3;
            jVar = jVar2;
        }
        this.e = this.h.pop();
    }

    private void c(byte[] bArr, byte[] bArr2, j jVar) {
        j jVar2;
        if (jVar == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        if (this.k) {
            throw new IllegalStateException("index already used");
        }
        if (this.j > (1 << this.b) - 2) {
            throw new IllegalStateException("index out of bounds");
        }
        int iA = aa.a(this.j, this.b);
        if (((this.j >> (iA + 1)) & 1) == 0 && iA < this.b - 1) {
            this.i.put(Integer.valueOf(iA), this.f.get(iA).c());
        }
        i iVar = (i) new i$a().d(jVar.e()).a(jVar.f()).a();
        g gVar = (g) new g$a().d(jVar.e()).a(jVar.f()).a();
        if (iA == 0) {
            j jVar3 = (j) new j$a().d(jVar.e()).a(jVar.f()).a(this.j).b(jVar.c()).c(jVar.d()).e(jVar.g()).a();
            this.a.a(this.a.a(bArr2, jVar3), bArr);
            this.f.set(0, v.a(this.a, this.a.a(jVar3), (i) new i$a().d(iVar.e()).a(iVar.f()).a(this.j).b(iVar.c()).c(iVar.d()).e(iVar.g()).a()));
            jVar2 = jVar3;
        } else {
            g gVar2 = (g) new g$a().d(gVar.e()).a(gVar.f()).a(iA - 1).b(this.j >> iA).e(gVar.g()).a();
            this.a.a(this.a.a(bArr2, jVar), bArr);
            u uVarA = v.a(this.a, this.f.get(iA - 1), this.i.get(Integer.valueOf(iA - 1)), gVar2);
            this.f.set(iA, new u(uVarA.a() + 1, uVarA.b()));
            this.i.remove(Integer.valueOf(iA - 1));
            for (int i = 0; i < iA; i++) {
                if (i < this.b - this.d) {
                    this.f.set(i, this.c.get(i).e());
                } else {
                    this.f.set(i, this.g.get(Integer.valueOf(i)).removeFirst());
                }
            }
            int iMin = Math.min(iA, this.b - this.d);
            for (int i2 = 0; i2 < iMin; i2++) {
                int i3 = ((1 << i2) * 3) + this.j + 1;
                if (i3 < (1 << this.b)) {
                    this.c.get(i2).a(i3);
                }
            }
            jVar2 = jVar;
        }
        for (int i4 = 0; i4 < ((this.b - this.d) >> 1); i4++) {
            c cVarB = b();
            if (cVarB != null) {
                cVarB.a(this.h, this.a, bArr, bArr2, jVar2);
            }
        }
        this.j++;
    }

    protected final int a() {
        return this.j;
    }

    public final a a(org.bouncycastle.a.p pVar) {
        return new a(this, f.a(pVar));
    }

    public final a a(byte[] bArr, byte[] bArr2, j jVar) {
        return new a(this, bArr, bArr2, jVar);
    }

    private a(a aVar, org.bouncycastle.b.r rVar) {
        this.a = new k(new m(rVar));
        this.b = aVar.b;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = new ArrayList();
        this.f.addAll(aVar.f);
        this.g = aVar.g;
        this.h = new Stack<>();
        this.h.addAll(aVar.h);
        this.c = aVar.c;
        this.i = new TreeMap(aVar.i);
        this.j = aVar.j;
        this.k = aVar.k;
        if (this.f == null) {
            throw new IllegalStateException("authenticationPath == null");
        }
        if (this.g == null) {
            throw new IllegalStateException("retain == null");
        }
        if (this.h == null) {
            throw new IllegalStateException("stack == null");
        }
        if (this.c == null) {
            throw new IllegalStateException("treeHashInstances == null");
        }
        if (this.i == null) {
            throw new IllegalStateException("keep == null");
        }
        if (!aa.a(this.b, this.j)) {
            throw new IllegalStateException("index in BDS state out of bounds");
        }
    }
}
