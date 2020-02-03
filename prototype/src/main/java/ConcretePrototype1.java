/**
 * <p> author liyong  </p>
 * <p> date 2020/2/3 6:09 下午 </p>
 * <p> description  </p>
 **/
public class ConcretePrototype1 implements Prototype {
    private String name;

    public Prototype clone() {
        //最简单的克隆，新建一个自身对象，由于没有属性就不再复制值了
        Prototype prototype = new ConcretePrototype1();
        return prototype;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ConcretePrototype1{" +
                "name='" + name + '\'' +
                '}';
    }
}