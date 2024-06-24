object act2 {
  def main(args: Array[String]):Unit = {
  var i = 2
  var j = 2
  var m = 5
  var n = 5
  var k = 2
  var f =12.0f
  var g = 4.0f
  var c = 'X'

  val ans_a = k +12*m
  val ans_b = m/j
  val ans_c = n%j
  val ans_d = m/j*j
  val ans_e = f + 10*5 + g
  val ans_f = {i+= 1; i*n}

    println(s"k +12*m = $ans_a")
    println(s"m/j = $ans_b ")
    println(s"n%j = $ans_c")
    println(s"m/j*j = $ans_d")
    println(s"f + 10*5 + g = $ans_e")
    println(s"++i* n = $ans_f")
  }      
}

