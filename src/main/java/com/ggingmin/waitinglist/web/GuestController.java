package com.ggingmin.waitinglist.web;

import com.ggingmin.waitinglist.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;


@Controller
public class GuestController {

    @Autowired
    private GuestService guestService;

    @GetMapping("/")
    public String index(Model model) {
        guestService.findAll(model);
        return "index";
    }

    @PostMapping("/guest")
    public String save(
            @RequestParam String content,
//            @RequestParam Integer num,
//            @RequestParam boolean noShow,
            @RequestParam(required = false) String submit,
            Model model
            ) throws IOException {
        if (submit != null && submit.equals("Submit")) {
            try {
                guestService.save(content, model);
                guestService.findAll(model);
                return "redirect:/";
            } catch (Exception e) {
                return "redirect:/";
            }
        }
        return "redirect:/";
    }


}
