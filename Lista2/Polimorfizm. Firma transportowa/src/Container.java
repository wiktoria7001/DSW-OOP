public class Container {
    private Goods goodsType;

    public Container(Goods goodsType) {
        this.goodsType = goodsType;
    }

    public Goods getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(Goods goodsType) {
        this.goodsType = goodsType;
    }

    @Override
    public String toString() {
        return "Container{" +
                "goodsType=" + goodsType +
                '}';
    }
}
