package generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Worker {
   private int id;
   private String name;
   private String depart;
   private String address;
   private String bDate;
   
   private Worker() {} 
   
   public Worker(int id, String name, String depart, String address, String bDate) {
      this.id = id;
      this.name = name;
      this.depart = depart;
      this.address = address;
      this.bDate = bDate;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getDepart() {
      return depart;
   }

   public void setDepart(String depart) {
      this.depart = depart;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public String getbDate() {
      return bDate;
   }

   public void setbDate(String bDate) {
      this.bDate = bDate;
   }
   
}
public class Point{
   public static void main(String[] args) {
      
      Scanner sc =new Scanner(System.in);
      ArrayList<Worker> aWork = new ArrayList<>();
      while(true) {
         System.out.println("��� ���� ���� ���α׷�");
         System.out.println("1. ��� ���� �Է�");
         System.out.println("2. ������� ���� ��ȸ");
         System.out.println("3. ���α׷� ����");
         int i = sc.nextInt();
         
         switch (i){
         case 1 :
            System.out.println("���ο� ��� ������ �Է��մϴ�");
            
            System.out.println("��� :");
            int iNum = sc.nextInt();
            
            System.out.println("�̸� : ");
            String name= sc.next();
            
            System.out.println("�μ� : ");
            String part = sc.next();
            
            sc.nextLine();
            System.out.println("�ּ� : ");
            String address = sc.nextLine();
            
            System.out.println("���� : ");
            String bDate = sc.next();
            
            aWork.add(new Worker(iNum,name,part,address,bDate));
            System.out.println("��������� �ԷµǾ���");
            break;
            
         case 2 :
            System.out.println("�˻��ϰ��� �ϴ� ����� �����? ��) 123(�Է�)");
            int id = sc.nextInt();
            Iterator<Worker> it = aWork.iterator();
            while(it.hasNext()) {
               Worker num = it.next();
               if(id == num.getId()) {
                  System.out.println("�̸� : "+num.getName());
                  System.out.println("�μ� : "+num.getDepart());
                  System.out.println("�ּ� : "+num.getAddress());
                  System.out.println("���� : "+num.getbDate());
               }
            }
            break;
            
         case 3 :
            System.out.println("���α׷� ����");
            return;
         }

   }
}
}