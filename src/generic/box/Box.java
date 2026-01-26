package generic.box;

class Box<T> {

    private T item; //item이라는 필드를 이 Box에서 담을 수 있는 타입으로 선언, T는 Box가 생성될 때 결정된다.

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item; //getItem 메서드는 Box가 담고 있는 item을 반환한다. 반환 타입도 T로 지정되어 있다.
    }

}
