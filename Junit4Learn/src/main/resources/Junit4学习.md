什么是Junit？
Junit是Java编程语言的单元测试框架，用于编写和运行可重复的自动化测试

Junit的特点
- 提供注解来识别测试方法
- 提供断言来测试预期结果
- 测试允许你编写代码更快，并提高质量
- 即时反馈，不需要人工梳理测试结果报告

官方资料
- 官方地址
  https://junit.org/junit4/
- 官方入门文档
  https://github.com/junit-team/junit4/wiki/Assertions
- 官方github
  https://github.com/junit-team

相关概念
测试方法
测试方式就是用@Test注解的函数
测试类
一个或多个测试方法的Test.java文件
测试集
一个suite，可能包含多个测试类
测试运行器
决定用什么方式偏好去运行这些测试集/类/方法

常用注解
@Test
用于进行测试的方法，但是需要注意测试方法必须是public void, 可以抛出异常
@Ignore
忽略暂时不运行某些测试方法时可以使用
@BeforeClass
在该测试类里所有用例运行之前，运行一次方法， 但是注意方法名可以任意，但是必须是public static void
@AfterClass
在该测试类里所有用例运行之后，运行一次方法
@Before
每个用例运行之前都运行一次，用于一些独立于用例之前的准备，注意方法名必须是public void, 不能为static， 不止运行一次
@After
每个用例运行之后都运行一次，用于一些独立于用例之后的准备
@RunWith
放在测试类名之前，用于确定这个类怎么运行
常见运行器
@RunWith(Parameterized.class)
参数化运行器，配合@Parameter使用junit的参数化功能
@RunWith(Suite.class) @SuitClasses({ATest.class, BTest.class, CTest.class})
测试集运行器配合使用测试集功能
@RunWith(JUnit4.class)
junit4的默认运行器
@RunWith(JUnit38ClassRunner.class)
兼容junit3.8的运行器
@Parameters
用于使用参数化功能

测试的生命周期
@BeforeClass: 所有方法运行前执行一次
@Before：每个测试方法执行前运行一次
@After：每个测试方法执行后运行一次
@AfterClass：所有方法运行后执行一次