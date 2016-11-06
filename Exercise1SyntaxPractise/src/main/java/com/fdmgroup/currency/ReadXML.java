package com.fdmgroup.currency;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.Namespace;
import org.jdom2.input.SAXBuilder;

public class ReadXML {
	
	
	 Map<String , Double> currencyMap = new HashMap<String , Double>();
	
	public  void readXML() {
		SAXBuilder builder = new SAXBuilder();
		
		File xmlFile = new File("./eurofxref-daily.xml");
//		File xmlFile = new File("/Users/Ludovic/Documents/workspace/maven.1471472035592/Exercise1SyntaxPractise/eurofxref-daily.xml");
		
		try {
			Document document = (Document )builder.build(xmlFile);
			Element root = document.getRootElement();
			Namespace ns = Namespace.getNamespace("http://www.ecb.int/vocabulary/2002-08-01/eurofxref");
			Element firstLayerChild = root.getChild("Cube",ns);
			Element secondLayerChild = firstLayerChild.getChild("Cube",ns);
			List<Element> list =secondLayerChild.getChildren("Cube",ns);
			
			for(int i =0; i<list.size();i++){
				Element fEle=list.get(i);
				
				Double currencyRate = Double.parseDouble(fEle.getAttributeValue("rate"));   //Value
				String currencyName = fEle.getAttributeValue("currency");  //Key
				
				currencyMap.put(currencyName, currencyRate);
				currencyMap.put("EUR",1.0D);
			}
			
		} catch (JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//			System.out.println(currencyMap.keySet());


	}

}
