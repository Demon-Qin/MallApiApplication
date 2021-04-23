package soft1921.mall.api.common;

/**
 * @authoradmin  ZYQin
 * @date 2021/4/20 11:02
 * @description Constants
 */
public enum IndexConfigTypeEnum {
    /**
     * 默认值
     */
    DEFAULT(0,"DEFAULT"),

    /**
     * 搜索框热搜
     */
    INDEX_SEARCH_HOTS(1,"INDEX_SEARCH_HOTS"),

    /**
     * 搜索下拉框热搜
     */
    INDEX_SEARCH_DOWN_HOTS(2,"INDEX_SEARCH_DOWN_HOTS"),

    /**
     *(首页新品上线)
     */
    INDEX_GOODS_RECOMMND(5,"INDEX_GOODS_RECOMMEND");
    private int type;
    private String name;

    IndexConfigTypeEnum(int type, String name) {
        this.type = type;
        this.name = name;
    }
    public static IndexConfigTypeEnum getIndexConfigTypeEnumByType(int type){
        for (IndexConfigTypeEnum indexConfigTypeEnum : IndexConfigTypeEnum.values()){
            if(indexConfigTypeEnum.getType()==type){
                return indexConfigTypeEnum;
            }
        }
        return DEFAULT;
    }
    public int getType(){
        return type;
    }
    public void setType(){
        this.type = type;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
