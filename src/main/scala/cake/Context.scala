package cake

object Context extends App {
   
  val ctx = new ServiceComponent  with DaoComponent with ProdDbConnectionComponent
  
  //Main app
  println("-- First call of service -->")
  ctx.service.doSomething
  println("-- Second call of service -->")
  ctx.service.doSomething
  
}