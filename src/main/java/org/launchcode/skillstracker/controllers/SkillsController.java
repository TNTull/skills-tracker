//Teresa Tull worked on this on 10-10-2022 in class ch 10 studio

package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {
    @GetMapping
    @ResponseBody
    public String addText(){
        return "<h1>Skills Tracker</h1>" +
                "<h2> We have a few skills we would like to learn. Here is the list! </h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>";
    }

    //@RequestMapping(value="form", method = {RequestMethod.GET})
    @GetMapping("form")
    @ResponseBody
    public String chooseLanguages(){
        return "<form method = 'post' action = '/form'>" +
                "<label>Name: </label><input type='text' name='name' />" +
                "<br>" +
                "<label>My favorite language: </label> " +
                "<br>" +
                "<select name = 'firstChoice' id='firstChoice' />" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<label>My second favorite language: </label> " +
                "<br>" +
                "<select name = 'secondChoice' id='secondChoice' />" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<label>My third favorite language: </label> " +
                "<br>" +
                "<select name = 'thirdChoice' id='thirdChoice' />" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<input type = 'submit' value = 'Submit' />" +
                "</form>";
    }

    @PostMapping("form")
    @ResponseBody
    public String displayUserPreferences(@RequestParam String name, @RequestParam String firstChoice, @RequestParam String secondChoice, @RequestParam String thirdChoice){
        return "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>"+ firstChoice+"</li>" +
                "<li>"+ secondChoice+"</li>" +
                "<li>"+ thirdChoice+"</li>" +
                "</ol>";
    }

}
