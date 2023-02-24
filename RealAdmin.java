
public class RealAdmin extends AbstractAdmin {

    

    
    RealAdmin(String name,String pass) {
        this.name = name;
        this.pass = pass;
    }
    @Override
    public String getName() {
       return name;
    }
    
    
    @Override
    public boolean isNil() {
       return false;
    }

    @Override
    public String getPass() {
        return pass;
    }
}

    

