package io.accenture.components.cart.module;

import java.util.HashMap;

public class ShoppingCart {

    private long id;
    private HashMap<Long, Item> contents;
    private boolean checkedOut;

    public ShoppingCart(){
        this.contents = new HashMap<>();
        this.checkedOut = false;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public HashMap<Long, Item> getContents() {
        return contents;
    }

    public void setContents(HashMap<Long, Item> contents) {
        this.contents = contents;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

}
