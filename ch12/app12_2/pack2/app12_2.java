// app12_2, package���ϥ�(�@),���ɮ׸m��pack2��Ƨ���
package pack2; // �ŧi�H�U�{���X�ҩw�q�����O���ǤJpackage pack2��
class CCircle  // CCircle���O�w�ǤJpackage pack2��
{
   public void show()
   {
      System.out.println("show() called");
   }
}
public class app12_2    // app12_2���O�]�ǤJpackage pack2��
{
   public static void main(String args[])
   {
      CCircle cir=new CCircle();
      cir.show();
   }
}

/* app12_2 OUTPUT-------
show() method called
----------------------*/