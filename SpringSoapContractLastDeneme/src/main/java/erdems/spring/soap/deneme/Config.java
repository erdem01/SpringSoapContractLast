package erdems.spring.soap.deneme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;

@Configuration
public class Config {

	@Bean
	public SimpleJaxWsServiceExporter jaxWsExporter() {
		final SimpleJaxWsServiceExporter exporter = new SimpleJaxWsServiceExporter();
		exporter.setBaseAddress("http://localhost:8090/services/");
		return exporter;
	}
	
}
