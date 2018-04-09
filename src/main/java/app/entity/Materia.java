package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela MATERIA
 * @generated
 */
@Entity
@IdClass(MateriaPK.class)
@Table(name = "\"MATERIA\"" ,uniqueConstraints=@UniqueConstraint(columnNames={
"materia" }))
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Materia")
public class Materia implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
   * @generated
   */
  @Id
  @Column(name = "materia", nullable = true, insertable=true, updatable=true)
  private java.lang.String materia;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_matricula", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Matricula matricula;

  /**
   * Construtor
   * @generated
   */
  public Materia(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Materia setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém materia
   * return materia
   * @generated
   */
  
  public java.lang.String getMateria(){
    return this.materia;
  }

  /**
   * Define materia
   * @param materia materia
   * @generated
   */
  public Materia setMateria(java.lang.String materia){
    this.materia = materia;
    return this;
  }

  /**
   * Obtém matricula
   * return matricula
   * @generated
   */
  
  public Matricula getMatricula(){
    return this.matricula;
  }

  /**
   * Define matricula
   * @param matricula matricula
   * @generated
   */
  public Materia setMatricula(Matricula matricula){
    this.matricula = matricula;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Materia object = (Materia)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    if (materia != null ? !materia.equals(object.materia) : object.materia != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    result = 31 * result + ((materia == null) ? 0 : materia.hashCode());
    return result;
  }

}
