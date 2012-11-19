package di

class Service(dao: () => Dao) {
  println("Creating : " + this)
  def doSomething = {
    println("Calling doSomething on : " + this)
    dao().find
  }
}

class Dao(db: () => DbConnection) {
  println("Creating : " + this)
  def find = {
    println("Calling find on : " + this)
    db().query
  }
}

class DbConnection(dbconfig: String) {
  println("Creating : " + this)
  def query =
    println("Calling query on : " + this)
}