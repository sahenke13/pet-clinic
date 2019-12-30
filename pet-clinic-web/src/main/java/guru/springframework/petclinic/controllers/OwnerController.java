package guru.springframework.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.petclinic.services.OwnerService;

@RequestMapping("/owners")
@Controller
public class OwnerController
{

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService)
    {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/", "/index"})
    public String listOwners(Model model){

        model.addAttribute("owners", ownerService.findAll());

        return "owner/ownerIndex";
    }

    @RequestMapping({"/find"})
    public String findOwners(){
        return "notImplemented";
    }

}
