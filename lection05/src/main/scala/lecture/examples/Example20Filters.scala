package fintech.lecture.examples

object Example20Filters extends App {
  val map = Map("one" -> 1, "two" -> 2, "three" -> 3, "four" -> 4)
  // for all traversables
  println(
    map.filter { case (k, v) => v >= 3 }
  )
  println(
    map.filterNot { case (k, v) => k == "three" }
  )

  println(
    map.collect { case (k, v) if  v >= 3 => k -> v * 3 }
  )
}