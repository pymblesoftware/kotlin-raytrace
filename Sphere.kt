
class sphere( 
	val x : float,
	val y : float,
	val z : float,
	val radius : float
	)
{

	override fun intersect( val ray : Ray) -> double { }
	override fun setColor( val point : Vector )  { }
	override fun normal(val point : Vector) -> Vector {  }
}