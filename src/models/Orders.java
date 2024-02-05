package models;

import java.util.Date;
import java.util.List;

public class Orders {
    String order_id;
    List<Itemorder> eat;

    public Orders(String order_id,  List<Itemorder> eat) {
        this.order_id = order_id;

        this.eat = eat;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }


    public List<Itemorder> getEat() {
        return eat;
    }

    public void setEat(List<Itemorder> eat) {
        this.eat = eat;
    }

}

