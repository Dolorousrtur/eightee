/**
  * Created by dolorousrtur on 19.06.17.
  */

abstract class Action {
  override def toString: String = this.getClass.getName.dropRight(1)

  def make(): Unit
}

object Put





object Main extends App {

  val a: Resource = Crystal

  println(a)
  //  val resources = Resource.Carrot :: Resource.Iron :: Nil
  //
  //  Resource.calculatePoints(resources)

}

class Card {

}
