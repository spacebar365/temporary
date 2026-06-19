package p000a.p001a;

import java.net.InetAddress;
import java.util.Properties;
import p000a.C0209g;
import p000a.EnumC0289m;
import p000a.InterfaceC0267h;

/* JADX INFO: renamed from: a.a.b */
/* JADX INFO: compiled from: PropertyConfiguration.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0002b extends C0001a implements InterfaceC0267h {
    public C0002b(Properties properties) {
        this.f60d = C0209g.m601a(properties, "jcifs.smb.client.useBatching", true);
        this.f61e = C0209g.m601a(properties, "jcifs.smb.client.useUnicode", true);
        this.f73q = C0209g.m601a(properties, "jcifs.smb.client.useLargeReadWrite", true);
        this.f62f = C0209g.m601a(properties, "jcifs.smb.client.forceUnicode", false);
        this.f63g = C0209g.m601a(properties, "jcifs.smb.client.signingPreferred", false);
        this.f64h = C0209g.m601a(properties, "jcifs.smb.client.signingEnforced", false);
        this.f65i = C0209g.m601a(properties, "jcifs.smb.client.ipcSigningEnforced", true);
        this.f66j = C0209g.m601a(properties, "jcifs.smb.client.encryptionEnabled", false);
        this.f57az = C0209g.m601a(properties, "jcifs.smb.client.requireSecureNegotiate", true);
        this.f29aA = C0209g.m601a(properties, "jcifs.smb.client.SendNTLMTargetName", true);
        this.f74r = C0209g.m597a(properties, "jcifs.smb.lmCompatibility", 3);
        this.f75s = C0209g.m601a(properties, "jcifs.smb.allowNTLMFallback", true);
        this.f76t = C0209g.m601a(properties, "jcifs.smb.useRawNTLM", false);
        this.f77u = C0209g.m601a(properties, "jcifs.smb.client.disableSpnegoIntegrity", false);
        this.f78v = C0209g.m601a(properties, "jcifs.smb.client.enforceSpnegoIntegrity", false);
        this.f79w = C0209g.m601a(properties, "jcifs.smb.client.disablePlainTextPasswords", true);
        this.f80x = properties.getProperty("jcifs.encoding", "Cp850");
        this.f67k = C0209g.m601a(properties, "jcifs.smb.client.useNtStatus", true);
        this.f68l = C0209g.m601a(properties, "jcifs.smb.client.useExtendedSecurity", true);
        this.f69m = C0209g.m601a(properties, "jcifs.smb.client.forceExtendedSecurity", false);
        this.f70n = C0209g.m601a(properties, "jcifs.smb.client.useSMB2Negotiation", false);
        this.f71o = C0209g.m601a(properties, "jcifs.smb.client.port139.enabled", false);
        this.f72p = C0209g.m601a(properties, "jcifs.smb.client.useNTSmbs", true);
        this.f81y = C0209g.m597a(properties, "jcifs.smb.client.flags2", 0);
        this.f82z = C0209g.m597a(properties, "jcifs.smb.client.capabilities", 0);
        this.f2A = C0209g.m597a(properties, "jcifs.smb.client.ssnLimit", 250);
        this.f51at = C0209g.m597a(properties, "jcifs.smb.client.maxRequestRetries", 2);
        this.f3B = C0209g.m601a(properties, "jcifs.smb.client.tcpNoDelay", false);
        this.f4C = C0209g.m597a(properties, "jcifs.smb.client.responseTimeout", 30000);
        this.f5D = C0209g.m597a(properties, "jcifs.smb.client.soTimeout", 35000);
        this.f6E = C0209g.m597a(properties, "jcifs.smb.client.connTimeout", 35000);
        this.f7F = C0209g.m597a(properties, "jcifs.smb.client.sessionTimeout", 35000);
        this.f8G = C0209g.m601a(properties, "jcifs.smb.client.disableIdleTimeout", false);
        this.f9H = C0209g.m599a(properties);
        this.f10I = C0209g.m597a(properties, "jcifs.smb.client.lport", 0);
        this.f11J = C0209g.m597a(properties, "jcifs.smb.client.maxMpxCount", 10);
        this.f12K = C0209g.m597a(properties, "jcifs.smb.client.snd_buf_size", 65535);
        this.f13L = C0209g.m597a(properties, "jcifs.smb.client.rcv_buf_size", 65535);
        this.f14M = C0209g.m597a(properties, "jcifs.smb.client.notify_buf_size", 1024);
        this.f15N = properties.getProperty("jcifs.smb.client.nativeOs", System.getProperty("os.name"));
        this.f16O = properties.getProperty("jcifs.smb.client.nativeLanMan", "jCIFS");
        this.f17P = 1;
        this.f18Q = C0209g.m601a(properties, "jcifs.smb.client.dfs.disabled", false);
        this.f19R = C0209g.m598a(properties, "jcifs.smb.client.dfs.ttl", 300L);
        this.f20S = C0209g.m601a(properties, "jcifs.smb.client.dfs.strictView", false);
        this.f21T = C0209g.m601a(properties, "jcifs.smb.client.dfs.convertToFQDN", false);
        this.f22U = properties.getProperty("jcifs.smb.client.logonShare", null);
        this.f23V = properties.getProperty("jcifs.smb.client.domain", null);
        this.f24W = properties.getProperty("jcifs.smb.client.username", null);
        this.f25X = properties.getProperty("jcifs.smb.client.password", null);
        this.f26Y = properties.getProperty("jcifs.netbios.hostname", null);
        this.f27Z = C0209g.m597a(properties, "jcifs.netbios.cachePolicy", 600) * 60;
        this.f32aa = C0209g.m597a(properties, "jcifs.netbios.soTimeout", 5000);
        this.f33ab = C0209g.m597a(properties, "jcifs.netbios.snd_buf_size", 576);
        this.f34ac = C0209g.m597a(properties, "jcifs.netbios.rcv_buf_size", 576);
        this.f35ad = C0209g.m597a(properties, "jcifs.netbios.retryCount", 2);
        this.f36ae = C0209g.m597a(properties, "jcifs.netbios.retryTimeout", 3000);
        this.f37af = properties.getProperty("jcifs.netbios.scope");
        this.f38ag = C0209g.m597a(properties, "jcifs.netbios.lport", 0);
        this.f39ah = C0209g.m600a(properties, "jcifs.netbios.laddr", (InetAddress) null);
        this.f40ai = properties.getProperty("jcifs.netbios.lmhosts");
        this.f41aj = C0209g.m602a(properties, "jcifs.netbios.wins", ",", new InetAddress[0]);
        this.f45an = C0209g.m597a(properties, "jcifs.smb.client.transaction_buf_size", 65535) - 512;
        this.f46ao = C0209g.m597a(properties, "jcifs.smb.maxBuffers", 16);
        this.f47ap = C0209g.m597a(properties, "jcifs.smb.client.listSize", 65535);
        this.f48aq = C0209g.m597a(properties, "jcifs.smb.client.listCount", 200);
        this.f49ar = C0209g.m598a(properties, "jcifs.smb.client.attrExpirationPeriod", 5000L);
        this.f50as = C0209g.m601a(properties, "jcifs.smb.client.ignoreCopyToException", false);
        this.f42ak = C0209g.m600a(properties, "jcifs.netbios.baddr", (InetAddress) null);
        this.f52au = C0209g.m601a(properties, "jcifs.traceResources", false);
        this.f53av = C0209g.m601a(properties, "jcifs.smb.client.strictResourceLifecycle", false);
        String property = properties.getProperty("jcifs.smb.client.minVersion");
        String property2 = properties.getProperty("jcifs.smb.client.maxVersion");
        if (property != null || property2 != null) {
            m35a(property, property2);
        } else {
            m34a(C0209g.m601a(properties, "jcifs.smb.client.disableSMB1", false) ? EnumC0289m.SMB202 : null, C0209g.m601a(properties, "jcifs.smb.client.enableSMB2", true) ? null : EnumC0289m.SMB1);
        }
        m56c(properties.getProperty("jcifs.resolveOrder"));
        m58d(properties.getProperty("jcifs.smb.client.disallowCompound"));
        m53ar();
    }
}
