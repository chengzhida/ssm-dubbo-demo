//import com.czd.enums.BaseEnum;
//import com.czd.enums.UserTypeEnum;
//import io.swagger.jaxrs.config.SwaggerContextService;
//import io.swagger.models.Contact;
//import io.swagger.models.Info;
//import io.swagger.models.Swagger;
//import org.apache.commons.lang3.StringUtils;
//import org.apache.commons.lang3.reflect.MethodUtils;
//
//import javax.servlet.ServletConfig;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import java.lang.reflect.InvocationTargetException;
//
//public class Bootstrap extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//	private static <T extends BaseEnum<?>> String parse(Class<T> enumType) {
//		StringBuilder sb = new StringBuilder("<p>");
//		T[] enums = enumType.getEnumConstants();
//		for (T t : enums) {
//			try {
//				// 枚举名称
//				String name = MethodUtils.invokeMethod(t, "name").toString();
//				// 备注
//				Object comment = MethodUtils.invokeMethod(t, "comment");
//				String value = comment == null || comment.toString().isEmpty() ? name : comment.toString();
//				sb.append("" + t.code() + "=" + value).append("<br/>");
//			} catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
//				e.printStackTrace();
//			}
//		}
//		sb.append("</p>");
//		return sb.toString();
//	}
//
//	@Override
//	public void init(ServletConfig config) throws ServletException {
//		String email = "";
//		String title = "API";
//		StringBuilder desc = new StringBuilder();
//		desc.append("<h3>签名算法</h3>");
//		desc.append("在线加密：http://www.cmd5.com/hash.aspx");
//		desc.append("<br/>");
//		desc.append("<h3>用户类别信息枚举</h3>");
//		desc.append(parse(UserTypeEnum.class));
//
//
//		Info info = new Info().title(title).description(desc.toString());
//		if (!StringUtils.isEmpty(email)) {
//			info.contact(new Contact().email(email));
//		}
//		Swagger swagger = new Swagger().info(info);
//		new SwaggerContextService().withServletConfig(config).updateSwagger(swagger);
//	}
//}
