package ru.borisbochkarev;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.borisbochkarev.phonebook.User;

@RestController
public class RESTController {

    @RequestMapping("/get_user")
    private User getUser(){
        return new User(1, "Boris Bochkarev");
    }

}
