package p000a.p029g;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.InterfaceC0004ab;
import p000a.InterfaceC0016c;
import p000a.InterfaceC0267h;
import p000a.InterfaceC0287k;
import p000a.p006d.InterfaceC0055c;
import p000a.p006d.InterfaceC0067d;
import p000a.p006d.InterfaceC0172f;
import p000a.p006d.p010d.p011a.C0074d;
import p000a.p031i.p032a.C0280g;

/* JADX INFO: renamed from: a.g.aw */
/* JADX INFO: compiled from: SmbTreeConnection.java */
/* JADX INFO: loaded from: classes.dex */
class C0233aw {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC1612b f1086a = C1620c.m4563a((Class<?>) C0233aw.class);

    /* JADX INFO: renamed from: j */
    private static final Random f1087j = new Random();

    /* JADX INFO: renamed from: b */
    private final InterfaceC0016c f1088b;

    /* JADX INFO: renamed from: c */
    private final C0233aw f1089c;

    /* JADX INFO: renamed from: d */
    private C0238ba f1090d;

    /* JADX INFO: renamed from: e */
    private volatile boolean f1091e;

    /* JADX INFO: renamed from: f */
    private volatile boolean f1092f;

    /* JADX INFO: renamed from: g */
    private InterfaceC0230at f1093g;

    /* JADX INFO: renamed from: h */
    private boolean f1094h;

    /* JADX INFO: renamed from: i */
    private final AtomicLong f1095i;

    protected C0233aw(InterfaceC0016c interfaceC0016c) {
        this.f1095i = new AtomicLong();
        this.f1088b = interfaceC0016c;
        this.f1089c = null;
    }

    protected C0233aw(C0233aw c0233aw) {
        this.f1095i = new AtomicLong();
        this.f1088b = c0233aw.f1088b;
        this.f1089c = c0233aw;
    }

    /* JADX INFO: renamed from: a */
    static C0233aw m763a(InterfaceC0016c interfaceC0016c) {
        return interfaceC0016c.mo114a().mo48am() ? new C0234ax(interfaceC0016c) : new C0233aw(interfaceC0016c);
    }

