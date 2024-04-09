namespace c_;

public class UnitTest1
{
    [Fact]
    public void Test1()
    {
        int[] a = [10, 15, 3, 7];
        Assert.True(Main.p1(a, 17));
    }
    [Fact]
    public void Test2()
    {
        int[] a = [10, 15, 3, 7];
        Assert.False(Main.p1(a, 16));
    }
    [Fact]
    public void Test3()
    {
        int[] a = [];
        Assert.False(Main.p1(a, 10));
    }
    
}
