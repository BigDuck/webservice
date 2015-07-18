package w.p.j;

import w.p.j.daomian.Student;


import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;
import java.util.Map;

/******************************************************
 * ****** Created by 吴培基 on 2015/7/18.8:38
 * ****************************************************
 * 测试CXF支持的数据类型
 */
@WebService
public interface ICXFTypeTest {
    @WebMethod
    public boolean addStudent(Student student);
    @WebMethod
    public Student getStudentById(int id);
    @WebMethod
    public List<Student> getStuList();
    @WebMethod
    public Map<Integer, Student> getStudentMap();

}
