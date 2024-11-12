package vn.edu.iuh.fit.frontend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vn.edu.iuh.fit.backend.dtos.JobDto;
import vn.edu.iuh.fit.backend.dtos.PageDTO;
import vn.edu.iuh.fit.frontend.models.JobModel;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private JobModel jobModel;

    @RequestMapping({"/", "/home"})
    public String home(Model model, 
            @RequestParam(value = "jobName", required = false) String jobName,
            @RequestParam(value = "page", required = false, defaultValue = "0") Integer page,
            @RequestParam(value = "size", required = false, defaultValue = "20") Integer size) {

        if(page == null) {
            page = 0;
        }
        if(size == null) {
            size = 20;
        }

        PageDTO<JobDto> jobs;
        if (jobName != null && !jobName.isEmpty()) {
            jobs = jobModel.getJobsByJobName(jobName, page, size);
        } else {
            jobs = jobModel.getJobsPaging(page, size);
        }
        
        model.addAttribute("jobs", jobs);

        return "index";
    }
}
