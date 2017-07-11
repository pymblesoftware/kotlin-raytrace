

class MultiRender
{
	/***

	list<CSceneObject *> *SceneList;
	list<CSceneObject> *LightList;

	void MakeDefault( unsigned int Width,  unsigned int Height );

	void DrawImage( int X, int Y, CColour RGBValue, RaysWnd *MainWnd );
	void EmptyScene();			// Clears the scene.
	
	unsigned int nHeight;
	unsigned int nWidth;
	unsigned int RecurseLevel;
	void Shade( CSceneObject *ClosestObj, Ray TheRay, CVector  Normal, CVector Point,  CColour& col );
	void SetColour( int X, int Y, CImage& Image, CColour Value,  RaysWnd *MainWnd  );
	bool Trace( Ray& TheRay, CColour& RgbVal  );
	void MakeRay( int X, int Y, Ray& TheRay, ViewPoint EyePos );
	void Go( CRaysDoc *pDC, unsigned int Width, unsigned int Height, RaysWnd *MainWnd );
	CMultiRender();
	virtual ~CMultiRender();

	CColour Background;


private:
	CRaysDoc * pTheDoc;

	***/
}