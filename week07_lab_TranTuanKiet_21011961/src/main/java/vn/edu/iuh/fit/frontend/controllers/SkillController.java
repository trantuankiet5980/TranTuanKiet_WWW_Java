package vn.edu.iuh.fit.frontend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.ui.Model;

import vn.edu.iuh.fit.backend.dtos.SkillDto;
import vn.edu.iuh.fit.frontend.models.SkillModels;

import java.util.List;

@Controller
@RequestMapping("/")
public class SkillController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private SkillModels skillModels;

    @GetMapping
    public String showSkills(Model model) {
        List<SkillDto> skills = skillModels.getAllSkills();
        model.addAttribute("skills", skills);
        return "index";
    }
}
