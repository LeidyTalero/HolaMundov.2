package bd;

import java.util.ArrayList;
import java.util.List;
import modelo.SesionDTO;

public class ListaBD {
    public static List<SesionDTO> lista =  new ArrayList<SesionDTO>();
    
    public static void cargarDatos() {
        SesionDTO d1 = new SesionDTO("g@g.com",
                "123456", "Leidy Talero", "12345");
        SesionDTO d2 = new SesionDTO("f@f.com",
                "123456", "Andres Vega", "12345");
        SesionDTO d3 = new SesionDTO("h@h.com",
                "123456", "Felipe Talero", "12345");
        lista.add(d1);
        lista.add(d2);
        lista.add(d3);
    }
}
