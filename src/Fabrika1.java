public class Fabrika1 implements IFabrika{
    @Override
    public IRenk renk() {
        return new Renk1();
    }

    @Override
    public IKapi kapi() {
        return new Kapi1();
    }

    @Override
    public IKapiKulu kapiKulu() {
        return new KapiKulu1();
    }


}
