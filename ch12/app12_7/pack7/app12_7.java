// app12_7.java, ���ɮ׸m��pack7��Ƨ���
package pack7;             // �Napp12_7���O�ǤJpackage pack7��
import pack7.subpack1.CCircle;   // ���Jpack7.subpack1�̪�CCircle���O
import pack7.subpack2.CBox;         // ���Jpack7.subpack2�̪�CBox���O

public class app12_7
{
   public static void main(String args[])
   {
      CCircle cir=new CCircle(2);
      CBox box=new CBox(2,3,4);
      cir.show();
      box.show();
   }
}

/* app12_7 OUTPUT--------------------------
radius=2.0, area=12.56
length=2, width=3, height=4, volume=24
-----------------------------------------*/