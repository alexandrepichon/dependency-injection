package di

object Context extends App {
  val prototypeDbConnection: () => DbConnection = 
    () => new DbConnection("localhost")
    
  val dao: Dao = new Dao(prototypeDbConnection)  
  val singletonDao: () => Dao = () => dao
  
  val service: Service = new Service(singletonDao)
  
  
  println("-- First call of service -->")
  service.doSomething
  println("-- Second call of service -->")
  service.doSomething
}