

class Color
{

	/////////////////////////////////////////////////////////////////
	// RGB values in the range of 0 to 0xff. Typical colour channels. 
	lateinit var unsigned char Red
	unsigned char Green
	unsigned char Blue


	/////////////////////////////////////////////////////////////////
	// RGB values in the range of 0.0 to 1.0. 
	float Rval
	float Gval
	float Bval


	// Data setting
	fun SetB( float InB ) { }
	fun SetG( float InG ) { }
	fun SetR( float InR ) { }
	fun SetB( unsigned char InB ) { }
	fun SetG( unsigned char InG ) { }
	fun SetR( unsigned char InR ) { }

	 // Data access
	fun GetG() -> unsigned char  { }
	fun GetB() -> unsigned char   { }
	fun GetR() -> unsigned char   { }


//	CColour( float R, float G, float B )
//	CColour( unsigned char R, unsigned char G, unsigned char B )
//	CColour()

}