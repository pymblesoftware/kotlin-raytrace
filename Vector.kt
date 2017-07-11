

class Vector
{	fun length() -> double { }
	fun operator*(double Val ) -> Vector { }
	fun GetZ() -> double  {  }
	fun GetY() -> double {  }
	fun GetX() -> double {  }
//	 CVector( const CVector& OtherVector )
//	 CVector( float x1, float y1, float z1 )
	fun RevRotate( float cos1, float sin1, float cos2, float sin2 ) -> Vector  {  }
	fun Rotate( float cos1, float sin1, float cos2, float sin2 ) -> Vector  {  }
	fun Max( CVector Arg ) -> Vector  {  }
	fun Min( CVector Arg ) -> Vector  {  }
	fun operator~() -> Vector  {  }
	fun operator^( CVector& Arg ) -> Vector  {  }
	fun operator%( CVector& Arg ) -> double  {  }
	fun operator/( float ) -> Vector  {  }
	fun operator*( float Arg ) -> Vector  {  }
	fun operator*( CVector& Arg ) -> Vector  {  }
	fun operator=( const CVector& Arg ) -> Vector  {  }
	fun operator-() -> Vector  {  }
	fun operator-( CVector& Arg ) -> Vector  {  }
	fun operator+( CVector& Arg ) -> Vector  {  }
}

