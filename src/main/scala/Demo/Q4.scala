package Demo

object Q4 {
  def main(args: Array[String]) = {
    val price = 24.95
    val copies = 60
    val discount = 0.40
    val ship50 = 3
    val shipadd = 0.75

    val discountprice = price * (1 - discount)

    val shippingprice = ship50 + (copies - 50) * shipadd

    val wholesalecost50 = discountprice * 60 + shippingprice

    println(s"Total wholesale cost for 60 copies is $wholesalecost50")
  }
}


