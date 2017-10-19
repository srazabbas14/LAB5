import org.scalatest.FunSuite 

class lab5 extends FunSuite {

	test("testResultantList") {

		val testList = List (2,3,5,7)
		val myList = List (2,3,4,5,6,7,8) 
		val resultList = seiveOfEratosthenes(myList,8,0)
		assert(resultList === testList)
	}

    test("testIncorrectList") {

		val testList = List (2,3,4,5,6,7,8)
		val myList = List (2,3,4,5,6,7,8) 
		val resultList = seiveOfEratosthenes(myList,8,0)
		assert(resultList === testList)
	}

}