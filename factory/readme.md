# 当前项目讲解的是工厂模式
* 工厂模式属于创建型模式
* 静态工厂模式(简单工厂模式)
* 工厂方法模式
* 抽象工厂模式  

#### 静态工厂模式  
* 特点
1. 他是一个具体的类，非接口抽象类。利用if或switch创建产品并返回
2. 关键的create()方法也是静态的，所以叫做静态工厂
* 缺点
1. 扩展性差(增加一种产品就要修改工厂方法类)
2. 不同的产品需要不同额外参数的时候不支持

#### 抽象工厂模式
* 优点:
1. 针对的创建对象为产品族(一般或多或少存在一定关联的产品)
2. 在类的内部对产品族进行约束

* 缺点
1. 产品族的扩展监事意见十分费力的事儿，假如产品族中需要增加一个新的产品，这几乎所有的工厂类都需要进行修改。所以使用抽象工厂模式时，对产品等级结构的划分是非常重要的。  

#####  使用工厂模式时，只需要关心降低耦合度的目的是否达到了。