// CCircle.java, ���ɮ׸m��pack8\subpack1��Ƨ���
package pack8.subpack1; // �NCCircle���O�ǤJpack8.subpack1��
public class CCircle
{
   final static double PI=3.14;
   private double radius;

   public CCircle(double r)
   {
      radius=r;
   }
   public void show()
   {
      System.out.print("radius="+radius);
      System.out.println(", area="+PI*radius*radius);
   }
}
