package quickcheck

object test {
  import common._

	import org.scalacheck._
	import Arbitrary._
	import Gen._
	import Prop._
	
	class he extends QuickCheckHeap {
	}
	
	val a = new he
	println(a.genHeap.toString)
}