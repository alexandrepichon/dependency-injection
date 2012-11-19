package di

object Context extends App {
   
  val getConnectionFunction = () => new DbConnection("localhost") // Prototype
    
  lazy val dao: Dao = new Dao(getConnectionFunction)  
  val getDaoFunction = () => dao // Singleton
  
  lazy val service: Service = new Service(getDaoFunction)
  
  //Main app
  println("-- First call of service -->")
  service.doSomething
  println("-- Second call of service -->")
  service.doSomething
  
}