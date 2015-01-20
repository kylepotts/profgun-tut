println("Hello World")
var x = new Rational(1,2)
var y = new Rational(2,5)
x.add(y)
x.subtract(y)
x.multiply(y)
x.divide(y)


class Rational(x:Int, y:Int) {
  def numer = x
  def denom = y

  override def toString = numer + "/" + denom

  def add(r:Rational) : Rational = {
    new Rational(numer * r.denom + r.numer * denom, denom * r.denom)
  }

  def subtract(r:Rational) = {
      new Rational(numer*r.denom-r.numer*denom,r.denom*denom)
    }

  def multiply(r:Rational) = {
    new Rational(numer * r.numer, denom * r.denom)
  }

  def divide(r:Rational) = {
      new Rational(numer*r.denom,r.numer*denom)
    }


}