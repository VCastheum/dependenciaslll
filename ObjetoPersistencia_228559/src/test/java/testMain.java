import com.mycompany.objetopersistencia_228559.CustomExceptions.Exceptions;
import com.mycompany.objetopersistencia_228559.MaterialMaps;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
public class testMain {
    private MaterialMaps probar;
            
    @BeforeEach
    public void setUp(){
        probar= new MaterialMaps();
    }
   @Test
   public void testNewMaterial() throws Exceptions{
       probar.newMaterial("D", "Titulo", "D", "PDF", 2);
       assertEquals(1,probar.mateDigi.size());
   }
   @Test
   public void testSearchMaterialByKey() throws Exceptions{
       probar.newMaterial("F", "Titulo", "F", "IMP", 2);
       assertDoesNotThrow(()->probar.searchMaterialByKey("2"));
   }
   @Test
   public void testSearchMaterialByType() throws Exceptions{
       probar.newMaterial("D", "Titulo", "D", "PDF", 2);
       assertDoesNotThrow((Executable) ()->probar.searchMaterialByType("D"));
   }
   @Test
   public void testModifyDigiTitle(){
       
   }
}
