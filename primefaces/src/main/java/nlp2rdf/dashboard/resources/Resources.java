package nlp2rdf.dashboard.resources;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Resources implements Serializable{
	
	private String label;
	
	private String uri;
	
	private String description;
	
	private String revisions;

	private String status;
	
	private String versioningLevel;
	
	private String versioningMethod;
	
	
	public Resources() {
		
		
	}

	
	
	public String getLabel() {
		return label;
	}



	public void setLabel(String label) {
		this.label = label;
	}



	public String getUri() {
		return uri;
	}



	public void setUri(String uri) {
		this.uri = uri;
	}



	public String getRevisions() {
		return revisions;
	}



	public void setRevisions(String revisions) {
		this.revisions = revisions;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getVersioningLevel() {
		return versioningLevel;
	}



	public void setVersioningLevel(String versioningLevel) {
		this.versioningLevel = versioningLevel;
	}



	public String getVersioningMethod() {
		return versioningMethod;
	}



	public void setVersioningMethod(String versioningMethod) {
		this.versioningMethod = versioningMethod;
	}



	public String getName() {
		return label;
	}

	public void setName(String name) {
		this.label = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
