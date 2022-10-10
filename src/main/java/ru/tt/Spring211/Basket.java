package ru.tt.Spring211;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import ru.tt.Spring211.Item;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Basket {

    private final List<Item> items;

    public Basket(List<Item> items) {
        this.items = new ArrayList<>();
    }

    public void add(List<Item> item){
        items.addAll(item);

    }

    public List<Item> get(){
      return new ArrayList<>(items);
    }
}
