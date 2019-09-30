package kz.zhabassov.intro;

import java.util.List;

public class E implements Interface{
    private String className;
    private String parentBeanName;
    private List<Interface> childBeans;
    @Override
    public void printInfo() {
        System.out.println("class name: " + className + " & " + "parent bean name :" + parentBeanName+ "; ");
    }

    @Override
    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public void setParentBeanName(String parentBeanName) {
        this.parentBeanName = parentBeanName;
    }

    @Override
    public void setChildBeans() {
        this.childBeans = childBeans;
    }

    @Override
    public List<Interface> getChildBeans() {
        return childBeans;
    }

    @Override
    public List<Logger> getLoggers() {
        return null;
    }
}