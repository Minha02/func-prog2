object act22 {
  def main(args: Array[String]):Unit = {
    var a = 2
    var b = 3
    var c = 4
    var d = 5
    var k = 4.3f
    var g = 4.0f

    println({b-=1;b * a + c * d})
    d-=1
    println(a)
    a+=1
    println(-2*(g-k)+c)
    println(c)
    c +=1
    println({c+=1;c*a})
    a+=1

  }}
