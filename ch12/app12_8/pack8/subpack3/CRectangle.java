// CRectangle.java, ���ɮ׸m��pack8\subpack3��Ƨ���
package pack8.subpack3; // �NCRectangle���O�ǤJpack8.subpack3��
public class CRectangle
{
   private int length;
   private int width;  
   
   public CRectangle(int l,int w)
   {
      length=l;
      width=w;     
   }
   public void show()
   {     
      System.out.print("length="+length);
      System.out.print(", width="+width);
      System.out.println(", area="+length*width);
   }
}
