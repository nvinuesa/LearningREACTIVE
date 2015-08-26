package quickcheck

object test {
  import common._

	import org.scalacheck._
	import Arbitrary._
	import Gen._
	import Prop._
	
	class he extends QuickCheckHeap {
	};import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(184); 
	
	val a = new he;System.out.println("""a  : quickcheck.test.he = """ + $show(a ));$skip(29); 
	println(a.genHeap.toString)}
}
