package vn.edu.iuh.fit.backend.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.iuh.fit.backend.entities.Skill;
import vn.edu.iuh.fit.backend.services.SkillService;

import java.util.List;

@RestController
@RequestMapping("/api/skills")
public class SkillResource {
    @Autowired
    private SkillService skillService;

    @GetMapping("/{skillName}")
    public Skill findBySkillName(@PathVariable String skillName) {
        return skillService.findBySkillName(skillName);
    }

    @GetMapping
    public List<Skill> getAll() {
        return skillService.getAll();
    }
}
