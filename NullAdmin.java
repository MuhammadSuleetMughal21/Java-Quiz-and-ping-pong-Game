
public class NullAdmin extends AbstractAdmin  {
   
    @Override
    public String getName() {
       return "Not Available in Admin Database";
    }
    @Override
    public boolean isNil() {
       return true;
    }

    @Override
    public String getPass() {
       return "Not Available in Admin Database";
    }    
}