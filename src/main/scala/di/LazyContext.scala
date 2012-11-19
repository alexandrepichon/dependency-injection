package di

object LazyContext extends App {
  val prototypeDbConnection: () => DbConnection = 
    () => new DbConnection("localhost")
    
  lazy val dao: Dao = new Dao(prototypeDbConnection)  
  val singletonDao: () => Dao = () => dao
  
  lazy val service: Service = new Service(singletonDao)
  
  
  println("-- First call of service -->")
  service.doSomething
  println("-- Second call of service -->")
  service.doSomething
}