import scala.reflect.ClassTag

object Test extends App {
  Array[Int](1, 2)

  try {
    Array[Int](1, 2)(null)
    ???
  } catch {
    case _: NullPointerException => println("Ok")
  }

  Array[Int](1, 2)({println("foo"); the[ClassTag[Int]]})
}
