// CBox.java, ���ɮ׸m��pack8\subpack2��Ƨ���
package pack8.subpack2;    // �NCBox���O�ǤJpack8.subpack2��
public class CBox
{
   private int length;
   private int width;
   private int height;

   public CBox(int l,int w,int h)
   {
      length=l;
      width=w;
      height=h;
   }
   public void show()
   {
      int vol=length*width*height;
      System.out.print("length="+length);
      System.out.print(", width="+width);
      System.out.print(", height="+height);
      System.out.println(", volume="+vol);
   }
}
