package example


import org.scalatest.{MustMatchers, WordSpec}

class PartridgeSpec extends WordSpec with MustMatchers {

  "Partridge" when {
    "part is called" must {

      "return Lynn, I've pierced my foot on a spike!!" in {
        Partridge.part(Array("")) mustEqual "Lynn, I've pierced my foot on a spike!!"


      }
      "return mines a pint! with one !" in{
        Partridge.part(Array("Peartree")) mustEqual "Mine's a Pint!"
      }
      "return mines a pint! with 2 !" in{
        Partridge.part(Array("Peartree","Mutha")) mustEqual "Myine's a Pint!!"
      }
    }

  }
}