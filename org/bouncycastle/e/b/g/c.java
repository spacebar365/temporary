package org.bouncycastle.e.b.g;

import java.io.Serializable;
import java.util.Stack;

/* JADX INFO: loaded from: classes.dex */
final class c implements Serializable {
    private u a;
    private final int b;
    private int c;
    private int d;
    private boolean e = false;
    private boolean f = false;

    c(int i) {
        this.b = i;
    }

    final int a() {
        if (!this.e || this.f) {
            return Integer.MAX_VALUE;
        }
        return this.c;
    }

    final void a(int i) {
        this.a = null;
        this.c = this.b;
        this.d = i;
        this.e = true;
        this.f = false;
    }

    final void a(Stack<u> stack, k kVar, byte[] bArr, byte[] bArr2, j jVar) {
        if (jVar == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        if (this.f || !this.e) {
            throw new IllegalStateException("finished or not initialized");
        }
        j jVar2 = (j) new j$a().d(jVar.e()).a(jVar.f()).a(this.d).b(jVar.c()).c(jVar.d()).e(jVar.g()).a();
        i iVar = (i) new i$a().d(jVar2.e()).a(jVar2.f()).a(this.d).a();
        g gVar = (g) new g$a().d(jVar2.e()).a(jVar2.f()).b(this.d).a();
        kVar.a(kVar.a(bArr2, jVar2), bArr);
        u uVarA = v.a(kVar, kVar.a(jVar2), iVar);
        while (!stack.isEmpty() && stack.peek().a() == uVarA.a() && stack.peek().a() != this.b) {
            g gVar2 = (g) new g$a().d(gVar.e()).a(gVar.f()).a(gVar.b()).b((gVar.c() - 1) / 2).e(gVar.g()).a();
            u uVarA2 = v.a(kVar, stack.pop(), uVarA, gVar2);
            uVarA = new u(uVarA2.a() + 1, uVarA2.b());
            gVar = (g) new g$a().d(gVar2.e()).a(gVar2.f()).a(gVar2.b() + 1).b(gVar2.c()).e(gVar2.g()).a();
        }
        if (this.a == null) {
            this.a = uVarA;
        } else if (this.a.a() == uVarA.a()) {
            g gVar3 = (g) new g$a().d(gVar.e()).a(gVar.f()).a(gVar.b()).b((gVar.c() - 1) / 2).e(gVar.g()).a();
            uVarA = new u(this.a.a() + 1, v.a(kVar, this.a, uVarA, gVar3).b());
            this.a = uVarA;
            new g$a().d(gVar3.e()).a(gVar3.f()).a(gVar3.b() + 1).b(gVar3.c()).e(gVar3.g()).a();
        } else {
            stack.push(uVarA);
        }
        if (this.a.a() == this.b) {
            this.f = true;
        } else {
            this.c = uVarA.a();
            this.d++;
        }
    }

    final void a(u uVar) {
        this.a = uVar;
        this.c = uVar.a();
        if (this.c == this.b) {
            this.f = true;
        }
    }

    final int b() {
        return this.d;
    }

    final boolean c() {
        return this.f;
    }

    final boolean d() {
        return this.e;
    }

    public final u e() {
        return this.a.c();
    }
}
