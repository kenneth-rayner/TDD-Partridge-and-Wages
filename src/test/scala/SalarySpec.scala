import org.scalatest.{MustMatchers, WordSpec}

class SalarySpec extends WordSpec with MustMatchers {

"Salary" when{

  "wages is called with bonus false" must {

    "return £salary " in {

      Salary.wages(100, false) mustEqual "£100"

    }
    "wages is called and bonus is true" must {

            "return £salary(including bonus" in{

        Salary.wages(100,true) mustEqual "£120"
      }
    }
  }
  }
}
