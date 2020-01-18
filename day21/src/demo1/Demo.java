package demo1;

import org.junit.*;

public class Demo {
    @Test
    public void a(){
        System.out.println("text");
    }
    @Before
    public void Bfore(){
        System.out.println("：在每个测试方法之前都会运行一次");
    }
    @After
    public void After(){
        System.out.println("：在每个测试方法之后都会运行一次");
    }
    @BeforeClass
    public static void BeforeClass(){
        System.out.println("在所有的测试方法运行之前，运行一次，而且必须用在静态方法上面。");
    }
    @AfterClass
    public static void AfterClass(){
        System.out.println("在所有的测试方法运行之后，运行一次，而且必须用在静态方法上面。");
    }
}
