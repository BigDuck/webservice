package w.p.j.main;

import w.p.j.GetStudentMapResponse;
import w.p.j.ICXFTypeTest;
import w.p.j.Student;
import w.p.j.impl.CXFTypeImplService;

import java.util.List;

/******************************************************
 * ****** Created by 吴培基 on 2015/7/18.9:23
 * ****************************************************
 */
public class ClientTest {
    public static void main(String[]args){
        CXFTypeImplService factory=new CXFTypeImplService();
      ICXFTypeTest icxfTypeTest= factory.getCXFTypeImplPort();
      //  System.out.println("结果1："+icxfTypeTest.addStudent(new Student("黎明", 22, "中国")));
        System.out.println("结果2："+icxfTypeTest.getStudentById(1).toString());
//        System.out.println("结果3："+icxfTypeTest.getStudentMap().toString());
//        GetStudentMapResponse.Return r=icxfTypeTest.getStudentMap();
//        List<GetStudentMapResponse.Return.Entry> entries=r.getEntry();
//        for (GetStudentMapResponse.Return.Entry entry:entries){
//            System.out.println(""+entry.getKey().toString()+"---"+entry.getValue().toString());
//        }
//        System.out.println("结果4："+icxfTypeTest.getStuList().toString());
    }
}
