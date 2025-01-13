import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ClassName: ProxyUtil
 * Description:
 * Datetime: 2025/1/11 17:57
 * Author: zdy
 * Version: 1.0
 */
public class ProxyUtil {
    public static star createProxy(bigStar bigStar){
        star starProxy = (star) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(),
                new Class[]{star.class}, new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if (method.getName().equals("sing")){
                            System.out.println("准备话筒，收钱吗20万");
                            return method.invoke(bigStar,args);
                        }else if (method.getName().equals("dance")) {
                            System.out.println("准备场地，收钱1000万");

                        }
                            return method.invoke(bigStar,args);

                    }
                });
        return starProxy;
    }
}
