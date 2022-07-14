package com.study.composite;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent{

    private List<MenuComponent> list = new ArrayList<>();

    public Menu(String name, int level) {
        super(name, level);
    }

    public void add(MenuComponent menuComponent) {
        list.add(menuComponent);
    }
    public void remove(MenuComponent menuComponent) {
        list.remove(menuComponent);
    }
    public MenuComponent getMenuComponent(int index) {
        return list.get(index);
    }
    @Override
    public void print() {
        System.out.println(getName());
        for (MenuComponent menuComponent : list) {
            for (int i = 0; i < level; i++) {
                System.out.print("  ");
            }
            menuComponent.print();
        }
    }
}
