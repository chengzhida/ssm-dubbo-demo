//import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/")
public class ApiConfig extends ResourceConfig {

	public ApiConfig() {

		packages(this.getClass().getPackage().getName());
//		register(JacksonFeature.class);
//		// 注册多媒体功能
//		register(MultiPartFeature.class);
		// 注册资源过滤器
//		register(BaseResourceFilter.class);

//		register(ValidationFeature.class);
	}

}
