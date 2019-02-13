package com.rutvikpatel.springmvc3.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashSet;
import java.util.Set;

@Controller
@RequestMapping("")
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String home(ModelMap model) {
        model.addAttribute("mensagem", "Teste");
        return "home";
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET , value = "mensagens/{name}")
    public Set<String> mensagens(@PathVariable("name") String name) {
        Set<String> mensagens = new HashSet<String>();
        mensagens.add("Msg 1:" + name);
        mensagens.add("Msg 2:" + name);
        mensagens.add("Msg 3:" + name);
        return mensagens;
    }
}
