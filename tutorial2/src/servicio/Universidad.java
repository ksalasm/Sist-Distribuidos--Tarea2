package servicio;
import java.util.*;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService (targetNamespace ="http://service", name="universidad")
public class Universidad {

  private static ProfesorService profesor;
  private static GrupoService grupo;

  @WebMethod (action="urn:findProfesor", operationName="findProfesor")
  public ProfesorDTO findProfesor(@WebParam (partName = "profesorId") String profesorId) {
    checkProfesor();
    return profesor.find(profesorId);
  }

  @WebMethod (action="urn:findAllProfesor", operationName="findAllProfesor")
  public List<ProfesorDTO> findAllProfesor() {
    checkProfesor();
    return profesor.findAll();
  }

  private void checkProfesor() {
    if (profesor == null)
      profesor = new ProfesorService();
  }
  
  @WebMethod (action="urn:updateProfesor", operationName="updateProfesor")
  public void updateProfesor(
	  @WebParam (partName = "profesorId") String cedula, 
	  @WebParam (partName = "nombre") String nombre,
	  @WebParam (partName = "titulo") String titulo,
	  @WebParam (partName = "area") String area,
	  @WebParam (partName = "correo") String correo,
	  @WebParam (partName = "telefono") String telefono
  ) {
    checkProfesor();
    profesor.update(cedula,nombre,titulo,area,correo,telefono);
  }
  
  @WebMethod (action="urn:insertProfesor", operationName="insertProfesor")
  public void insertProfesor(
	  @WebParam (partName = "profesorId") String cedula, 
	  @WebParam (partName = "nombre") String nombre,
	  @WebParam (partName = "titulo") String titulo,
	  @WebParam (partName = "area") String area,
	  @WebParam (partName = "correo") String correo,
	  @WebParam (partName = "telefono") String telefono
  ) {
    checkProfesor();
    profesor.insert(cedula,nombre,titulo,area,correo,telefono);
  }
  
  @WebMethod (action="urn:deleteProfesor", operationName="deleteProfesor")
  public void deleteProfesor(@WebParam (partName = "profesorId") String profesorId) {
    checkProfesor();
    profesor.delete(profesorId);
  }
/*--------------------------------------------------------------------------------------------*/  
  @WebMethod (action="urn:findGrupo", operationName="findGrupo")
  public GrupoDTO findGrupo(@WebParam (partName = "id") String id) {
    checkGrupo();
    return grupo.find(id);
  }
  
  @WebMethod (action="urn:findAllXProfesor", operationName="findAllXProfesor")
  public GrupoDTO findAllXProfesor(@WebParam (partName = "id_profesor") String idProfesor) {
    checkGrupo();
    return grupo.findAllXProfesor(idProfesor);
  }
  
  @WebMethod (action="urn:findAllGrupo", operationName="findAllGrupo")
  public List<GrupoDTO> findAllGrupo() {
    checkGrupo();
    return grupo.find();
  }
  
  @WebMethod (action="urn:updateGrupo", operationName="updateGrupo")
  public void updateGrupo(
	@WebParam (partName = "id") String id,
	@WebParam (partName = "numero") String numero,
	@WebParam (partName = "sigla") String sigla,
	@WebParam (partName = "nombre") String nombre,
	@WebParam (partName = "horario") String horario,
	@WebParam (partName = "aula") String aula,
	@WebParam (partName = "id_profesor") String id_profesor
  ) {
    checkGrupo();
    grupo.update(id,numero,sigla,nombre,horario,aula,id_profesor);
  }
  
  @WebMethod (action="urn:insertGrupo", operationName="insertGrupo")
  public void insertGrupo(
	@WebParam (partName = "id") String id,
	@WebParam (partName = "numero") String numero,
	@WebParam (partName = "sigla") String sigla,
	@WebParam (partName = "nombre") String nombre,
	@WebParam (partName = "horario") String horario,
	@WebParam (partName = "aula") String aula,
	@WebParam (partName = "id_profesor") String id_profesor
  ) {
    checkGrupo();
    grupo.insert(id,numero,sigla,nombre,horario,aula,id_profesor);
  }
  
  @WebMethod (action="urn:deleteGrupo", operationName="deleteGrupo")
  public void deleteGrupo(@WebParam (partName = "id") String id) {
    checkGrupo();
    grupo.delete(id);
  }
  
  private void checkGrupo() {
    if (grupo == null)
      grupo = new GrupoService();
  }
    
}
    
}