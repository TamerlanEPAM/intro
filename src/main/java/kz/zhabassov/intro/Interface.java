package kz.zhabassov.intro;

import java.util.List;

public interface Interface {
    void printInfo();
    void setClassName(String className);
    void setParentBeanName(String parentBeanName);
    void setChildBeans();
    List<Interface> getChildBeans();
    List<Logger> getLoggers();
}
