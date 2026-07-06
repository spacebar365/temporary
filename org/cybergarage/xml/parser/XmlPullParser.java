package org.cybergarage.xml.parser;

import java.io.InputStream;
import org.cybergarage.xml.c;
import org.cybergarage.xml.e;
import org.cybergarage.xml.f;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes.dex */
public class XmlPullParser extends e {
    private static c a(org.xmlpull.v1.XmlPullParser xmlPullParser, InputStream inputStream) throws f {
        c cVarF;
        try {
            xmlPullParser.setInput(inputStream, null);
            int eventType = xmlPullParser.getEventType();
            c cVar = null;
            c cVar2 = null;
            while (eventType != 1) {
                switch (eventType) {
                    case 2:
                        c cVar3 = new c();
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
                        cVar3.f(stringBuffer.toString());
                        int attributeCount = xmlPullParser.getAttributeCount();
                        for (int i = 0; i < attributeCount; i++) {
                            cVar3.c(xmlPullParser.getAttributeName(i), xmlPullParser.getAttributeValue(i));
                        }
                        if (cVar != null) {
                            cVar.c(cVar3);
                        }
                        if (cVar2 == null) {
                            cVarF = cVar3;
                            cVar2 = cVar3;
                        } else {
                            cVarF = cVar3;
                        }
                        break;
                    case 3:
                        cVarF = cVar.f();
                        break;
                    case 4:
                        String text = xmlPullParser.getText();
                        if (text == null || cVar == null) {
                            cVarF = cVar;
                        } else {
                            cVar.g(text);
                            cVarF = cVar;
                        }
                        break;
                    default:
                        cVarF = cVar;
                        break;
                }
                eventType = xmlPullParser.next();
                cVar = cVarF;
            }
            return cVar2;
        } catch (Exception e) {
            throw new f(e);
        }
    }

    @Override // org.cybergarage.xml.e
    public final c a(InputStream inputStream) throws f {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            xmlPullParserFactoryNewInstance.setNamespaceAware(false);
            return a(xmlPullParserFactoryNewInstance.newPullParser(), inputStream);
        } catch (Exception e) {
            throw new f(e);
        }
    }
}
