public class Istemci {
    IRenk urunRenk;
    IKapi urunKapi;
    IKapiKulu urunKapiKulu;

    public Istemci(IFabrika fabrika){
        urunKapi=fabrika.kapi();
        urunRenk=fabrika.renk();
        urunKapiKulu=fabrika.kapiKulu();
    }
    public void calistir(){
      urunRenk.renkSec();
      urunKapi.kapiSec();
      urunKapiKulu.kapiKuluSec();
    }
}
