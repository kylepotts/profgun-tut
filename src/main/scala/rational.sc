object rational {
  val x = new Rational(1,2)

}

class Rational(x:Int, y:Int){
  def numer = x
  def denom = y

  override def toString = numer + "/" + denom
}