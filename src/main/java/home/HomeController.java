package home;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "/car")
public class HomeController {

    private final static Logger LOGGER = Logger.getLogger(HomeController.class.getName());

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Object createPet(@Valid @RequestBody Cars cars) {


        System.out.println("Nama: " + cars.getName());

        Map<String, Object> map = (Map<String, Object>) cars.getTypes();

        for(String key : map.keySet()){
            System.out.println(" Key " + key + " Result " + map.get(key));
        }

        return cars;
    }
}

