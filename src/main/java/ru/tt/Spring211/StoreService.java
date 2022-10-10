package ru.tt.Spring211;

import org.springframework.stereotype.Service;
import ru.tt.Spring211.Basket;
import ru.tt.Spring211.Item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class StoreService {

    private final List<Item> itemMap = new ArrayList();
    private final Basket basket;

    public StoreService(Basket basket) {
        this.basket = basket;
    }

    public List<Item> get(){
        return basket.get();
    }

    public void add(List<Integer>id){
        basket.add(id.stream()
                .map(i -> new Item(i))
                .collect(Collectors.toList()));
    }
}
