package nlp2rdf.test.dashboard.utils;

import nlp2rdf.dashboard.utils.TestURL;

import org.junit.Test;

public class TestDemoTest {

	
	public void TestDemoTesting() {
		
		try {
			if(TestURL.Test("http://demo.nlp2rdf.org:9998/opennlp?f=text&i=This+is+a+test.&t=direct&modelFolder=model"))
				System.out.println("Good! Demos appear to be working!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
