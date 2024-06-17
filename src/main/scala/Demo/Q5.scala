package Demo

object Q5 {
  def main(args: Array[String]) = {
    val easypace = 4
    val tempo = 3
    val easytimeper1km = 8
    val tempotimeper1km = 7

     val totalrunningtime = easypace * easytimeper1km + tempo * tempotimeper1km

    println(s"Total running time is $totalrunningtime minutes")
  }

}
