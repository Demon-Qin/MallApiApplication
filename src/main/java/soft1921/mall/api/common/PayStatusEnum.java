package soft1921.mall.api.common;

/**
 * @authoradmin  ZYQin
 * @date 2021/4/20 11:22
 * @description PayStatusEnum
 */
public enum PayStatusEnum {
    /**
     * 支付失败
     */
    DEFAULT(-1, "支付失败"),
    /**
     * 支付中
     */
    PAY_ING(0, "支付中"),
    /**
     * 支付成功
     */
    PAY_SUCCESS(1, "支付成功");
    private int payStatus;
    private String name;

    PayStatusEnum(int payStatus, String name) {
        this.payStatus = payStatus;
        this.name = name;
    }

    public static PayStatusEnum getPayStatusEnumByStatus(int payStatus) {
        for (PayStatusEnum payStatusEnum : PayStatusEnum.values()) {
            if (payStatusEnum.getPayStatus() == payStatus) {
                return payStatusEnum;
            }
        }
        return DEFAULT;
    }

    public int getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(int payStatus) {
        this.payStatus = payStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
