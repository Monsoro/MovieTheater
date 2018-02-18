package ua.epam.spring.hometask.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.epam.spring.hometask.domain.Auditorium;
import ua.epam.spring.hometask.service.AuditoriumService;

import javax.annotation.Resource;
import java.util.Set;

@RequestMapping(value = "/auditoriums")
@Controller
public class AuditoriumController {

    @Resource
    private AuditoriumService auditoriumService;

    @RequestMapping(method = RequestMethod.GET)
    public String auditoriumPage(Model model){
        Set<Auditorium> auditoriums = auditoriumService.getAll();
        model.addAttribute("auditoriums", auditoriums);

        return "auditoriums";
    }

}
