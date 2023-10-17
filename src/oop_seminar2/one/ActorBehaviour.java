package oop_seminar2.one;

public interface ActorBehaviour {
    void setMakeOrder(boolean makeOrder);

    void setTakeOrder(boolean pickUpOrder);

    boolean isMakeOrder();

    boolean isTakeOrder();
}
