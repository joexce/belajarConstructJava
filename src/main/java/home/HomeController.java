package home;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import javax.validation.Valid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Object getFactory(@Valid @RequestBody Factory factory) {


        List<String> list = new ArrayList<String>();
        list.add("indonesia");
        list.add("arab");
        list.add("japan");
        factory.setFactoryName("Mitsuisisi");
        factory.setCountryAvailable((ArrayList) list);

        City a = new City("Jakarta");
        City b = new City("Tokyo");

        ArrayList<City> cities = new ArrayList<City>();
        cities.add(0,a);
        cities.add(1,b);

        factory.setCityName(cities);

        return factory;
    }
}

