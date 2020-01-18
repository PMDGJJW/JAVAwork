package text18;

public class son extends Father {
    @Override
    public void eat() throws ToothPainException {
//        throw new BigToothPainException("重写方法不能抛出与父类平级的其他异常。");
//        throw new TonguePainException("重写方法不能抛出与父类平级的其他异常。");
//        throw  new PainExecption("SDSA");
    }

    @Override
    public void drink() {
//        throw new TonguePainException("SDAS");
        try {
            throw new  TonguePainException("喝到100度的热水");
        }catch (Exception e){
        e.printStackTrace();
        }
    }
}
