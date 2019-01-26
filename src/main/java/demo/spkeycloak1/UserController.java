/*
 *  copyright (c) thelook.cn
 */
package demo.spkeycloak1;

import java.security.Principal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author 老唐
 */
@Controller
public class UserController {

    final static Logger LOG = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("/user")
    public String index(Principal p) {
        System.out.println("------"+p.getName()+"--------->");
        LOG.debug("p:{}", p != null ? p.getName() : "null");
        System.out.println("--------------->");
        return "user";
    }

}
