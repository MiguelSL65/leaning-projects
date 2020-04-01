package org.academiadecodigo.rhashtafaris.tomcat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class RhashtaController {

    @ModelAttribute("rasta")
    public Rhashtafari setUp() {
        return new Rhashtafari();
    }

    @GetMapping("/")
    public String form() {

        return "homepage";
    }

    @PostMapping("/saveRasta")
    public String processingInfo(@ModelAttribute("rasta") Rhashtafari rasta) {

        return "index";
    }
}
