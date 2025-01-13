/**
 * ClassName: bigStar
 * Description:
 * Datetime: 2025/1/11 17:47
 * Author: zdy
 * Version: 1.0
 */
public class bigStar implements star{
    private String name;

    public bigStar(String name) {
        this.name = name;
    }
    public String sing(String name){
        return "谢谢！谢谢";
    }

    public  void dance(){
        System.out.println(this.name+"在跳舞");
    }
}
