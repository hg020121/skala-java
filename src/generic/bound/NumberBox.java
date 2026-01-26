package generic.bound;

class NumberBox<T extends Number> { //상한값, 하한값 정의

    private T value;

    public void printDouble() {
        System.out.println(value.doubleValue());
    }

    public void setValue(T value) {
        this.value = value;
    }

}
