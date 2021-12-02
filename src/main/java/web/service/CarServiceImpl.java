package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {

    private List <Car> list = new ArrayList<>();

    @Override
    public List<Car> getList(int count) {
        list.add(new Car("supra", 1, 1998));
        list.add(new Car("mustang", 2, 1995));
        list.add(new Car("astra", 3, 2009));
        list.add(new Car("almera", 4, 2002));
        list.add(new Car("vectra", 5, 2005));
        if (count <= 0) {
            return null;
        } else if (count < 5) {
            list = list.subList(0, count);
        }
        return list;
    }
}
