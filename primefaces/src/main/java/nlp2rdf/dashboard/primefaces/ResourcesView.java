package nlp2rdf.dashboard.primefaces;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import nlp2rdf.dashboard.resources.Resources;
import nlp2rdf.dashboard.utils.GetResourcesFromWeb;

@ManagedBean
public class ResourcesView implements Serializable{
	
	private List<List<Resources>> resources = new ArrayList<List<Resources>>();
	
	private List<Resources> ontologies = new ArrayList<Resources>(); 
	private List<Resources> poster = new ArrayList<Resources>(); 
	private List<Resources> software = new ArrayList<Resources>(); 
	private List<Resources> specifications = new ArrayList<Resources>(); 
	private List<Resources> wikis = new ArrayList<Resources>(); 	
	private List<Resources> demo = new ArrayList<Resources>(); 	
	
	

	public ResourcesView(){
		
//		resources.add(new Resources("Oi","Descricao"));
//		resources.add(new Resources("Oi","Descricao"));
//		resources.add(new Resources("Oi","Descricao"));
//		resources.add(new Resources("Oi","Descricao"));
		
		resources = GetResourcesFromWeb.Go();

		ontologies = resources.get(0);
		poster = resources.get(1);
		software = resources.get(2);
		specifications = resources.get(3);
		wikis = resources.get(4);
		setDemo(resources.get(5));
		
		
	}



	public List<List<Resources>> getResources() {
		return resources;
	}



	public void setResources(List<List<Resources>> resources) {
		this.resources = resources;
	}



	public List<Resources> getOntologies() {
		return ontologies;
	}



	public void setOntologies(List<Resources> ontologies) {
		this.ontologies = ontologies;
	}



	public List<Resources> getPoster() {
		return poster;
	}



	public void setPoster(List<Resources> poster) {
		this.poster = poster;
	}



	public List<Resources> getSoftware() {
		return software;
	}



	public void setSoftware(List<Resources> software) {
		this.software = software;
	}



	public List<Resources> getSpecifications() {
		return specifications;
	}



	public void setSpecifications(List<Resources> specifications) {
		this.specifications = specifications;
	}



	public List<Resources> getWikis() {
		return wikis;
	}



	public void setWikis(List<Resources> wikis) {
		this.wikis = wikis;
	}



	public List<Resources> getDemo() {
		return demo;
	}



	public void setDemo(List<Resources> demo) {
		this.demo = demo;
	}
	
		
}
