package nlp2rdf.dashboard.primefaces;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Dashboard {

    private String firstName = "Cirola";
    private String lastName = "Doe";
    private String demo1Status = "j";


	public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String showGreeting() {
        return "Hello" + " " + firstName + " " + lastName + "!";
    }
    
    public String showNews(){
    	return "we're using the Unifi Enterprise AP system on three floors with reduced power output connected via powerswitch, then into Dlink Gigabit switch, then to PFsense. Only issue ever encountered with clients unable to connect was a laptop downloading torrents using up all available bandwidth and still wanting more...I swear that green light started glowing red! (Which would be a good idea for excess bandwidth usage, et al)."
    			+ "";
    }
    
}
