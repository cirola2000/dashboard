package nlp2rdf.dashboard.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import nlp2rdf.dashboard.resources.Resources;

import org.junit.Test;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.Statement;
import com.hp.hpl.jena.rdf.model.StmtIterator;
import com.hp.hpl.jena.vocabulary.RDFS;

public class GetResourcesFromWeb {

	public static List<List<Resources>> Go(){
		
		final List<List<Resources>> ret = new ArrayList<List<Resources>>();
		final String uri = "https://raw.githubusercontent.com/NLP2RDF/ontologies/master/dev/misc/resources.ttl";
		
		final Model model = ModelFactory.createDefaultModel();
		model.read(uri,null,"TTL");
		
		final List<String> uris = new ArrayList<String>();
		uris.add("ontology");
		uris.add("poster");
		uris.add("software");
		uris.add("specification");
		uris.add("wikipage");
		uris.add("demo");
		
		Iterator<String> urisIt = uris.iterator();
		
		while (urisIt.hasNext()){
			 List<Resources> re = new ArrayList<Resources>(); 
			
		// instantiate ontologies classes
			
			String obj = urisIt.next();
		StmtIterator it = model.listStatements(null, model.getProperty("http://persistence.uni-leipzig.org/nlp2rdf/ontologies/dev/misc/resources.ttl#type") , obj);
		
		while(it.hasNext()){
			Statement stmt      = it.nextStatement();  // get next statement
		    Resource  subject   = stmt.getSubject();     // get the subject

		    System.out.println(subject.toString());
		    System.out.println(obj);
		    
			Resources r2 = new Resources();
			r2.setLabel(subject.getProperty(RDFS.label).getObject().toString());
			r2.setUri(subject.toString());
			r2.setStatus(subject.getProperty(model.getProperty("http://persistence.uni-leipzig.org/nlp2rdf/ontologies/dev/misc/resources.ttl#status")).getObject().toString());
			r2.setDescription(subject.getProperty(model.getProperty("http://persistence.uni-leipzig.org/nlp2rdf/ontologies/dev/misc/resources.ttl#description")).getObject().toString());
			try{
				r2.setRevisions(subject.getProperty(model.getProperty("http://persistence.uni-leipzig.org/nlp2rdf/ontologies/dev/misc/resources.ttl#revisions")).getObject().toString());
				r2.setVersioningLevel(subject.getProperty(model.getProperty("http://persistence.uni-leipzig.org/nlp2rdf/ontologies/dev/misc/resources.ttl#versioningLevel")).getObject().toString());
				r2.setVersioningMethod(subject.getProperty(model.getProperty("http://persistence.uni-leipzig.org/nlp2rdf/ontologies/dev/misc/resources.ttl#versioningMethod")).getObject().toString());
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		    re.add(r2);
		}
		ret.add(re);
		}
		return ret;
	}
	

}
