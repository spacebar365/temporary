package org.bouncycastle.jcajce.provider.config;

import java.security.BasicPermission;
import java.security.Permission;
import java.util.StringTokenizer;
import org.bouncycastle.f.k;

/* JADX INFO: loaded from: classes.dex */
public class ProviderConfigurationPermission extends BasicPermission {
    private final String a;
    private final int b;

    public ProviderConfigurationPermission(String str, String str2) {
        super(str, str2);
        this.a = str2;
        this.b = a(str2);
    }

    private static int a(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(k.c(str), " ,");
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            if (strNextToken.equals("threadlocalecimplicitlyca")) {
                i |= 1;
            } else if (strNextToken.equals("ecimplicitlyca")) {
                i |= 2;
            } else if (strNextToken.equals("threadlocaldhdefaultparams")) {
                i |= 4;
            } else if (strNextToken.equals("dhdefaultparams")) {
                i |= 8;
            } else if (strNextToken.equals("acceptableeccurves")) {
                i |= 16;
            } else if (strNextToken.equals("additionalecparameters")) {
                i |= 32;
            } else if (strNextToken.equals("all")) {
                i |= 63;
            }
        }
        if (i == 0) {
            throw new IllegalArgumentException("unknown permissions passed to mask");
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProviderConfigurationPermission)) {
            return false;
        }
        ProviderConfigurationPermission providerConfigurationPermission = (ProviderConfigurationPermission) obj;
        return this.b == providerConfigurationPermission.b && getName().equals(providerConfigurationPermission.getName());
    }

    @Override // java.security.BasicPermission, java.security.Permission
    public String getActions() {
        return this.a;
    }

    public int hashCode() {
        return getName().hashCode() + this.b;
    }

    @Override // java.security.BasicPermission, java.security.Permission
    public boolean implies(Permission permission) {
        if (!(permission instanceof ProviderConfigurationPermission) || !getName().equals(permission.getName())) {
            return false;
        }
        ProviderConfigurationPermission providerConfigurationPermission = (ProviderConfigurationPermission) permission;
        return (this.b & providerConfigurationPermission.b) == providerConfigurationPermission.b;
    }
}
