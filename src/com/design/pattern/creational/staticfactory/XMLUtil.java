package design.pattern.creational.staticfactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class XMLUtil {
    // 从XML配置文件中提取图案类型，并返回类型名
    public static String getChartType() {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = null;
        try {
            documentBuilder = dbFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(new File("src/main/resources/config.xml"));
            NodeList nodeList = document.getElementsByTagName("chartType");
            Node firstChild = nodeList.item(0).getFirstChild();
            return firstChild.getNodeValue().trim();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
