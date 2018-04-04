object o1 {

   def main(args: Array[String]): Unit = {
   trait Jsonable[A] {
     def toJson(x: A): String
   }

   implicit val XJsonable = new Jsonable[Int] {
     def toJson(x: Int) = s"{x: ${x}}"
   }

   class AnyJsonable[A](that: A) {
     def toJson: String = ???
   }

   new AnyJsonable(1).toJson
}
}
