package org.cybergarage.xml.parser;

import java.io.InputStream;
import javax.xml.parsers.DocumentBuilderFactory;
import org.cybergarage.xml.c;
import org.cybergarage.xml.e;
import org.cybergarage.xml.f;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

/* JADX INFO: loaded from: classes.dex */
public class JaxpParser extends e {
    private c a(c cVar, Node node, int i) {
        short nodeType = node.getNodeType();
        String nodeName = node.getNodeName();
        String nodeValue = node.getNodeValue();
        NamedNodeMap attributes = node.getAttributes();
        if (attributes != null) {
            attributes.getLength();
        }
        if (nodeType == 3) {
            cVar.h(nodeValue);
            return cVar;
        }
        if (nodeType == 1) {
            c cVar2 = new c();
            cVar2.f(nodeName);
            cVar2.g(nodeValue);
            if (cVar != null) {
                cVar.c(cVar2);
            }
            NamedNodeMap attributes2 = node.getAttributes();
            if (attributes2 != null) {
                int length = attributes2.getLength();
                for (int i2 = 0; i2 < length; i2++) {
                    Node nodeItem = attributes2.item(i2);
                    cVar2.c(nodeItem.getNodeName(), nodeItem.getNodeValue());
                }
            }
            Node firstChild = node.getFirstChild();
            if (firstChild == null) {
                cVar2.g("");
                return cVar2;
            }
            do {
                a(cVar2, firstChild, i + 1);
                firstChild = firstChild.getNextSibling();
            } while (firstChild != null);
            return cVar2;
        }
        return cVar;
    }

    private c a(Node node) {
        return a(null, node, 0);
    }

    @Override // org.cybergarage.xml.e
    public final c a(InputStream inputStream) throws f {
        try {
            Element documentElement = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(inputStream)).getDocumentElement();
            if (documentElement == null) {
                return null;
            }
            return a(documentElement);
        } catch (Exception e) {
            throw new f(e);
        }
    }
}
