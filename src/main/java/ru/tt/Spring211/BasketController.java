package ru.tt.Spring211;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.tt.Spring211.Item;
import ru.tt.Spring211.StoreService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class BasketController {

    private final StoreService storeService;

    public BasketController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/add")
    public void add(@RequestParam("id") List<Integer> id){
        storeService.add(id);
    }

    @GetMapping("/get")
    public List<Item> get(){
        return storeService.get();
    }
}
