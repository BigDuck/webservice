package w.p.j.impl;

import w.p.j.ICXFTypeTest;
import w.p.j.daomian.Student;


import javax.jws.WebService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/******************************************************
 * ****** Created by 吴培基 on 2015/7/18.8:46
 * ****************************************************
 */
@WebService
public class CXFTypeImpl implements ICXFTypeTest {

    public boolean addStudent(Student student) {
        System.out.println(student.toString());
        return false;
    }

    public Student getStudentById(int id) {
        System.out.println("id="+id);
        return new Student("大鸭子",23,"泉州市");
    }

    public List<Student> getStuList() {
        System.out.println("getList");
        List<Student> list=new ArrayList<Student>();
        list.add(new Student("张三",22,"四川"));
        list.add(new Student("李四",32,"福建"));
        return list;
    }

    public Map<Integer, Student> getStudentMap() {
        System.out.println("获取学生Map");
        Map<Integer,Student> map=new HashMap<Integer, Student>();
        map.put(1,new Student("张三",22,"四川"));
        map.put(2,new Student("李四",32,"福建"));
        map.put(2,new Student("王五",31,"浙江"));
        return map;

    }
}
