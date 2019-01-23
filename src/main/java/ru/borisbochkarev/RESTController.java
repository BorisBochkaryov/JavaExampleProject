package ru.borisbochkarev;

import org.springframework.web.bind.annotation.*;
import ru.borisbochkarev.phonebook.EntityUser;
import ru.borisbochkarev.phonebook.IndividualUser;

import java.util.List;
import java.util.Map;

@RestController
public class RESTController {

    private static UserDAO db = null;

    static {
        db = new UserDAO();
    }

    @RequestMapping("/get_all_individual_users")
    private List<IndividualUser> getAllIndividualUsers(){
        return db.getAllIndividualUsers();
    }

    @RequestMapping("/get_all_entity_users")
    private List<EntityUser> getAllEntityUsers(){
        return db.getAllEntityUsers();
    }

    @PostMapping("/add_individual_user")
    @ResponseBody
    public String addIndividualUser(@RequestParam Map<String,String> allParams) {
        db.saveIndividualUser(new IndividualUser(new Long(db.getCountIndividualUser() + 1), allParams.get("fio"), allParams.get("phone"),
                allParams.get("homeAddress")));
        return "ok";
    }

    @PostMapping("/add_entity_user")
    @ResponseBody
    public String addEntitylUser(@RequestParam Map<String,String> allParams) {
        db.saveEntityUser(new EntityUser(new Long(db.getCountEntityUser() + 1), allParams.get("fio"), allParams.get("phone"),
                allParams.get("authorizedcapital")));
        return "ok";
    }

}
