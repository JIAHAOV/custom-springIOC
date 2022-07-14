package com.study;

import com.study.composite.Menu;
import com.study.composite.MenuItem;

public class Client {
    public static void main(String[] args) {
        Menu menu = new Menu("主菜单", 0);

        Menu menu1 = new Menu("一级菜单", 1);
        menu1.add(new MenuItem("文件", 2));

        Menu menu2 = new Menu("一级菜单", 1);
        menu2.add(new MenuItem("文件", 2));

        Menu menu3 = new Menu("一级菜单", 1);
        menu3.add(new MenuItem("文件", 2));

        Menu menu4 = new Menu("一级菜单", 1);
        menu4.add(new MenuItem("文件", 2));

        menu.add(menu1);
        menu.add(menu2);
        menu.add(menu3);
        menu.add(menu4);
        menu.print();
    }
}
