// app12_11, Integer class method������
public class app12_11
{
   public static void main(String args[])
   {
      String str;
      int inum;

      inum=Integer.parseInt("654")+3;     // �N�r���ন��ƫ�A�A�[3
      System.out.println(inum);
      str=Integer.toString(inum)+"3";     // �N "3" ���[�b�r��᭱
      System.out.println(str);
   }
}

/* app12_11 OUTPUT---
657
6573
-------------------*/