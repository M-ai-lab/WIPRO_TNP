class Box
{
	int width,height,depth;

	Box(int width,int height,int depth)
	{
		this.width=width;
		this.height=height;
		this.depth=depth;
	}

	int volume()
	{
		return width*height*depth;
	}
}

class BoxDemo
{
	public static void main(String args[])
	{
		Box b=new Box(10,20,30);
		System.out.println("Volume = "+b.volume());
	}
}