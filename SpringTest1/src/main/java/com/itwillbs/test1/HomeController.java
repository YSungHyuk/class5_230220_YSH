package com.itwillbs.test1;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
		// => servlet-context.xml 파일에 기술된 InternalResourceViewResolver 에 의해
		//    prefix 값과 suffix 값을 return 문 뒤의 문자열과 결합하여 포워딩 할 페이지 경로가 생성됨
		// => 즉, return "home"; 지정 시 "/WEB-INF/views" + "home" + ".jsp" 가 결합되어 하나의 문자열로 생성됨
		// => DispatcherServlet 객체에 의해 포워딩 작업이 이루어진다!
		//    결국, webapp/WEB-INF/views/home.jsp 페이지로 포워딩됨
		
//		return "index"; // webapp/WEB-INF/views/index.jsp
		
		
//		return "test/main"; // webapp/WEB-INF/views/test/main.jsp
		
	}
	
}









