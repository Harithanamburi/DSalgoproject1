package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configreader {

		private Properties prop;

		public Properties init_prop() {

			prop = new Properties();
			try {
<<<<<<< HEAD
				FileInputStream ip = new FileInputStream("/Users/muvva/eclipse-workspace/DSAlgoproject1/src/test/resources/Config.properties/configproperties");
=======
				FileInputStream ip = new FileInputStream(".\\src\\test\\resources\\Config.properties\\configproperties");
>>>>>>> main
				prop.load(ip);								
			}
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			catch (IOException e) {
				e.printStackTrace();
			}

			return prop;

		}

	}
	
	
	

