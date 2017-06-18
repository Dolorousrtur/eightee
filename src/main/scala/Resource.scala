import scala.collection.mutable.HashMap

/**
  * Created by dolorousrtur on 18.06.17.
  */
//
//object Resource extends Enumeration {
//  type Resource = Value
//
//  val Coal, Carrot, Crystal, Iron, Forest = Value
//
//  def calculatePoints(resources : Seq[Resource]) = {
//    resources.foreach(println(_))
//  }
//
//}

abstract class Resource {

  override def toString: String = this.getClass.getName.dropRight(1)

  def calculatePoints(num: Int): Int
}

object Carrot extends Resource {



  def calculatePoints(num: Int): Int = {
    if (num < 3) 0
    else if (num < 5) 1
    else if (num < 7) 2
    else if (num < 8) 3
    else 5
  }

}

object Wood extends Resource {


  def calculatePoints(num: Int): Int = {
    if (num < 2) 0
    else if (num < 4) 1
    else if (num < 5) 2
    else if (num < 6) 3
    else 5
  }

}

object Iron extends Resource {


  def calculatePoints(num: Int): Int = {
    if (num < 2) 0
    else if (num < 4) 1
    else if (num < 6) 2
    else if (num < 7) 3
    else 5
  }

}

object Crystal extends Resource {


  def calculatePoints(num: Int): Int = {
    if (num < 1) 0
    else if (num < 2) 1
    else if (num < 3) 2
    else if (num < 4) 3
    else 5
  }

}


class ResourceStorage {

  private val resources = scala.collection.mutable.HashMap.empty[Resource, Int]

//  for (r <- Resource.values) resources.put(r, 0)

  def put(r: Resource) = {
    resources updated (r, resources.getOrElseUpdate(r, 0) + 1)
  }

  def calculatePoints = {
    (for (rt <- resources.keysIterator) yield resources.getOrElse(rt, 0)).sum
  }

}
