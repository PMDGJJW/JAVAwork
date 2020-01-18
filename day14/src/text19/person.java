package text19;

public class person  {
    private  String name;
    private  int liveValue;

    public person() {
    }

    public person(String name, int liveValue) {
        this.name = name;
        this.liveValue = liveValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLiveValue() {
        return liveValue;
    }

    public void setLiveValue(int liveValue) {

        this.liveValue = liveValue;
        if (liveValue<0){
            throw new NoLifeValueExption("生命值不能为负数:"+this.liveValue);
        }
    }
}
