package nlp2rdf.test.dashboard.primefaces;

import static org.junit.Assert.assertEquals;
import nlp2rdf.dashboard.primefaces.Dashboard;

import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void testShowGreeting() {
        Dashboard helloWorld = new Dashboard();
        helloWorld.setFirstName("John");
        helloWorld.setLastName("Doe");

        assertEquals(helloWorld.showGreeting(), "Hello John Doe!");
    }
}
