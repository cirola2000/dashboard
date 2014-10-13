package nlp2rdf.dashboard.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class TestURL {

	public static boolean Test(String URL) {

		BufferedReader reader = null;
		try {
			URL url = new URL(URL);

			reader = new BufferedReader(new InputStreamReader(url.openStream(),
					"UTF-8"));

			for (String line; (line = reader.readLine()) != null;) {
				if (line.startsWith("@") || line.contains("!DOCTYPE html>"))
					return true;
				else
					return false;

			}
		}

		catch (Exception ignore) {
			try {
				reader.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return false;
	}
}
