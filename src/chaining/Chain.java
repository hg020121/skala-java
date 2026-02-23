package chaining;

public class Chain {
    private String name;
    private int count;
    private String connector;

    // 반환 타입을 Chain으로 변경
    public Chain setName(String name) {
        this.name = name;
        return this; // 자기 자신(객체 주소)을 반환하여 점(.)으로 계속 연결 가능하게 함
    }

    public Chain setCount(int count) {
        this.count = count;
        return this;
    }

    public Chain setConnector(String connector) {
        this.connector = connector;
        return this;
    }

    // Getter들은 그대로 두셔도 됩니다.
    public String getName() { return this.name; }
    public int getCount() { return this.count; }
    public String getConnector() { return this.connector; }

    @Override
    public String toString() {
        return "Name: " + name + ", Count: " + count + ", Connector: " + connector;
    }
}
