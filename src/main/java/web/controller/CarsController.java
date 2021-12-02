package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String carList(@RequestParam(value = "count", required = false) String count, ModelMap model) {
        CarServiceImpl car = new CarServiceImpl();
        if (count == null) {
            model.addAttribute("cars", car.getList(5));
        } else {
            model.addAttribute("cars", car.getList(Integer.parseInt(count)));
        }
        return "cars";
    }
}
