/**
 * Copyright (C) 2009-2010 Scalable Solutions AB <http://scalablesolutions.se>
 */
package se.scalablesolutions.akka.spring

object StringReflect {
  /**
   * Implicit conversion from String to StringReflect.
   */
  implicit def string2StringReflect(x: String) = new StringReflect(x)
}

/**
 * Reflection helper class.
 * @author michaelkober
 */
class StringReflect(val self: String) {
  def toClass[T <: AnyRef]: Class[T] = {
    val clazz = Class.forName(self)
    clazz.asInstanceOf[Class[T]]
  }
}


