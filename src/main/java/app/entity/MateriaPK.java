package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;


/**
* @generated
*
**/
public class MateriaPK implements Serializable {

  /**
  * @generated
  */
  private static final long serialVersionUID = 1L;
  
  /**
   * @generated
   */
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
  
  /**
   * @generated
   */
  private java.lang.String materia;
  
  /**
   * Construtor
   * @generated
   */
  public MateriaPK(){
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
  public MateriaPK setId(java.lang.String id){
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
  public MateriaPK setMateria(java.lang.String materia){
    this.materia = materia;
    return this;
  }
  
  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    MateriaPK object = (MateriaPK)obj;
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
