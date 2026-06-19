package org.bouncycastle.p083b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'a' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: org.bouncycastle.b.ae */
/* JADX INFO: loaded from: classes.dex */
public abstract class EnumC0805ae implements InterfaceC0980g {

    /* JADX INFO: renamed from: a */
    public static final EnumC0805ae f3327a;

    /* JADX INFO: renamed from: b */
    public static final EnumC0805ae f3328b;

    /* JADX INFO: renamed from: c */
    public static final EnumC0805ae f3329c;

    /* JADX INFO: renamed from: d */
    private static final /* synthetic */ EnumC0805ae[] f3330d;

    static {
        final String str = "ASCII";
        f3327a = new EnumC0805ae(str) { // from class: org.bouncycastle.b.af
            {
                byte b = 0;
            }

            @Override // org.bouncycastle.p083b.InterfaceC0980g
            /* JADX INFO: renamed from: a */
            public final String mo1901a() {
                return "ASCII";
            }

            @Override // org.bouncycastle.p083b.InterfaceC0980g
            /* JADX INFO: renamed from: a */
            public final byte[] mo1902a(char[] cArr) {
                return AbstractC0804ad.m1894a(cArr);
            }
        };
        final String str2 = "UTF8";
        f3328b = new EnumC0805ae(str2) { // from class: org.bouncycastle.b.ag
            {
                int i = 1;
                byte b = 0;
            }

            @Override // org.bouncycastle.p083b.InterfaceC0980g
            /* JADX INFO: renamed from: a */
            public final String mo1901a() {
                return "UTF8";
            }

            @Override // org.bouncycastle.p083b.InterfaceC0980g
            /* JADX INFO: renamed from: a */
            public final byte[] mo1902a(char[] cArr) {
                return AbstractC0804ad.m1895b(cArr);
            }
        };
        final String str3 = "PKCS12";
        f3329c = new EnumC0805ae(str3) { // from class: org.bouncycastle.b.ah
            {
                int i = 2;
                byte b = 0;
            }

            @Override // org.bouncycastle.p083b.InterfaceC0980g
            /* JADX INFO: renamed from: a */
            public final String mo1901a() {
                return "PKCS12";
            }

            @Override // org.bouncycastle.p083b.InterfaceC0980g
            /* JADX INFO: renamed from: a */
            public final byte[] mo1902a(char[] cArr) {
                return AbstractC0804ad.m1896c(cArr);
            }
        };
        f3330d = new EnumC0805ae[]{f3327a, f3328b, f3329c};
    }

    private EnumC0805ae(String str, int i) {
    }

    /* synthetic */ EnumC0805ae(String str, int i, byte b) {
        this(str, i);
    }

    public static EnumC0805ae valueOf(String str) {
        return (EnumC0805ae) Enum.valueOf(EnumC0805ae.class, str);
    }

    public static EnumC0805ae[] values() {
        return (EnumC0805ae[]) f3330d.clone();
    }
}
