package org.cybergarage.xml.parser;

import java.io.InputStream;
import javax.xml.parsers.DocumentBuilderFactory;
import org.cybergarage.xml.AbstractC1754e;
import org.cybergarage.xml.C1752c;
import org.cybergarage.xml.C1755f;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

/* JADX INFO: loaded from: classes.dex */
public class JaxpParser extends AbstractC1754e {
    /* JADX INFO: renamed from: a */
    private C1752c m5175a(C1752c c1752c, Node node, int i) {
        short nodeType = node.getNodeType();
        String nodeName = node.getNodeName();
        String nodeValue = node.getNodeValue();
        NamedNodeMap attributes = node.getAttributes();
        if (attributes != null) {
            attributes.getLength();
        }
        if (nodeType == 3) {
            c1752c.m5154h(nodeValue);
            return c1752c;
        }
        if (nodeType == 1) {
            C1752c c1752c2 = new C1752c();
            c1752c2.m5150f(nodeName);
            c1752c2.m5152g(nodeValue);
            if (c1752c != null) {
                c1752c.m5146c(c1752c2);
            }
            NamedNodeMap attributes2 = node.getAttributes();
            if (attributes2 != null) {
                int length = attributes2.getLength();
                for (int i2 = 0; i2 < length; i2++) {
                    Node nodeItem = attributes2.item(i2);
                    c1752c2.m5145c(nodeItem.getNodeName(), nodeItem.getNodeValue());
                }
            }
            Node firstChild = node.getFirstChild();
            if (firstChild == null) {
                c1752c2.m5152g("");
                return c1752c2;
            }
            do {
                m5175a(c1752c2, firstChild, i + 1);
                firstChild = firstChild.getNextSibling();
            } while (firstChild != null);
            return c1752c2;
        }
        return c1752c;
    }

    /* JADX INFO: renamed from: a */
    private C1752c m5176a(Node node) {
        return m5175a(null, node, 0);
    }

    @Override // org.cybergarage.xml.AbstractC1754e
    /* JADX INFO: renamed from: a */
    public final C1752c mo5171a(InputStream inputStream) throws C1755f {
        try {
            Element documentElement = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(inputStream)).getDocumentElement();
            if (documentElement == null) {
                return null;
            }
            return m5176a(documentElement);
        } catch (Exception e) {
            throw new C1755f(e);
        }
    }
}
