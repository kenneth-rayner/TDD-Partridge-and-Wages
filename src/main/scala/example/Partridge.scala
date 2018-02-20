package example

object Partridge extends App{

  def part(args:Array[String])={
    val quoteSet =Set("Partridge","Peartree","Mutha")
    //val q = args.count((i:String)=>quoteSet contains i)
  //  if(q==0) {"Lynn, I've pierced my foot on a spike!!"}
  //  else{s"Mine's a Pint!" + "!" * q}
     args.count(quoteSet.contains(_))match{
       case 0 =>"Lynn, I've pierced my foot on a spike!!"
       case fred =>"Mine's a Pint" + "!" * fred
     }

  }

}
