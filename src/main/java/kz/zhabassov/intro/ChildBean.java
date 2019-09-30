package kz.zhabassov.intro;

import java.util.ArrayList;
import java.util.List;

public class ChildBean {
    private List<Interface> childBeans= new ArrayList<>();

    private ChildBean() {
    }

    public void setChildBeans(List<Interface> childBeans) {
        this.childBeans = childBeans;
    }

    public List<Interface> getChildBeans(){
        return childBeans;
    }
}
