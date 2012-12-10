package cake

trait ProdDbConnectionComponent {
  val db = new DbConnection("prod")
  
  class DbConnection(dbconfig: String) {
	println("Creating : " + this)
    def query =
      println("Calling query on : " + this)
  }
  
}

trait DaoComponent { this: ProdDbConnectionComponent => 
  val dao = new Dao 
  
  class Dao() {
    println("Creating : " + this)
    def find = {
      println("Calling find on : " + this)
      db.query
    }
  }
}

trait ServiceComponent { this: DaoComponent =>
  val service = new Service

  class Service() {
    println("Creating : " + this)
    def doSomething = {
      println("Calling doSomething on : " + this)
      dao.find
    }
  }
}