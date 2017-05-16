package com.financeui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by user on 4/18/2017.
 */
@Controller
@RequestMapping(value = "")
public class CentralController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String home(){
        return "index";
    }
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        return "index";
    }
    @RequestMapping(value = "/index-2", method = RequestMethod.GET)
    public String home2(){
        return "index-2";
    }
    @RequestMapping(value = "/index-3", method = RequestMethod.GET)
    public String home3(){
        return "index-3";
    }
    @RequestMapping(value = "/index-4", method = RequestMethod.GET)
    public String home4(){
        return "index-4";
    }
    @RequestMapping(value = "/index-5", method = RequestMethod.GET)
    public String home5(){
        return "index-5";
    }
    @RequestMapping(value = "/add-job", method = RequestMethod.GET)
    public String addJob(){
        return "add-job";
    }
    @RequestMapping(value = "/add-resume", method = RequestMethod.GET)
    public String addResume(){
        return "add-resume";
    }

    @RequestMapping(value = "/blog", method = RequestMethod.GET)
    public String blog(){
        return "blog";
    }

    @RequestMapping(value = "/blog-single-post", method = RequestMethod.GET)
    public String blogSinglePost(){
        return "blog-single-post";
    }

    @RequestMapping(value = "/browse-categories", method = RequestMethod.GET)
    public String browseCategories(){
        return "browse-categories";
    }

    @RequestMapping(value = "/browse-jobs", method = RequestMethod.GET)
    public String browseJobs(){
        return "browse-jobs";
    }

    @RequestMapping(value = "/browse-resumes", method = RequestMethod.GET)
    public String browseResumes(){
        return "browse-resumes";
    }

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String contact(){
        return "contact";
    }

    @RequestMapping(value = "/icons", method = RequestMethod.GET)
    public String icons(){
        return "icons";
    }

    @RequestMapping(value = "/job-alerts", method = RequestMethod.GET)
    public String jobAlerts(){
        return "job-alerts";
    }

    @RequestMapping(value = "/job-page", method = RequestMethod.GET)
    public String jobPage(){
        return "job-page";
    }

    @RequestMapping(value = "/job-page-alt", method = RequestMethod.GET)
    public String jobPageAlt(){
        return "job-page-alt";
    }

    @RequestMapping(value = "/manage-applications", method = RequestMethod.GET)
    public String manageApplications(){
        return "manage-applications";
    }

    @RequestMapping(value = "/manage-jobs", method = RequestMethod.GET)
    public String manageJobs(){
        return "manage-jobs";
    }

    @RequestMapping(value = "/manage-resumes", method = RequestMethod.GET)
    public String manageResumes(){
        return "manage-resumes";
    }

    @RequestMapping(value = "/my-account", method = RequestMethod.GET)
    public String myAccount(){
        return "my-account";
    }

    @RequestMapping(value = "/pricing-tables", method = RequestMethod.GET)
    public String pricingTable(){
        return "pricing-tables";
    }

    @RequestMapping(value = "/resume-page", method = RequestMethod.GET)
    public String resumePage(){
        return "resume-page";
    }

    @RequestMapping(value = "/shortcodes", method = RequestMethod.GET)
    public String shortcodes(){
        return "shortcodes";
    }



}
