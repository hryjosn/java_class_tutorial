// app12_8.java,���ɮ׸m��pack8��Ƨ���
package pack8;  // �Napp12_8���O�ǤJpackage pack8��
import pack8.subpack1.CCircle;     // ���Jpack8.subpack1�̪�CCircle���O
import pack8.subpack2.CBox;           // ���Jpack8.subpack2�̪�CBox���O
//import pack8.subpack3.CRectangle; // ���Jpack8.subpack3�̪�CRectangle���O

 public class app12_8
 {
    public static void main(String args[])
    {
       CCircle cir=new CCircle(2);
       CBox box=new CBox(2,3,4);
       // CRectangle rec=new CRectangle(5,7);
       cir.show();
       box.show();
       // rec.show();
    }
 }
