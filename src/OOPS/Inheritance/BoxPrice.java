package OOPS.Inheritance;

public class BoxPrice extends BoxVolume{

    double cost;

    BoxPrice(){
        super();
        this.cost = -1;
    }

    BoxPrice(BoxPrice other){
        super(other);
        this.cost = other.cost;
    }

    BoxPrice(double l, double h, double w, double volume, double cost) {
        super(l, h, w, volume);
        this.cost = cost;
    }

    BoxPrice(double side, double volume, double cost){
        super(side, volume);
        this.cost = cost;
    }
}
