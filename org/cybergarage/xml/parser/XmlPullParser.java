package org.cybergarage.xml.parser;

import java.io.InputStream;
import org.cybergarage.xml.AbstractC1754e;
import org.cybergarage.xml.C1752c;
import org.cybergarage.xml.C1755f;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes.dex */
public class XmlPullParser extends AbstractC1754e {
    /* JADX INFO: renamed from: a */
    private static C1752c m5177a(org.xmlpull.v1.XmlPullParser xmlPullParser, InputStream inputStream) throws C1755f {
        C1752c c1752cM5149f;
        try {
            xmlPullParser.setInput(inputStream, null);
            int eventType = xmlPullParser.getEventType();
            C1752c c1752c = null;
            C1752c c1752c2 = null;
            while (eventType != 1) {
                switch (eventType) {
                    case 2:
                        C1752c c1752c3 = new C1752c();
                        String prefix = xmlPullParser.getPrefix();
                        String name = xmlPullParser.getName();
                        StringBuffer stringBuffer = new StringBuffer();
                        if (prefix != null && prefix.length() > 0) {
                            stringBuffer.append(prefix);
                            stringBuffer.append(":");
                        }
                        if (name != null && name.length() > 0) {
                            stringBuffer.append(name);
                        }
                        c1752c3.m5150f(stringBuffer.toString());
                        int attributeCount = xmlPullParser.getAttributeCount();
                        for (int i = 0; i < attributeCount; i++) {
                            c1752c3.m5145c(xmlPullParser.getAttributeName(i), xmlPullParser.getAttributeValue(i));
                        }
                        if (c1752c != null) {
                            c1752c.m5146c(c1752c3);
                        }
                        if (c1752c2 == null) {
                            c1752cM5149f = c1752c3;
                            c1752c2 = c1752c3;
                        } else {
                            c1752cM5149f = c1752c3;
                        }
                        break;
                    case 3:
                        c1752cM5149f = c1752c.m5149f();
                        break;
                    case 4:
                        String text = xmlPullParser.getText();
                        if (text == null || c1752c == null) {
                            c1752cM5149f = c1752c;
                        } else {
                            c1752c.m5152g(text);
                            c1752cM5149f = c1752c;
                        }
                        break;
                    default:
                        c1752cM5149f = c1752c;
                        break;
                }
                eventType = xmlPullParser.next();
                c1752c = c1752cM5149f;
            }
            return c1752c2;
        } catch (Exception e) {
            throw new C1755f(e);
        }
    }

    @Override // org.cybergarage.xml.AbstractC1754e
    /* JADX INFO: renamed from: a */
    public final C1752c mo5171a(InputStream inputStream) throws C1755f {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            xmlPullParserFactoryNewInstance.setNamespaceAware(false);
            return m5177a(xmlPullParserFactoryNewInstance.newPullParser(), inputStream);
        } catch (Exception e) {
            throw new C1755f(e);
        }
    }
}
