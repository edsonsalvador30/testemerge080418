package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("MateriaDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface MateriaDAO extends JpaRepository<Materia, MateriaPK> {

  /**
   * Obtém a instância de Materia utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @param materia
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Materia entity WHERE entity.id = :id AND entity.materia = :materia")
  public Materia findOne(@Param(value="id") java.lang.String id, @Param(value="materia") java.lang.String materia);

  /**
   * Remove a instância de Materia utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @param materia
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Materia entity WHERE entity.id = :id AND entity.materia = :materia")
  public void delete(@Param(value="id") java.lang.String id, @Param(value="materia") java.lang.String materia);



  /**
   * Foreign Key matricula
   * @generated
   */
  @Query("SELECT entity FROM Materia entity WHERE entity.matricula.id = :id")
  public Page<Materia> findMateriasByMatricula(@Param(value="id") java.lang.String id, Pageable pageable);

}
