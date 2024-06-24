object act23 {
  def normalpay(h:Double):Double= 250*h
  def OTpay(h:Double):Double = 85*h
  def TotalPay(normalh:Double, OTh:Double):Double = normalpay(normalh) + OTpay(OTh)
  def TaxCal(normalh:Double, OTh:Double):Double = TotalPay(normalh,OTh)*.12
  def TakeHomeSalary(normalh:Double, OTh:Double):Double = TotalPay(normalh, OTh) - TaxCal(normalh, OTh)

  def main(args: Array[String]):Unit ={
    val normalHours = 40
    val OThours = 30
    val takeHomeSalary = TakeHomeSalary(normalHours,OThours)
    println(s"Take Home Salary : Rs. $takeHomeSalary")
  }


}

