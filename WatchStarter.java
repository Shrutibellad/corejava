class WatchStarter{
public static void main(String[] args)
{
Watch watch=new Watch(451,"sonata");
System.out.println(watch.model);
System.out.println(watch.brand);
Light light=watch.light;
System.out.println(light.on);
}
}