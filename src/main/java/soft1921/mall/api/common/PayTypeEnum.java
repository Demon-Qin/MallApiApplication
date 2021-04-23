package soft1921.mall.api.common;

/**
 * @authoradmin  ZYQin
 * @date 2021/4/20 11:21
 * @description PayTypeEnum
 */
public enum PayTypeEnum {
    /**
     * 默认值
     */
    DEFAULT(-1,"ERROR"),
    /**
     * 无
     */
    NOT_PAY(0,"无"),
    /**
     * 支付宝
     */
    ALT_PAY(1,"支付宝"),
    /**
     * 微信支付
     */
    WECHAT_PAY(2,"微信支付");
    private  int payType;
    private String name;


    PayTypeEnum(int payType, String name) {
        this.payType = payType;
        this.name = name;
    }
    public static PayTypeEnum getPayTypeEnumByType(int payType){
        for (PayTypeEnum payTypeEnum : PayTypeEnum.values()){
            if (payTypeEnum.getPayType() == payType){
                return payTypeEnum;
            }
        }
        return DEFAULT;
    }
    public int getPayType(){
        return payType;
    }
    public void setPayType(int payType){
        this.payType = payType;
    }
    public  String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}


