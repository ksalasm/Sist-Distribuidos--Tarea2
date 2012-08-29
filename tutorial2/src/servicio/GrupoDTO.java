package servicio;

public class GrupoDTO {
  String id;
  String numero;
  String sigla;
  String nombre;
  String horario;
  String aula;
  String id_profesor;
  
  public void setId(String id) {this.id = id;}
  public void setNumero(String num) {this.numero = num;}
  public void setSigla(String sig) {this.sigla = sig;}  
  public void setNombre(String nomb) {this.nombre = nomb;}
  public void setHorario(String hor) {this.horario = hor;}
  public void setAula(String aula) {this.aula = aula;}
  public void setId_profesor(String id_prof) {this.id_profesor = id_prof;}
  
  public String getId() { return id; }
  public String getNumero() { return numero; }
  public String getNombre() { return nombre; }  
  public String getHorario() { return horario; }
  public String getAula() { return aula; }
  public String getId_Profesor() { return id_profesor; }
}