    /* JADX INFO: renamed from: a */
    static C0233aw m764a(C0233aw c0233aw) {
        return c0233aw.f1088b.mo114a().mo48am() ? new C0234ax(c0233aw) : new C0233aw(c0233aw);
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC0267h m779a() {
        return this.f1088b.mo114a();
    }

    /* JADX INFO: renamed from: i */
    private synchronized C0238ba m773i() {
        C0238ba c0238baM814a;
        c0238baM814a = this.f1090d;
        if (c0238baM814a != null) {
            c0238baM814a = c0238baM814a.m814a(false);
        } else if (this.f1089c != null) {
            this.f1090d = this.f1089c.m773i();
            c0238baM814a = this.f1090d;
        }
        return c0238baM814a;
    }

    /* JADX INFO: renamed from: j */
    private synchronized C0238ba m774j() {
        C0238ba c0238baM774j;
        c0238baM774j = this.f1090d;
        if (c0238baM774j == null) {
            if (this.f1089c != null) {
                c0238baM774j = this.f1089c.m774j();
            } else {
                c0238baM774j = null;
            }
        }
        return c0238baM774j;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized void m768a(p000a.p029g.C0238ba r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            a.g.ba r3 = r6.m773i()     // Catch: java.lang.Throwable -> L57
            r2 = 0
            if (r3 != r7) goto Lf
            if (r3 == 0) goto Ld
            r3.close()     // Catch: java.lang.Throwable -> L57
        Ld:
            monitor-exit(r6)
            return
        Lf:
            boolean r0 = r6.f1091e     // Catch: java.lang.Throwable -> L5e java.lang.Throwable -> L73
            org.c.b r1 = p000a.p029g.C0233aw.f1086a     // Catch: java.lang.Throwable -> L5e java.lang.Throwable -> L73
            java.lang.String r4 = "Switching tree"
            r1.mo4534b(r4)     // Catch: java.lang.Throwable -> L5e java.lang.Throwable -> L73
            if (r7 == 0) goto L5a
            org.c.b r1 = p000a.p029g.C0233aw.f1086a     // Catch: java.lang.Throwable -> L5e java.lang.Throwable -> L73
            java.lang.String r4 = "Acquired tree on switch "
            java.lang.String r5 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L5e java.lang.Throwable -> L73
            java.lang.String r4 = r4.concat(r5)     // Catch: java.lang.Throwable -> L5e java.lang.Throwable -> L73
            r1.mo4534b(r4)     // Catch: java.lang.Throwable -> L5e java.lang.Throwable -> L73
            r1 = 1
            r7.m814a(r1)     // Catch: java.lang.Throwable -> L5e java.lang.Throwable -> L73
            r1 = 1
            r6.f1091e = r1     // Catch: java.lang.Throwable -> L5e java.lang.Throwable -> L73
        L30:
            r6.f1090d = r7     // Catch: java.lang.Throwable -> L5e java.lang.Throwable -> L73
            if (r3 == 0) goto L3a
            if (r0 == 0) goto L3a
            r0 = 1
            r3.m820b(r0)     // Catch: java.lang.Throwable -> L5e java.lang.Throwable -> L73
        L3a:
            a.g.aw r0 = r6.f1089c     // Catch: java.lang.Throwable -> L5e java.lang.Throwable -> L73
            if (r0 == 0) goto L51
            boolean r0 = r6.f1092f     // Catch: java.lang.Throwable -> L5e java.lang.Throwable -> L73
            if (r0 == 0) goto L51
            org.c.b r0 = p000a.p029g.C0233aw.f1086a     // Catch: java.lang.Throwable -> L5e java.lang.Throwable -> L73
            java.lang.String r1 = "Releasing delegate"
            r0.mo4534b(r1)     // Catch: java.lang.Throwable -> L5e java.lang.Throwable -> L73
            r0 = 0
            r6.f1092f = r0     // Catch: java.lang.Throwable -> L5e java.lang.Throwable -> L73
            a.g.aw r0 = r6.f1089c     // Catch: java.lang.Throwable -> L5e java.lang.Throwable -> L73
            r0.m783c()     // Catch: java.lang.Throwable -> L5e java.lang.Throwable -> L73
        L51:
            if (r3 == 0) goto Ld
            r3.close()     // Catch: java.lang.Throwable -> L57
            goto Ld
        L57:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L5a:
            r1 = 0
            r6.f1091e = r1     // Catch: java.lang.Throwable -> L5e java.lang.Throwable -> L73
            goto L30
        L5e:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L60
        L60:
            r1 = move-exception
            r2 = r0
        L62:
            if (r3 == 0) goto L69
            if (r2 == 0) goto L6f
            r3.close()     // Catch: java.lang.Throwable -> L57 java.lang.Throwable -> L6a
        L69:
            throw r1     // Catch: java.lang.Throwable -> L57
        L6a:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch: java.lang.Throwable -> L57
            goto L69
        L6f:
            r3.close()     // Catch: java.lang.Throwable -> L57
            goto L69
        L73:
            r0 = move-exception
            r1 = r0
            goto L62
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0233aw.m768a(a.g.ba):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000a.p029g.C0233aw m782b() {
        /*
            r5 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r5.f1095i
            long r0 = r0.incrementAndGet()
            org.c.b r2 = p000a.p029g.C0233aw.f1086a
            boolean r2 = r2.mo4536b()
            if (r2 == 0) goto L2c
            org.c.b r2 = p000a.p029g.C0233aw.f1086a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Acquire tree connection "
            r3.<init>(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r4 = " "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r3 = r3.toString()
            r2.mo4532a(r3)
        L2c:
            r2 = 1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L79
            monitor-enter(r5)
            a.g.ba r3 = r5.m773i()     // Catch: java.lang.Throwable -> L86
            r2 = 0
            if (r3 == 0) goto L5c
            boolean r0 = r5.f1091e     // Catch: java.lang.Throwable -> L7a java.lang.Throwable -> L92
            if (r0 != 0) goto L5c
            org.c.b r0 = p000a.p029g.C0233aw.f1086a     // Catch: java.lang.Throwable -> L7a java.lang.Throwable -> L92
            boolean r0 = r0.mo4539c()     // Catch: java.lang.Throwable -> L7a java.lang.Throwable -> L92
            if (r0 == 0) goto L55
            org.c.b r0 = p000a.p029g.C0233aw.f1086a     // Catch: java.lang.Throwable -> L7a java.lang.Throwable -> L92
            java.lang.String r1 = "Acquire tree on first usage "
            java.lang.String r4 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L7a java.lang.Throwable -> L92
            java.lang.String r1 = r1.concat(r4)     // Catch: java.lang.Throwable -> L7a java.lang.Throwable -> L92
            r0.mo4534b(r1)     // Catch: java.lang.Throwable -> L7a java.lang.Throwable -> L92
        L55:
            r0 = 1
            r3.m814a(r0)     // Catch: java.lang.Throwable -> L7a java.lang.Throwable -> L92
            r0 = 1
            r5.f1091e = r0     // Catch: java.lang.Throwable -> L7a java.lang.Throwable -> L92
        L5c:
            if (r3 == 0) goto L61
            r3.close()     // Catch: java.lang.Throwable -> L86
        L61:
            a.g.aw r0 = r5.f1089c     // Catch: java.lang.Throwable -> L86
            if (r0 == 0) goto L78
            boolean r0 = r5.f1092f     // Catch: java.lang.Throwable -> L86
            if (r0 != 0) goto L78
            org.c.b r0 = p000a.p029g.C0233aw.f1086a     // Catch: java.lang.Throwable -> L86
            java.lang.String r1 = "Acquire delegate on first usage"
            r0.mo4534b(r1)     // Catch: java.lang.Throwable -> L86
            a.g.aw r0 = r5.f1089c     // Catch: java.lang.Throwable -> L86
            r0.m782b()     // Catch: java.lang.Throwable -> L86
            r0 = 1
            r5.f1092f = r0     // Catch: java.lang.Throwable -> L86
        L78:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L86
        L79:
            return r5
        L7a:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L7c
        L7c:
            r1 = move-exception
            r2 = r0
        L7e:
            if (r3 == 0) goto L85
            if (r2 == 0) goto L8e
            r3.close()     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L89
        L85:
            throw r1     // Catch: java.lang.Throwable -> L86
        L86:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L86
            throw r0
        L89:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch: java.lang.Throwable -> L86
            goto L85
        L8e:
            r3.close()     // Catch: java.lang.Throwable -> L86
            goto L85
        L92:
            r0 = move-exception
            r1 = r0
            goto L7e
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0233aw.m782b():a.g.aw");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0096  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m783c() {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0233aw.m783c():void");
    }

    /* JADX INFO: renamed from: d */
    protected final void m784d() {
        if (m785e() && this.f1095i.get() != 0) {
            f1086a.mo4540d("Tree connection was not properly released ".concat(String.valueOf(this)));
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0050  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized void m772b(boolean r7) {
        /*
            r6 = this;
            r3 = 0
            monitor-enter(r6)
            a.g.aq r4 = r6.m787g()     // Catch: java.lang.Throwable -> L30
            if (r4 != 0) goto Lf
            if (r4 == 0) goto Ld
            r4.close()     // Catch: java.lang.Throwable -> L30
        Ld:
            monitor-exit(r6)
            return
        Lf:
            a.g.as r5 = r4.m707h()     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L61
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L3e java.lang.Throwable -> L71
            a.g.ba r0 = r6.m774j()     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L56
            r1 = 1
            r0.m818a(r7, r1)     // Catch: java.lang.Throwable -> L33
            r0 = 0
            r6.f1090d = r0     // Catch: java.lang.Throwable -> L3b
            r0 = 0
            r6.f1091e = r0     // Catch: java.lang.Throwable -> L3b
        L24:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3b
            if (r5 == 0) goto L2a
            r5.close()     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L61
        L2a:
            if (r4 == 0) goto Ld
            r4.close()     // Catch: java.lang.Throwable -> L30
            goto Ld
        L30:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L33:
            r0 = move-exception
            r1 = 0
            r6.f1090d = r1     // Catch: java.lang.Throwable -> L3b
            r1 = 0
            r6.f1091e = r1     // Catch: java.lang.Throwable -> L3b
            throw r0     // Catch: java.lang.Throwable -> L3b
        L3b:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3b
            throw r0     // Catch: java.lang.Throwable -> L3e java.lang.Throwable -> L71
        L3e:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L40
        L40:
            r1 = move-exception
            r2 = r0
        L42:
            if (r5 == 0) goto L49
            if (r2 == 0) goto L64
            r5.close()     // Catch: java.lang.Throwable -> L5c java.lang.Throwable -> L61
        L49:
            throw r1     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L61
        L4a:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L4c
        L4c:
            r1 = move-exception
            r3 = r0
        L4e:
            if (r4 == 0) goto L55
            if (r3 == 0) goto L6d
            r4.close()     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L68
        L55:
            throw r1     // Catch: java.lang.Throwable -> L30
        L56:
            a.g.aw r0 = r6.f1089c     // Catch: java.lang.Throwable -> L3b
            r0.m772b(r7)     // Catch: java.lang.Throwable -> L3b
            goto L24
        L5c:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L61
            goto L49
        L61:
            r0 = move-exception
            r1 = r0
            goto L4e
        L64:
            r5.close()     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L61
            goto L49
        L68:
            r0 = move-exception
            r3.addSuppressed(r0)     // Catch: java.lang.Throwable -> L30
            goto L55
        L6d:
            r4.close()     // Catch: java.lang.Throwable -> L30
            goto L55
        L71:
            r0 = move-exception
            r1 = r0
            r2 = r3
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0233aw.m772b(boolean):void");
    }

    /* JADX INFO: renamed from: a */
    final <T extends InterfaceC0067d> T m776a(C0225ao c0225ao, InterfaceC0055c interfaceC0055c, T t, EnumC0261u... enumC0261uArr) {
        return (T) m762a(c0225ao, interfaceC0055c, t, enumC0261uArr.length == 0 ? EnumSet.noneOf(EnumC0261u.class) : EnumSet.copyOf((Collection) Arrays.asList(enumC0261uArr)));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013c A[EDGE_INSN: B:89:0x013c->B:66:0x013c BREAK  A[LOOP:0: B:10:0x004e->B:47:0x0106], SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private <T extends p000a.p006d.InterfaceC0067d> T m762a(p000a.p029g.C0225ao r15, p000a.p006d.InterfaceC0055c r16, T r17, java.util.Set<p000a.p029g.EnumC0261u> r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0233aw.m762a(a.g.ao, a.d.c, a.d.d, java.util.Set):a.d.d");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0029 A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private <T extends p000a.p006d.InterfaceC0067d> T m770b(p000a.p029g.C0225ao r6, p000a.p006d.InterfaceC0055c r7, T r8, java.util.Set<p000a.p029g.EnumC0261u> r9) throws java.lang.Throwable {
        /*
            r5 = this;
            r0 = 10
            r3 = r0
        L3:
            if (r3 <= 0) goto L60
            boolean r0 = r7 instanceof p000a.p006d.InterfaceC0172f
            if (r0 == 0) goto Lf
            r0 = r7
            a.d.f r0 = (p000a.p006d.InterfaceC0172f) r0
            r5.m775a(r6, r0)
        Lf:
            a.g.ba r4 = r5.m773i()     // Catch: p000a.p029g.C0244d -> L2a
            r2 = 0
            if (r4 != 0) goto L3f
            a.d r0 = new a.d     // Catch: java.lang.Throwable -> L1e java.lang.Throwable -> L68
            java.lang.String r1 = "Failed to get tree connection"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1e java.lang.Throwable -> L68
            throw r0     // Catch: java.lang.Throwable -> L1e java.lang.Throwable -> L68
        L1e:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L20
        L20:
            r1 = move-exception
            r2 = r0
        L22:
            if (r4 == 0) goto L29
            if (r2 == 0) goto L4e
            r4.close()     // Catch: p000a.p029g.C0244d -> L2a java.lang.Throwable -> L49
        L29:
            throw r1     // Catch: p000a.p029g.C0244d -> L2a
        L2a:
            r0 = move-exception
            r1 = r0
            a.k r0 = r1.m861a()
            java.lang.Class<a.d.a.b> r2 = p000a.p006d.p007a.InterfaceC0047b.class
            a.k r0 = r0.mo175a(r2)
            a.d.a.b r0 = (p000a.p006d.p007a.InterfaceC0047b) r0
            boolean r0 = r0.mo194k()
            if (r0 == 0) goto L52
            throw r1
        L3f:
            a.d.d r0 = r4.m812a(r7, r8, r9)     // Catch: java.lang.Throwable -> L1e java.lang.Throwable -> L68
            if (r4 == 0) goto L48
            r4.close()     // Catch: p000a.p029g.C0244d -> L2a
        L48:
            return r0
        L49:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch: p000a.p029g.C0244d -> L2a
            goto L29
        L4e:
            r4.close()     // Catch: p000a.p029g.C0244d -> L2a
            goto L29
        L52:
            r7.mo217e_()
            org.c.b r0 = p000a.p029g.C0233aw.f1086a
            java.lang.String r2 = "send0"
            r0.mo4533a(r2, r1)
            int r0 = r3 + (-1)
            r3 = r0
            goto L3
        L60:
            a.d r0 = new a.d
            java.lang.String r1 = "Loop in DFS referrals"
            r0.<init>(r1)
            throw r0
        L68:
            r0 = move-exception
            r1 = r0
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0233aw.m770b(a.g.ao, a.d.c, a.d.d, java.util.Set):a.d.d");
    }

    /* JADX INFO: renamed from: a */
    public final C0235ay m777a(C0225ao c0225ao) throws C0214ad {
        try {
            return m771b(c0225ao);
        } catch (C0214ad e) {
            throw e;
        } catch (UnknownHostException e2) {
            throw new C0214ad("Failed to connect to server", e2);
        } catch (IOException e3) {
            throw new C0214ad("Failed to connect to server", e3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0057  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized p000a.p029g.C0235ay m771b(p000a.p029g.C0225ao r7) {
        /*
            r6 = this;
            r3 = 0
            monitor-enter(r6)
            a.g.aq r4 = r6.m787g()     // Catch: java.lang.Throwable -> L5d
            boolean r0 = r6.m785e()     // Catch: java.lang.Throwable -> L51 java.lang.Throwable -> L65
            if (r0 == 0) goto L2c
            a.g.as r5 = r4.m707h()     // Catch: java.lang.Throwable -> L51 java.lang.Throwable -> L65
            boolean r0 = r5.mo743d()     // Catch: java.lang.Throwable -> L45 java.lang.Throwable -> L83
            if (r0 != 0) goto L1c
            java.lang.String r0 = r5.mo97a()     // Catch: java.lang.Throwable -> L45 java.lang.Throwable -> L83
            if (r0 != 0) goto L27
        L1c:
            org.c.b r0 = p000a.p029g.C0233aw.f1086a     // Catch: java.lang.Throwable -> L45 java.lang.Throwable -> L83
            java.lang.String r1 = "Disconnecting failed tree and session"
            r0.mo4534b(r1)     // Catch: java.lang.Throwable -> L45 java.lang.Throwable -> L83
            r0 = 1
            r6.m772b(r0)     // Catch: java.lang.Throwable -> L45 java.lang.Throwable -> L83
        L27:
            if (r5 == 0) goto L2c
            r5.close()     // Catch: java.lang.Throwable -> L51 java.lang.Throwable -> L65
        L2c:
            boolean r0 = r6.m785e()     // Catch: java.lang.Throwable -> L51 java.lang.Throwable -> L65
            if (r0 == 0) goto L6c
            org.c.b r0 = p000a.p029g.C0233aw.f1086a     // Catch: java.lang.Throwable -> L51 java.lang.Throwable -> L65
            java.lang.String r1 = "Already connected"
            r0.mo4532a(r1)     // Catch: java.lang.Throwable -> L51 java.lang.Throwable -> L65
            a.g.ay r0 = new a.g.ay     // Catch: java.lang.Throwable -> L51 java.lang.Throwable -> L65
            r0.<init>(r7, r6)     // Catch: java.lang.Throwable -> L51 java.lang.Throwable -> L65
            if (r4 == 0) goto L43
            r4.close()     // Catch: java.lang.Throwable -> L5d
        L43:
            monitor-exit(r6)
            return r0
        L45:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L47
        L47:
            r1 = move-exception
            r2 = r0
        L49:
            if (r5 == 0) goto L50
            if (r2 == 0) goto L68
            r5.close()     // Catch: java.lang.Throwable -> L60 java.lang.Throwable -> L65
        L50:
            throw r1     // Catch: java.lang.Throwable -> L51 java.lang.Throwable -> L65
        L51:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L53
        L53:
            r1 = move-exception
            r3 = r0
        L55:
            if (r4 == 0) goto L5c
            if (r3 == 0) goto L7f
            r4.close()     // Catch: java.lang.Throwable -> L5d java.lang.Throwable -> L7a
        L5c:
            throw r1     // Catch: java.lang.Throwable -> L5d
        L5d:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L60:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch: java.lang.Throwable -> L51 java.lang.Throwable -> L65
            goto L50
        L65:
            r0 = move-exception
            r1 = r0
            goto L55
        L68:
            r5.close()     // Catch: java.lang.Throwable -> L51 java.lang.Throwable -> L65
            goto L50
        L6c:
            java.lang.String r0 = r7.m680o()     // Catch: java.lang.Throwable -> L51 java.lang.Throwable -> L65
            a.g.ay r0 = r6.m778a(r7, r0)     // Catch: java.lang.Throwable -> L51 java.lang.Throwable -> L65
            if (r4 == 0) goto L43
            r4.close()     // Catch: java.lang.Throwable -> L5d
            goto L43
        L7a:
            r0 = move-exception
            r3.addSuppressed(r0)     // Catch: java.lang.Throwable -> L5d
            goto L5c
        L7f:
            r4.close()     // Catch: java.lang.Throwable -> L5d
            goto L5c
        L83:
            r0 = move-exception
            r1 = r0
            r2 = r3
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0233aw.m771b(a.g.ao):a.g.ay");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0010  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean m785e() {
        /*
            r1 = this;
            monitor-enter(r1)
            a.g.ba r0 = r1.m774j()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L10
            boolean r0 = r0.m821b()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L10
            r0 = 1
        Le:
            monitor-exit(r1)
            return r0
        L10:
            r0 = 0
            goto Le
        L12:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0233aw.m785e():boolean");
    }

    /* JADX INFO: renamed from: a */
    public final synchronized C0235ay m778a(C0225ao c0225ao, String str) {
        return m765a(c0225ao, str, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x01c1 A[Catch: all -> 0x0099, TRY_LEAVE, TryCatch #41 {, blocks: (B:4:0x0002, B:24:0x0064, B:77:0x00c4, B:78:0x00c7, B:80:0x00d3, B:82:0x00d9, B:126:0x01ba, B:85:0x00e6, B:89:0x00f1, B:91:0x0105, B:93:0x0109, B:95:0x0111, B:96:0x0120, B:108:0x0188, B:149:0x01ef, B:150:0x01f2, B:165:0x0212, B:164:0x020e, B:166:0x0216, B:180:0x027d, B:209:0x02a8, B:210:0x02ab, B:231:0x02d8, B:230:0x02d4, B:111:0x018e, B:113:0x0197, B:116:0x019f, B:127:0x01c1, B:57:0x0095, B:125:0x01b5, B:124:0x01b0, B:58:0x0098), top: B:291:0x0002, inners: #33, #38 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0209 A[Catch: Throwable -> 0x01e9, all -> 0x0205, TRY_LEAVE, TryCatch #12 {Throwable -> 0x01e9, blocks: (B:97:0x0151, B:107:0x0185, B:143:0x01e8, B:161:0x0209, B:158:0x0201), top: B:258:0x0151 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0212 A[Catch: all -> 0x0099, IOException -> 0x018d, TryCatch #33 {IOException -> 0x018d, blocks: (B:91:0x0105, B:93:0x0109, B:95:0x0111, B:96:0x0120, B:108:0x0188, B:149:0x01ef, B:150:0x01f2, B:165:0x0212, B:164:0x020e, B:166:0x0216, B:180:0x027d, B:209:0x02a8, B:210:0x02ab, B:231:0x02d8, B:230:0x02d4), top: B:276:0x0105, outer: #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0216 A[Catch: all -> 0x0099, IOException -> 0x018d, TRY_LEAVE, TryCatch #33 {IOException -> 0x018d, blocks: (B:91:0x0105, B:93:0x0109, B:95:0x0111, B:96:0x0120, B:108:0x0188, B:149:0x01ef, B:150:0x01f2, B:165:0x0212, B:164:0x020e, B:166:0x0216, B:180:0x027d, B:209:0x02a8, B:210:0x02ab, B:231:0x02d8, B:230:0x02d4), top: B:276:0x0105, outer: #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02c2 A[Catch: Throwable -> 0x0298, all -> 0x02be, TRY_LEAVE, TryCatch #24 {all -> 0x02be, blocks: (B:168:0x0243, B:178:0x0277, B:195:0x0294, B:196:0x0297, B:221:0x02c2, B:218:0x02ba), top: B:269:0x0243 }] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02cf A[Catch: Throwable -> 0x02a2, all -> 0x02cb, TRY_LEAVE, TryCatch #9 {Throwable -> 0x02a2, blocks: (B:167:0x0233, B:179:0x027a, B:203:0x02a1, B:227:0x02cf, B:224:0x02c7), top: B:253:0x0233 }] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02d8 A[Catch: all -> 0x0099, IOException -> 0x018d, TRY_LEAVE, TryCatch #33 {IOException -> 0x018d, blocks: (B:91:0x0105, B:93:0x0109, B:95:0x0111, B:96:0x0120, B:108:0x0188, B:149:0x01ef, B:150:0x01f2, B:165:0x0212, B:164:0x020e, B:166:0x0216, B:180:0x027d, B:209:0x02a8, B:210:0x02ab, B:231:0x02d8, B:230:0x02d4), top: B:276:0x0105, outer: #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x01ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x02a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x01e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x029e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0294 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c4 A[Catch: all -> 0x0099, TRY_ENTER, TryCatch #41 {, blocks: (B:4:0x0002, B:24:0x0064, B:77:0x00c4, B:78:0x00c7, B:80:0x00d3, B:82:0x00d9, B:126:0x01ba, B:85:0x00e6, B:89:0x00f1, B:91:0x0105, B:93:0x0109, B:95:0x0111, B:96:0x0120, B:108:0x0188, B:149:0x01ef, B:150:0x01f2, B:165:0x0212, B:164:0x020e, B:166:0x0216, B:180:0x027d, B:209:0x02a8, B:210:0x02ab, B:231:0x02d8, B:230:0x02d4, B:111:0x018e, B:113:0x0197, B:116:0x019f, B:127:0x01c1, B:57:0x0095, B:125:0x01b5, B:124:0x01b0, B:58:0x0098), top: B:291:0x0002, inners: #33, #38 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f1 A[Catch: all -> 0x0099, TRY_LEAVE, TryCatch #41 {, blocks: (B:4:0x0002, B:24:0x0064, B:77:0x00c4, B:78:0x00c7, B:80:0x00d3, B:82:0x00d9, B:126:0x01ba, B:85:0x00e6, B:89:0x00f1, B:91:0x0105, B:93:0x0109, B:95:0x0111, B:96:0x0120, B:108:0x0188, B:149:0x01ef, B:150:0x01f2, B:165:0x0212, B:164:0x020e, B:166:0x0216, B:180:0x027d, B:209:0x02a8, B:210:0x02ab, B:231:0x02d8, B:230:0x02d4, B:111:0x018e, B:113:0x0197, B:116:0x019f, B:127:0x01c1, B:57:0x0095, B:125:0x01b5, B:124:0x01b0, B:58:0x0098), top: B:291:0x0002, inners: #33, #38 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0109 A[Catch: all -> 0x0099, IOException -> 0x018d, TryCatch #33 {IOException -> 0x018d, blocks: (B:91:0x0105, B:93:0x0109, B:95:0x0111, B:96:0x0120, B:108:0x0188, B:149:0x01ef, B:150:0x01f2, B:165:0x0212, B:164:0x020e, B:166:0x0216, B:180:0x027d, B:209:0x02a8, B:210:0x02ab, B:231:0x02d8, B:230:0x02d4), top: B:276:0x0105, outer: #41 }] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized p000a.p029g.C0235ay m765a(p000a.p029g.C0225ao r14, java.lang.String r15, p000a.InterfaceC0287k r16) {
        /*
            Method dump skipped, instruction units count: 757
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0233aw.m765a(a.g.ao, java.lang.String, a.k):a.g.ay");
    }

    /* JADX INFO: renamed from: a */
    private C0238ba m767a(C0225ao c0225ao, String str, String str2, InterfaceC0230at interfaceC0230at, C0238ba c0238ba, InterfaceC0287k interfaceC0287k) throws Throwable {
        if (f1086a.mo4539c() && interfaceC0230at.mo750k() && !c0225ao.mo91h() && !this.f1088b.mo114a().mo26U()) {
            f1086a.mo4534b("Signatures for file enabled but not required ".concat(String.valueOf(this)));
        }
        if (interfaceC0287k != null) {
            c0238ba.m824e();
        }
        try {
            if (f1086a.mo4536b()) {
                f1086a.mo4532a("doConnect: ".concat(String.valueOf(str)));
            }
            c0238ba.m819b(null, null);
            return c0238ba.m814a(true);
        } catch (C0212ab e) {
            f1086a.mo4535b("Authentication failed", e);
            return m766a(c0225ao, str2, interfaceC0230at, c0238ba, interfaceC0287k, e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0085 A[Catch: Throwable -> 0x005d, all -> 0x0081, TRY_LEAVE, TryCatch #1 {all -> 0x0081, blocks: (B:6:0x0029, B:9:0x0046, B:20:0x0059, B:21:0x005c, B:44:0x0085, B:41:0x007d), top: B:95:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091 A[Catch: Exception -> 0x0067, Throwable -> 0x0070, all -> 0x008e, TRY_LEAVE, TryCatch #9 {all -> 0x008e, blocks: (B:3:0x0005, B:5:0x000f, B:10:0x0049, B:27:0x0063, B:28:0x0066, B:50:0x0091, B:47:0x008a, B:52:0x0095, B:54:0x00a5, B:60:0x00e0, B:76:0x00fb, B:77:0x00fe, B:86:0x0111, B:85:0x010d, B:87:0x0115, B:30:0x0068, B:31:0x006f), top: B:105:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0108 A[Catch: Throwable -> 0x00f5, all -> 0x0104, TRY_LEAVE, TryCatch #5 {all -> 0x0104, blocks: (B:55:0x00c2, B:59:0x00dd, B:69:0x00f1, B:70:0x00f4, B:82:0x0108, B:79:0x0100), top: B:100:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0111 A[Catch: Throwable -> 0x0070, all -> 0x008e, TryCatch #9 {all -> 0x008e, blocks: (B:3:0x0005, B:5:0x000f, B:10:0x0049, B:27:0x0063, B:28:0x0066, B:50:0x0091, B:47:0x008a, B:52:0x0095, B:54:0x00a5, B:60:0x00e0, B:76:0x00fb, B:77:0x00fe, B:86:0x0111, B:85:0x010d, B:87:0x0115, B:30:0x0068, B:31:0x006f), top: B:105:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private p000a.p029g.C0238ba m766a(p000a.p029g.C0225ao r8, java.lang.String r9, p000a.p029g.InterfaceC0230at r10, p000a.p029g.C0238ba r11, p000a.InterfaceC0287k r12, p000a.p029g.C0212ab r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0233aw.m766a(a.g.ao, java.lang.String, a.g.at, a.g.ba, a.k, a.g.ab):a.g.ba");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [a.g.aw] */
    /* JADX WARN: Type inference failed for: r5v0, types: [a.g.ao] */
    /* JADX WARN: Type inference failed for: r5v1, types: [a.g.ao] */
    /* JADX WARN: Type inference failed for: r5v3, types: [a.ab] */
    /* JADX WARN: Type inference failed for: r5v4, types: [a.ab] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX INFO: renamed from: a */
    final InterfaceC0004ab m775a(C0225ao c0225ao, InterfaceC0172f interfaceC0172f) {
        if (!(interfaceC0172f instanceof C0074d)) {
            int i = 0;
            c0225ao = c0225ao;
            while (i < this.f1088b.mo114a().mo46ak() + 1) {
                try {
                    c0225ao = m769b(c0225ao, interfaceC0172f);
                    break;
                } catch (C0214ad e) {
                    if (e.m614b() != -1073741275 && !(e.getCause() instanceof C0280g)) {
                        throw e;
                    }
                    f1086a.mo4535b("resolveDfs", e);
                    if (f1086a.mo4539c()) {
                        f1086a.mo4534b("Retrying (" + i + ") resolveDfs: " + interfaceC0172f);
                    }
                    f1086a.mo4534b("Disconnecting tree on DFS retry");
                    m772b(true);
                    try {
                        Thread.sleep(f1087j.nextInt(5000) + 500);
                    } catch (InterruptedException e2) {
                        f1086a.mo4535b("resolveDfs", e2);
                    }
                    C0235ay c0235ayM777a = m777a(c0225ao);
                    if (c0235ayM777a != null) {
                        c0235ayM777a.close();
                    }
                    i++;
                    c0225ao = c0225ao;
                }
            }
        }
        return c0225ao;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01c8 A[Catch: IOException -> 0x0179, Throwable -> 0x018f, all -> 0x01c4, TRY_LEAVE, TryCatch #0 {IOException -> 0x0179, blocks: (B:53:0x012a, B:55:0x0139, B:78:0x0175, B:79:0x0178, B:121:0x01c8, B:118:0x01c0), top: B:177:0x012a }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01e2 A[Catch: Throwable -> 0x018f, all -> 0x01c4, TRY_ENTER, TryCatch #3 {all -> 0x01c4, blocks: (B:6:0x0011, B:8:0x0016, B:10:0x001d, B:11:0x0021, B:13:0x0027, B:38:0x00b0, B:39:0x00bb, B:41:0x00d5, B:43:0x00dd, B:44:0x00fb, B:46:0x0101, B:47:0x0104, B:50:0x0113, B:52:0x011b, B:53:0x012a, B:55:0x0139, B:81:0x017a, B:83:0x0187, B:84:0x018e, B:78:0x0175, B:79:0x0178, B:121:0x01c8, B:118:0x01c0, B:131:0x01e2, B:133:0x01e8, B:135:0x01ec, B:137:0x01f0, B:139:0x01f4, B:141:0x01fc, B:142:0x020b, B:143:0x021a, B:144:0x021b, B:15:0x002d, B:17:0x0033, B:19:0x0039, B:21:0x0041, B:22:0x0058, B:24:0x005e, B:36:0x00a7, B:64:0x0152, B:35:0x007c, B:34:0x0076), top: B:181:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0175 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b0 A[Catch: Throwable -> 0x018f, all -> 0x01c4, TryCatch #3 {all -> 0x01c4, blocks: (B:6:0x0011, B:8:0x0016, B:10:0x001d, B:11:0x0021, B:13:0x0027, B:38:0x00b0, B:39:0x00bb, B:41:0x00d5, B:43:0x00dd, B:44:0x00fb, B:46:0x0101, B:47:0x0104, B:50:0x0113, B:52:0x011b, B:53:0x012a, B:55:0x0139, B:81:0x017a, B:83:0x0187, B:84:0x018e, B:78:0x0175, B:79:0x0178, B:121:0x01c8, B:118:0x01c0, B:131:0x01e2, B:133:0x01e8, B:135:0x01ec, B:137:0x01f0, B:139:0x01f4, B:141:0x01fc, B:142:0x020b, B:143:0x021a, B:144:0x021b, B:15:0x002d, B:17:0x0033, B:19:0x0039, B:21:0x0041, B:22:0x0058, B:24:0x005e, B:36:0x00a7, B:64:0x0152, B:35:0x007c, B:34:0x0076), top: B:181:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d5 A[Catch: Throwable -> 0x018f, all -> 0x01c4, TryCatch #3 {all -> 0x01c4, blocks: (B:6:0x0011, B:8:0x0016, B:10:0x001d, B:11:0x0021, B:13:0x0027, B:38:0x00b0, B:39:0x00bb, B:41:0x00d5, B:43:0x00dd, B:44:0x00fb, B:46:0x0101, B:47:0x0104, B:50:0x0113, B:52:0x011b, B:53:0x012a, B:55:0x0139, B:81:0x017a, B:83:0x0187, B:84:0x018e, B:78:0x0175, B:79:0x0178, B:121:0x01c8, B:118:0x01c0, B:131:0x01e2, B:133:0x01e8, B:135:0x01ec, B:137:0x01f0, B:139:0x01f4, B:141:0x01fc, B:142:0x020b, B:143:0x021a, B:144:0x021b, B:15:0x002d, B:17:0x0033, B:19:0x0039, B:21:0x0041, B:22:0x0058, B:24:0x005e, B:36:0x00a7, B:64:0x0152, B:35:0x007c, B:34:0x0076), top: B:181:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a1  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private p000a.InterfaceC0004ab m769b(p000a.p029g.C0225ao r13, p000a.p006d.InterfaceC0172f r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0233aw.m769b(a.g.ao, a.d.f):a.ab");
    }

    /* JADX INFO: renamed from: a */
    final void m780a(boolean z) {
        this.f1094h = false;
    }

    /* JADX INFO: renamed from: f */
    public final long m786f() {
        C0238ba c0238baM774j = m774j();
        if (c0238baM774j == null) {
            return -1L;
        }
        return c0238baM774j.m829j();
    }

    /* JADX INFO: renamed from: g */
    public final C0227aq m787g() {
        C0238ba c0238baM774j = m774j();
        if (c0238baM774j != null) {
            return c0238baM774j.m828i();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002b  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m781a(int r6) throws java.lang.Throwable {
        /*
            r5 = this;
            r2 = 0
            a.g.aq r3 = r5.m787g()
            if (r3 == 0) goto L3d
            a.g.as r4 = r3.m707h()     // Catch: java.lang.Throwable -> L25 java.lang.Throwable -> L36
            boolean r0 = r4.m733a(r6)     // Catch: java.lang.Throwable -> L1a java.lang.Throwable -> L4e
            if (r4 == 0) goto L14
            r4.close()     // Catch: java.lang.Throwable -> L25 java.lang.Throwable -> L36
        L14:
            if (r3 == 0) goto L19
            r3.close()
        L19:
            return r0
        L1a:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L1c
        L1c:
            r0 = move-exception
        L1d:
            if (r4 == 0) goto L24
            if (r1 == 0) goto L39
            r4.close()     // Catch: java.lang.Throwable -> L31 java.lang.Throwable -> L36
        L24:
            throw r0     // Catch: java.lang.Throwable -> L25 java.lang.Throwable -> L36
        L25:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L27
        L27:
            r1 = move-exception
            r2 = r0
        L29:
            if (r3 == 0) goto L30
            if (r2 == 0) goto L4a
            r3.close()     // Catch: java.lang.Throwable -> L45
        L30:
            throw r1
        L31:
            r4 = move-exception
            r1.addSuppressed(r4)     // Catch: java.lang.Throwable -> L25 java.lang.Throwable -> L36
            goto L24
        L36:
            r0 = move-exception
            r1 = r0
            goto L29
        L39:
            r4.close()     // Catch: java.lang.Throwable -> L25 java.lang.Throwable -> L36
            goto L24
        L3d:
            a.g.ad r0 = new a.g.ad     // Catch: java.lang.Throwable -> L25 java.lang.Throwable -> L36
            java.lang.String r1 = "Not connected"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L25 java.lang.Throwable -> L36
            throw r0     // Catch: java.lang.Throwable -> L25 java.lang.Throwable -> L36
        L45:
            r0 = move-exception
            r2.addSuppressed(r0)
            goto L30
        L4a:
            r3.close()
            goto L30
        L4e:
            r0 = move-exception
            r1 = r2
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0233aw.m781a(int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m788h() throws java.lang.Throwable {
        /*
            r4 = this;
            a.g.ba r3 = r4.m773i()
            r2 = 0
            java.lang.String r0 = r3.m822c()     // Catch: java.lang.Throwable -> L27 java.lang.Throwable -> L3c
            java.lang.String r1 = "LPT1:"
            boolean r1 = r1.equals(r0)     // Catch: java.lang.Throwable -> L27 java.lang.Throwable -> L3c
            if (r1 == 0) goto L19
            r0 = 32
        L13:
            if (r3 == 0) goto L18
            r3.close()
        L18:
            return r0
        L19:
            java.lang.String r1 = "COMM"
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L27 java.lang.Throwable -> L3c
            if (r0 == 0) goto L24
            r0 = 64
            goto L13
        L24:
            r0 = 8
            goto L13
        L27:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L29
        L29:
            r1 = move-exception
            r2 = r0
        L2b:
            if (r3 == 0) goto L32
            if (r2 == 0) goto L38
            r3.close()     // Catch: java.lang.Throwable -> L33
        L32:
            throw r1
        L33:
            r0 = move-exception
            r2.addSuppressed(r0)
            goto L32
        L38:
            r3.close()
            goto L32
        L3c:
            r0 = move-exception
            r1 = r0
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0233aw.m788h():int");
    }
}
