package HW_2;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Share {
    private List<Share> components = new ArrayList<> ();
    public  void addComponent(Share component){
        components.add(component);
    }
    public  void removeComponent(Share component){
        components.remove(component);
    }
    public void draw(){
        for (Share component: components){
            component.draw();
        }
    }
}
