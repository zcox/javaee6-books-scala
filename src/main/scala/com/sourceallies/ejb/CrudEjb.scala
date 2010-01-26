package com.sourceallies.model

import javax.persistence._
import scala.reflect._

/** Provides basic CRUD support using an injected JPA entity manager. */
trait CrudEjb[E] {
  @PersistenceContext
  protected var manager: EntityManager = _
  
  def create(entity: E): E = {
    manager persist entity
    entity
  }
  
  def readAll()(implicit m: Manifest[E]) = manager createNamedQuery ("findAll" + m.erasure.getSimpleName) getResultList
  
  def read(id: Long)(implicit manifest: Manifest[E]): E = manager.find(manifest.erasure, id).asInstanceOf[E]
  
  def update(entity: E): E = manager merge entity
  
  def delete(entity: E) { manager remove entity }
}
