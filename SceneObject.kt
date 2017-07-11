


class Properties
{
	Properties.Ambient = 0.5;
	Properties.Diffuse = 0.5;
	Properties.Brilliance = 0.5;
	Properties.Specular = 0.5;
	Properties.Roughness = 0.5;
	Properties.Reflection = 0.5;

} 



class SceneObject
{

	open fun intersect( val ray : Ray) -> double { }
	open fun setColor( val point : Vector )  { }
	open fun normal(val point : Vector) -> Vector {  }

	
}