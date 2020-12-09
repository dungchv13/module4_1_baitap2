package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryCtrl {


    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/search")
    public String search(@RequestParam String word, Model model){
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "Xin chao");
        dictionary.put("how", "the nao ");
        dictionary.put("book", "quyen vo");
        dictionary.put("computer", "may tinh");

        String result = dictionary.get(word);
        if(result != null){
            model.addAttribute("result",result);
        }else{
            model.addAttribute("message","Not found");
        }
        return "home";

    }

}
