public class Fabrika2 implements IFabrika{

    @Override
    public IRenk renk() {
        return new Renk2();
    }
    @Override
    public IKapi kapi() {
        return new Kapi2();
    }

    @Override
    public IKapiKulu kapiKulu() {
        return new KapiKulu2();
    }

}
