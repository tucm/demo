package com.test.tucm.pattern.decorate;

/**
 * 装饰模式测试类
 * <p>
 * 抽象构件角色（Component）：通常是一个抽象类或者一个接口，定义了一系列方法，方法的实现可以由子类实现或者自己实现。
 * 通常不会直接使用该类，而是通过继承该类或者实现该接口来实现特定的功能。
 * （例如，对于动物类，有一个抽象方法输出所有的功能，基本功能包括：呼吸，觅食，睡觉等等）
 * </p>
 * <p>
 * 具体构件角色（Concrete Component）：是Component的子类，实现了对应的方法，它就是那个被装饰的类。
 * （具体构建角色可以建立很多个，例如狗，猫，鸟等等，如果是狗，我们可以装饰一些吼叫的功能，吃肉的功能；鸟可以装饰一些飞行的功能，
 * 带有翅膀的功能等等。当然这些需要在具体装饰角色中去具体定义）
 * </p>
 * <p>
 * 装饰角色（Decorator）：是Component的子类，它是具体装饰角色共同实现的抽象类（也可以是接口），
 * 并且持有一个Component类型的对象引用，它的主要作用就是把客户端的调用委派到被装饰类。
 * </p>
 * <p>
 * 具体装饰角色（ConcreteDecorator）：它是具体的装饰类，是Decorator的子类，当然也是Component的子类。
 * 它主要就是定义具体的装饰功能，例如上面说的，对于鸟这个具体构建角色而言，除了具备抽象构件角色基本的功能，
 * 它还具有一些飞行的功能，带翅膀的功能。那么我们可以把这两个功能定义成一个具体装饰角色1，对于狗这个具体构件角色而言，
 * 我们可以把吼叫，吃肉这两个功能定义成一个具体装饰角色2，这样，如果我们再定义一个狼这样的具体构件角色的时候， 就可以直接用具体装饰角色2来进行装饰。
 * </p>
 * 
 * @Author owl
 * @Date 2020/10/3 下午4:11
 * @Version 1.0
 **/
public class DecotrateTest {
	public static void main(String[] args) {
		Component component = new ConcreteComponent();
		System.out.println("------装饰前：-------");
		component.function();
		Component newComponent = new ConcreteDecorator(component);
		System.out.println("------装饰后：-------");
		newComponent.function();

	}
}
