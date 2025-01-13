/**
 * ClassName: test
 * Description:
 * Datetime: 2025/1/11 18:09
 * Author: zdy
 * Version: 1.0
 */
public class test {
    public static void main(String[] args) {
        bigStar s = new bigStar("杨超越");
        star starProxy = ProxyUtil.createProxy(s);
        String rs=starProxy.sing("好日子");
        System.out.println(rs);

    }
}
