public class Car implements Nameable{
    @Override
    public String getName() {
        return this.getClass().getName();
    }

    public void ppp(Nameable a){

    }

    void l(){

        ppp(this);

    }
}
