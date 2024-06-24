object act24 {
  def attendance(price:Int):Int = 120 + (15- price)/5*20

  def cost(price:Int):Int = 500 + attendance(price)*3

  def profit(price:Int):Int = attendance(price)*price -cost(price)

  def main(args: Array[String]):Unit = {
    println("Profit = "+ profit(20))
  }
}
