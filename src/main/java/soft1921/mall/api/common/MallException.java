package soft1921.mall.api.common;

/**
 * @authoradmin ZYQin
 * @date 2021/4/20 11:25
 * @description MallException
 */
public class MallException extends RuntimeException{
    public MallException() {

    }

    public MallException(String message) {
        super(message);
    }

    /*
    * 抛出异常
    * */
    public static void fail(String message) {
        throw new MallException(message);
    }
}
