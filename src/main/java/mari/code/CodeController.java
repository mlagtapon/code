package mari.code;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CodeController {
    
    @RequestMapping("/")
    public String index() {

          return "index.jsp";
    }
    
    @RequestMapping(value="/submit", method=RequestMethod.POST)
    public String code(HttpSession session, RedirectAttributes redirectAtt, @RequestParam(value="name") String name) {
		session.setAttribute("name", name);
		System.out.println(name);
		redirectAtt.addFlashAttribute("wrong", "You must train harder!");
          return "redirect:/";
    }
    
    @RequestMapping("/clearsession")
    public String clear(HttpServletRequest request) {
    	HttpSession session = request.getSession(false);
    	if (session != null) {
    	    session.invalidate();
    	}
    	return "redirect:/";
    }
    
    @RequestMapping("/code")
    public String thecode() {
          return "code.jsp";
    }
}