package nlp2rdf.dashboard.primefaces;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import nlp2rdf.dashboard.utils.TestURL;

@ManagedBean 
@ViewScoped
public class CheckDemoStatus implements Serializable {

	private static final long serialVersionUID = 1L;


	public String openNLPURL = "http://demo.nlp2rdf.org:9998/opennlp?f=text&i=This+is+a+test.&t=direct&modelFolder=model";

	public String stanfordURL = "http://demo.nlp2rdf.org:9999/stanfordcorenlpn?f=text&i=This+is+a+test.&t=direct";

	public String onlineMsg = "<div style=\"color: #66FF66\">Online!</div>";
	
	public String offlineMsg = "<div style=\"color: #FF6666\">Offline!</div>";

	public String stanfordStatus = offlineMsg;
	
	public String openNLPStatus = offlineMsg;

	public String getOpenNLPURL() {
		return openNLPURL;
	}

	public void setOpenNLPURL(String openNLPURL) {
		this.openNLPURL = openNLPURL;
	}

	public String getStanfordURL() {
		return stanfordURL;
	}

	public void setStanfordURL(String stanfordURL) {
		this.stanfordURL = stanfordURL;
	}

	public String getStanfordStatus() {
		return stanfordStatus;
	}

	public void setStanfordStatus(String stanfordStatus) {
		this.stanfordStatus = stanfordStatus;
	}

	public String getOpenNLPStatus() {
		return openNLPStatus;
	}

	public void setOpenNLPStatus(String demo1Status) {
		this.openNLPStatus = demo1Status;
	}

	@PostConstruct
	public void check(){
		try {
			if (TestURL
					.Test(openNLPURL))
				openNLPStatus = onlineMsg;
			else
				openNLPStatus = offlineMsg;
			if (TestURL
					.Test(stanfordURL))
				stanfordStatus = onlineMsg;
			else
				stanfordStatus = offlineMsg;
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
