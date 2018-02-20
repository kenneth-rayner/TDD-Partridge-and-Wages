object Salary extends App {

  def wages(salary: Int, bonus: Boolean): String = {

    if (bonus) {

      "£"+ (salary *1.2).toInt

    } else {
      "£" + salary
    }
  }
 println(wages(100,false))
 println(wages(100,true))
 println(wages(545667, true))
}


