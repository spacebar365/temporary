package org.bouncycastle.jcajce.provider.symmetric;

import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import org.bouncycastle.jcajce.provider.symmetric.util.ClassUtil;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.p059d.C0615b;

/* JADX INFO: loaded from: classes.dex */
class GcmSpecUtil {

    /* JADX INFO: renamed from: a */
    static final Class f6101a = ClassUtil.m4466a(GcmSpecUtil.class, "javax.crypto.spec.GCMParameterSpec");

    GcmSpecUtil() {
    }

    /* JADX INFO: renamed from: a */
    static boolean m4437a() {
        return f6101a != null;
    }

    /* JADX INFO: renamed from: a */
    static boolean m4438a(Class cls) {
        return f6101a == cls;
    }

    /* JADX INFO: renamed from: a */
    static boolean m4439a(AlgorithmParameterSpec algorithmParameterSpec) {
        return f6101a != null && f6101a.isInstance(algorithmParameterSpec);
    }

    /* JADX INFO: renamed from: b */
    static C0615b m4440b(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        try {
            return new C0615b((byte[]) f6101a.getDeclaredMethod("getIV", new Class[0]).invoke(algorithmParameterSpec, new Object[0]), ((Integer) f6101a.getDeclaredMethod("getTLen", new Class[0]).invoke(algorithmParameterSpec, new Object[0])).intValue() / 8);
        } catch (Exception e) {
            throw new InvalidParameterSpecException("Cannot process GCMParameterSpec");
        }
    }

    /* JADX INFO: renamed from: a */
    static AlgorithmParameterSpec m4436a(AbstractC0686u abstractC0686u) throws InvalidParameterSpecException {
        try {
            C0615b c0615bM1499a = C0615b.m1499a(abstractC0686u);
            return (AlgorithmParameterSpec) f6101a.getConstructor(Integer.TYPE, byte[].class).newInstance(Integer.valueOf(c0615bM1499a.m1501b() * 8), c0615bM1499a.m1500a());
        } catch (NoSuchMethodException e) {
            throw new InvalidParameterSpecException("No constructor found!");
        } catch (Exception e2) {
            throw new InvalidParameterSpecException("Construction failed: " + e2.getMessage());
        }
    }
}
