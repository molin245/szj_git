package com.szj.cloud.study.user.entity;
import java.math.BigDecimal;

//定义1：创建用户实体类，该类是一个POJO  Plain Old Java Object 没有使用Entity Beans的普通java对象，可以把POJO作为支持业务逻辑的协助类
//定义2：一个简单的Java类，这个类没有实现/继承任何特殊的java接口或者类，不遵循任何主要java模型，约定或者框架的java对象。
// 在理想情况下，POJO不应该有注解. (POJO的内在含义是指那些没有从任何类继承、也没有实现任何接口，更没有被其它框架侵入的java对象)


//为什么会有POJO？
//主要是Java的开发者被EJB的繁杂搞怕了，大家经过反思，又回归“纯洁老式”的JavaBean，即有无参构造函数，
// 每个字段都有getter和setter的java类。

//三：POJO的意义
// POJO让开发者可专注于业务逻辑和脱离框架的单元测试。除此之外， 由于POJO并不须要继承框架的类或实现其接口，
// 开发者能够极其灵活地搭建继承结构和建造应用。
// POJO的意义就在于它的简单而灵活性，因为它的简单和灵活，使得POJO能够任意扩展，从而胜任多个场合，也就让一个模型贯穿多个层成为现实。
// 先写一个核心POJO，然后实现业务逻辑接口和持久化接口，就成了Domain Model；
// UI需要使用时，就实现数据绑定接口，变成VO（View Object）

//四：POJO与PO、VO的区别
//PO是指持久对象（persistant object持久对象）。
//VO是指值对象或者View对象（Value Object、View Object）。View Object。
//持久对象实际上必须对应数据库中的entity（与数据库中的字段一致），实体类与数据库表中字段不一致时，可以通过如下方法解决：

//所以和POJO有所区别。比如说POJO是由new创建，由GC回收。
//但是持久对象（PO）是insert数据库创建，由数据库delete删除的。
//基本上持久对象生命周期和数据库密切相关。
//另外持久对象往往只能存在一个数据库Connection之中，Connnection关闭以后，持久对象就不存在了，而POJO只要不被GC回收，总是存在的。

//由于存在诸多差别，因此持久对象PO(Persistent Object)在代码上肯定和POJO不同，
// 起码PO相对于POJO会增加一些用来管理数据库entity状态的属性和方法。
// 而ORM追求的目标就是要PO在使用上尽量和POJO一致，对于程序员来说，他们可以把PO当做POJO来用，而感觉不到PO的存在。

//五： 关于PO类（持久化类）
//PO：Persistent Object 持久化对象。
//持久化对象，在Hibernate经常会遇见这样的概念。Hibernate实体状态有三种状态：瞬时态，持久态，游离态。

//1）瞬时态（暂态）：（Transient）实体在内存中自由存在，它与数据库记录无关。po在DB中无记录（无副本），po和session无关（手工管理同步）。
//eg. Customer customer=New Customer();
//customer.setName("eric");这里的Customer对象与数据库中的数据没有任何关联。

//2）持久态(Persistent):实体对象处于Hibernate框架的管理之中。 po在DB中有记录，po和session有关（session自动管理同步）。

//3 ) 游离态（脱管态）:（Detached）处于Persistent状态的实体对象，其对应的session实例关闭后，那么此时的实体对象处于Detached态。

// PO：Persistent Object 持久化对象。
//po在DB中有记录，po和session无关（手工同步管理）
//无名态：po处于游离态时被垃圾站回收了（垃圾回收机制），没有正本，只有DB中的副本。
//po处于瞬时态时被垃圾站回收了，则死亡。（唯一可以死亡的状态）

public class User {
    private Long id;
    private String username;
    private String name;
    private Integer age;
    private BigDecimal balance;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
