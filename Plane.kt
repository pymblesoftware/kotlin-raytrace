
class Plane : SceneObject
{

//	Plane( float A , float B, float C, float D )
	lateinit var A, B, C, Distance : double
//	CVector Normal();
	override fun Normal( val point : Vector ) -> Vector 
	{ 

	}

	override fun   Intersect( val ray : Ray ) -> double 
	{

	}
}