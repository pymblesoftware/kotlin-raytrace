

class LightSource 
{

	lateinit var CVector Center;
	fun MakeLightRay( CVector Point, Ray& TheRay ) -> Double { }
//	CColour GetColour(  CSceneObject *ObjPtr,  Ray LightRay,  double Distance, BList *SceneList );
	fun GetColour(  CSceneObject *ObjPtr,  Ray LightRay,  double Distance, list<CSceneObject *> *SceneList ) -> Colour 
	{

	}

//	CLightSource( CVector Origin );
	override fun double Intersect( ray : Ray ) -> double { }

}